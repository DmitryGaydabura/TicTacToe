import java.util.Scanner;

public class GameLogic {

    public static int whoWillBeFirst() {
        int A = (int) (Math.random() * 10);
        if (A > 5) {
            int side = 0;
            System.out.println("You will start");
            return side;
        } else {
            int side = 1;
            System.out.println("Computer will start");
            return side;
        }
    }

    public static void start(int side, Spaces A1, Spaces A2, Spaces A3, Spaces B1, Spaces B2, Spaces B3, Spaces C1, Spaces C2, Spaces C3, int numberOfTurns, String player, String computer) {
        String move;

        if (side == 0) {
            //Player will start
            System.out.println("Your Turn " + numberOfTurns);


            //Player will choose his move
            label:
            while (true) {
                Scanner in = new Scanner(System.in);
                String n = in.nextLine().toLowerCase();
                switch (n.toUpperCase()) {
                    case "A1":
                        A1.setType(player);
                        break label;
                    case "A2":
                        A2.setType(player);
                        break label;
                    case "A3":
                        A3.setType(player);
                        break label;
                    case "B1":
                        B1.setType(player);
                        break label;
                    case "B2":
                        B2.setType(player);
                        break label;
                    case "B3":
                        B3.setType(player);
                        break label;
                    case "C1":
                        C1.setType(player);
                        break label;
                    case "C2":
                        C2.setType(player);
                        break label;
                    case "C3":
                        C3.setType(player);
                        break label;
                }
                System.out.println("Incorrect input. Please, try again.");
            }
            //Check win

            //change turn
            side = 1;


        } else {
            //Computer will start
            System.out.println("Computer Turn " + numberOfTurns);
            //Computer will choose his move
            move = makeMove(A1.type, A2.type, A3.type, B1.type, B2.type, B3.type, C1.type, C2.type, C3.type);
            System.out.println(move);
            if (move.equals("A1")) {
                A1.setType(computer);
            }
            if (move.equals("A2")) {
                A2.setType(computer);
            }
            if (move.equals("A3")) {
                A3.setType(computer);
            }
            if (move.equals("B1")) {
                B1.setType(computer);
            }
            if (move.equals("B2")) {
                B2.setType(computer);
            }
            if (move.equals("B3")) {
                B3.setType(computer);
            }
            if (move.equals("C1")) {
                C1.setType(computer);
            }
            if (move.equals("C2")) {
                C2.setType(computer);
            }
            if (move.equals("C3")) {
                C3.setType(computer);
            }
            //Draw diagram
            System.out.println("          |     |     ");
            System.out.println("A->    " + A1.type + "  |  " + A2.type + "  |  " + A3.type + "  ");
            System.out.println("     -----+-----+-----");
            System.out.println("B->    " + B1.type + "  |  " + B2.type + "  |  " + B3.type + "  ");
            System.out.println("     -----+-----+-----");
            System.out.println("C->    " + C1.type + "  |  " + C2.type + "  |  " + C3.type + "  ");
            System.out.println("          |     |     ");
            System.out.println("                      ");
            System.out.println("       ^     ^     ^  ");
            System.out.println("       1     2     3  ");

            //Check win
            checkWin(A1.type, A2.type, A3.type, B1.type, B2.type, B3.type, C1.type, C2.type, C3.type, player, computer);
            //change turn
            side = 0;
            numberOfTurns++;
        }
        if (numberOfTurns == 6) {
            System.out.println("Draw!");
            return;
        }
        start(side, A1, A2, A3, B1, B2, B3, C1, C2, C3, numberOfTurns, player, computer);

    }

