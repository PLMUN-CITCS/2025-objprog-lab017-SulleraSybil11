import java.util.Scanner;

public class GradeCalculator {
    
    public static int getStudentScore() {  //Defining the main method
Scanner input = new Scanner(System.in);
System.out.print("Enter your score: ");
int score = input.nextInt();
return score;

}

public static String calculateScore(int score){

        if (score >= 90) return "A";

else if (score >= 80) return "B";
else if (score >= 70) return "C";
else if (score >= 60) return "D";
      else return "F";
}

public static void main(String[] args) {
System.out.print("Your Grade is: "+calculateScore(
      getStudentScore()));



    }
}