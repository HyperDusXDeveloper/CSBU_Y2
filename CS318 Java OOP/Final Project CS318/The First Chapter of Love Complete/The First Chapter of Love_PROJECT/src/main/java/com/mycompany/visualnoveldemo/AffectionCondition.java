package com.mycompany.visualnoveldemo;

public class AffectionCondition implements RouteCondition {
    private String characterId;
    private int minValue;

    public AffectionCondition(String characterId, int minValue) {
        this.characterId = characterId;
        this.minValue = minValue;
    }

    @Override
    public boolean isSatisfied(PlayerState state) {
        return state.getAffection(characterId) >= minValue;
    }
}
