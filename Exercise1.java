// T. Urness
// Array List demonstration

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        boolean finished = false;
        String item = "";

        while (finished == false) {
            System.out.print("Enter in a grocery item: ");
            item = keyboard.nextLine();
            if (!item.equals("done")) {
                groceryList.add(item);
            }
            else {
                finished = true;
            }
        }
        keyboard.close();

        System.out.println("There are " + groceryList.size() + " items");

        for(String product : groceryList) {
            System.out.println(product);
        }

    }    
}
