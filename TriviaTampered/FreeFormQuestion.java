public class FreeFormQuestion extends TriviaQuestion {
    
    public FreeFormQuestion(String q, String a, int v) {
    // super calls TriviaQuestions q, a and v
        super( q, a, v );
    }
    
    public boolean checkAnswer( String answer ){
        return this.getAnswer().toLowerCase().equals( answer.toLowerCase() );
    }
}