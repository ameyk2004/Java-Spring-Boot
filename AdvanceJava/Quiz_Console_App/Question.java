package AdvanceJava.Quiz_Console_App;

public class Question {

    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;

    private String correctAnswer;


    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        String question = "";
        
        question += "\n--------------------------------------------------------------\n";
        question +="Q"+getId()+". "+getQuestion()+"\n";
        question +="1) "+getOpt1()+"\t2) "+getOpt2()+"\n";
        question +="3) "+getOpt3()+"\t4) "+getOpt4()+"\n";
        question +="--------------------------------------------------------------";

        return question;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return this.opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return this.opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return this.opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return this.opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
