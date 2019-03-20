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
public class GameBoard {

    private int numRows;
    private int numCols;
    private Piece[][] pieces;

    public GameBoard(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        pieces = new Piece[numRows][numCols];
    }

    public void addPiece(int row, int col, Color colour) {
        // create a new piece
        Piece newPiece = new Piece(row, col, colour);
        // store it in the array
        pieces[row][col] = newPiece;
    }

    public void removePiece(int row, int col) {

        pieces[row][col] = null;
    }
    
    public boolean isPiece(int row, int col){
        
    }

}
