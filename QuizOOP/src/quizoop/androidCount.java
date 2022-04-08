package quizoop;
import quizoop.company.android;
/**
 * @author Qibran Idza L - 123200141
 */
public class androidCount implements android{
    double writing, coding, interview, result;
    String information = "Sorry, you aren't accept as Android";
    
    //constructor
    public androidCount(double writing, double coding, double interview) {
        this.writing = writing;
        this.coding = coding;
        this.interview = interview;
    }

    public void setWriting(double writing) {
        this.writing = writing;
    }

    public void setContent(double coding) {
        this.coding = coding;
    }

    public void setinterview(double interview) {
        this.interview = interview;
    }

    //method
    @Override
    public double writing() {
        writing = writing * 0.20;
        return writing;
    }
    
    @Override
    public double coding() {
        coding = coding * 0.50;
        return coding;
    }

    @Override
    public double interview() {
        interview = interview * 0.30;
        return interview;
    }

    public double result(){
        result = writing() + coding() + interview();
        return result;
    }

    public String information(){
        if (result >= 85){
            information = "Congrats! You are accepted as Android";
        }
        return information;
    }
}