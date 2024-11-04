import java.util.Scanner;

public class ChooseYourAdventure {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(
                                "You wake up and look outside, the streets are empty. Confused, you walk outside. Looking to your left you see a horde of zombies, they are walking down the street going away from you. Freigtened you run back inside your home.");
                System.out.println(
                                "Type \"T\" to stay in your house \nType \"F\" to leave and try to find better shelter");
                String choice1 = scanner.nextLine(); // store choice 1 user input
                if (choice1.toLowerCase().equals("t")) { // First choice
                        System.out.println(
                                        "You spend the remainder of your day rationing out the food that you have and trying to fortify your house. As night falls, a small scouting group of three zombies arrives outside your house.");
                        System.out.println(
                                        "Type \"T\" to barricade your door and wait inside \nType \"F\" to open the door and fight the zombies");
                        String choice2 = scanner.nextLine(); // store choice 2 user input

                        if (choice2.toLowerCase().equals("t")) { // Second choice
                                System.out.println(
                                                "The scouts try their hardest to make it through your barricade, eventually they leave. Later that night, they came back, except this time with many more numbers. They easily tear through your barricades and they get to you inside your house. \n YOU LOSE");
                        } else if (choice2.toLowerCase().equals("f")) {
                                System.out.println(
                                                "You open the door and immediately throw yourself at the small pack of zombies, you easily dispose of the small group and you survive the night \n YOU WIN");
                        }

                } else if (choice1.toLowerCase().equals("f")) {
                        System.out.println(
                                        "You leave your house bringing with you your machete and a small store of food in a backpack. You leave your house in the suburbs and enter the heart of the city. It is now later in the afternoon.");
                        System.out.println(
                                        "Type \"T\" to continue exploring the city in hopes of finding some sort of shelter\nType \"F\" to search for food");
                        String choice3 = scanner.nextLine(); // store choice 3 user input

                        if (choice3.toLowerCase().equals("t")) { // Third choice
                                System.out.println(
                                                "You continue walking through the apocalyptic city. You come across an old grocery store. You think it will make a good shelter so you enter. Inside is the most food you have seen since the apocalypse started, coupled with a very solid shelter. \n YOU WIN");
                        } else if (choice3.toLowerCase().equals("f")) {
                                System.out.println(
                                                "You go on the search for food. You head towards the shopping district of the city and you come across many corpses scattered across the streets. You think it must be people who were trying to get food when the apocalypse started. Behind you, you hear a low rumbling, it slowly gets louder. You whip your head around to see the larget horde of zombies you have ever seen sprinting towards you. \n YOU LOSE");
                        }
                        scanner.close();
                }
        }
}