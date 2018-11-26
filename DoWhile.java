package getStarted;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// All things you need!
		Scanner input = new Scanner(System.in);
		int pil;
		float r, s,luas,kel;
		float phi = (float)3.14;
		String lagi;
		boolean kondisi;
		
		// Start dari sini
		do {
			System.out.println();
			System.out.println("===============================");
			System.out.println("    MENGHITUNG BANGUN DATAR    ");
			System.out.println();
			System.out.println("1. Lingkaran");
			System.out.println("2. Persegi");
			System.out.println("3. Exit");
			System.out.println("===============================");
			System.out.print("Masukkan pilihan: ");
			pil = input.nextInt();
			
			// Eksekusi pilihan user
			if(pil == 1) {
				System.out.print("Masukkan panjang jari-jari: ");
				r = input.nextFloat();
				luas = phi * r * r;
				kel = 2 * phi * r;
				
				System.out.println("Luas lingkaran = " + luas);
				System.out.println("Keliling lingkaran = " + kel);
				System.out.println("===============================");
			} else if(pil == 2) {
				System.out.print("Masukkan panjang sisi: ");
				s = input.nextFloat();
				luas = s * s;
				kel = 4 * s;
				
				System.out.println("Luas persegi = " + luas);
				System.out.println("Keliling persegi = " + kel);
				System.out.println("===============================");
			} else if(pil == 3) {
				System.out.println();
				System.out.println("Bye");
				break;
			} else {
				// lakuin perulangan kalo piihan user salah
				// do while statement buat loop, eksekusi pake switch
				do {
					System.out.println("Pilihan anda salah!");
					System.out.print("Masukkan pilihan: ");
					pil = input.nextInt();
					switch(pil) {
						case 1:
							System.out.print("Masukkan panjang jari-jari: ");
							r = input.nextFloat();
							luas = phi * r * r;
							kel = 2 * phi * r;
							
							System.out.println("Luas lingkaran = " + luas);
							System.out.println("Keliling lingkaran = " + kel);
							System.out.println("===============================");
							break;
						case 2:
							System.out.print("Masukkan panjang sisi: ");
							s = input.nextFloat();
							luas = s * s;
							kel = 4 * s;
							
							System.out.println("Luas persegi = " + luas);
							System.out.println("Keliling persegi = " + kel);
							System.out.println("===============================");
							break;
						case 3:
							System.out.println();
							System.out.println("Bye");
							break;
						default:
							break;
					}
				} while((pil<1) || (pil>3));
			}
			
			// Tanyain lagi ke user mau nyoba programnya lagi apa enggak
			// pengulangan dikasih parameter nilai boolean sebagai acuan ngulang atau enggaknya
			kondisi = true;
			do {
				System.out.println();
				System.out.print("Ingin mencoba lagi? (Y/N) : ");
				lagi = input.next();
				switch(lagi) {
					case "Y":
						pil = 1;
						kondisi = false;
						break;
					case "y":
						pil = 1;
						kondisi = false;
						break;
					case "N":
						pil = 0;
						kondisi = false;
						System.out.println();
						System.out.println("Bye");
						break;
					case "n":
						pil = 0;
						kondisi = false;
						System.out.println();
						System.out.println("Bye");
						break;
					default:
						System.out.println("Pilihan salah! Silahkan memilih Y/y/N/n");
						break;
				}
			} while(kondisi);
		} while((pil>0) && (pil<3));
		
		input.close();
	}
}
