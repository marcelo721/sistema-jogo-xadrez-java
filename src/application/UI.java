package application;

import chess.ChessPeace;

public class UI {

    public static  void printBoard(ChessPeace[][] pieces){

        for (int i = 0 ; i < pieces.length ; i ++){
            System.out.print((8 - i) + " ");
            for (int j = 0 ; j < pieces.length ; j ++){
                printPeace(pieces[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("  a b c d e f g h ");
    }

    private static void printPeace(ChessPeace piece){
        if(piece == null)
            System.out.print("-");
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
