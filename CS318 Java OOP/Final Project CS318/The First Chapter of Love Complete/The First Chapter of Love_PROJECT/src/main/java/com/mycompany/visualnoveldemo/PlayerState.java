package com.mycompany.visualnoveldemo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * เก็บสถานะของผู้เล่น
 *  - relationship: ค่าความสัมพันธ์ของแต่ละตัวละคร
 *  - flags: ตัวแปรสถานะต่าง ๆ (ใช้กับ FlagCondition)
 *
 * รองรับทั้งเมธอดแบบใหม่ (getRelationship/addRelationship)
 * และเมธอดแบบเก่า (getAffection/addAffection/hasFlag/setFlag)
 */
public class PlayerState implements Serializable {

    private static final long serialVersionUID = 1L;

    // ความสัมพันธ์กับตัวละคร: key = characterId, value = score
    private final Map<String, Integer> relationship = new HashMap<>();

    // แฟลกสถานะต่าง ๆ
    private final Set<String> flags = new HashSet<>();

    // ---------- เมธอดหลักสำหรับ Relationship ----------

    /** อ่านค่าความสัมพันธ์ ถ้าไม่เคยมีให้คืน 0 */
    public int getRelationship(String characterId) {
        return relationship.getOrDefault(characterId, 0);
    }

    /** เพิ่ม/ลดค่าความสัมพันธ์ */
    public void addRelationship(String characterId, int delta) {
        int current = relationship.getOrDefault(characterId, 0);
        relationship.put(characterId, current + delta);
    }

    /** คืน map ทั้งหมด (ใช้ใน RelationshipUI) */
    public Map<String, Integer> getRelationshipMap() {
        return relationship;
    }

    // ---------- alias สำหรับโค้ดเก่า (ชื่อเดิม) ----------

    public int getAffection(String characterId) {
        return getRelationship(characterId);
    }

    public void addAffection(String characterId, int delta) {
        addRelationship(characterId, delta);
    }

    /** ให้ RelationshipUI ใช้ชื่อเก่านี้ได้ด้วย */
    public Map<String, Integer> getAffectionMap() {
        return getRelationshipMap();
    }

    // ---------- ระบบ Flag ----------

    public boolean hasFlag(String flagName) {
        return flags.contains(flagName);
    }

    public void setFlag(String flagName) {
        flags.add(flagName);
    }

    public void clearFlag(String flagName) {
        flags.remove(flagName);
    }

    public Set<String> getFlags() {
        return flags;
    }

    @Override
    public String toString() {
        return "PlayerState{" +
                "relationship=" + relationship +
                ", flags=" + flags +
                '}';
    }
}
