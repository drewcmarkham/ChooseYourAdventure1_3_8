import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "You wake up and look outside, the streets are empty. Confused, you walk outside. Looking to your left you see a horde of zombies, they are walking down the street going away from you. Freigtened you run back inside your home.");
        System.out.println("Type \"T\" to stay in your house, type \"F\" to leave and try to find better shelter.");
        String choice1 = scanner.nextLine();
        if (choice1.toLowerCase() == "t") {
            System.out.println("");
        } else if (choice1.toLowerCase() == "f") {
            System.out.println("");

        }
    }
}