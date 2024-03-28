import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {

    private static String correctAnswer;
    private static String text;
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void presentQuestions() {
        for (Question question : questions) {
            System.out.println(question.getText());
            for (String answerChoice : question.getAnswerChoices()) {
                System.out.println(answerChoice);
            }

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals(question.getCorrectAnswer())) {
                score++;
            }
        }
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        System.out.println("\nQUIZ\n");

        quiz.addQuestion(new Question("Is hyderabad capital of Telangana?", "yes"));
        quiz.addQuestion(new Question("Is pakistan a enemy of india?", "yes"));
        quiz.addQuestion(new Question("Was hitler kind and gentleman?", "no"));
        quiz.addQuestion(new Question("Does israel support india?", "yes"));
        quiz.addQuestion(new Question("Was hiroshima bombed by usa?", "yes"));
        quiz.addQuestion(new Question("Were britshers good people?", "no"));
        quiz.addQuestion(new Question("Is india democartic nation?", "yes"));
        quiz.addQuestion(new Question("Is Mounteverest tallest mountain?", "yes"));
        quiz.addQuestion(new Question("Is Marina trech lowest point?", "yes"));
        quiz.addQuestion(new Question("Is indiapoorest nation?", "no"));

        quiz.presentQuestions();

        System.out.println("Your score is: " + quiz.getScore());
        
        if(quiz.getScore()<=5)
        {
            System.out.println("better luck next time\nneed to improve yourr skills");
        }
        else if(quiz.getScore()>5 & quiz.getScore()<10)
        {
            System.out.println("You have scored above average\nAmazing result, keep it up, keep learning");
        }
        else{
            System.out.println("youscored full marks 10/10");
        }

    }
}

class Question {

    private String text;
    private String correctAnswer;
    private ArrayList<String> answerChoices;

    public Question(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        answerChoices = new ArrayList<>();
    }

    public void addAnswerChoice(String answerChoice) {
        answerChoices.add(answerChoice);
    }

    public String getText() {
        return text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    public String getcorrectAnswer() {
        return correctAnswer;

    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }
}