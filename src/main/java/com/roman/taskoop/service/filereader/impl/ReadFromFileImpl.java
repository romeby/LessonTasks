package com.roman.taskoop.service.filereader.impl;

import com.roman.taskoop.entity.FloorCareAppliance;
import com.roman.taskoop.entity.KitchenAppliance;
import com.roman.taskoop.entity.LaundryAppliance;
import com.roman.taskoop.entity.TvAndEntertainment;
import com.roman.taskoop.exception.CustomException;
import com.roman.taskoop.service.filereader.ReadFromFile;
import com.roman.taskoop.validator.StringValidator;
import com.roman.taskoop.validator.impl.StringValidatorImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFromFileImpl implements ReadFromFile {
    private static final String FILE_NAME = "data\\InputFile.txt";
    private static final String SEPARATOR = "\\s+";
    String fileName;

    @Override
    public FloorCareAppliance floorReader(String filename) throws CustomException {
        FloorCareAppliance floorCareAppliance = new FloorCareAppliance();
        StringValidator stringValidator = new StringValidatorImpl();
        int[] ints;
        String[] strings;
        boolean[] booleans;
        //double[] doubles;
        Path path = Path.of(filename);
        if (!Files.exists(path)){
            throw new CustomException("File does not exists");
            //filename = "data\\InputFile.txt";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String stringTmp = bufferedReader.readLine();
            if (stringTmp != null){
                String[] splitedString = stringTmp.split(SEPARATOR);
                ints = new int[splitedString.length];
                strings = new String[splitedString.length];
                booleans = new boolean[splitedString.length];
               // doubles = new double[splitedString.length];
                for (int i = 0; i < splitedString.length; i++){
                    if (stringValidator.validateInt(splitedString[i])){
                        ints[i] = Integer.parseInt(splitedString[i]);
                        System.out.println(ints[i]);
                    }
                }
                for (int i = 0; i < splitedString.length; i++){
                    if (stringValidator.validateString(splitedString[i])){
                        strings[i] = splitedString[i];
                        System.out.println(strings[i]);
                    }
                }
                for (int i = 0; i < splitedString.length; i++){
                    if (stringValidator.validateBoolean(splitedString[i])){
                        booleans[i] = Boolean.parseBoolean(splitedString[i]);
                    }
                }
//                for (int i = 0; i < splitedString.length; i++){
//                    if (stringValidator.validateDouble(splitedString[i])){
//                        doubles[i] = Double.parseDouble(splitedString[i]);
//                    }
//                }
                floorCareAppliance = new FloorCareAppliance(floorCareAppliance.getApplianceId(), strings[0],strings[1], ints[2],
                        ints[3], ints[4], booleans[5]);
                System.out.println(floorCareAppliance);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public KitchenAppliance kitchenReader(String filename) {
        return null;
    }

    @Override
    public LaundryAppliance laundryReader(String filename) {
        return null;
    }

    @Override
    public TvAndEntertainment entertainmentReader(String filename) {
        return null;
    }
}
