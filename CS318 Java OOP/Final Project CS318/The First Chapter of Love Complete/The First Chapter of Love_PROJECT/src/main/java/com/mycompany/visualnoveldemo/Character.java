package com.mycompany.visualnoveldemo;

import java.util.HashMap;
import java.util.Map;

public class Character {
    private final String id;
    private final String name;

    private final Map<String, String> expressions = new HashMap<>();
    private String defaultExpression = "default";

    public Character(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public Character addExpression(String key, String path) {
        expressions.put(key, path);
        return this;
    }

    public void setDefaultExpression(String key) {
        this.defaultExpression = key;
    }

    public String getAvatarPath() {
        return getAvatarPath(defaultExpression);
    }

    public String getAvatarPath(String expressionKey) {
        if (expressionKey == null || expressionKey.isEmpty()) {
            expressionKey = defaultExpression;
        }
        String p = expressions.get(expressionKey);
        if (p == null) p = expressions.get(defaultExpression); // fallback
        return p;
    }
}
