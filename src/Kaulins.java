import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	
static void mest(int m){
	Random rand = new Random();
int uzmestkaulins;
int max=0;
for(int i = 0;i<m;i++){
uzmestkaulins = rand.nextInt(6)+1;
if(max<uzmestkaulins){
	max=uzmestkaulins;
}
System.out.println("Uzkrita : "+uzmestkaulins);
}
System.out.println("No "+m+" metieniem lielakais bija: "+max);
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


