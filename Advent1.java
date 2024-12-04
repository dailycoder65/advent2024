import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Advent1  {
    //compare distance between values in two sorted lists
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        try {
            File file = new File("locations.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextInt()) {
                list1.add(scanner.nextInt());
                if (scanner.hasNextInt()) {
                    list2.add(scanner.nextInt());
                }
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        int overallDistance =  0;
        for (int i=0; i < list1.size(); i ++) {
            overallDistance += Math.abs(list1.get(i) - list2.get(i));
        }
        System.out.println("answer: " + overallDistance);
    }
}
