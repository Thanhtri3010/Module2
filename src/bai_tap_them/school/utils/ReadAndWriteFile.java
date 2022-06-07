package bai_tap_them.school.utils;

import bai_tap_them.school.models.Student;
import bai_tap_them.school.models.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
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

    public static void writeStudent(String pathFile, List<Student> student) {
        List<String> list = new ArrayList<>();
        for (Student item : student) {
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

    public static List<Student> readStudent(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Student> studentsList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            studentsList.add(new Student(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], item[5], Double.parseDouble(item[6])));
        }
        return studentsList;
    }

    public static List<Teacher> readTeacher(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Teacher> teachersList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            teachersList.add(new Teacher(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
        }
        return teachersList;
    }
}
