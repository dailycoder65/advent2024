import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Advent1b  {
    // count total elements in second list found in first list and multiple by
    // total
    public static void main(String[] args) {

        int [] list1 = new int [1000]; 
        int [] list2 = new int [1000]; 
        
        try {
            int count = 0;
            File file = new File("locations.txt");
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

        int magicNumber = 0;
        int count;

        for (int value : list1) {
            count = countTotal(list2, value);
            magicNumber += value * count;
            System.out.println(value + " " + count + " " + (value * count));
        }
        System.out.println(magicNumber);
        
    }

    public static int countTotal(int [] list, int target) {
        int count = 0;
        for (int value : list) {
            if (value == target)
                count ++;
        }
        return count;
    }
}
