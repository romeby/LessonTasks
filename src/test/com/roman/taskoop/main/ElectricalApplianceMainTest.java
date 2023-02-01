package com.roman.taskoop.main;

import com.roman.taskoop.entity.ElectricalAppliance;
import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.entity.KitchenAppliance;
import com.roman.taskoop.entity.PluggedInAppliance;
import com.roman.taskoop.exception.CustomException;
import com.roman.taskoop.reader.ReadFromFile;
import com.roman.taskoop.reader.impl.ReadFromFileImpl;
import com.roman.taskoop.service.calculate.CalculateEnergyConsumption;
import com.roman.taskoop.service.calculate.impl.calculateEnergyConsumptionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ElectricalApplianceMainTest {
static Logger logger = LogManager.getLogger();
    @org.testng.annotations.Test
    public void testMain() {
        List<ElectricalAppliance> applianceList = new ArrayList<>();
        int sumOfEnergyConsumption;
        ReadFromFile readFromFile = new ReadFromFileImpl();
        FloorCareAppliance floorAppliance = null;
        try {
            floorAppliance = readFromFile.floorReader("data\\InputFile.txt");
        } catch (CustomException e) {
            throw new RuntimeException("File not found",e);
        }
        KitchenAppliance kitchenAppliance = null;
        try {
            kitchenAppliance = readFromFile.kitchenReader("data\\InputFileKitchen.txt");
        } catch (CustomException e) {
            throw new RuntimeException("File not found",e);
        }
        applianceList.add(floorAppliance);
        applianceList.add(kitchenAppliance);
        PluggedInAppliance pluggedInAppliance = new PluggedInAppliance(applianceList);
        CalculateEnergyConsumption calculateEnergyConsumption = new calculateEnergyConsumptionImpl();
        try {
            sumOfEnergyConsumption = calculateEnergyConsumption.calculate(pluggedInAppliance);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
        logger.log(Level.INFO, "Energy consumption is {} Watt", sumOfEnergyConsumption);
        assertEquals(sumOfEnergyConsumption, 4000);
    }
}