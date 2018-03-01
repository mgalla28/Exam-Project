//Michael Gallagher
//mgalla28


public class ExamTester{
  public static void main(String[] args){
    System.out.print("Michael Gallagher\n");
    System.out.print("mgalla28\n");
    Exam e1 = new Exam("This is my test exam");
    
    SAQuestion q1 = new SAQuestion("What city is UIC in?",1.0);
    q1.getNewAnswer("Chicago");
    
    SAQuestion q2 = new SAQuestion("What city is State is Chicago in?",1.0);
    q2.getNewAnswer("Illinois");
    
    SAQuestion q3 = new SAQuestion("Who is the professor for this class?",1.0);
    q3.getNewAnswer("John Bell");
    
    MCSAQuestion q4 = new MCSAQuestion("Where is Europe?",1.0);
    q4.getNewAnswer("West of America",1.0);
    q4.getNewAnswer("South of Africa");
    q4.getNewAnswer("Asia");
    q4.getNewAnswer("The Moon");
    q4.getNewAnswer("North of America");
    
    MCSAQuestion q5 = new MCSAQuestion("What grade will I receive on this assignment?",1.0);
    q5.getNewAnswer("100%",1.0);
    q5.getNewAnswer("99%");
    q5.getNewAnswer("98%");
    q5.getNewAnswer("97%");
    q5.getNewAnswer("96%");
    
    
    e1.addQuestion(q1);
    e1.addQuestion(q2);
    e1.addQuestion(q3);
    e1.addQuestion(q4);
    e1.addQuestion(q5);
    e1.print();

    e1.reorderQuestions();    System.out.print("Questions and mc answers will now be reordered and the exam will print again\n\n");
    for(int i = 0;i < 5;i++) {
    	e1.reorderMCAnswers(i);
    }
    e1.print();
    
    System.out.print("Please answer question 1\n");
    e1.getAnswerfromStudent(0);
    System.out.print("Please answer question 2\n");
    e1.getAnswerfromStudent(1);
    System.out.print("Please answer question 3\n");
    e1.getAnswerfromStudent(2);
    System.out.print("Please answer question 4\n");
    e1.getAnswerfromStudent(3);
    System.out.print("Please answer question 5\n");
    e1.getAnswerfromStudent(4);

    e1.reportQuestionValues();
  }
}