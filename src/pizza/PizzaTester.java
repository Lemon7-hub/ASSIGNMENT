/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: PizzaTester
Description:Tests the Pizza class
 */

package pizza;
import java.util.Scanner;
public class PizzaTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pizzas would you like to order?");
        int numPizzas = scanner.nextInt();

        for (int i = 0; i < numPizzas; i++) {
            System.out.println("Enter the number of slices for pizza " + (i + 1));
            int numSlices = scanner.nextInt();

            System.out.println("Select a meat choice:");
            System.out.println("1. Pepperoni");
            System.out.println("2. Sausage");
            System.out.println("3. Bacon");
            System.out.println("4. Ham");
            int meatChoiceNum = scanner.nextInt();
            Pizza.MeatChoice meatChoice = null;
            switch (meatChoiceNum) {
                case 1:
                    meatChoice = Pizza.MeatChoice.PEPPERONI;
                    break;
                case 2:
                    meatChoice = Pizza.MeatChoice.SAUSAGE;
                    break;
                case 3:
                    meatChoice = Pizza.MeatChoice.BACON;
                    break;
                case 4:
                    meatChoice = Pizza.MeatChoice.HAM;
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Pepperoni.");
                    meatChoice = Pizza.MeatChoice.PEPPERONI;
            }

            System.out.println("Select a veg choice:");
            System.out.println("1. Mushrooms");
            System.out.println("2. Onions");
            System.out.println("3. Green Peppers");
            System.out.println("4. Extra Cheese");
            System.out.println("5. Tomatoes");
            int vegChoiceNum = scanner.nextInt();
            Pizza.VegChoice vegChoice = null;
            switch (vegChoiceNum) {
                case 1:
                    vegChoice = Pizza.VegChoice.MUSHROOMS;
                    break;
                case 2:
                    vegChoice = Pizza.VegChoice.ONIONS;
                    break;
                case 3:
                    vegChoice = Pizza.VegChoice.GREEN_PEPPERS;
                    break;
                case 4:
                    vegChoice = Pizza.VegChoice.EXTRA_CHEESE;
                    break;
                case 5:
                    vegChoice = Pizza.VegChoice.TOMATOES;
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Mushrooms.");
                    vegChoice = Pizza.VegChoice.MUSHROOMS;
            }

            Pizza pizza = new Pizza(numSlices, meatChoice, vegChoice);
            System.out.println("You ordered a pizza with:");
            System.out.println(pizza.toString());
        }

        scanner.close();
    }
}