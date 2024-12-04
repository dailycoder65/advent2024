import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Advent2  {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String filePath = "reports.txt";
         try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int [] myIntArray = getIntArray(list.get(2));
        System.out.println(Arrays.toString(myIntArray));
//         for (String report: list) {
//             
//         }

    }

    public static int[] getIntArray(String report) {
        String [] strArray = report.split(" ");
        int [] intArray = new int[strArray.length];
        for (int i=0; i < strArray.length; i ++) {
           intArray[i] = Integer.parseInt(strArray[i]); 
        }
        return intArray;
    }
}
