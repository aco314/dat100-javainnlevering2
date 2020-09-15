package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		
		int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] b = { {10,11,12}, {13,14,15}, {16,17,18} };
		int[][] c = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] d = { {1,2}, {5,6}, {7,9} };
		int[][] e = { 
				{0,0,1,1,1,1,0,0}, 
				{0,1,0,0,0,0,1,0}, 
				{0,1,0,0,0,0,1,0}, 
				{0,0,1,1,1,1,0,0}, 
				{0,1,0,0,0,0,1,0}, 
				{0,1,0,0,0,0,1,0}, 
				{0,1,0,0,0,0,1,0}, 
				{0,0,1,1,1,1,0,0}, 
			};
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		if (matrise == null) {
			return;
		}
		
		for (int[] rad: matrise) {
			for (int tall: rad) {
				
				System.out.print(tall + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String text = "";
		
		for (int[] rad: matrise) {
			for (int tall: rad) {
				
				text += tall + " ";
			}
			text += "\n";
		}
		
		return text;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
	
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int i = 0; i < matrise[0].length; i++) {
				
				nyMatrise[rad][i] = matrise[rad][i] * tall;
			}
		}
		
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if ((a.length != b.length) || a[0].length != b[0].length) {
			return false;
		}
		
		for (int rad = 0; rad < a.length; rad++) {
			for (int verdi = 0; verdi < a.length; verdi++) {
				
				if (a[rad][verdi] != b[rad][verdi]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		// Returnerer null hvis matrisen ikke er kvadratisk
		if (matrise.length != matrise[0].length) {
			return null;
		}

		// Lager en identisk matrise som parameteren, 
		// ved hjelp av skaler() og 1 som multiplikator
		int[][] nyMatrise = skaler(1, matrise);
		
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int verdi = 0; verdi < matrise.length; verdi++) {
				
				nyMatrise[rad][verdi] = matrise[verdi][rad];
			}
		}
		
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		// Veldig vanskelig oppgave, men jeg tenker at man trenger 3 nøstede for-løkker.
		
		throw new UnsupportedOperationException("multipliser ikke implementert");
	}
}
