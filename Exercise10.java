/* Um banco concede empréstimo a seus clientes no valor máximo
de 30% do valor do seu salário liquido. Receba o valor do salário bruto,
o valor dos descontos e o valor do possível empréstimo de um cliente,
em seguida avise se ele poderá ou não fazer o empréstimo. */

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grossSalary, net, discounts, lending;

        System.out.print("Enter gross salary: ");
        grossSalary = input.nextInt();

        System.out.print("Enter the discounts: ");
        discounts = input.nextInt();

        System.out.print("Enter the loan value: ");
        lending = input.nextInt();

        net = grossSalary * (1 - (discounts / 100));

        if(lending <= (net * 0.3)){
            System.out.print(lending + " dollars loan is possible");
        }
        else {
            System.out.print(lending + " dollars loan isn't possible");
        }

        input.close();
    }

}
