import java.util.Scanner;

public class MCSAQuestion extends MCQuestion {
	public MCSAQuestion(String text,double maxValue) {
		super(text,maxValue);
	}
	
	public Answer getNewAnswer() {
		Scanner newAnswerInput = new Scanner(System.in);
		MCSAAnswer newAnswer = new MCSAAnswer(newAnswerInput.nextLine(),0.0); //0.0 is default value, assumes it's a wrong answer
		newAnswerInput.nextLine();
		newAnswerInput.close();
		answers.add(newAnswer);
		return newAnswer;
	}
	
	
	
	public Answer getNewAnswer(String text) {
		MCSAAnswer newAnswer = new MCSAAnswer(text,0.0);
		answers.add(newAnswer);
		return newAnswer;
	}
	
	public Answer getNewAnswer(String text,double creditIfSelected) {
		MCSAAnswer newAnswer = new MCSAAnswer(text,creditIfSelected);
		answers.add(newAnswer); 
		rightAnswer = newAnswer; //should be the only right answer for this question if you get credit for it
		return newAnswer;
	}
	
	public Answer getAnswerFromStudent() {
		Scanner studentInput = new Scanner(System.in);
		char input = 0;
		if(studentInput.hasNextLine())
			input = studentInput.next().charAt(0);
		else {
			studentInput.close(); //Something weird was happening where this scanner would be opened by one class and used by the other after it should've closed, this solved that
			studentAnswer = getAnswerFromStudent();
		}
		switch(input) {
		case 'A': studentAnswer = answers.get(0); break;
		case 'a': studentAnswer = answers.get(0); break;
		case 'B': studentAnswer = answers.get(1); break;
		case 'b': studentAnswer = answers.get(1); break;
		case 'C': studentAnswer = answers.get(2); break;
		case 'c': studentAnswer = answers.get(2); break;
		case 'D': studentAnswer = answers.get(3); break;
		case 'd': studentAnswer = answers.get(3); break;
		case 'E': studentAnswer = answers.get(4); break;
		case 'e': studentAnswer = answers.get(4); break;
		case 'F': studentAnswer = answers.get(5); break;
		case 'f': studentAnswer = answers.get(5); break;
		
		}
		return studentAnswer;
	}
	
	public double getValue() {
		if(studentAnswer == null)
			return 0.0;
		return studentAnswer.getCredit(this.rightAnswer);
	}
	

}
