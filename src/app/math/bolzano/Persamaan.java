package app.math.bolzano;

public class Persamaan {
	
	double batasAtas;
	double batasBawah;
	double nilaiIntv1;
	double nilaiIntv2;

	
	double masukFungsi(double x) {
		double fx = (x * x * x) + (4*(x * x)) - 10;
		return fx;
	}
	
	double runBolzano(double intv1, double intv2) {
		double temp = 0;
		
		double cekInterval = masukFungsi(intv1) * masukFungsi(intv2);
		if (cekInterval < 0) {
			batasAtas = intv1;
			batasBawah = intv2;
			
			
			for(int i = 0; i < 10; i++) {
				System.out.println("Iterasi ke - " + (i+1));
				for(double x = batasAtas; x < batasBawah; x = batasBawah) {
					temp = (x + batasBawah)/2;
					if(masukFungsi(x) * masukFungsi(temp) < 0) {
						batasBawah = temp;
						System.out.println("f"+"("+temp+") = " + masukFungsi(temp) );
					}
					else {
						batasAtas = temp;
						System.out.println("f"+"("+temp+") = " + masukFungsi(temp) );

					}	
				}
				
			}
		}
		
		return cekInterval;
	}
}
