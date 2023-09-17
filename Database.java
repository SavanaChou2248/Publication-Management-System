import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Comparator;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;



public class Database{
    Scanner scnr = new Scanner(System.in);
    private HashMap<Integer, Publication> myDataBase= new HashMap<>();

    public void defaultDisplay() {
        System.out.println("Type in the number for the action that you want: ");
        System.out.println("1. Create a publication");
        System.out.println("2. Print information for a publication to a file ");
        System.out.println("3. List all publication");
        System.out.println("4. Delete a publication from the database");
        System.out.println("5. Exit");
    }

    public void CreatePublication() {
        System.out.println("What type of publication do you want to create? ");
        System.out.println("1. Book");
        System.out.println("2. Journal");
        System.out.println("3. EJournal");

        int type = scnr.nextInt();
        scnr.nextLine();

        if (type == 1) {
            Book myBook = new Book();
            System.out.println("What is the title? ");
            myBook.setTitle(scnr.nextLine());
            System.out.println("What is the year of publication? ");
            myBook.setYear(scnr.nextInt());
            scnr.nextLine();
            System.out.println("Who is the publisher? ");
            myBook.setPublisher(scnr.nextLine());
            System.out.println("What is the ISBN? ");
            myBook.setISBN(scnr.nextInt());
            scnr.nextLine();
            System.out.println("Who is the author? ");
            myBook.setAuthor(scnr.nextLine());
            System.out.println("How many number of pages is it? ");
            myBook.setPages(scnr.nextInt());
            scnr.nextLine();
            System.out.println("What is the binding type? ");
            myBook.setBindingType(scnr.nextLine());
            myDataBase.put(myBook.getISBN(), myBook);
        }
        else if (type == 2) {
            Journal myJournal = new Journal();
            System.out.println("What is the title? ");
            myJournal.setTitle(scnr.nextLine());
            System.out.println("What is the year of publication? ");
            myJournal.setYear(scnr.nextInt());
            scnr.nextLine();
            System.out.println("Who is the publisher? ");
            myJournal.setPublisher(scnr.nextLine());
            System.out.println("What is the ISBN? ");
            myJournal.setISBN(scnr.nextInt());
            scnr.nextLine();
            System.out.println("Who is the editor? ");
            myJournal.setEditor(scnr.nextLine());
            System.out.println("What is the issue number? ");
            myJournal.setIssueNum(scnr.nextInt());
            scnr.nextLine();
            myDataBase.put(myJournal.getISBN(), myJournal);

        }
        else if (type == 3) {
            EJournal myEjournal = new EJournal();
            System.out.println("What is the title? ");
            myEjournal.setTitle(scnr.nextLine());
            System.out.println("What is the year of publication? ");
            myEjournal.setYear(scnr.nextInt());
            scnr.nextLine();
            System.out.println("Who is the publisher? ");
            myEjournal.setPublisher(scnr.nextLine());
            System.out.println("What is the ISBN? ");
            myEjournal.setISBN(scnr.nextInt());
            scnr.nextLine();
            System.out.println("Who is the editor? ");
            myEjournal.setEditor(scnr.nextLine());
            System.out.println("What is the issue number? ");
            myEjournal.setIssueNum(scnr.nextInt());
            scnr.nextLine();
            System.out.println("What is the url?");
            myEjournal.setURL(scnr.nextLine());
            System.out.println("What is the publication fee?");
            myEjournal.setPublicationFee(scnr.nextInt());
            scnr.nextLine();
            myDataBase.put(myEjournal.getISBN(), myEjournal);

        }
    }

    public void printInfo(){
        System.out.println("What is the file name that you want to print to? ");
        String fileName = scnr.nextLine();
        System.out.println("What is the ISBN of the publication that you want to print to the file? ");
        int userISBN = scnr.nextInt();
        scnr.nextLine();

        Publication myPublication = myDataBase.get(userISBN);
        myPublication.print(fileName);
    }

    public void printAll() {
        ArrayList<Publication> publications = new ArrayList<>(myDataBase.values());
        Collections.sort(publications);
        for (Publication myPublication: publications) {
            System.out.println(myPublication);
        }
    }

    public void deletePublication() {
        System.out.println("What is the ISBN of the publication that you want to delete?");
        int delISBN = scnr.nextInt();
        scnr.nextLine();
        if (myDataBase.containsKey(delISBN)) {
            myDataBase.remove(delISBN);
            System.out.println("Your publication has been removed");
        }
        else {
            System.out.println("Publication not found");
        }

    }


}