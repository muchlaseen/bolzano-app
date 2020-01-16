package app.math.bolzano;

import java.util.Scanner;

public class BolzanoApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		// Interval sesuai Soal Papan Tulis = 1 & 2
		System.out.print("Masukkan interval 1 : " );
		double interval1 = input.nextDouble();
		System.out.print("Masukkan interval 2 : " );
		double interval2 = input.nextDouble();
		
		Persamaan fungsi = new Persamaan();
		
		
		fungsi.runBolzano(interval1, interval2);
		
	
	}
}
