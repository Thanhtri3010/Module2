package _16_text_file.bai_tap.coppy_file_text;

import java.io.*;

public class CoppyFileText {
    public static void main(String[] args) {
        File sourceFile = new File("src/_16_text_file/bai_tap/coppy_file_text/source_file.csv");
        File targetFile = new File("src/_16_text_file/bai_tap/coppy_file_text/target_file.csv");
        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại");
        } else if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại");
        } else {
            try (FileReader fileReader = new FileReader(sourceFile);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
                 FileWriter fileWriter = new FileWriter(targetFile);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                String line;
                int count = 0;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    count += line.length();
                }
                bufferedWriter.write("Số ký tự trong tệp  " + count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
