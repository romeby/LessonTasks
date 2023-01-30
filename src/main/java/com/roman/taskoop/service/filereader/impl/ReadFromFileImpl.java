package com.roman.taskoop.service.filereader.impl;

import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.entity.KitchenAppliance;
import com.roman.taskoop.entity.LaundryAppliance;
import com.roman.taskoop.entity.TvAndEntertainment;
import com.roman.taskoop.exception.CustomException;
import com.roman.taskoop.service.filereader.ReadFromFile;
import com.roman.taskoop.validator.StringValidator;
import com.roman.taskoop.validator.impl.StringValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadFromFileImpl implements ReadFromFile {
    static Logger logger = LogManager.getLogger();
    private static final String FLOOR_INPUT_FILE = "data\\InputFile.txt";
    private static final String KITCHEN_INPUT_FILE = "data\\InputFileKitchen.txt";
    private static final String SEPARATOR = "\\s+";

    @Override
    public FloorCareAppliance floorReader(String filename) throws CustomException {
        FloorCareAppliance floorCareAppliance = new FloorCareAppliance();
        StringValidator stringValidator = new StringValidatorImpl();
        int[] ints;
        String[] typeStrings;
        boolean[] booleans;
        Path path = Paths.get(filename);
        if (!Files.exists(path)) {
            logger.log(Level.WARN, "File does not exist.");
            filename = FLOOR_INPUT_FILE;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            String stringTmp = bufferedReader.readLine();
            if (stringTmp != null) {
                String[] splitedString = stringTmp.split(SEPARATOR);
                ints = new int[splitedString.length];
                typeStrings = new String[splitedString.length];
                booleans = new boolean[splitedString.length];
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateInt(splitedString[i])) {
                        ints[i] = Integer.parseInt(splitedString[i]);
                        logger.log(Level.INFO, ints[i]);
                    }
                }
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateString(splitedString[i])) {
                        typeStrings[i] = splitedString[i];
                        logger.log(Level.INFO, typeStrings[i]);
                    }
                }
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateBoolean(splitedString[i])) {
                        booleans[i] = Boolean.parseBoolean(splitedString[i]);
                        logger.log(Level.INFO, booleans[i]);
                    }
                }
                floorCareAppliance = new FloorCareAppliance(floorCareAppliance.getApplianceId(), typeStrings[0],
                        typeStrings[1], ints[2], ints[3], ints[4], booleans[5]);
            } else {
                logger.log(Level.WARN, "No data. File is empty");
            }
        } catch (IOException ex){
            ex.printStackTrace(System.out);
            throw new CustomException("File is empty or File not Found");
        }
        return floorCareAppliance;
    }

    @Override
    public KitchenAppliance kitchenReader(String filename) throws CustomException {
        KitchenAppliance kitchenAppliance = new KitchenAppliance();
        StringValidator stringValidator = new StringValidatorImpl();
        int[] ints;
        String[] typeStrings;
        boolean[] booleans;
        Path path = Paths.get(filename);
        if (!Files.exists(path)) {
            logger.log(Level.WARN, "File does not exist.");
            filename = KITCHEN_INPUT_FILE;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            String stringTmp = bufferedReader.readLine();
            if (stringTmp != null) {
                String[] splitedString = stringTmp.split(SEPARATOR);
                ints = new int[splitedString.length];
                typeStrings = new String[splitedString.length];
                booleans = new boolean[splitedString.length];

                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateInt(splitedString[i])) {
                        ints[i] = Integer.parseInt(splitedString[i]);
                        logger.log(Level.INFO, ints[i]);
                    }
                }
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateString(splitedString[i])) {
                        typeStrings[i] = splitedString[i];
                        logger.log(Level.INFO, typeStrings[i]);
                    }
                }
                for (int i = 0; i < splitedString.length; i++) {
                    if (stringValidator.validateBoolean(splitedString[i])) {
                        booleans[i] = Boolean.parseBoolean(splitedString[i]);
                        logger.log(Level.INFO, booleans[i]);
                    }
                }
//                for (int i = 0; i < splitedString.length; i++){
//                    if (stringValidator.validateDouble(splitedString[i])){
//                        doubles[i] = Double.parseDouble(splitedString[i]);
//                        logger.log(Level.INFO, doubles[i]);
//                    }
//                }
                kitchenAppliance = new KitchenAppliance(kitchenAppliance.getApplianceId(), typeStrings[0],
                        typeStrings[1], ints[2], ints[3], ints[4], booleans[5]);
            } else {
                logger.log(Level.WARN, "No data. File is empty");
            }
        } catch (IOException ex){
            ex.printStackTrace(System.out);
            throw new CustomException("File is empty or File not Found");
        }
        return kitchenAppliance;
    }

    @Override
    public LaundryAppliance laundryReader(String filename) {
        LaundryAppliance laundryAppliance = new LaundryAppliance();
        return laundryAppliance;
    }

    @Override
    public TvAndEntertainment entertainmentReader(String filename) {
        TvAndEntertainment tvAndEntertainment = new TvAndEntertainment();
        return tvAndEntertainment;
    }
}
