
public class MCSAAnswer extends MCAnswer {
	public MCSAAnswer(String text, double creditIfSelected) {
		super(text,creditIfSelected);
	}
	
	public double getCredit(Answer rightAnswer) {
		if(this == rightAnswer)
			return creditIfSelected;
		else
			return 0.0;
	}

}
