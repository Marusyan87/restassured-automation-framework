package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<String[]> readUsers(String filePath) throws IOException {

        List<String[]> users = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;

        br.readLine(); // sare peste header

        while ((line = br.readLine()) != null) {

            users.add(line.split(","));
        }

        br.close();

        return users;
    }
}