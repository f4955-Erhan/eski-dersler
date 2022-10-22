package j12_Loops.L02_WhileLoop.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		System.out.println("3 basamaklı sayılarda 4 ve 6 ya bölünen tam sayilar : ");

		int adet =0;

		for (int i = 999; i > 0; i--) {

			if (i%4==0&&i%6==0) {

				System.out.print(i+">");

				adet++;

			}

		}
		System.out.println();
		System.out.println("toplam "+adet+" sayı");
		
		
			
	}

}
