package com.mycompany.visualnoveldemo;

public class DialogueLine {

    private final Character speaker;
    private final String text;
    private final String expressionKey;   // ท่าทาง
    private final String backgroundPath;  // ✅ BG เฉพาะบรรทัด (optional)

    // ของเดิม (ไม่ระบุท่าทาง / BG)
    public DialogueLine(Character speaker, String text) {
        this(speaker, text, null, null);
    }

    // ระบุท่าทาง
    public DialogueLine(Character speaker, String text, String expressionKey) {
        this(speaker, text, expressionKey, null);
    }

    // ✅ ใหม่: ระบุทั้งท่าทาง + BG
    public DialogueLine(Character speaker, String text,
                        String expressionKey, String backgroundPath) {
        this.speaker = speaker;
        this.text = text;
        this.expressionKey = expressionKey;
        this.backgroundPath = backgroundPath;
    }

    public Character getSpeaker() {
        return speaker;
    }

    public String getText() {
        return text;
    }

    public String getExpressionKey() {
        return expressionKey;
    }

    public String getBackgroundPath() {
        return backgroundPath;
    }
}
