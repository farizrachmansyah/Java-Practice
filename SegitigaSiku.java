package getStarted;

public class SegitigaSiku {
	public static void main(String[] args) {
		System.out.println("Segitiga siku-siku kiri");
		int i,j,k;
		for(i=0; i<6; i++) {
			for(j=6; j>(i+1); j--) {
				System.out.print(" ");
			}
			for(k=0; k<=i; k++) {
				System.out.print(j--);
			}
			System.out.println();
		}
	}
}
