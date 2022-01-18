import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
Random rand = new Random();
Scanner dati = new Scanner(System.in);
System.out.println("Cik reizes uzmest kaulinu?");
int x = dati.nextInt();
int uzmestkaulins;
for(int i =0; i<x;i++){
uzmestkaulins = rand.nextInt(6)+1;
System.out.println("Uzkrita : "+uzmestkaulins);
}
dati.close();
		
		
		
	}

}
