package model;

/**
 * Created by vladimir on 07.02.2018.
 */
public enum Operation {
    PLUS("+"),
    MINUS("-"),
    TIMES("*"),
    DIV(":");

    private final String mathValue;

    Operation(String mathValue) {
        this.mathValue = mathValue;
    }

    public String getMathValue() {
        return mathValue;
    }
}
