import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Advent2v2  {
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

        int total = 0; 
        for (int i=0; i < 1000; i++) {
            int [] myIntArray = getIntArray(list.get(i));
            if (isIncreasingOrDecreasing(myIntArray)) {
                System.out.println(i + ": " + Arrays.toString(myIntArray));
                total ++;
            } else {
                System.out.println("UNSAFE: "+ i+": "+  Arrays.toString(myIntArray));
            }
        
        }

        System.out.println(total);
    }

    public static boolean isIncreasingOrDecreasing(int [] arr) {
        int spacing;
        for (int i=0; i < arr.length-1; i++) {
            int val1 = (arr[i]);
            int val2 = (arr[i+1]);
            spacing = Math.abs(val1 - val2);

            if (spacing < 1 || spacing > 3) {
                System.out.println("spacing off");
                return false;
            }

            //check if increasing
            if (arr[i+1] <= arr[i]) {
                System.out.println("increasing");
                return true;
            } else {
                System.out.println("not increasing");
                break;
            }
            
        }

        for (int i=0; i < arr.length-1; i++) {
            //check if decreasing
            if (arr[i] <= arr[i+1]) { 
                System.out.println("no decreasing either");
                return false;
            }
        }

        System.out.println("decreasing");
        return true;
    }

    public static boolean isIncreasing(int [] arr) {
        System.out.println(Arrays.toString(arr));
        boolean increasing = true;
        int spacing;
        for (int i=0; i < arr.length-1; i++) {
            int val1 = (arr[i]);
            int val2 = (arr[i+1]);
            spacing = Math.abs(val1 - val2);
            if (spacing < 1 || spacing > 3) return false;
           // System.out.println("arr lenght: " + arr.length + " " + i);
            if (arr[i+1] <= arr[i])
                return false;
        }
        return increasing;
    }

    public static boolean isDecreasing(int [] arr) {
        System.out.println("decreasing " + Arrays.toString(arr));
        boolean decreasing = true;
        int spacing;
        for (int i=0; i < arr.length-1; i++) {
            int val1 = (arr[i]);
            int val2 = (arr[i+1]);
            spacing = Math.abs(val1 - val2);
            if (spacing < 1 || spacing > 3) return false;            
            System.out.println(i + " " + (i+1));
            System.out.println(arr[i] + " " + arr[i+1]);
            if (arr[i] <= arr[i+1])
                return false;
        }
        return decreasing;
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
