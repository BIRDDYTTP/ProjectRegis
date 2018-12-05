import java.util.ArrayList;

public class PostSubject extends Subject {
    private ArrayList<Subject> preSubject;
    public PostSubject(String subject, String subID, int credit, String description) {
        super(subject, subID, credit, description);
//        preSubject = new ArrayList<>();
    }

    public boolean checkPreSubIsAllPass(){
        int passing = 0;
        for (Subject subject : preSubject) {
            if (subject.isPassing()){
                passing++;
            }
        }
        if (passing == preSubject.size()){
            return true;
        }
        return false;
    }

    public ArrayList<Subject> getPreSubject() {
        return preSubject;
    }
}
