package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    String winner = "";
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        int diagLToR = 0;
        int diagRToL = 0;
        int col = 0;
        int row = 0;

        boolean inFavor = false;
        for (int i = 0, j = matrix.length-1; i < matrix.length; i++, j--){
            if (matrix[j][i].toString().equals("X")){
                diagLToR += 1;
            } if (matrix[i][i].toString().equals("X")){
                diagRToL += 1;

            } for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i].toString().equals("X")) {
                    row += 1;
                    if (row == 3){
                        return true;
                    }
                }
                if (matrix[i][k].toString().equals("X")) {
                    col += 1;
                    if (col == 3){
                        return true;
                    }
                }
            }
            row = 0;
            col = 0;
        } if (diagLToR == 3|| diagRToL == 3){
                this.winner = "O";
                inFavor = true;
            }
        return inFavor;
    }

    public Boolean isInFavorOfO() {
        int diagLToR = 0;
        int diagRToL = 0;
        int col = 0;
        int row = 0;


        boolean inFavor = false;
        for (int i = 0, j = matrix.length-1; i < matrix.length; i++, j--){
            if (matrix[j][i].toString().equals("O")){
                diagLToR += 1;
            }
            if (matrix[i][i].toString().equals("O")){
                diagRToL += 1;
            }
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i].toString().equals("O")) {
                    row += 1;
                    if (row == 3){
                        return true;
                    }
                }
                if (matrix[i][k].toString().equals("O")) {
                    col += 1;
                    if (col == 3){
                        return true;
                    }
                }
            }
            row = 0;
            col = 0;
        } if (diagLToR == 3|| diagRToL == 3){
                this.winner = "O";
                inFavor = true;
            }
        return inFavor;
    }


    public Boolean isTie() {
        this.winner = "";
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        if(isInFavorOfO()) {
            this.winner = "O";
        } if(isInFavorOfX()) {
            this.winner = "X";
        }
        return winner;
        }
    }



