import java.util.ArrayList;

public abstract class MCQuestion extends Question {
	protected ArrayList<MCAnswer> answers;
	
	public MCQuestion(String text,double maxValue) {
		super(text,maxValue);
		answers = new ArrayList<MCAnswer>();
	}
	
	public void print(){ //Currently supporting up to 6 answers
		System.out.print(text + "\n");
		for(int i = 0;i < answers.size();i++) {
			switch(i) {
			case 0: System.out.print("    A. "); answers.get(i).print(); break;
			case 1: System.out.print("    B. "); answers.get(i).print(); break;
			case 2: System.out.print("    C. "); answers.get(i).print(); break;
			case 3: System.out.print("    D. "); answers.get(i).print(); break;
			case 4: System.out.print("    E. "); answers.get(i).print(); break;
			case 5: System.out.print("    F. "); answers.get(i).print(); break;
			}
		}
	}
	
	public void addAnswers(MCAnswer ans) {
		answers.add(ans);
	}
	
	public void reorderAnswers() {
	    int seed;
	    MCAnswer swap;
	    int nAs = answers.size();
	    for(int i = 0;i < nAs;i++){
	      seed = (int)(Math.random() * nAs);
	      swap =answers.get(seed);
	      answers.set(seed, answers.get(i));
	      answers.set(i, swap);
	    }
	}
	/*  
	  public void unselectAnswer(int position){
		    ansArr[position].setSelected(false);
		  }
		  
		  public void selectAnswer(int position){
		    for(int i = 0;i < nAnswers;i++){
		      unselectAnswer(i);
		    }
		    ansArr[position].setSelected(true);
		  }
		  
		  public void reorderAnswers(){
			    int seed;
			    Answer swap;
			    for(int i = 0;i < nAnswers;i++){
			      seed = (int)(Math.random() * nAnswers);
			      swap = ansArr[seed];
			      ansArr[seed] = ansArr[i];
			      ansArr[i] = swap;
			    }
			  }
		  
		  public void addAnswer(Answer ans){
			    ansArr[nAnswers] = ans;
			    nAnswers++;
			  }
		*/	  
}
