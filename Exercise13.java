/* Acrescente no problema anterior possibilidade dele fazer prova final em caso de
recuperação. Neste caso a nota de aprovação passa a ser >= 5.0 */

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grade, gradeSum = 0, average, recoveryGrade;

        for(int quantifyGrades = 1; quantifyGrades <= 3; quantifyGrades++){
            System.out.print("Enter the " + quantifyGrades + "º grade: ");
            grade = input.nextFloat();
            gradeSum += grade;
        }

        average = gradeSum / 3;

        if(average >= 7) {
            System.out.print("You passed with an average of " + average + " points");
        }
        else if(average >= 5 && average < 7) {
            System.out.println("you are in recovery with an average of " + average + " points");

            System.out.print("Enter the recovery grade: ");
            recoveryGrade = input.nextFloat();

            if(recoveryGrade >= 5){
                System.out.print("You passed with a recovery grade of " + recoveryGrade + " points");
            }
            else{
                System.out.print("You were not approved with a recovery grade of " + recoveryGrade + " points");
            }
        }
        else {
            System.out.print("You were not approved with an average of " + average + " points");
        }


        input.close();
    }

}
