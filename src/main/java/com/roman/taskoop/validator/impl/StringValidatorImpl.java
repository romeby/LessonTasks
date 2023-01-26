package com.roman.taskoop.validator.impl;

import com.roman.taskoop.validator.StringValidator;

public class StringValidatorImpl implements StringValidator {
    private static final String STRING_REG_EX = "[a-zA-Z]+\\_?[a-zA-Z]+";
    private static final String INT_REG_EX = "\\d{1,4}+";
    private static final String DOUBLE_REG_EX = "(\\d{1,3}[\\.\\,]\\d{2})\\s+";
    private static final String BOOLEAN_REG_EX = "true";

    @Override
    public boolean validateString(String string) {
        boolean match = string.matches(STRING_REG_EX);
        if (!match) {
            System.out.println("Bad match string");
        }
        return match;
    }
    @Override
    public boolean validateInt(String intString) {
        boolean match = intString.matches(INT_REG_EX);
        if (!match) {
            System.out.println("Bad match int");
        }
        return match;
    }
    @Override
    public boolean validateDouble(String doubleString) {
        boolean match = doubleString.matches(DOUBLE_REG_EX);
        if (!match) {
            System.out.println("Bad match double");
        }
        return match;
    }
    @Override
    public boolean validateBoolean(String booleanString) {
        boolean match = booleanString.matches(BOOLEAN_REG_EX);
        if (!match) {
            System.out.println("Bad match boolean");
        }
        return match;
    }
}
