import java.util.Random;
import java.util.Scanner;

public class Say�tahminoyunu {

	public static void main(String[] args) {
		int tahmin, can=5, i=0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int say� = rand.nextInt(100);
		
		boolean oyunDurumu = false;
		int[] tahminler=new int[5];
		System.out.println(say�);
		System.out.println("Say� Tahmin oyununa ho�gelniz");
		System.out.println("0 - 99 aras�nda bir say� tuttum ");
		while(can > 0) {
			System.out.println("Tahmininiz ");
			tahmin=scan.nextInt();
			tahminler[i++]=tahmin;
			if(tahmin<0 && tahmin > 99) {
				System.out.println("L�tfen 0 ve 99 aras�nda bir say� giriniz ");
				continue;
				
			}
			if(tahmin==say�) {
				oyunDurumu=true;
				break;
				
			}
			else {
				System.out.println("Yanl�� tahmin tekrar deneyiniz  Kalan can : " + --can);
			}
		}
		if(oyunDurumu) {
			System.out.println("Tebrikler Do�ru Tahmin ");
			System.out.println("Say�m�z " + say�);
			System.out.println("Kalan can�n�z " + can);
			
		}
		else {
			System.out.println("Ba�aramad�n�z ");
		}
		System.out.print("Tahminleriniz ");
		for(int value : tahminler) {
			if(value !=0)
			System.out.print(value +" , ");
		}
	}

}
