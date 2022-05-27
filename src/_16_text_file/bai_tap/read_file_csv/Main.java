package _16_text_file.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/_16_text_file/bai_tap/read_file_csv/countries.csv");
        List<String[]> list = new ArrayList<>();
        List<Country> countryList = new ArrayList<>();
        if (!file.exists()) {
            System.out.println("File nguồn không tồn tại");
        } else {
            String line;
            String[] arr;
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    list.add(arr);
                }
                for (String[] item : list) {
                    Country country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
                    countryList.add(country);
                }
                System.out.println("Danh sách các quốc gia");
                for (Country item : countryList) {
                    System.out.println(item);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
