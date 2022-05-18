public class MoveLogic {
    public static String diagonalMoves(String A1, String A3, String B2, String C1, String C3) {
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
        return " ";
    }

    public static String horizontalMoves(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3) {
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
        return " ";
    }

    public static String verticalMoves(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3) {
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
        return " ";
    }

    public static String randomMoves(String A1, String A2, String A3, String B1, String B2, String B3, String C1, String C2, String C3) {
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
}
