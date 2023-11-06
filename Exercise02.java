/* Calcule e exiba a quantidade de salários mínimos
que um determinado funcionário ganha. Para isto,
peça o valor do seu salário e o valor do salário mínimo atual. */

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salary, currentMinimumSalary;

        System.out.print("What's your salary: ");
        salary = input.nextInt();

        System.out.print("What's the current minimum salary: ");
        currentMinimumSalary = input.nextInt();

        System.out.println("You receive " + (salary / currentMinimumSalary) + " minimum salaries");

        input.close();
    }

}
