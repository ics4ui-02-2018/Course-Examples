/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPExample;

import java.awt.Color;

/**
 *
 * @author lamon
 */
public class BoardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create our game board
        GameBoard board = new GameBoard(8,8);
        // print empty board
        board.printBoard();
        
        board.addPiece(2,3,Color.BLACK);
        board.printBoard();
    }
    
}
