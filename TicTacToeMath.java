//@authod 		Neil-Bryan Caoile
//@studentId	991590424
public class TicTacToeMath {
    Player player1;
    Player player2;
    String gameName;
    TicTacToeBoard mainBoard;

    //Constructor
    public TicTacToeMath(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
         gameName = "TicTacToeMath";
    }

    public void setBoard(TicTacToeBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getGameName() {
        return gameName;
    }


}
