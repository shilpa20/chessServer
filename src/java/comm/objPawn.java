/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm;

import com.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "objPawn")
public class objPawn extends objChessPieces
{
	private int currentPlayer =1;
	public void objPawn ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer)
	{
		
		boolean legalMove = true;
		int[] playerPawnStart = {6,1};
		
		if ((currentPlayer == 1 && desRow >= startRow) || (currentPlayer == 2 && desRow <= startRow)) //If moving in wrong direction
		{
			
			strErrorMsg = "Can not move in that direction";
			legalMove = false;
			
		}
		else if (desColumn != startColumn) //If moving sideways
		{
			
			if ((desColumn > startColumn && desColumn == (startColumn + 1)) || (desColumn < startColumn && desColumn == (startColumn - 1))) //If only moving one place side ways
			{
				
				if ((desRow == (startRow + 1) && currentPlayer == 2) || (desRow == (startRow - 1) && currentPlayer == 1))
				{					
				
					if (playerMatrix[desRow][desColumn] == 0) //If cell is empty
					{
						
						strErrorMsg = "Can only move diagonal when taking an enemy piece";
						legalMove = false;
						
					}
					
				}
				else
				{
					
					strErrorMsg = "Can not move that far";
					legalMove = false;
					
				}
				
			}
			else
			{
				
				strErrorMsg = "Can not move that far";
				legalMove = false;
				
			}
			
		}
		else if ((currentPlayer == 1 && desRow < (startRow - 1)) || (currentPlayer == 2 && desRow > (startRow + 1))) //If moved two or more places
		{
			
			if ((currentPlayer == 1 && desRow == (startRow - 2)) || (currentPlayer == 2 && desRow == (startRow + 2))) //If moved two places
			{
				
				if (playerPawnStart[currentPlayer - 1] != startRow) //If not at pawn starting place
				{
			
				strErrorMsg = "Can not move that far";
				legalMove = false;
			
				}
				
			}
			else
			{
				
				strErrorMsg = "Can not move that far";				
				legalMove = false;
				
			}
			
		}		
		
		if (legalMove)
		{

			finalDesRow = desRow;
			finalDesColumn = desColumn;
			
		}
		
		return legalMove;
		
	}
	
}	