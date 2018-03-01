
public class SAAnswer extends Answer {
	protected String text;
	
	public SAAnswer(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.print(text);
		System.out.print("\n");
	}
	

	public double getCredit(Answer rightAnswer) {
		if(rightAnswer == null)
			return 0.0;
		SAAnswer rightAnswer1 = (SAAnswer) rightAnswer;
		if(this.text.equals(rightAnswer1.text))
			return 1.0;
		else
			return 0.0;
	}
	
	

}
