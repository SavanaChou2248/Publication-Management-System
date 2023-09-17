public class Journal extends Publication {
    private String editor;
    private int issueNum;

    public Journal() {
        editor = null;
        issueNum = 0;
    }

    public Journal(String mEditor, int mIssueNum) {
        editor = mEditor;
        issueNum = mIssueNum;
    }

    public String getEditor() {
        return editor;
    }
    public int getIssueNum() {
        return issueNum;
    }

    public void setEditor(String mEditor) {
        editor = mEditor;
    }
    public void setIssueNum(int mIssueNum) {
        issueNum = mIssueNum;
    }
}