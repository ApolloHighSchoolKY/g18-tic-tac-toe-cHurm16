//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	char[0][0] = 'x';
	char[0][1] = 'x';
	char[0][2] = 'x';
	char[1][0] = 'o';
	char[1][1] = 'o';
	char[1][2] = 'o';
	char[2][0] = 'x';
	char[2][1] = 'o';
	char[2][2] = 'x';

	public TicTacToe()
	{
		TicTacToe game = new TicTacToe(file.nextLine());

	}

	public TicTacToe(String game)
	{
		for(row=0; row<char.length; row++)

		for(col=0; col<char[0].length; col++)
		file.nextLine();



	}
	
	int check = mat[i][i+1];
	public String getWinner()
	{
		boolean winner = true;

		for(int i=0; i<3; i++)
		if(char[i][0]==('X')&& char[i][1]==('X')&& char[i][2]==('X'))
		return true; 
		System.out.println("X is the winner");
		if(char[0][i]=='X'&& char[1][i]=='X'&& char[2][i]==('X'))
		return true; 
		System.out.println("X is the winner");

		if(char[i][0]==('O')&& char[i][1]==('O')&& char[i][2]==('O'))
		return true; 
		System.out.println("O is the winner");
		if(char[0][i]=='O'&& char[1][i]=='O'&& char[2][i]==('O'))
		return true; 
		System.out.println("O is the winner");

		if(char[0][0]==('O')&& char[1][1]==('O')&& char[2][2]==('O'))
		return true; 
		System.out.println("O is the winner");
		if(char[0][0]=='X'&& char[1][1]=='X'&& char[2][2]==('X'))
		return true; 
		System.out.println("X is the winner");

		if(char[0][2]==('O')&& char[1][1]==('O')&& char[2][0]==('O'))
		return true; 
		System.out.println("O is the winner");
		if(char[0][2]=='X'&& char[1][1]=='X'&& char[2][0]==('X'))
		return true; 
		System.out.println("X is the winner");

		if(char[0][0]==('O')&& char[1][1]==('x')&& char[2][2]==('x'))
		return false; 
		System.out.println("No one is the winner");
		if(char[0][0]=='X'&& char[1][1]=='O'&& char[2][2]==('O'))
		return false; 
		System.out.println("No one is the winner");
		else
		return false; 







		

		











		return "";
	}

	public String toString()
	{
		String output="";

		return winner; 
		return x; 
		return output+"\n\n";
	}
}