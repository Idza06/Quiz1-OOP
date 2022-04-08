package quizoop;
import quizoop.company.web;
/**
 * @author Qibran Idza L - 123200141
 */
public class webCount implements web{
    double writingB, codingB, interviewB, result;
    String information = "Sorry, you aren't accept as Web development";
    
    //constructor
    public webCount(double writingB, double codingB, double interviewB) {
        this.writingB = writingB;
        this.codingB = codingB;
        this.interviewB = interviewB;
    }

    public void setWritingB(double writingB) {
        this.writingB = writingB;
    }

    public void setCodingB(double codingB) {
        this.codingB = codingB;
    }

    public void setinterviewB(double interviewB) {
        this.interviewB = interviewB;
    }
    
    //method
    @Override
    public double writingB() {
        writingB = writingB * 0.40;
        return writingB;
    }
    
    @Override
    public double codingB() {
        codingB = codingB * 0.35;
        return codingB;
    }

    @Override
    public double interviewB() {
        interviewB = interviewB * 0.25;
        return interviewB;
    }

    public double result(){
        result = writingB() + codingB() + interviewB();
        return result;
    }

    public String information(){
        if (result >= 85){
            information = "Congrats! You are accepted as Web Development";
        }
        return information;
    }
}