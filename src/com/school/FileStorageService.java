package com.school.storage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageService {

    public void saveToFile(String filename, List<? extends Storable> objects) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            for (Storable obj : objects) {
                writer.write(obj.toDataString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
