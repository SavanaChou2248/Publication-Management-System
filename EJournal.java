public class EJournal extends Journal {
    private String url;
    private int publicationFee;

    public EJournal(){
        url = null;
        publicationFee = 0;
    }

    public EJournal(String mURL, int mPublicationFee) {
        url = mURL;
        publicationFee = mPublicationFee;
    }

    public String getURL(){
        return url;
    }
    public int getPublicationFee() {
        return publicationFee;
    }

    public void setURL(String mURL) {
        url = mURL;
    }
    public void setPublicationFee(int mPublicationFee) {
        publicationFee = mPublicationFee;
    }
}