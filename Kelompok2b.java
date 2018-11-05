package getStarted;
import java.util.Scanner;
public class Kelompok2b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menghitung Luas dan Keliling Bangun Datar");
		System.out.println("1. lingkaran");
		System.out.println("2. persegi");
		System.out.println();
		System.out.println("Masukkan pilihan =");
		int pilihan = input.nextInt();
		System.out.println();
		float pi = (float)3.14;
		if(pilihan == 1) {
			System.out.println("Menghitung Luas & Keliling lingkaran");
			System.out.print("Masukkan Jari-jari : ");
			float r = (float)input.nextFloat();
			float luas = pi*r*r;
			float keliling = 2*pi*r;
			System.out.println("Luas = " + luas);
			System.out.println("Keliling = " + keliling);
		} else if(pilihan == 2) {
			System.out.println("Menghitung Luas & Keliling persegi");
			System.out.print("Masukkan Sisi : ");
			int s = input.nextInt();
			int luas = s*s;
			int keliling = 4*s;
			System.out.println("Luas = " + luas);
			System.out.println("Keliling = " + keliling);
		} else {
			System.out.println("Pilihan anda salah");
		}
		
		for(int i=0; i<2; i++) {
			System.out.println();
			System.out.println("Ingin Mencoba lagi (Y/N)? :");
			char pilihan2 = input.next().charAt(0);
			if(pilihan2 == 'y') {
				System.out.println("Menghitung Luas dan Keliling Bangun Datar");
				System.out.println("1. lingkaran");
				System.out.println("2. persegi");
				System.out.println();
				System.out.println("Masukkan pilihan =");
				pilihan = input.nextInt();
				System.out.println();
				if(pilihan == 1) {
					System.out.println("Menghitung Luas & Keliling lingkaran");
					System.out.print("Masukkan Jari-jari : ");
					float r = (float)input.nextFloat();
					float luas = pi*r*r;
					float keliling = 2*pi*r;
					System.out.println("Luas = " + luas);
					System.out.print("Keliling = " + keliling);
				} else if(pilihan == 2) {
					System.out.println("Menghitung Luas & Keliling persegi");
					System.out.print("Masukkan Sisi : ");
					int s = input.nextInt();
					int luas = s*s;
					int keliling = 4*s;
					System.out.println("Luas = " + luas);
					System.out.println("Keliling = " + keliling);
				} else {
					System.out.println("Pilihan anda salah");
				}
			} else if(pilihan2 == 'n') {
				System.out.println("Bye");
			} else {
				break;
			}
		}
		input.close();
	}
}
