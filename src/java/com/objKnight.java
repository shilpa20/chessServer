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

@WebService(serviceName = "objKnight")
public class objKnight extends objChessPieces
{
    public void objKnight ()
    {
        
    }
	
    public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
    {
	finalDesRow = desRow;
	finalDesColumn = desColumn;
	strErrorMsg = "Horse can only move in a L shape";
		
	if (desRow == (startRow - 2) && desColumn == (startColumn - 1)) //2N, 1E
	{
            return true;
	}
		
        else if (desRow == (startRow - 2) && desColumn == (startColumn + 1)) //2N, 1W
	{
            return true;
	}
		
        else if (desRow == (startRow + 2) && desColumn == (startColumn - 1)) //2S, 1E
	{
            return true;
	}
		
        else if (desRow == (startRow + 2) && desColumn == (startColumn + 1)) //2S, 1W
	{
            return true;
	}
	
        else if (desRow == (startRow - 1) && desColumn == (startColumn - 2)) //1N, 2E
	{
            return true;
	}
		
        else if (desRow == (startRow - 1) && desColumn == (startColumn + 2)) //1N, 2W
	{
            return true;
	}
		
        else if (desRow == (startRow + 1) && desColumn == (startColumn - 2)) //1S, 2E
	{
            return true;
	}
		
        else if (desRow == (startRow + 1) && desColumn == (startColumn + 2)) //1S, 2W
	{
            return true;
	}
		
	return false;
    }
}