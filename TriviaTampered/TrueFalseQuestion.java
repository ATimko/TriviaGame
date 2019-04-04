public class TrueFalseQuestion extends TriviaQuestion {  
    public TrueFalseQuestion(String q, String a, int v) {
    // super calls TriviaQuestions q, a and v
        super( q, a, v );
    }
    public boolean checkAnswer( String answer ) {
        return getAnswer().equals( answer.toUpperCase().substring(0,1) );
    }
}