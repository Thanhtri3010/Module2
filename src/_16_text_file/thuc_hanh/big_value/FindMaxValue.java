package _16_text_file.thuc_hanh.big_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("/Users/apple/Documents/C0322g1/CodeGym/Module2/src/_16_text_file/thuc_hanh/big_value/file/numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("/Users/apple/Documents/C0322g1/CodeGym/Module2/src/_16_text_file/thuc_hanh/big_value/file/result.txt", maxValue);
    }
}
