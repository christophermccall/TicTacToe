package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    String winner = "";
    Board board;
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
            }else if (matrix[i][i].toString().equals("X")){
                diagRToL += 1;
            }else if (matrix[0][i].toString().equals("X")){
                row += 1;
            } else if (matrix[i][0].toString().equals("X")){
                col += 1;
            }
    }   if (diagLToR == 3|| diagRToL == 3 || col == 3 || row ==3){
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
            }else if (matrix[i][i].toString().equals("O")){
                diagRToL += 1;
            }else if (matrix[0][i].toString().equals("O")){
                row += 1;
            } else if (matrix[i][0].toString().equals("O")){
                col += 1;
            }
    }   if (diagLToR == 3|| diagRToL == 3 || col == 3 || row ==3){
                inFavor = true;
            }
        return inFavor;
    }


    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        if(isInFavorOfX()) {
            this.winner = "X";
        } else if(isInFavorOfO()) {
            this.winner = "O";
        }
        return this.winner;
        }
    }



