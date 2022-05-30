package bai_tap_them;

import java.io.CharArrayReader;
import java.io.IOException;

public class j {
    public static void main(String[] args) {
        String x = "user@fpt.edu.vn";
        String y = "\\w+@\\w+(\\.\\w+){1,2}";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }


    }
}