    public static String makeMove(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3) {
        //diagonal check
        if (A1.equals(B2) && C3.equals(" ")) {
            return "C3";
        }
        if (A1.equals(C3) && B2.equals(" ")) {
            return "B2";
        }
        if (B2.equals(C3) && A1.equals(" ")) {
            return "A1";
        }
        if (A3.equals(B2) && C1.equals(" ")) {
            return "C1";
        }
        if (A3.equals(C1) && B2.equals(" ")) {
            return "B2";
        }
        if (B2.equals(C1) && A3.equals(" ")) {
            return "A3";
        }
        //horizontal check
        if (A1.equals(A2) && A3.equals(" ")) {
            return "A3";
        }
        if (A1.equals(A3) && A2.equals(" ")) {
            return "A2";
        }
        if (A2.equals(A3) && A1.equals(" ")) {
            return "A1";
        }
        if (B1.equals(B2) && B3.equals(" ")) {
            return "B3";
        }
        if (B1.equals(B3) && B2.equals(" ")) {
            return "B2";
        }
        if (B2.equals(B3) && B1.equals(" ")) {
            return "B1";
        }
        if (C1.equals(C2) && C3.equals(" ")) {
            return "C3";
        }
        if (C1.equals(C3) && C2.equals(" ")) {
            return "C2";
        }
        if (C2.equals(C3) && C1.equals(" ")) {
            return "C1";
        }

        //vertical check
        if (A1.equals(B1) && C1.equals(" ")) {
            return "C1";
        }
        if (A1.equals(C1) && B1.equals(" ")) {
            return "B1";
        }
        if (B1.equals(C1) && A1.equals(" ")) {
            return "A1";
        }
        if (A2.equals(B2) && C2.equals(" ")) {
            return "C2";
        }
        if (A2.equals(C2) && B2.equals(" ")) {
            return "B2";
        }
        if (B2.equals(C2) && A2.equals(" ")) {
            return "A2";
        }
        if (A3.equals(B3) && C3.equals(" ")) {
            return "C3";
        }
        if (A3.equals(C3) && B3.equals(" ")) {
            return "B3";
        }
        if (B3.equals(C3) && A3.equals(" ")) {
            return "A3";
        }


        if (B2.equals(" ")) {
            return "B2";
        }
        if (A1.equals(" ")) {
            return "A1";
        }
        if (A2.equals(" ")) {
            return "A2";
        }
        if (A3.equals(" ")) {
            return "A3";
        }
        if (B1.equals(" ")) {
            return "B1";
        }
        if (B3.equals(" ")) {
            return "B3";
        }
        if (C1.equals(" ")) {
            return "C1";
        }
        if (C2.equals(" ")) {
            return "C2";
        }
        if (C3.equals(" ")) {
            return "C3";
        }
        return " ";
    }

    public static void checkWin(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3, String player, String computer) {
        //horizontal check
        if (A1.equals(A2) && A3.equals(A2) && A1.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (A1.equals(A2) && A3.equals(A2) && A1.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }
        if (B1.equals(B2) && B3.equals(B2) && B1.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (B1.equals(B2) && B3.equals(B2) && B1.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }
        if (C1.equals(C2) && C3.equals(C2) && C1.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (C1.equals(C2) && C3.equals(C2) && C1.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }


        //vertical check
        if (A1.equals(B1) && C1.equals(B1) && A1.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (A1.equals(B1) && C1.equals(B1) && A1.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }
        if (A2.equals(B2) && C2.equals(B2) && B2.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (A2.equals(B2) && C2.equals(B2) && B2.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }
        if (A3.equals(B3) && C3.equals(B3) && C3.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (A3.equals(B3) && C3.equals(B3) && C3.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }

        //diagonal check
        if (A1.equals(B2) && C3.equals(B2) && B2.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (A1.equals(B2) && C3.equals(B2) && B2.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
            return;
        }
        if (A3.equals(B2) && C1.equals(B2) && B2.equals(player)) {
            System.out.println("You won!");
            System.exit(0);
            return;
        }
        if (A3.equals(B2) && C1.equals(B2) && B2.equals(computer)) {
            System.out.println("Computer won!");
            System.exit(0);
        }
    }
    public static void  createField(){
        System.out.println("          |     |     ");
        System.out.println("A->       |     |     ");
        System.out.println("     -----+-----+-----");
        System.out.println("B->       |     |     ");
        System.out.println("     -----+-----+-----");
        System.out.println("C->       |     |     ");
        System.out.println("          |     |     ");
        System.out.println("                      ");
        System.out.println("       ^     ^     ^  ");
        System.out.println("       1     2     3  ");
    }
}

