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


        int [] myIntArray = getIntArray(list.get(3));
        System.out.println(Arrays.toString(myIntArray));
//         for (String report: list) :w
//             
//         }

        int [] arr1 = {1,2,3,4,5,5};
        int [] arr2 = {5,4,3,2,1,1};
        int [] arr3 = {8,4,1,9,7,6};
        System.out.println(isIncreasing(arr1));
        System.out.println(isIncreasing(arr2));
        System.out.println(isIncreasing(arr3));
    }

    public static boolean isIncreasing(int [] arr) {
        boolean increasing = true;
        int spacing;
        for (int i=0; i < arr.length; i++) {
//            System.out.println(arr[i+1] + " " + arr[i]);
 //           spacing = arr[i+i] - arr[i];
  //          System.out.println("spacing: " + spacing);
            if (arr[i+1] <= arr[i] && (arr[i+1] - arr[i]) >= 1 && (arr[i+1] - arr[i]) <=3 )
                return false;
        }
        return increasing;
    }

    public static boolean isDecreasing(int [] arr) {

        return false;
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
