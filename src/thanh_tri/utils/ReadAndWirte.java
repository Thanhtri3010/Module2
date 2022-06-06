package thanh_tri.utils;

import thanh_tri.models.Students;
import thanh_tri.models.Teacher;

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

    public static void writeStuden(String pathFile, List<Students> students) {
        List<String> list = new ArrayList<>();
        for (Students item : students) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeTeacher(String pathFile, List<Teacher> teachers) {
        List<String> list = new ArrayList<>();
        for (Teacher item : teachers) {
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

    public static List<Students> readStudent(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Students> studentsList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            studentsList.add(new Students(item[0], item[1], item[2], item[3], item[4], Float.parseFloat(item[5])));
        }
        return studentsList;
    }

    public static List<Teacher> readTeacher(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Teacher> teacherList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            teacherList.add(new Teacher(item[0], item[1], item[2], item[3], item[4]));
        }
        return teacherList;
    }
}
