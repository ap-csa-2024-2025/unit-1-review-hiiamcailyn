public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "compsci";
    int minWk = 30;
    int hrWk = (30 * 60);
    int hw1 = 90;
    int hw2 = 60;
    int hw3 = 30;
    int hw4 = 100;
    int avgHw = (90 + 60 + 30 + 100)/4
    double quiz1 = 75.5;
    double quiz2 = 80.5;
    double avgQuiz = (75.5 + 80.5)/2;
    double finalExam = 99.9
    System.out.println(":course name :"  course );
    System.out.println( " average time spent in a week for this course in minutes and hours: " +  minWk + " minutes or  " + hrWk + " hours");
    System.out.println( "homework grades for this course: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println( "quiz grades for this course: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println( " Average homework grade: " + avgHw);
    System.out.println( " Average quiz grade: " + avgQuiz);
    System.out.println( "Final exm grade for this course: " + finalExam);



  }
}
