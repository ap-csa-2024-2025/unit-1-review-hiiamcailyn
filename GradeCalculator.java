public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "Computer Science";
    int minWk = 30;
    int hrWk = (30 * 60);
    int hw1 = 90;
    int hw2 = 60;
    int hw3 = 30;
    int hw4 = 100;
    int avgHw = (90 + 60 + 30 + 100)/4;
    double quiz1 = 75.5;
    double quiz2 = 80.5;
    double avgQuiz = (75.5 + 80.5)/2;
    double finalExam = 99.9;
    double overallGrade = (avgHw * .35) + (avgQuiz * .15) * (finalExam * .50);
    int betteroverallGrade = (int) (overallGrade + 0.5);
    System.out.println("Course name :" + course );
    System.out.println( "Average time spent in a week for this course in minutes and hours: " +  minWk + " minutes or  " + hrWk + " hours");
    System.out.println( "Homework grades for this course: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println( "Quiz grades for this course: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println( "Average homework grade: " + avgHw);
    System.out.println( "Average quiz grade: " + avgQuiz);
    System.out.println( "Final exam grade for this course: " + finalExam);
    System.out.println( "Overall grade for this course: " + betteroverallGrade);



  }
}
