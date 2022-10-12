import java.util.List;
import java.util.Scanner;

public class View {
    Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);

    /*
    BLACK	\u001B[30m
    RED	    \u001B[31m
    GREEN	\u001B[32m
    YELLOW	\u001B[33m
    BLUE	\u001B[34m
    PURPLE	\u001B[35m
    CYAN	\u001B[36m
    WHITE	\u001B[37m
    */

    public void printWelcomeMessage() {
        printYellowText("Welcome to ArenaFighter, please choose how many players (max. 4) you want.");



        printYellowText("Now, please choose your desired character type.");
        printRedText("PLEASE PRESS ENTER TO CONTINUE..");
        scanner.nextLine();
    }

    private static final String colorRest = "\u001B[0m";
    private static final String colorCyan = "\u001B[36m";
    private static final String colorRed = "\u001B[31m";


    /* FIGHTER TEXTS */
    public void printListContent(int i, String text) {
        System.out.println(printCounter(i) + text);
    }

    public void printChooseText(String text) {
        System.out.println("\nPlease choose your " + text);
    }

    public void printInputText(String text) {
        System.out.println("\nPlease type in your " + text + ": ");
    }

    /* COLOURS */
    private void printYellowText(String text) {
        System.out.println(colorCyan + text + colorRest);
    }
    private void printRedText(String text) {
        System.out.println(colorRed + text + colorRest);
    }


    public String readString() {
        return scanner.nextLine();
    }
    public void printTypes(Types types) {
        List<String> typesList = types.getEntries();

        for (int i = 0; i < typesList.size() ; i++) {
            System.out.println(printCounter(i) + typesList.get(i));
        }
    }
    public String getType() {
        Types types = new Types();

        System.out.println("Choose your type: ");
        printTypes(types);
        int position = getLoopInput();

        return types.getFieldValue(position);
    }




    /* UTILITY */

    public String printCounter(int number) {
        number++;
        return ("(" + number + ") ");
    }
    public int getLoopInput() {
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        return --input;
    }
    public String getStringInput() {
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
    public int getIntInput() {
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        return input;
    }
}
