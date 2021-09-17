//@authod 		Neil-Bryan Caoile
//@studentId	991590424
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Objects
        Scanner scanner = new Scanner(System.in);

        //Player1
        Player player1 = new Player("Neil");
        Player player2 = new Player("Clair");

        TicTacToeMath game = new TicTacToeMath(player1,player2);
        TicTacToeBoard mainBoard = new TicTacToeBoard();

        //Set Board
        game.setBoard(mainBoard);
        player1.setBoard(mainBoard);
        player2.setBoard(mainBoard);

        //Flag
        boolean isGameDone = false;

        //Game Start
        System.out.println("Welcome to " +game.getGameName() + "!");
        mainBoard.printBoard();

        while (!isGameDone){
            player1.setTurn(true);
            while (player1.getTurn()){
                System.out.println("Player 1 Turn");
                System.out.print("Enter Cell: ");
                player1.setCell(scanner.nextLine());
                System.out.print("Enter Number: ");
                player1.setNumber(scanner.nextInt());scanner.nextLine();
                player1.putToMainBoard();
                if(player1.isSet()){
                    player1.setTurn(false);
                }
            }
            mainBoard.printBoard();
            player1.resetIsSet();
            if(player1.isWinner()){
                System.out.println(player1.getName() + " won the game. Congratulations!");
                break;
            }

            if(player1.isDraw() && player2.isDraw()){
                System.out.println("Game Over. Its a draw!");
                break;
            }

            player2.setTurn(true);
            while (player2.getTurn()){
                System.out.println("Player 2 Turn");
                System.out.print("Enter Cell: ");
                player2.setCell(scanner.nextLine());
                System.out.print("Enter Number: ");
                player2.setNumber(scanner.nextInt());scanner.nextLine();
                player2.putToMainBoard();
                if(player2.isSet()){
                    player2.setTurn(false);
                }
            }
            mainBoard.printBoard();
            player2.resetIsSet();
            if(player2.isWinner()){
                System.out.println(player2.getName() + " won the game. Congratulations!");
                isGameDone=true;
            }
        }
    }
}
