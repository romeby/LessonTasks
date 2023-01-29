package com.roman.taskoop.validator.impl;

import com.roman.taskoop.validator.StringValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidatorImpl implements StringValidator {
    Logger logger = LogManager.getLogger();
    private static final String STRING_REG_EX = "[a-zA-Z]+\\_?[a-zA-Z]+";  //FIXME exclude "true" and "false" values
    private static final String INT_REG_EX = "\\d{1,4}+";
    private static final String DOUBLE_REG_EX = "\\d{1,3}[\\.\\,]+\\d{1,3}";
    private static final String BOOLEAN_REG_EX = "true";

    @Override
    public boolean validateString(String typeOrBrandString) {
        boolean match = typeOrBrandString.matches(STRING_REG_EX);
        if (!match) {
            logger.log(Level.WARN, "Bad match string");
        }
        return match;
}

    @Override
    public boolean validateInt(String intString) {
        boolean match = intString.matches(INT_REG_EX);
        if (!match) {
            logger.log(Level.WARN, "Bad match int");
        }
        return match;
    }

    @Override
    public boolean validateDouble(String doubleString) {
        boolean match = doubleString.matches(DOUBLE_REG_EX);
        if (!match) {
            logger.log(Level.WARN, "Bad match double");
        }
        return match;
    }

    @Override
    public boolean validateBoolean(String booleanString) {
        boolean match = booleanString.matches(BOOLEAN_REG_EX);
        if (!match) {
            logger.log(Level.WARN, "Bad match boolean");
        }
        return match;
    }
}
