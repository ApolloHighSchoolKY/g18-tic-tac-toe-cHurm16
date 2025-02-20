//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		//Read how many times you should read 

		//TicTacToe only wants this: file.nextLine();

		//Make a TicTacToe object for each game in the file 

		//Print the game (TicTacToe)

		//Print the winner 

		int x = file.nextInt();
		file.nextLine();

		TicTacToe game = new TicTacToe(file.nextLine());

		

		








	}
}



