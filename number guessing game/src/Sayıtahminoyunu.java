import java.util.Random;
import java.util.Scanner;

public class Sayýtahminoyunu {

	public static void main(String[] args) {
		int tahmin, can=5, i=0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sayý = rand.nextInt(100);
		
		boolean oyunDurumu = false;
		int[] tahminler=new int[5];
		System.out.println(sayý);
		System.out.println("Sayý Tahmin oyununa hoþgelniz");
		System.out.println("0 - 99 arasýnda bir sayý tuttum ");
		while(can > 0) {
			System.out.println("Tahmininiz ");
			tahmin=scan.nextInt();
			tahminler[i++]=tahmin;
			if(tahmin<0 && tahmin > 99) {
				System.out.println("Lütfen 0 ve 99 arasýnda bir sayý giriniz ");
				continue;
				
			}
			if(tahmin==sayý) {
				oyunDurumu=true;
				break;
				
			}
			else {
				System.out.println("Yanlýþ tahmin tekrar deneyiniz  Kalan can : " + --can);
			}
		}
		if(oyunDurumu) {
			System.out.println("Tebrikler Doðru Tahmin ");
			System.out.println("Sayýmýz " + sayý);
			System.out.println("Kalan canýnýz " + can);
			
		}
		else {
			System.out.println("Baþaramadýnýz ");
		}
		System.out.print("Tahminleriniz ");
		for(int value : tahminler) {
			if(value !=0)
			System.out.print(value +" , ");
		}
	}

}
