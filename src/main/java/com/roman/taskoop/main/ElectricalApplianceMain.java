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
import com.roman.taskoop.service.sort.Sort;
import com.roman.taskoop.service.sort.impl.SortImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ElectricalApplianceMain {
     static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        List<ElectricalAppliance> applianceList = new ArrayList<>();
        int sumOfEnergyConsumption;
//        AppliancePropertiesReader reader = new AppliancePropertiesReaderImpl();
//        reader.readPropertiesFloorCare("data\\floorcare.properties");
        ReadFromFile readFromFile = new ReadFromFileImpl();
        FloorCareAppliance floorAppliance = readFromFile.floorReader("data\\InputFile.txt");
        KitchenAppliance kitchenAppliance = readFromFile.kitchenReader("data\\InputFileKitchen.txt");
        applianceList.add(floorAppliance);
        applianceList.add(kitchenAppliance);
        PluggedInAppliance pluggedInAppliance = new PluggedInAppliance(applianceList);
        CalculateEnergyConsumption calculateEnergyConsumption = new calculateEnergyConsumptionImpl();
        sumOfEnergyConsumption = calculateEnergyConsumption.calculate(pluggedInAppliance);
        logger.log(Level.INFO, "Energy consumption is {} Watt", sumOfEnergyConsumption);
        Sort sort = new SortImpl();
        System.out.println(sort.sortByEnergyConsumption(applianceList));
        System.out.println(sort.sortByPrice(applianceList));
        System.out.println(sort.sortByWeight(applianceList));

    }
}
