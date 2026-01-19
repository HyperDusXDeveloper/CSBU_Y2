package com.mycompany.visualnoveldemo;

import java.util.*;

/**
 * แกนหลักของเกม:
 *  - เก็บ scene ทั้งหมด
 *  - จำว่าอยู่ scene ไหน
 *  - เก็บสถานะผู้เล่น (ความสัมพันธ์)
 *  - จัดการเมื่อผู้เล่นเลือก choice
 */
public class GameEngine {
    private final Map<String, Character> characters = new HashMap<>();
    private final Map<String, Scene> scenes = new HashMap<>();
    private Scene currentScene;

    private PlayerState playerState = new PlayerState();

    /** เพิ่ม scene เข้า engine (ต้องเรียกจาก GameData) */
    public void addScene(Scene scene) {
        if (scene == null || scene.getId() == null) return;
        scenes.put(scene.getId(), scene);
    }

    /** เริ่มเกมที่ scene ตาม id */
    public void start(String sceneId) {
        currentScene = scenes.get(sceneId);
    }

    /** อ่าน scene ปัจจุบัน (เอาไปใช้ใน UI) */
    public Scene getCurrentScene() {
        return currentScene;
    }

    /** อ่านสถานะผู้เล่น (ใช้ดู relationship) */
    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState state) {
        if (state != null) {
            this.playerState = state;
        }
    }

    /** Helper สำหรับดู affection ของตัวละครจาก UI หรือ GameData */
    public int getAffection(String characterId) {
        return playerState.getRelationship(characterId);
    }

    /** คืน list choice ของ scene ปัจจุบัน */
    public List<Choice> getAvailableChoices() {
        if (currentScene == null) return Collections.emptyList();

        List<Choice> choices = currentScene.getChoices();
        if (choices == null) return Collections.emptyList();

        List<Choice> visible = new ArrayList<>();
        for (Choice c : choices) {
            if (c != null && c.isVisible(playerState)) {
                visible.add(c);
            }
        }
        return visible;
    }

    /** เวลาผู้เล่นเลือก choice */
    public void choose(Choice choice) {
        if (choice == null) return;

        // 1) อัปเดตค่าความสัมพันธ์
        if (choice.getAffectionTargetId() != null && choice.getAffectionDelta() != 0) {
            playerState.addRelationship(
                    choice.getAffectionTargetId(),
                    choice.getAffectionDelta()
            );
        }

        // 2) เปลี่ยนฉากไป nextSceneId
        Scene next = scenes.get(choice.getNextSceneId());
        if (next != null) {
            currentScene = next;
        }
    }
    
    public void addCharacter(Character c) {
        characters.put(c.getId(), c);
    }
    
    public java.util.List<Character> getAllCharacters() {
        return new java.util.ArrayList<>(characters.values());
    }
    
    // สร้างข้อมูลเซฟจากสถานะปัจจุบัน
    public SaveData toSaveData(int dialogueIndex) {
        String sceneId = (currentScene != null) ? currentScene.getId() : null;
        return new SaveData(sceneId, dialogueIndex, playerState);
    }


    // โหลดสถานะจาก SaveData
    public void loadFromSaveData(SaveData data) {
        if (data == null) return;

        this.playerState = data.getPlayerState();

        if (data.getCurrentSceneId() != null) {
            Scene s = scenes.get(data.getCurrentSceneId());
            if (s != null) {
                this.currentScene = s;
            }
        }
    }


}
