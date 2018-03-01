	//Michael Gallagher
	//mgalla28
public abstract class Question {
	  protected String text;
	  protected Answer rightAnswer;
	  protected Answer studentAnswer;
	  protected double maxValue;
	  
	  protected Question(String input, double maxValue){
	    text = input;
	    this.maxValue = maxValue;
	  }
	  
	  
	  public void print(){

	    System.out.print(text + "\n");

	  }
	  
	  public abstract Answer getNewAnswer();
	  
	  public abstract Answer getAnswerFromStudent();
	  
	  
	  
	  public abstract double getValue();
	  
}
