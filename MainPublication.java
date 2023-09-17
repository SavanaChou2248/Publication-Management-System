import java.util.Scanner;

public class MainPublication {
    public static void main(String[] argv) {
        Database myDataBase = new Database();
        Scanner scnr = new Scanner(System.in);
        
        int defaultAnswer = 0;

        while (defaultAnswer != 5) {
            myDataBase.defaultDisplay();
            defaultAnswer = scnr.nextInt();

            if (defaultAnswer == 1) {
                myDataBase.CreatePublication();
            }
            else if(defaultAnswer == 2) {
                myDataBase.printInfo();
            }
            else if(defaultAnswer == 3) {
                myDataBase.printAll();
            }
            else if (defaultAnswer == 4) {
                myDataBase.deletePublication();
            }
        }
        


    }
}