
public abstract class MCAnswer extends Answer {
	protected String text;
	protected boolean selected;
	protected double creditIfSelected;
	
	protected MCAnswer(String text, double creditIfSelected) {
		this.text = text;
		this.creditIfSelected = creditIfSelected;
	}
	 
	public void print() {
		System.out.print(text + "\n");
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}


//Michael Gallagher
//mgalla28
/*
public abstract class Answer{
protected String text;
private boolean selectState;
private boolean correctState;
private double selVal;
private double unselVal;

public Answer(String input){
  text = input;
  selVal = 0.0;
  unselVal = 0.0;
}

public void print(int position){
  System.out.print("     ");
  System.out.print(position);
  System.out.print(".");
  System.out.print(text);
  System.out.print("\n");
}

public void setSelected(boolean setState){
  selectState = setState;
}

public void setValue(double input1, double input2){
  selVal = input1;
  unselVal = input2;
}

public double getValue(){
  if(selectState)
    return selVal;
  else
    return unselVal;
}
            */