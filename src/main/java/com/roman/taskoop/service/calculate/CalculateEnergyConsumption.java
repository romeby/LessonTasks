package com.roman.taskoop.service.calculate;

import com.roman.taskoop.entity.PluggedInAppliance;
import com.roman.taskoop.exception.CustomException;

public interface CalculateEnergyConsumption {
    int calculate(PluggedInAppliance pluggedInAppliance) throws CustomException;
}
