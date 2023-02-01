package com.roman.taskoop.service.calculate.impl;

import com.roman.taskoop.entity.PluggedInAppliance;
import com.roman.taskoop.exception.CustomException;
import com.roman.taskoop.service.calculate.CalculateEnergyConsumption;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculateEnergyConsumptionImpl implements CalculateEnergyConsumption {
    static Logger logger = LogManager.getLogger();

    @Override
    public int calculate(PluggedInAppliance pluggedInAppliance) throws CustomException {
        int sumOfEnergyConsumption = 0;
        if (pluggedInAppliance == null) {
            throw new CustomException("No electrical appliances");
        }
        if (pluggedInAppliance.getElectricalApplianceList() == null) {
            throw new CustomException("List of plugged appliances is empty");
        }
        if (pluggedInAppliance.getElectricalApplianceList().size() != 0) {
            for (int i = 0; i < pluggedInAppliance.getElectricalApplianceList().size(); i++) {
                sumOfEnergyConsumption += pluggedInAppliance.getElectricalApplianceList().get(i).getEnergyConsumption();
            }
        } else {
            logger.log(Level.INFO, "No appliance is plugged");
        }
        return sumOfEnergyConsumption;
    }
}
