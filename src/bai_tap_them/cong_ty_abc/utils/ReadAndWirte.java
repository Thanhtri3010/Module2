package bai_tap_them.cong_ty_abc.utils;

import bai_tap_them.cong_ty_abc.models.ManagementStaff;
import bai_tap_them.cong_ty_abc.models.ProductionStaff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWirte {
    public static void writeFile(String pathFile, List<String> list) {
        File file = new File(pathFile);
        try (
                FileWriter fileWriter = new FileWriter(pathFile, false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String data : list) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void writeManagementStaff(String pathFile, List<ManagementStaff> managementStaffs) {
        List<String> list = new ArrayList<>();
        for (ManagementStaff item : managementStaffs) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeProduction(String pathFile, List<ProductionStaff> productionStaffs) {
        List<String> list = new ArrayList<>();
        for (ProductionStaff item : productionStaffs) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static List<String> readFile(String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals(""))
                    list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<ManagementStaff> readManagementStaff(String pathFile) {
        List<String> list = readFile(pathFile);
        List<ManagementStaff> managementStaffList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            managementStaffList.add(new ManagementStaff(Integer.parseInt(item[0]),item[1],item[2],item[3],item[4],Double.parseDouble(item[5]),Double.parseDouble(item[6])));
        }
        return managementStaffList;
    }

    public static List<ProductionStaff> readProduction(String pathFile) {
        List<String> list = readFile(pathFile);
        List<ProductionStaff> productionStaffList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            productionStaffList.add(new ProductionStaff(Integer.parseInt(item[0]),item[1],item[2],item[3],item[4],Double.parseDouble(item[5]),Double.parseDouble(item[6])));
        }
        return productionStaffList;
    }
}
