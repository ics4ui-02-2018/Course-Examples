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
public class Piece {
    private int row;
    private int col;
    private int size;
    private Color colour;
    
    public Piece(int row, int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.size = 10;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    public Color getColour(){
        return this.colour;
    }
    
    
    public void setPosition(int row, int col){
        this.row = row;
        this.col = col;
    }
}
