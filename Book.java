public class Book extends Publication {
    private String author;
    private int pages;
    private String bindingType;

    public Book() {
        author = null;
        pages = 0;
        bindingType = null;
    }

    public Book(String mAuthor, int mPages, String mBindingType) {
        author = mAuthor;
        pages = mPages;
        bindingType = mBindingType;
    }

    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
    public String getBindingType(){
        return bindingType;
    }

    public void setAuthor(String mAuthor) {
        author = mAuthor;
    }
    public void setPages(int mPages) {
        pages = mPages;
    }
    public void setBindingType(String mBindingType) {
        bindingType = mBindingType;
    }

}