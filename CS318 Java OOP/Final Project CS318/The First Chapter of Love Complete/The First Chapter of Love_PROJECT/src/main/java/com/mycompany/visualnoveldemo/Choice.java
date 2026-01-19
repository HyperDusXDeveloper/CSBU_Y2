package com.mycompany.visualnoveldemo;

/**
 * ตัวเลือกในเกม
 *  - text: ข้อความที่ให้ผู้เล่นเห็น
 *  - nextSceneId: id ของ scene ถัดไป
 *  - affectionTargetId: id ตัวละครที่ได้รับผลความสัมพันธ์ (เช่น "alice")
 *  - affectionDelta: คะแนนความสัมพันธ์ที่เพิ่ม/ลด (เช่น +5, -2)
 *
 * ✅ เพิ่มเงื่อนไข (optional)
 *  - conditionTargetId: ตัวละครที่ใช้เช็ค relationship
 *  - minAffection: ต้องมี relationship >= ค่านี้ ถึงจะมองเห็น choice
 */
public class Choice {

    private final String text;
    private final String nextSceneId;

    private final String affectionTargetId;
    private final int affectionDelta;

    // ✅ เงื่อนไขการแสดงผล
    private final String conditionTargetId; // เช่น "himiko"
    private final int minAffection;         // เช่น 10

    // ใช้กรณีทั่วไป (ไม่ยุ่งกับความสัมพันธ์)
    public Choice(String text, String nextSceneId) {
        this(text, nextSceneId, null, 0, null, Integer.MIN_VALUE);
    }

    // ใช้กรณีมีผลกับค่าความสัมพันธ์
    public Choice(String text, String nextSceneId,
                  String affectionTargetId, int affectionDelta) {
        this(text, nextSceneId, affectionTargetId, affectionDelta, null, Integer.MIN_VALUE);
    }

    // ✅ ใช้กรณีมีผลกับความสัมพันธ์ + มีเงื่อนไขให้โชว์
    public Choice(String text, String nextSceneId,
                  String affectionTargetId, int affectionDelta,
                  String conditionTargetId, int minAffection) {
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.affectionTargetId = affectionTargetId;
        this.affectionDelta = affectionDelta;
        this.conditionTargetId = conditionTargetId;
        this.minAffection = minAffection;
    }

    public String getText() {
        return text;
    }

    public String getNextSceneId() {
        return nextSceneId;
    }

    public String getAffectionTargetId() {
        return affectionTargetId;
    }

    public int getAffectionDelta() {
        return affectionDelta;
    }

    public String getConditionTargetId() {
        return conditionTargetId;
    }

    public int getMinAffection() {
        return minAffection;
    }

    // ✅ เช็คว่า choice นี้ “ควรแสดง” ไหม
    public boolean isVisible(PlayerState state) {
        if (conditionTargetId == null) return true; // ไม่มีเงื่อนไข = โชว์เสมอ
        if (state == null) return false;
        return state.getRelationship(conditionTargetId) >= minAffection;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "text='" + text + '\'' +
                ", nextSceneId='" + nextSceneId + '\'' +
                ", affectionTargetId='" + affectionTargetId + '\'' +
                ", affectionDelta=" + affectionDelta +
                ", conditionTargetId='" + conditionTargetId + '\'' +
                ", minAffection=" + minAffection +
                '}';
    }
}
