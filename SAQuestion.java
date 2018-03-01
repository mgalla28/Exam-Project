import java.util.Scanner;

public class SAQuestion extends Question {
	public SAQuestion(String text, double maxValue) {
		super(text,maxValue);
	}
	
	public Answer getNewAnswer() {
		Scanner newAnswerInput = new Scanner(System.in);
		SAAnswer newAnswer = new SAAnswer(newAnswerInput.nextLine());
		newAnswerInput.nextLine();
		newAnswerInput.close();
		rightAnswer = newAnswer;
		return newAnswer;
		
	}
	
	public Answer getNewAnswer(String text) {
		SAAnswer newAnswer = new SAAnswer(text);
		rightAnswer = newAnswer;
		return newAnswer;
		
	}
	
	public Answer getAnswerFromStudent(){
		Scanner studentInput = new Scanner(System.in);
		if(studentInput.hasNextLine())
			studentAnswer = new SAAnswer(studentInput.nextLine());
		else {
			studentInput.close(); //Something weird was happening where this scanner would be opened by one class and used by the other after it should've closed, this solved that
			studentAnswer = getAnswerFromStudent();
		}
		return studentAnswer;
		
	}
	
	public double getValue(){
		if(studentAnswer == null)
			return 0.0;
		
		
		if(studentAnswer.getCredit(rightAnswer) == 1.0)
			return maxValue;
		else
			return 0.0;
		
	}
	
}
