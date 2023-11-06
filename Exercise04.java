/* Determine e exiba a média aritmética de um aluno a partir de suas 4 notas. */

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grade, gradeSum = 0;

        for(int quantifyGrades = 1; quantifyGrades <= 4; quantifyGrades++){
            System.out.print("Enter the " + quantifyGrades + "º grade: ");
            grade = input.nextFloat();
            gradeSum += grade;
        }

        System.out.print("Your average is " + gradeSum / 4 + " points");


        input.close();
    }

}
