import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {

        OorX player = new OorX(" ");
        OorX computer = new OorX(" ");
        System.out.println("\n" +
                "  _______ _          _______             _______          \n" +
                " |__   __(_)        |__   __|           |__   __|         \n" +
                "    | |   _  ___ ______| | __ _  ___ ______| | ___   ___  \n" +
                "    | |  | |/ __|______| |/ _` |/ __|______| |/ _ \\ / _ \\ \n" +
                "    | |  | | (__       | | (_| | (__       | | (_) |  __/ \n" +
                "    |_|  |_|\\___|      |_|\\__,_|\\___|      |_|\\___/ \\___| \n" +
                "                                                          \n" +
                "                                                          \n");
        while (true) {


            System.out.println("Enter: X or O");
            Scanner in = new Scanner(System.in);
            String n = in.nextLine().toLowerCase();

            if (!n.equals("o") && !n.equals("x")) {
                System.out.println("Incorrect Input. Please, try again.");
                continue;
            }
            if (n.equals("o")) {
                System.out.println("You will be playing as O");
                System.out.println("Computer will be playing as X");
                player.setType("O");
                computer.setType("X");
                break;
            } else {
                System.out.println("You will be playing as X");
                System.out.println("Computer will be playing as O");
                player.setType("X");
                computer.setType("O");
                break;
            }
        }


        Spaces A1 = new Spaces(1, " ");
        Spaces A2 = new Spaces(2, " ");
        Spaces A3 = new Spaces(3, " ");

        Spaces B1 = new Spaces(4, " ");
        Spaces B2 = new Spaces(5, " ");
        Spaces B3 = new Spaces(6, " ");

        Spaces C1 = new Spaces(7, " ");
        Spaces C2 = new Spaces(8, " ");
        Spaces C3 = new Spaces(9, " ");
        int numberOfTurns = 1;
        int side = GameLogic.whoWillBeFirst();
        if (side == 0) {
            GameLogic.createField();
        }
        GameLogic.start(side, A1, A2, A3, B1, B2, B3, C1, C2, C3, numberOfTurns, player.type, computer.type);


    }
}
