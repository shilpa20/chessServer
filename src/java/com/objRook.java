/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "objRook")

public class objRook extends objChessPieces
{
	
	public void objRock ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
	{
		
		if (startRow != desRow && startColumn != desColumn) //If moved diagonal
		{
			
			strErrorMsg = "Rock can only move Horiztonal or Vertical";
			return false;
			
		}
		//Since Queen shares the same movement as a bishop or rock, the path checking code is shared for all 3 of them
		//The boolean at the end is weather the piece is moving straight, or diagonally
		return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, true);
		
	}
	
}