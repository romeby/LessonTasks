package com.roman.taskoop.idgenerator;

public class IdGenerator {
    private static int applianceId;
    public static int generateNextId() {
        return ++applianceId;
    }

}
