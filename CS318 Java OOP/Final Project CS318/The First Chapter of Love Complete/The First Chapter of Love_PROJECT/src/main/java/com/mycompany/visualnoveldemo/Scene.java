package com.mycompany.visualnoveldemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scene {

    private final String id;
    private String backgroundPath;
    private boolean ending = false;

    private final List<DialogueLine> dialogues = new ArrayList<>();
    private final List<Choice> choices = new ArrayList<>();
    
    private String bgmPath;

    public void setBgmPath(String path) {
        this.bgmPath = path;
    }

    public String getBgmPath() {
        return bgmPath;
    }

    public Scene(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getBackgroundPath() {
        return backgroundPath;
    }

    public void setBackgroundPath(String backgroundPath) {
        this.backgroundPath = backgroundPath;
    }

    public void addDialogue(DialogueLine line) {
        dialogues.add(line);
    }

    public List<DialogueLine> getDialogues() {
        return Collections.unmodifiableList(dialogues);
    }

    // 👇 สำคัญ: ให้เก็บ choices ไว้ใน scene
    public void addChoice(Choice choice) {
        choices.add(choice);
    }

    public List<Choice> getChoices() {
        return Collections.unmodifiableList(choices);
    }

    public void setEnding(boolean ending) {
        this.ending = ending;
    }

    public boolean isEnding() {
        return ending;
    }
}
