//@authod 		Neil-Bryan Caoile
//@studentId	991590424
public class Player {
    private final String name;
    private Boolean isTurn;
    private TicTacToeBoard mainBoard;
    private String cell;
    private int number =  0;
    private boolean isSet = false;
    private boolean isDraw = false;


    public Player(String name) {
        this.name = name;
    }

    //Setters
    public void setTurn(Boolean turn) { isTurn = turn; }
    public void setCell(String cell) {
        cell= cell.toUpperCase();
        this.cell = cell;
    }
    public void setNumber(int number) {
        if(number > 0 && number <10){
            this.number = number;
        }
    }
    public void setBoard(TicTacToeBoard mainBoard) {
        this.mainBoard = mainBoard;
    }
    public Boolean getTurn() { return isTurn; }
    public String getName() {
        return name;
    }

    //Other Methods
    public boolean isSet(){
        return isSet;
    }
    public void resetIsSet(){
        isSet = false;
    }
    public void putToMainBoard(){
        switch (cell){
            case "A1":
                if(mainBoard.getCellA()[0]){
                    System.out.println("Sorry cell is already occupied. Please try again.");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellA1(true);
                mainBoard.setNumberA1(number);
                isSet = true;
                break;
            case "A2":
                if(mainBoard.getCellA()[1] ){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellA2(true);
                mainBoard.setNumberA2(number);
                isSet = true;
                break;
            case "A3":
                if(mainBoard.getCellA()[2]){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellA3(true);
                mainBoard.setNumberA3(number);
                isSet = true;
                break;
            case "B1":
                if(mainBoard.getCellB()[0]){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellB1(true);
                mainBoard.setNumberB1(number);
                isSet = true;
                break;
            case "B2":
                if(mainBoard.getCellB()[1]){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellB2(true);
                mainBoard.setNumberB2(number);
                isSet = true;
                break;
            case "B3":
                if(mainBoard.getCellB()[2]){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellB3(true);
                mainBoard.setNumberB3(number);
                isSet = true;
                break;
            case "C1":
                if(mainBoard.getCellC()[0]){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellC1(true);
                mainBoard.setNumberC1(number);
                isSet = true;
                break;
            case "C2":
                if(mainBoard.getCellC()[1]){
                    System.out.println("Sorry cell is already occupied.Please try again");
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellC2(true);
                mainBoard.setNumberC2(number);
                isSet = true;
                break;
            case "C3":
                if(mainBoard.getCellC()[2]){
                    System.out.println("Sorry cell is already occupied by " + name);
                    break;
                }
                if(number == 0){
                    System.out.println("Invalid cell number [1 - 9]. Please try again.");
                    break;
                }
                mainBoard.setCellC3(true);
                mainBoard.setNumberC3(number);
                isSet = true;
                break;
            default:
                System.out.println("Invalid cell.");
        }
    }
    public boolean isDraw() {
        return isDraw;
    }
    public boolean isWinner(){
        //Check if they player have a fill on the board.
        int totalFill = 0;
        if(mainBoard.getCellA()[0] && mainBoard.getCellA()[1] && mainBoard.getCellA()[2]){
            totalFill = mainBoard.getNumberA()[0] + mainBoard.getNumberA()[1] + mainBoard.getNumberA()[2];
            if(totalFill == 15){
                System.out.println(name + ": Horizontal Fill, A1, A2, A3");
            }
        }
        if(mainBoard.getCellB()[0] && mainBoard.getCellB()[1] && mainBoard.getCellB()[2]){
            totalFill = mainBoard.getNumberB()[0] + mainBoard.getNumberB()[1] + mainBoard.getNumberB()[2];
            if(totalFill == 15){
                System.out.println(name + ": Horizontal Fill, B1, B2, B3");
            }
        }
        if(mainBoard.getCellC()[0] && mainBoard.getCellC()[1] && mainBoard.getCellC()[2]){
            totalFill = mainBoard.getNumberC()[0] + mainBoard.getNumberC()[1] + mainBoard.getNumberC()[2];
            if(totalFill == 15){
                System.out.println(name + ": Horizontal Fill, C1, C2, C3");
            }
        }
        if(mainBoard.getCellA()[0] && mainBoard.getCellB()[0] && mainBoard.getCellC()[0]){
            totalFill = mainBoard.getNumberA()[0] + mainBoard.getNumberB()[0] + mainBoard.getNumberC()[0];
            if(totalFill == 15){
                System.out.println(name + ": Vertical Fill, A1, B1, C1");
            }
        }
        if(mainBoard.getCellA()[1] && mainBoard.getCellB()[1] && mainBoard.getCellC()[1]){
            totalFill = mainBoard.getNumberA()[1] + mainBoard.getNumberB()[1] + mainBoard.getNumberC()[1];
            if(totalFill == 15){
                System.out.println(name + ": Vertical Fill, A2, B2, C2");
            }
        }
        if(mainBoard.getCellA()[2] && mainBoard.getCellB()[2] && mainBoard.getCellC()[2]){
            totalFill = mainBoard.getNumberA()[2] + mainBoard.getNumberB()[2] + mainBoard.getNumberC()[2];
            if(totalFill == 15){
                System.out.println(name + ": Vertical Fill, A3, B3, C3");
            }
        }
        if(mainBoard.getCellA()[0] && mainBoard.getCellB()[1] && mainBoard.getCellC()[2]){
            totalFill = mainBoard.getNumberA()[0] + mainBoard.getNumberB()[1] + mainBoard.getNumberC()[2];
            if(totalFill == 15){
                System.out.println(name + ": Diagonal Fill, A1, B2, C3");
            }
        }
        if(mainBoard.getCellA()[2] && mainBoard.getCellB()[1] && mainBoard.getCellC()[0]){
            totalFill = mainBoard.getNumberA()[2] + mainBoard.getNumberB()[1] + mainBoard.getNumberC()[0];
            if(totalFill == 15){
                System.out.println(name + ": Diagonal Fill, A3, B3, C3");
            }
        }
        if(mainBoard.getCellA()[0] && mainBoard.getCellA()[0] && mainBoard.getCellA()[0] &&
                mainBoard.getCellB()[0] && mainBoard.getCellB()[0] && mainBoard.getCellB()[0] &&
                mainBoard.getCellC()[0] && mainBoard.getCellC()[0] && mainBoard.getCellC()[0] &&
                totalFill != 15){
            isDraw = true;
            return false;
        }

        return totalFill == 15;

    }

}
