/* A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
recuperação ou foi reprovado. A média de aprovação é &gt;= 7.0; a média de recuperação é
&gt;= 5.0 e &lt; 7.0; e a média do reprovado é &lt; 5.0 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grade, gradeSum = 0, average;

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
            System.out.print("you are in recovery with an average of " + average + " points");
        }
        else {
            System.out.print("You were not approved with an average of " + average + " points");
        }



        input.close();
    }

}
