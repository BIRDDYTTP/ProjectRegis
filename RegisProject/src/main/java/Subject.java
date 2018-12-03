public class Subject {
    private String subject;
    private String subID;
    private int credit;
    private String description;
    private boolean passing;
    public Subject(String subject, String subID, int credit, String description) {
        this.subject = subject;
        this.subID = subID;
        this.credit = credit;
        this.description = description;
        this.passing = false;
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
