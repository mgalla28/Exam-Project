import java.util.ArrayList;

//Michael Gallagher
//mgalla28
public class Exam{
  private String text;
  private ArrayList<Question> qList;
  
  public Exam(String input){
    qList = new ArrayList<Question>();
    text = input;
  }
  
  public void addQuestion(Question q){
    qList.add(q);
  }
  
  public void print(){
    System.out.print(text);
    System.out.print("\n\n");
    for(int i = 0;i < qList.size();i++){
      System.out.print(i+1 + ". ");
      qList.get(i).print();
    }
  }
  
  public void reorderQuestions(){
    int seed;
    Question swap;
    int nQs = qList.size();
    for(int i = 0;i < nQs;i++){
      seed = (int)(Math.random() * nQs);
      swap =qList.get(seed);
      qList.set(seed, qList.get(i));
      qList.set(i, swap);
    }
  }
  
  public void reorderMCAnswers(int position) {
	  Question q = qList.get(position);
	  if(q instanceof MCQuestion) {
		  MCQuestion q1 = (MCQuestion) q; 
		  q1.reorderAnswers();
	  }
	  
  }
  
  void getAnswerfromStudent(int position) {
	  qList.get(position).getAnswerFromStudent();
  }

  
  public double getValue(){
    double score = 0.0;
    int nQs = qList.size();
    for(int i = 0;i < nQs;i++){
      score += qList.get(i).getValue();
    }
    return score;
  }
  
  public void reportQuestionValues() { 
	  for(int i = 0; i < qList.size();i++) {
		  System.out.print("Question " + (i+1) + " currently contributes " + qList.get(i).getValue() + " to the score\n");
	  }
	  System.out.println("The current total score is " + getValue());
  }
    
}