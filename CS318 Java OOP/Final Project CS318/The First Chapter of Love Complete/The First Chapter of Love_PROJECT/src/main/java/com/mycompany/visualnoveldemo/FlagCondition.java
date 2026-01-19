package com.mycompany.visualnoveldemo;

public class FlagCondition implements RouteCondition {
    private String requiredFlag;

    public FlagCondition(String requiredFlag) {
        this.requiredFlag = requiredFlag;
    }

    @Override
    public boolean isSatisfied(PlayerState state) {
        return state.hasFlag(requiredFlag);
    }
}
