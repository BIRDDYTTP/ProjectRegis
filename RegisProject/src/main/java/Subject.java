import java.util.ArrayList;

public class Subject {
    private String subject;
    private String subID;
    private int credit;
    private String description;
    private ArrayList<String> presubject;
    private boolean passing;
    private String hardRate;
    public Subject(String subject, String subID, int credit, String description, ArrayList<String> presubject, String hardRate) {
        this.subject = subject;
        this.subID = subID;
        this.credit = credit;
        this.description = description;
        this.presubject = presubject;
        this.passing = false;
        this.hardRate = hardRate;
    }

    public String getHardRate() {
        return hardRate;
    }

    public ArrayList<String> getPresubject() {
        return presubject;
    }

    public void setPassing(boolean passing) {
        this.passing = passing;
    }

    public boolean isPassing() {
        return passing;
    }

    public String getSubject() {
        return subject;
    }

    public String getSubID() {
        return subID;
    }

    public int getCredit() {
        return credit;
    }

    public String getDescription() {
        return description;
    }

}
