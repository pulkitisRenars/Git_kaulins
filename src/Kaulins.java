import java.util.Random;

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
mest(3);
		
		
		
		
	}

}
