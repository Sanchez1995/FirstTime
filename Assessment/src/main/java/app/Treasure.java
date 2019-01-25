package app;

import java.util.Random;
import java.util.Scanner;

public class Treasure {
	public static void main(String [] args) {
		Random rand = new Random(); 
		int [] locationOfTreasure = {rand.nextInt(21) - 10, rand.nextInt(21)- 10};
		int x = 0;
		int y = 0;
		int [] position = {x,y};
		
		boolean north = false;
		boolean south = false;
		boolean east = false;
		boolean west = false;
		
		{
			while (position != locationOfTreasure) {	
			Scanner sc = new Scanner(System.in);
			String input = new String();
				System.out.println("please enter a direction to go in");
					
				input = (sc.nextLine());
			
			
				if (north = true) {
					x=x+1;
					System.out.println("moved north" );
					
				}
				else if (south = true) {
					x=x-1;
					System.out.println("moved south");
					
				}
				else if (east = true) {
					y=y+1;
					System.out.println("moved east");
					
				}
				else if (west = true) {
					y=y-1;
					System.out.println("moved west");
					
				}
				else if (y>10) {
					System.out.println("please pick another direction");
					
				}
				else if (y<-10) {
					System.out.println("please pick another direction");
					
				}
				else if (x>10) {
					System.out.println("please pick another direction");
					
				}
				else if (x<-10) {
					System.out.println("please pick another direction");
					
				}
				if (locationOfTreasure == position) {
					System.out.println("treasure found!!!" + "\n" + "congratulations you have completed the game" );
					break;
				}
				
						
								
									
										
								
//								if (y>10) {
//									System.out.println("please pick another direction");
//								if (y<-10) {
//									System.out.println("please pick another direction");
//								if (north) { 
//								y=y+1;
//								System.out.println("moved north" ); 
//								}
//								if (south) {
//									y=y-1;						
//									System.out.println("moved south" + position + locationOfTreasure);
//								}}}
//						for (x = -10; x<11;){
//								if (x>10) {
//									System.out.println("please pick another direction");}
//								if (x<-10) {
//									System.out.println("please pick another direction");}
//								if (east){
//									x=x+1;						
//									System.out.println("moved east" + position + locationOfTreasure);
//								}
//								if (west){
//									x=x-1;
//									System.out.println("moved west" + position + locationOfTreasure);
//								}
//								}
//					if (locationOfTreasure == position) {
//									System.out.println("treasure found!!!" + "\n" + "congratulations you have completed the game" );
											}}}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
						
							
						

}
