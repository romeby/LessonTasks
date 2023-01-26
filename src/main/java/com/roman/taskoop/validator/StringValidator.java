package com.roman.taskoop.validator;

import com.roman.taskoop.exception.CustomException;

public interface StringValidator {
    boolean validateString (String stringString) throws CustomException;
    boolean validateInt (String intString);
    boolean validateDouble (String doubleString);
    boolean validateBoolean (String booleanString);
}
