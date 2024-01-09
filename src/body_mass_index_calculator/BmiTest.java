package body_mass_index_calculator;

import java.util.Scanner;

public class BmiTest {
	public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	
        Bmi[] bmiArray = new Bmi[3];

        for (int i = 0; i < bmiArray.length; i++){
            System.out.println("\nPlease enter person "+ (i+1) +"'s values");
            String[] input = separate1();

            int age = Integer.parseInt(input[2]);
            double weight = Double.parseDouble(input[3]);
            double height = Double.parseDouble(input[4]);

            Bmi user = new Bmi(input[0] + " "+ input[1], age, weight, height );
            bmiArray[i] = user;
        }
        for (Bmi bmi : bmiArray) {

            System.out.println("\nThe BMI result for " + bmi.getName() + " is:");
            System.out.print("Age = " + bmi.getAge());
            System.out.print(" Weight = " + bmi.getWeight());
            System.out.print(" Height = " + bmi.getHeight());
            System.out.print("\n" + bmi.getStatus(bmi.getBMI(bmi)) + ".\n");
        }
        scn.close();

    }
    public static String[] separate1() {
        System.out.println("Enter name, age, weight, height: (as space separated)");
        String person = scn.nextLine();
        String[] input = person.split(" ");
        
        return input;
    }
    public static String[] separate2() {
        String[] input = new String[5];
        System.out.print("Enter name, age, weight, height: (as space separated)");
        String person = scn.nextLine();
        int nameSpace = person.indexOf(' ');
        input[0] = person.substring(0, nameSpace);

        int surnameSpace = person.indexOf(' ', nameSpace + 1);
        input[1] = person.substring(nameSpace + 1, surnameSpace);

        int ageSpace = person.indexOf(' ', surnameSpace + 1);
        input[2] = person.substring(surnameSpace + 1, ageSpace);

        int weightSpace = person.indexOf(' ', ageSpace + 1);
        input[3] = person.substring(ageSpace + 1, weightSpace);

        input[4] = person.substring(weightSpace + 1);

        return input;
    }
}
