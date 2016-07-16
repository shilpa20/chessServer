/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.jws.WebService;

/**
 *
 * @author hp
 */

@WebService(serviceName = "objQueen")
public class objQueen extends objChessPieces
{
    public void objQueen ()
    {
        
    }
	
    public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
    {
	boolean axis = true;
		
	if (startRow == desRow ^ startColumn == desColumn) //XOR If ONE of these conditions match (if both true or false then false is returned)
	{
            axis = true; //Moving straight along axis
	}
		
        else if (startRow != desRow && startColumn != desColumn)
	{
            axis = false; //Moving diagonal
	}
		
        else
	{
            strErrorMsg = "Queen can move in a straight line in any direction";
            return false;
	}
	
        return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, axis);
    }
}
