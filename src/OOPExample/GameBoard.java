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

    public boolean isPiece(int row, int col) {
        if (pieces[row][col] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void movePiece(int row, int col, int newRow, int newCol) {
        // if a piece exsists
        if (isPiece(row, col)) {
            // put it at the new location
            pieces[newRow][newCol] = pieces[row][col];
            // remove the old location
            removePiece(row, col);
            // update the piece's info
            pieces[newRow][newCol].setPosition(newRow, newCol);
        }
    }

    public Color getPieceColour(int row, int col) {
        // is there a piece?
        if (isPiece(row, col)) {
            return pieces[row][col].getColour();
        } else {
            return null;
        }
    }

    public void printBoard() {
        // print column numbers
        System.out.print("  ");
        for (int i = 0; i < this.numCols; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // top line
        System.out.print("  ");
        for (int i = 0; i < this.numCols; i++) {
            System.out.print("- ");
        }
        // drop down
        System.out.println();

        // start grid
        for (int row = 0; row < this.numRows; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < this.numCols; col++) {
                // is there a piece to draw
                if (isPiece(row, col)) {
                    // what colour?
                    if (getPieceColour(row, col) == Color.BLACK) {
                        System.out.print("B|");
                    } else if (getPieceColour(row, col) == Color.RED) {
                        System.out.print("R|");
                    } else {
                        System.out.print("O|");
                    }
                } else {
                    // no piece
                    System.out.print(" |");
                }
            }
            // drop down
            System.out.println();
            
            // bottom line
            System.out.print("  ");
            for (int i = 0; i < this.numCols; i++) {
                System.out.print("- ");
            }
            // drop down
            System.out.println();
        }
    }

}
