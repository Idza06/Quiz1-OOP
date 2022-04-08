package quizoop;
import java.util.Scanner;
/**
 * @author Qibran Idza L - 123200141
 */
public class main {
    public static void main(String[] args) {
        
        double writing, coding, interview;
        double writingB, codingB, interviewB;

        Scanner input = new Scanner(System.in);
        
        System.out.println(" =============================== ");
        System.out.println(" Registration Form PT. Keenz");
        System.out.println(" =============================== ");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose Form type : ");
        int chooseCtgr = input.nextInt();

        switch (chooseCtgr){
            case 1 :
                int chooseCtgr1;
                System.out.println(" ");
                System.out.println("==== Registration From ====");
                System.out.print("Student Number : ");
                String idA = input.next();
                System.out.print("Name : ");
                String nameA = input.next();
                System.out.print("Input Writing Exam Score : ");
                writing = input.nextDouble();
                System.out.print("Input Coding Test Score  : ");
                coding = input.nextDouble();
                System.out.print("Input Interview Test Score : ");
                interview = input.nextDouble();
                androidCount andrdCnt = new androidCount(writing, coding, interview);

                do{
                    System.out.println(" ");
                    System.out.println("========= ");
                    System.out.println(" Menu : ");
                    System.out.println("========= ");
                    System.out.println("1. Output");
                    System.out.println("2. Edit");
                    System.out.println("3. Exit");
                    System.out.print("Choose : ");
                    chooseCtgr1 = input.nextInt();

                    if (chooseCtgr1 == 1){
                        System.out.println("Final score : " + andrdCnt.result());
                        System.out.println("Information : " + andrdCnt.information());
                    } else if(chooseCtgr1 == 2){
                        System.out.println("=== Edit Form ===");
                        System.out.print("Input Writing Exam Score : ");
                        writing = input.nextDouble();
                        andrdCnt.setWriting(writing);
                        System.out.print("Input Coding Test Score : ");
                        coding = input.nextDouble();
                        andrdCnt.setContent(coding);
                        System.out.print("Input Interview Test Score : ");
                        interview = input.nextDouble();
                        andrdCnt.setinterview(interview);
                    }
                }while(chooseCtgr1 != 3);
                    break;

            case 2 :
                int chooseCtgr2;
                System.out.println(" ");
                System.out.println("==== Registration From ====");
                System.out.print("Student Number : ");
                String idB = input.next();
                System.out.print("Name : ");
                String nameB = input.next();
                System.out.print("Input Writing Exam Score : ");
                writingB = input.nextDouble();
                System.out.print("Input Coding Test Score  : ");
                codingB = input.nextDouble();
                System.out.print("Input Interview Test Score : ");
                interviewB = input.nextDouble();
                webCount webCnt = new webCount(writingB, codingB, interviewB);

                do{
                    System.out.println(" ");
                    System.out.println("========= ");
                    System.out.println(" Menu : ");
                    System.out.println("========= ");
                    System.out.println("1. Output");
                    System.out.println("2. Edit");
                    System.out.println("3. Exit");
                    System.out.print("Choose : ");
                    chooseCtgr2 = input.nextInt();

                    if (chooseCtgr2 == 1){
                        System.out.println("Final score: " + webCnt.result());
                        System.out.println("Information : " + webCnt.information());
                    } else if(chooseCtgr2 == 2){
                        System.out.println("=== Edit Form ===");
                        System.out.print("Input Writing Exam Score : ");
                        writingB = input.nextDouble();
                        webCnt.setWritingB(writingB);
                        System.out.print("Input Coding Test Score : ");
                        codingB = input.nextDouble();
                        webCnt.setCodingB(codingB);
                        System.out.print("Input Interview Test Score : ");
                        interviewB = input.nextDouble();
                        webCnt.setinterviewB(interviewB);
                    }
                }while(chooseCtgr2 != 3);
                    break;
        }
    }
}