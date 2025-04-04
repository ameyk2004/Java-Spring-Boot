package AdvanceJava.Quiz_Console_App;

import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    static int score = 0;

    public QuestionService() {
        questions[0] = new Question(1, "Which year did MSD win the T20 WC?", "2007", "2011", "2013", "2015", "2007");
        questions[1] = new Question(2, "Which IPL team does MSD captain?", "MI", "RCB", "CSK", "DC", "CSK");
        questions[2] = new Question(3, "MSD's highest ODI score?", "183", "150", "175", "200", "183");
        questions[3] = new Question(4, "Which team did MSD debut against?", "Pakistan", "Australia", "England", "Sri Lanka", "Bangladesh");
        questions[4] = new Question(5, "How many IPL trophies has MSD won?", "3", "4", "5", "6", "5");

    }

    public static void calculateScore(boolean correct){
        if(correct){
            score+=4;
        }
        else if(!correct){
            score-=1;
        }
        
        System.out.println("\nYour Score : ("+score+"/20)");
    }

    public void checkAnswer(Question q){
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        String usersChoice = "";

        switch (userInput) {

            case 1:
                usersChoice = q.getOpt1(); 
                break;

                case 2:
                usersChoice = q.getOpt2(); 
                break;

                case 3:
                usersChoice = q.getOpt3(); 
                break;

                case 4:
                usersChoice = q.getOpt4(); 
                break;
        
            default:
            break;
        }

        System.out.println("Your choice : "+usersChoice);
        System.out.println("Correct Answer : "+q.getCorrectAnswer());

        if(usersChoice.equals(q.getCorrectAnswer())){
            System.out.println("WOOH ! Correct Answer");
            calculateScore(true);
        }
        else{
            System.out.println("Oops ! Wrong Answer, Better luck next Time");
            calculateScore(false);
        }
    }

    public void playQuiz(){

        System.out.println("Questions on MS Dhoni");

        for(Question q: questions){
            System.out.println(q);
            checkAnswer(q);
        }

    }
}
