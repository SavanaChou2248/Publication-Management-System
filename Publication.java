import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Publication implements Comparable<Publication>, Printable{
    private String title;
    private int year;
    private String publisher;
    private int ISBN; 

    public Publication() {
        title = null;
        year = 0;
        publisher = null;
        ISBN = 0;
    }

    public Publication(String mTitle, int mYear, String mPublisher, int mISBN) {
        title = mTitle;
        year = mYear;
        publisher = mPublisher;
        ISBN = mISBN;
    }

    public Publication(Publication p){
        title = p.getTitle();
        year = p.getYear();
        publisher = p.getPublisher();
        ISBN = p.getISBN();

    }

    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getISBN() {
        return ISBN;
    }
    

    public void setTitle(String mTitle) {
        title = mTitle;
    }
    public void setYear(int mYear) {
        year = mYear;
    }
    public void setPublisher(String mPublisher) {
        publisher = mPublisher;
    }
    public void setISBN(int mISBN) {
        ISBN = mISBN;
    }


    @Override
    public int compareTo(Publication otherPublication) {
        if (this.year != otherPublication.year) {
            return this.year - otherPublication.year;
        } 
        else {
            return this.title.compareTo(otherPublication.title);
        }
    }

    @Override
    public String toString() {
        return "Publication:\n" + 
        "  title: " + title + "\n" +
        "  publication year: " + year;
    }

    @Override
    public void print(String fileName) {
        try (PrintWriter fileWriter = new PrintWriter(fileName)) {
            fileWriter.print("Title: " + getTitle());
            fileWriter.print(", Year: " + getYear());
            fileWriter.print(", Publisher: " + getPublisher());
            fileWriter.print(", ISBN: " + getISBN());
            fileWriter.println();
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}