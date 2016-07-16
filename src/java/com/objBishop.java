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

@WebService(serviceName = "objBishop")
public class objBishop extends objChessPieces
{
    public void objBishop ()    
    {
    
    }
	
    public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
    {
	if (startRow == desRow || startColumn == desColumn) //If moved straight
	{
            strErrorMsg = "Bishop can only move along diagonal lines";
            return false;
	}
		
	return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, false);
    }
}