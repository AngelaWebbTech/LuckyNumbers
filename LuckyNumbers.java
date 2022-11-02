//11.2.22 only 3 digit lucky number is being calculated & printed

//enter your name, letters assigned to numbers, add numbers, get your lucky number

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LuckyNumbers {
	public static void main (String[] args) {
		
		String name, birthmonth, birthyear, favoriteThing, totalString, twelfthPointString, luckyNumberMessage="";
		int total=0, startPoint, nextInt, secondPoint=0, thirdPoint=0, fourthPoint=0, fifthPoint=0, sixthPoint=0, seventhPoint=0, eighthPoint=0, 
				ninthPoint=0, tenthPoint=0, eleventhPoint=0, twelfthPoint=0;
		char nextChar;
		
		Scanner input = new Scanner(System.in);
		//enter your name
		name = JOptionPane.showInputDialog("What's your name?");
			//validate for only letters
		while (!name.matches("[a-zA-Z]+")) {
			name = JOptionPane.showInputDialog("Please only enter letters.\n\nWhat is your name?");
		}
		
		//enter your birthmonth
		birthmonth = JOptionPane.showInputDialog("What month were you born?");
		//validate for only letters
		while (((!birthmonth.matches("[a-zA-Z]+") && !birthmonth.matches("[0-9]+")))
				|| (birthmonth.matches("[0-9]+") && (birthmonth.equals("0") || Integer.parseInt(birthmonth)>12))) {
			birthmonth = JOptionPane.showInputDialog("Please only enter only letters or only numbers.\n\nWhat is your birth month?");
		}
		
		//enter your birthyear
		birthyear = JOptionPane.showInputDialog("What year were you born?");
		//validate for only 4 numbers (if only 2 numbers, verify that the first two are either 19 or 20)
		while (!birthyear.matches("[0-9]+") || birthyear.length()!=4) {
			birthyear = JOptionPane.showInputDialog("Please enter a 4 digit number.\n\nWhat year were you born?");
		}
		
		//enter your favorite thing
		favoriteThing = JOptionPane.showInputDialog("What is your favorite thing?");
		System.out.println("user entered favoriteThing: " + favoriteThing);
		favoriteThing = favoriteThing.replaceAll("[^a-zA-Z0-9]", "");
		
		//convert each character to int
		for (int i=0;i<name.length();i++) {
			if (name.charAt(i)=='a' || name.charAt(i)=='A')
				total+=1;
			else if (name.charAt(i)=='b' || name.charAt(i)=='B')
				total+=2; 
			else if (name.charAt(i)=='c' || name.charAt(i)=='C')
				total+=3; 
			else if (name.charAt(i)=='d' || name.charAt(i)=='D')
				total+=4;
			else if (name.charAt(i)=='e' || name.charAt(i)=='E')
				total+=5; 
			else if (name.charAt(i)=='f' || name.charAt(i)=='F')
				total+=6; 
			else if (name.charAt(i)=='g' || name.charAt(i)=='G')
				total+=7; 
			else if (name.charAt(i)=='h' || name.charAt(i)=='H')
				total+=8; 
			else if (name.charAt(i)=='i' || name.charAt(i)=='I')
				total+=9; 
			else if (name.charAt(i)=='j' || name.charAt(i)=='J')
				total+=10; 
			else if (name.charAt(i)=='k' || name.charAt(i)=='K')
				total+=11; 
			else if (name.charAt(i)=='l' || name.charAt(i)=='L')
				total+=12; 
			else if (name.charAt(i)=='m' || name.charAt(i)=='M')
				total+=13; 
			else if (name.charAt(i)=='n' || name.charAt(i)=='N')
				total+=14; 
			else if (name.charAt(i)=='o' || name.charAt(i)=='O')
				total+=15; 
			else if (name.charAt(i)=='p' || name.charAt(i)=='P')
				total+=16; 
			else if (name.charAt(i)=='q' || name.charAt(i)=='Q')
				total+=17; 
			else if (name.charAt(i)=='r' || name.charAt(i)=='R')
				total+=18; 
			else if (name.charAt(i)=='s' || name.charAt(i)=='S')
				total+=19; 
			else if (name.charAt(i)=='t' || name.charAt(i)=='T')
				total+=20; 
			else if (name.charAt(i)=='u' || name.charAt(i)=='U')
				total+=21; 
			else if (name.charAt(i)=='v' || name.charAt(i)=='V')
				total+=22; 
			else if (name.charAt(i)=='w' || name.charAt(i)=='W')
				total+=23; 
			else if (name.charAt(i)=='x' || name.charAt(i)=='X')
				total+=24; 
			else if (name.charAt(i)=='y' || name.charAt(i)=='Y')
				total+=25; 
			else if (name.charAt(i)=='z' || name.charAt(i)=='Z')
				total+=26; 
			else if (name.charAt(i)=='0')
				total+=0; 
			else if (name.charAt(i)=='1')
				total+=1; 
			else if (name.charAt(i)=='2')
				total+=2; 
			else if (name.charAt(i)=='3')
				total+=3; 
			else if (name.charAt(i)=='4')
				total+=4; 
			else if (name.charAt(i)=='5')
				total+=5; 
			else if (name.charAt(i)=='6')
				total+=6; 
			else if (name.charAt(i)=='7')
				total+=7; 
			else if (name.charAt(i)=='8')
				total+=8; 
			else if (name.charAt(i)=='9')
				total+=9; 
			else
				total=total;
		}
		
		for (int i=0;i<birthmonth.length();i++) {
			if (birthmonth.charAt(i)=='a' || birthmonth.charAt(i)=='A')
				total+=1;
			else if (birthmonth.charAt(i)=='b' || birthmonth.charAt(i)=='B')
				total+=2; 
			else if (birthmonth.charAt(i)=='c' || birthmonth.charAt(i)=='C')
				total+=3; 
			else if (birthmonth.charAt(i)=='d' || birthmonth.charAt(i)=='D')
				total+=4;
			else if (birthmonth.charAt(i)=='e' || birthmonth.charAt(i)=='E')
				total+=5; 
			else if (birthmonth.charAt(i)=='f' || birthmonth.charAt(i)=='F')
				total+=6; 
			else if (birthmonth.charAt(i)=='g' || birthmonth.charAt(i)=='G')
				total+=7; 
			else if (birthmonth.charAt(i)=='h' || birthmonth.charAt(i)=='H')
				total+=8; 
			else if (birthmonth.charAt(i)=='i' || birthmonth.charAt(i)=='I')
				total+=9; 
			else if (birthmonth.charAt(i)=='j' || birthmonth.charAt(i)=='J')
				total+=10; 
			else if (birthmonth.charAt(i)=='k' || birthmonth.charAt(i)=='K')
				total+=11; 
			else if (birthmonth.charAt(i)=='l' || birthmonth.charAt(i)=='L')
				total+=12; 
			else if (birthmonth.charAt(i)=='m' || birthmonth.charAt(i)=='M')
				total+=13; 
			else if (birthmonth.charAt(i)=='n' || birthmonth.charAt(i)=='N')
				total+=14; 
			else if (birthmonth.charAt(i)=='o' || birthmonth.charAt(i)=='O')
				total+=15; 
			else if (birthmonth.charAt(i)=='p' || birthmonth.charAt(i)=='P')
				total+=16; 
			else if (birthmonth.charAt(i)=='q' || birthmonth.charAt(i)=='Q')
				total+=17; 
			else if (birthmonth.charAt(i)=='r' || birthmonth.charAt(i)=='R')
				total+=18; 
			else if (birthmonth.charAt(i)=='s' || birthmonth.charAt(i)=='S')
				total+=19; 
			else if (birthmonth.charAt(i)=='t' || birthmonth.charAt(i)=='T')
				total+=20; 
			else if (birthmonth.charAt(i)=='u' || birthmonth.charAt(i)=='U')
				total+=21; 
			else if (birthmonth.charAt(i)=='v' || birthmonth.charAt(i)=='V')
				total+=22; 
			else if (birthmonth.charAt(i)=='w' || birthmonth.charAt(i)=='W')
				total+=23; 
			else if (birthmonth.charAt(i)=='x' || birthmonth.charAt(i)=='X')
				total+=24; 
			else if (birthmonth.charAt(i)=='y' || birthmonth.charAt(i)=='Y')
				total+=25; 
			else if (birthmonth.charAt(i)=='z' || birthmonth.charAt(i)=='Z')
				total+=26; 
			else if (birthmonth.charAt(i)=='0')
				total+=0; 
			else if (birthmonth.charAt(i)=='1')
				total+=1; 
			else if (birthmonth.charAt(i)=='2')
				total+=2; 
			else if (birthmonth.charAt(i)=='3')
				total+=3; 
			else if (birthmonth.charAt(i)=='4')
				total+=4; 
			else if (birthmonth.charAt(i)=='5')
				total+=5; 
			else if (birthmonth.charAt(i)=='6')
				total+=6; 
			else if (birthmonth.charAt(i)=='7')
				total+=7; 
			else if (birthmonth.charAt(i)=='8')
				total+=8; 
			else if (birthmonth.charAt(i)=='9')
				total+=9; 
			else
				total=total;
		}
		
		for (int i=0;i<birthyear.length();i++) {
			if (birthyear.charAt(i)=='0')
				total+=0; 
			else if (birthyear.charAt(i)=='1')
				total+=1; 
			else if (birthyear.charAt(i)=='2')
				total+=2; 
			else if (birthyear.charAt(i)=='3')
				total+=3; 
			else if (birthyear.charAt(i)=='4')
				total+=4; 
			else if (birthyear.charAt(i)=='5')
				total+=5; 
			else if (birthyear.charAt(i)=='6')
				total+=6; 
			else if (birthyear.charAt(i)=='7')
				total+=7; 
			else if (birthyear.charAt(i)=='8')
				total+=8; 
			else if (birthyear.charAt(i)=='9')
				total+=9; 
			else
				total=total;
		}
		
		for (int i=0;i<favoriteThing.length();i++) {
			if (favoriteThing.charAt(i)=='a' || favoriteThing.charAt(i)=='A')
				total+=1;
			else if (favoriteThing.charAt(i)=='b' || favoriteThing.charAt(i)=='B')
				total+=2; 
			else if (favoriteThing.charAt(i)=='c' || favoriteThing.charAt(i)=='C')
				total+=3; 
			else if (favoriteThing.charAt(i)=='d' || favoriteThing.charAt(i)=='D')
				total+=4;
			else if (favoriteThing.charAt(i)=='e' || favoriteThing.charAt(i)=='E')
				total+=5; 
			else if (favoriteThing.charAt(i)=='f' || favoriteThing.charAt(i)=='F')
				total+=6; 
			else if (favoriteThing.charAt(i)=='g' || favoriteThing.charAt(i)=='G')
				total+=7; 
			else if (favoriteThing.charAt(i)=='h' || favoriteThing.charAt(i)=='H')
				total+=8; 
			else if (favoriteThing.charAt(i)=='i' || favoriteThing.charAt(i)=='I')
				total+=9; 
			else if (favoriteThing.charAt(i)=='j' || favoriteThing.charAt(i)=='J')
				total+=10; 
			else if (favoriteThing.charAt(i)=='k' || favoriteThing.charAt(i)=='K')
				total+=11; 
			else if (favoriteThing.charAt(i)=='l' || favoriteThing.charAt(i)=='L')
				total+=12; 
			else if (favoriteThing.charAt(i)=='m' || favoriteThing.charAt(i)=='M')
				total+=13; 
			else if (favoriteThing.charAt(i)=='n' || favoriteThing.charAt(i)=='N')
				total+=14; 
			else if (favoriteThing.charAt(i)=='o' || favoriteThing.charAt(i)=='O')
				total+=15; 
			else if (favoriteThing.charAt(i)=='p' || favoriteThing.charAt(i)=='P')
				total+=16; 
			else if (favoriteThing.charAt(i)=='q' || favoriteThing.charAt(i)=='Q')
				total+=17; 
			else if (favoriteThing.charAt(i)=='r' || favoriteThing.charAt(i)=='R')
				total+=18; 
			else if (favoriteThing.charAt(i)=='s' || favoriteThing.charAt(i)=='S')
				total+=19; 
			else if (favoriteThing.charAt(i)=='t' || favoriteThing.charAt(i)=='T')
				total+=20; 
			else if (favoriteThing.charAt(i)=='u' || favoriteThing.charAt(i)=='U')
				total+=21; 
			else if (favoriteThing.charAt(i)=='v' || favoriteThing.charAt(i)=='V')
				total+=22; 
			else if (favoriteThing.charAt(i)=='w' || favoriteThing.charAt(i)=='W')
				total+=23; 
			else if (favoriteThing.charAt(i)=='x' || favoriteThing.charAt(i)=='X')
				total+=24; 
			else if (favoriteThing.charAt(i)=='y' || favoriteThing.charAt(i)=='Y')
				total+=25; 
			else if (favoriteThing.charAt(i)=='z' || favoriteThing.charAt(i)=='Z')
				total+=26; 
			else if (favoriteThing.charAt(i)=='0')
				total+=0; 
			else if (favoriteThing.charAt(i)=='1')
				total+=1; 
			else if (favoriteThing.charAt(i)=='2')
				total+=2; 
			else if (favoriteThing.charAt(i)=='3')
				total+=3; 
			else if (favoriteThing.charAt(i)=='4')
				total+=4; 
			else if (favoriteThing.charAt(i)=='5')
				total+=5; 
			else if (favoriteThing.charAt(i)=='6')
				total+=6; 
			else if (favoriteThing.charAt(i)=='7')
				total+=7; 
			else if (favoriteThing.charAt(i)=='8')
				total+=8; 
			else if (favoriteThing.charAt(i)=='9')
				total+=9; 
			else
				total=total;
		}
		
		//sum all integers in loops - save the smallest for each digit count (one 6 digit number, one 5 digit number, one 4 digit number, etc.)
		totalString = String.valueOf(total);
				
		while (totalString.length()>12) { //get starting point to 12 or fewer digits
			for (int x=0;x<totalString.length();x++) {
				nextChar = totalString.charAt(x);
				nextInt = Character.valueOf(nextChar);
				total += nextInt;
				totalString = String.valueOf(total);
			}
		}
		
		startPoint = totalString.length();
		Integer[] luckyNumbers = new Integer[12];
		
		for (int i=0;i<startPoint;i++) {  //sets up a loop for the number of times = number of digits in starting point
			//add all digits
			for (int x=0;x<startPoint-i;x++) {
				nextInt = Character.valueOf(totalString.charAt(i)); //parse first digit to int
				total += nextInt; //add the new int to the total
			}
			
			totalString = String.valueOf(total);
			
			//store "lucky number" in appropriate place in array
			if (totalString.length()==1)
				luckyNumbers[0] = total;
			else if (totalString.length()==2)
				luckyNumbers[1] = total;
			else if (totalString.length()==3)
				luckyNumbers[2] = total;
			else if (totalString.length()==4)
				luckyNumbers[3] = total;
			else if (totalString.length()==5)
				luckyNumbers[4] = total;
			else if (totalString.length()==6)
				luckyNumbers[5] = total;
			else if (totalString.length()==7)
				luckyNumbers[6] = total;
			else if (totalString.length()==8)
				luckyNumbers[7] = total;
			else if (totalString.length()==9)
				luckyNumbers[8] = total;
			else if (totalString.length()==10)
				luckyNumbers[9] = total;
			else if (totalString.length()==11)
				luckyNumbers[10] = total;
			else if (totalString.length()==12)
				luckyNumbers[11] = total;
			else {
				JOptionPane.showMessageDialog(null, "I'm sorry to say that something has gone wrong during the calcualtion.\nPlease try again.");
				System.exit(0);
			}
		}
			
		//display "your lucky numbers are:" (only display the ones that have totals) ****************************************************************** DISPLAY NOT WORKING PROPERLY
		for (int y = 0;y<12;y++) {
			if (luckyNumbers[y]==null)
				luckyNumberMessage = luckyNumberMessage + "Your " + (y+1) + " digit lucky number: (none)\n";
			else
				luckyNumberMessage = luckyNumberMessage + "Your " + (y+1) + " digit lucky number: " + luckyNumbers[y] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, luckyNumberMessage);
	}
}

