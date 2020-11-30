package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Stage 1
       /* System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffe = scanner.nextInt();
        int mlWater = cupsOfCoffe * 200;
        int mlMilk = cupsOfCoffe * 50;
        int gCoffe = cupsOfCoffe * 15;

        System.out.println("For " + cupsOfCoffe + " cups of coffee you will need:");
        System.out.println(mlWater + " ml of water");
        System.out.println(mlMilk + " ml of milk");
        System.out.println(gCoffe + "g of coffee beans");*/


        //Stage 2
        /*System.out.println("Write how many ml of water the coffee machine has: ");
        int mlWaterAvailable = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int mlMilkAvailable = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int gCoffeAvailable = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();

        int a, b, c;
        a = mlWaterAvailable / 200;
        b = mlMilkAvailable / 50;
        c = gCoffeAvailable / 15;
        int amountOfCoffe = Math.min(a, Math.min(b,c));

        if (amountOfCoffe >= cupsOfCoffee) {
            System.out.println("Yes, I can make that amount of coffee ");
            if ((amountOfCoffe - cupsOfCoffee) > 0 ){
                System.out.println("(and even " + (amountOfCoffe - cupsOfCoffee)+ " more than that");

            }
        }
        else {
            System.out.println("No, I can make only "+ amountOfCoffe + " cup(s) of coffee");
        }*/

        /*System.out.println("The coffee machine has: ");
        System.out.println("400 of water");
        System.out.println("540 of milk");
        System.out.println("120 of coffee beans");
        System.out.println("9 of disposable cups");
        System.out.println("550 of money");*/
        int mlWater = 400;
        int mlMilk = 540;
        int gCoffe = 120;
        int cupsOfCoffe = 9;
        int money = 550;
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buy = scanner.nextLine();
                    switch (buy) {
                        case "1":
                            if (mlWater < 250) System.out.println("Sorry, not enough water!");
                            if (gCoffe < 16) System.out.println("Sorry, not enough coffee!");
                            if (cupsOfCoffe < 1) System.out.println("Sorry, not enough cups of coffee!");
                            if (mlWater >= 250 && gCoffe >= 16 && cupsOfCoffe >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                mlWater = mlWater - 250;
                                gCoffe = gCoffe - 16;
                                money = money + 4;
                                cupsOfCoffe = cupsOfCoffe - 1;
                            }
                            break;

                        case "2":
                            if (mlWater < 350) System.out.println("Sorry, not enough water!\n");
                            if (mlMilk < 75) System.out.println("Sorry, not enough milk!\n");
                            if (gCoffe < 20) System.out.println("Sorry, not enough coffee!\n");
                            if (cupsOfCoffe < 1) System.out.println("Sorry, not enough cups of coffee!\n");
                            if (mlWater >= 350 && gCoffe >= 20 && cupsOfCoffe >= 1 && mlMilk >= 75) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                mlWater = mlWater - 350;
                                mlMilk = mlMilk - 75;
                                gCoffe = gCoffe - 20;
                                money = money + 7;
                                cupsOfCoffe = cupsOfCoffe - 1;
                            }
                            break;
                        case "3":
                            if (mlWater < 200) System.out.println("Sorry, not enough water!\n");
                            if (mlMilk < 100) System.out.println("Sorry, not enough milk!\n");
                            if (gCoffe < 12) System.out.println("Sorry, not enough coffee!\n");
                            if (cupsOfCoffe < 1) System.out.println("Sorry, not enough cups of coffee!\n");
                            if (mlWater >= 200 && gCoffe >= 12 && cupsOfCoffe >= 1 && mlMilk >= 100) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                mlWater = mlWater - 200;
                                mlMilk = mlMilk - 100;
                                gCoffe = gCoffe - 12;
                                money = money + 6;
                                cupsOfCoffe = cupsOfCoffe - 1;
                            }
                            break;
                        case "back":
                            break;

                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int mlWaterAdded = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int mlMilkAdded = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int gCoffeAdded = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int cupsOfCoffeeAdded = scanner.nextInt();
                    mlWater = mlWater + mlWaterAdded;
                    mlMilk = mlMilkAdded + mlMilk;
                    gCoffe = gCoffe + gCoffeAdded;
                    cupsOfCoffe = cupsOfCoffeeAdded + cupsOfCoffe;
                    break;
                case "take":
                    System.out.println("I gave you " + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has: ");
                    System.out.println(mlWater + " of water");
                    System.out.println(mlMilk + " of milk");
                    System.out.println(gCoffe + " of coffee beans");
                    System.out.println(cupsOfCoffe + " of disposable cups");
                    System.out.println(money + " of money\n");
                    break;
                case "exit":
                    System.exit(0);
                    break;

            }
        }
    }
}
