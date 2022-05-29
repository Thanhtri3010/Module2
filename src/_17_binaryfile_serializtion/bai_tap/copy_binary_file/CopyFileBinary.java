package _17_binaryfile_serializtion.bai_tap.copy_binary_file;

import java.io.*;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) {
        File source = new File("src/_17_binaryfile_serializtion/bai_tap/copy_binary_file/file_source.csv");
        File target = new File("src/_17_binaryfile_serializtion/bai_tap/copy_binary_file/file_target.csv");
        if (!source.exists()) {
            System.out.println("Source file not found.");
        } else if (target.exists()) {
            System.out.println("Target file is exist.");
        } else {
            int count = 0;
            try (FileInputStream fis = new FileInputStream(source);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 FileOutputStream fos = new FileOutputStream(target);
                 BufferedOutputStream bos = new BufferedOutputStream(fos)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = bis.read(buffer)) > 0) {
                    bos.write(buffer, 0, length);
                    count++;
                }
                System.out.println("Number of bytes used: " + count + " byte.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
