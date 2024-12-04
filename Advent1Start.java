import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LocationStart  {
    public static void main(String[] args) {

        int [] list1 = new int [1000]; 
        int [] list2 = new int [1000]; 
        
        try {
            int count = 0;
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextInt()) {
                list1[count] = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    list2[count] = scanner.nextInt();
                }
            count ++;
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);
        
    }
}
