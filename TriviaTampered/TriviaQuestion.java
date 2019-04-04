public abstract class TriviaQuestion {
    private String question;
    private String answer;
    private int value;
    
    public TriviaQuestion( String q, String a, int v){
        question = q;
        answer = a;
        value = v;
    }

    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public int getValue() {
        return value;
    }
    
    abstract public boolean checkAnswer( String answer );
}