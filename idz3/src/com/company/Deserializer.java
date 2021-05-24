package com.company;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserializer {
    private Deserializer() {

    }

    public static Tribe[] deserialize(String file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Tribe[]) inputStream.readObject();
        }
        catch (Exception e) {
            return new Tribe[0];
        }
    }
}