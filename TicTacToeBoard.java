//@authod 		Neil-Bryan Caoile
//@studentId	991590424
public class TicTacToeBoard {

    //Board for player
    private final boolean[] cellA = new boolean[] {false, false, false};//A1, A2, A3
    private final boolean[] cellB = new boolean[] {false, false, false};//B1,  B2, B3
    private final boolean[] cellC = new boolean[] {false, false, false};//C1,  C2, C3
    //Numbers
    private final int[] numberA = new int[] {0, 0, 0};
    private final int[] numberB = new int[] {0, 0, 0};
    private final int[] numberC = new int[] {0, 0, 0};


    public void printBoard(){
        System.out.println("      1     2     3");
        System.out.println("A     "+numberA[0]+"  |  "+numberA[1]+"  |  "+numberA[2]);
        System.out.println("     ---------------");
        System.out.println("B     "+numberB[0]+"  |  "+numberB[1]+"  |  "+numberB[2]);
        System.out.println("     ---------------");
        System.out.println("C     "+numberC[0]+"  |  "+numberC[1]+"  |  "+numberC[2]);
    }

    //Methods that represent each of the cells of TicTacToe Board.
    //If the cells is occupied, the boolean will return true
    //else, it will return false
    public void setCellA1(boolean A1) {
        cellA[0] = A1;
    }
    public void setCellA2(boolean A2) {
        cellA[1] = A2;
    }
    public void setCellA3(boolean A3) {
        cellA[2] = A3;
    }
    public void setCellB1(boolean B1) {
        cellB[0] = B1;
    }
    public void setCellB2(boolean B2) {
        cellB[1] = B2;
    }
    public void setCellB3(boolean B3) {
        cellB[2] = B3;
    }
    public void setCellC1(boolean C1) {
        cellC[0] = C1;
    }
    public void setCellC2(boolean C2) {
        cellC[1] = C2;
    }
    public void setCellC3(boolean C3) {
        cellC[2] = C3;
    }

    //Methods that return the array of Column A, B, C
    public boolean[] getCellA() {
        return cellA;
    }
    public boolean[] getCellB() {
        return cellB;
    }
    public boolean[] getCellC() {
        return cellC;
    }

    //Methods that represent each number of cells in the TicTacToe Board.
    public void setNumberA1(int A1) {
        numberA[0] = A1;
    }
    public void setNumberA2(int A2) {
        numberA[1] = A2;
    }
    public void setNumberA3(int A3) {
        numberA[2] = A3;
    }
    public void setNumberB1(int B1) {
        numberB[0] = B1;
    }
    public void setNumberB2(int B2) {
        numberB[1] = B2;
    }
    public void setNumberB3(int B3) {
        numberB[2] = B3;
    }
    public void setNumberC1(int C1) {
        numberC[0] = C1;
    }
    public void setNumberC2(int C2) {
        numberC[1] = C2;
    }
    public void setNumberC3(int C3) {
        numberC[2] = C3;
    }

    //Methods that return the array of Numbers A, B, C
    public int[] getNumberA() {
        return numberA;
    }
    public int[] getNumberB() {
        return numberB;
    }
    public int[] getNumberC() {
        return numberC;
    }



}
