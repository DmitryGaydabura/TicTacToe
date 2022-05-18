

public class StartGame {
    public static void main(String[] args) {

        OorX player = new OorX(" ");
        OorX computer = new OorX(" ");
        GameLogic.createLogo();
        GameLogic.input(player, computer);


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
        int side = GameLogic.decideIfFieldIsNeeded();
        GameLogic.start(side, A1, A2, A3, B1, B2, B3, C1, C2, C3, numberOfTurns, player.type, computer.type);


    }
}
