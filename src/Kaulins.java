import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	
static void mest(int m){
	Random rand = new Random();
int uzmestkaulins;
for(int i = 0;i<m;i++){
uzmestkaulins = rand.nextInt(6)+1;
System.out.println("Uzkrita : "+uzmestkaulins);
}
}
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		int x;
		do{
		System.out.println("Cik reizes uzmest kaulinu?");
		x = dati.nextInt();
		}while(x<1);
	
mest(x);
	}

		
		
		
	}


