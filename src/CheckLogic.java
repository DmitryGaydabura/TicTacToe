public class CheckLogic {
    public static void horizontalCheck(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3, String player, String computer) {
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
        }
    }

    public static void verticalCheck(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3, String player, String computer) {
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

        }
    }

    public static void diagonalCheck(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3, String player, String computer) {
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
}
