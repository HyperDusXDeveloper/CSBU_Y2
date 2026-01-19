package com.mycompany.visualnoveldemo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ข้อมูลที่ใช้เซฟเกม
 *  - currentSceneId: เราอยู่ฉากไหน
 *  - dialogueIndex: อยู่บรรทัดบทพูดที่เท่าไร
 *  - playerState: ค่าความสัมพันธ์ / flag ต่าง ๆ
 */
public class SaveData implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String currentSceneId;
    private final int dialogueIndex;
    private final PlayerState playerState;

    public SaveData(String currentSceneId, int dialogueIndex, PlayerState playerState) {
        this.currentSceneId = currentSceneId;
        this.dialogueIndex = dialogueIndex;
        this.playerState = playerState;
    }

    public String getCurrentSceneId() {
        return currentSceneId;
    }

    public int getDialogueIndex() {
        return dialogueIndex;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    // ---------- helper สำหรับอ่าน/เขียนไฟล์ ----------

    public static void saveToFile(String filename, SaveData data) throws IOException {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(data);
        }
    }

    public static SaveData loadFromFile(String filename) throws IOException, ClassNotFoundException {
        if (!Files.exists(Path.of(filename))) {
            return null;
        }
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filename))) {
            Object obj = ois.readObject();
            return (SaveData) obj;
        }
    }
}
