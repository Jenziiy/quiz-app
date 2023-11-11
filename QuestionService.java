import java.util.Scanner;

public class QuestionService {

  Question[] questions = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {
    questions[0] = new Question(1, "oldest lang", "Java", "c", "c++", "c#", "Java");
    questions[1] = new Question(2, "What 2", "Java", "c", "c++", "c#", "Java");
    questions[2] = new Question(3, "What 3", "Java", "c", "c++", "c#", "Java");
    questions[3] = new Question(4, "What 4", "Java", "c", "c++", "c#", "Java");
    questions[4] = new Question(5, "What 5", "Java", "c", "c++", "c#", "Java");
  }

  public void playQuiz() {
    int i = 0;
    for (Question question : questions) {
      System.out.println("Question no. : " + question.getId());
      System.out.println(question.getQuestion());
      System.out.println(question.getOpt1());
      System.out.println(question.getOpt2());
      System.out.println(question.getOpt3());
      System.out.println(question.getOpt4());
      Scanner sc = new Scanner(System.in);
      selection[i++] = sc.nextLine();
    }

    for (String s : selection) {
      System.out.println(s);
    }
  }

  public void printScore() {
    int score = 0;

    for (int i = 0; i < questions.length; i++) {
      Question question = questions[i];
      String actualAnswer = question.getAnswer();

      String userAnswer = selection[i];
      if (actualAnswer.equals(userAnswer))
        score++;
    }
    System.out.println("Your score is: " + score);
  }

}
