import java.util.Scanner;
import java.util.Random;

public class java
{
public static void main(String args[])
{
Random random=new Random();
int num=random.nxtInt(100)+1;
int numGuesses=0;
Scanner keyboard=new Scanner(System.in);
System.out.println("guess the number between 1 to 100");
while(true)
{
int guess=sc.nextInt();
numGuesses++;
if(guess<num)
{
System.out.println("Too low. try again:");
}
else if(guess>num)
{
System.out.println("Too high. try again:");
}
else
{
System.out.println("you guessed the number" + numGuesses+ "num.");
break;
}
}
sc.close();
}
}
