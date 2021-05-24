package com.company;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    private Serializer() {

    }

    public static void serialize(Tribe[] tribes, String file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            outputStream.writeObject(tribes);
        }
        catch (Exception e) {

        }
    }
}