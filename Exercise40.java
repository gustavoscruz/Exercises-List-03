/* Solicite ao usuário a idade de cada um componente de um grupo de pessoas.
A quantidade de pessoas também será determinada por ele. */

import java.util.Scanner;
public class Exercise40 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int personAge, oldestPerson = 0, youngestPerson = 0, legalPeople = 0, ageSum = 0;

        System.out.print("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        for(int i = 1; i <= numberOfPeople; i++){

            System.out.print("Enter the age: ");
            personAge = input.nextInt();

            ageSum += personAge;

            if(i == 1){
                oldestPerson = personAge;
                youngestPerson = personAge;
            }

            if(personAge > oldestPerson){
                oldestPerson = personAge;
            }

            if(personAge < youngestPerson){
                youngestPerson = personAge;
            }

            if (personAge >= 18){
                legalPeople ++;
            }

        }

        System.out.println("The average of ages is " + (float)ageSum / numberOfPeople);
        System.out.println("The oldest age is " + oldestPerson);
        System.out.println("The youngest age is " + youngestPerson);
        System.out.println("the number of people of legal age is " + legalPeople);


        input.close();
    }

}
