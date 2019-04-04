import java.util.ArrayList;

public class TriviaData {
	private ArrayList<TriviaQuestion> data;

	public TriviaData() {
		data = new ArrayList<TriviaQuestion>();
	}

	public void addQuestion( TriviaQuestion q ) {
		data.add(q);
	}

	public void showQuestion(int index) {
		TriviaQuestion q = data.get(index);
		System.out.println("Question " + (index +1) + ".  " + q.getValue() + " points.");
	    System.out.println( q.getQuestion() );
        if (q instanceof TrueFalseQuestion) {
			System.out.println("Enter 'T' for true or 'F' for false.");
		}
	}

	public int numQuestions() {
		return data.size();
	}

	public TriviaQuestion getQuestion(int index) {
		return data.get(index);
	}
}