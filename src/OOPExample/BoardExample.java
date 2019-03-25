package OOPExample;


import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class BoardExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board gameBoard = new Board(12, 12);

        // put down a piece
        gameBoard.putPeg(Color.RED, 2, 5);
        gameBoard.putPeg(Color.YELLOW, 1, 5);
        // remove a peg
        gameBoard.removePeg(2, 5);
        // place a message
        char c = 0x2660;
        gameBoard.displayMessage("Click on the board!" + String.valueOf(c));

        while (true) {
            // receive a click
            Coordinate click = gameBoard.getClick();
            int clickRow = click.getRow();
            int clickCol = click.getCol();
            gameBoard.putPeg(Color.BLACK, clickRow, clickCol);
    
        }
    }

}
