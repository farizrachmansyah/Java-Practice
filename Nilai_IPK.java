package com.latihan;
import java.util.Scanner;

public class Nilai_IPK {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Deklarasi semua bahan bahannya
		float ipk,bobot,totNilai;
		float[] nilai = new float[4];
		float[] sks = {2, 2, 3, 2};
		char[] skor = new char[4];
		String[] matkul = {"ALGORITMA PEMROGRAMAN", "MATIF", "KTI", "MATDAS"};
		String[] ujian = {"UTS", "UAS", "VClass", "Kuis"};

		bobot = 0;
		for(int i=0; i<matkul.length; i++) {    // ini untuk pengulangan matkulnya
			totNilai = 0;
			switch(matkul[i]) { // buat ngatur posisi judul biar cakep aja
				case "ALGORITMA PEMROGRAMAN":
					System.out.println("##### " + matkul[i] + " #####");
					break;
				case "MATIF":
					System.out.println("############# " + matkul[i] + " #############");
					break;
				case "KTI":
					System.out.println("############## " + matkul[i] + " ##############");
					break;
				case "MATDAS":
					System.out.println("############ " + matkul[i] + " ############");
			}

			for(int j=0; j<ujian.length; j++) { // ini buat pengulangan ujiannya
				switch(ujian[j]) {
					case "UTS":
						System.out.print("Masukkan nilai " + ujian[j] + " : ");
						nilai[j] = input.nextFloat();

						nilai[j] = nilai[j] * 0.6f;
						totNilai = totNilai + nilai[j];

						break;
					case "UAS":
						System.out.print("Masukkan nilai " + ujian[j] + " : ");
						nilai[j] = input.nextFloat();

						nilai[j] = nilai[j] * 0.2f;
						totNilai = totNilai + nilai[j];

						break;
					case "VClass":
						System.out.print("Masukkan nilai " + ujian[j] + " : ");
						nilai[j] = input.nextFloat();

						nilai[j] = nilai[j] * 0.05f;
						totNilai = totNilai + nilai[j];

						break;
					case "Kuis":
						System.out.print("Masukkan nilai " + ujian[j] + " : ");
						nilai[j] = input.nextFloat();

						nilai[j] = nilai[j] * 0.15f;
						totNilai = totNilai + nilai[j];

						break;
				}
			}

			if(totNilai >= 85) {
				skor[i] = 'A';
				bobot = bobot + (4 * sks[i]);

				System.out.println("Skor = " + skor[i]);
			} else if(totNilai >= 70) {
				skor[i] = 'B';
				bobot = bobot + (3 * sks[i]);

				System.out.println("Skor = " + skor[i]);
			} else if(totNilai >= 50) {
				skor[i] = 'C';
				bobot = bobot + (2 * sks[i]);

				System.out.println("Skor = " + skor[i]);
			} else if (totNilai >= 30) {
				skor[i] = 'D';
				bobot = bobot + (1.5f * sks[i]);

				System.out.println("Skor = " + skor[i]);
			} else {
				skor[i] = 'E';
				bobot = bobot + 1;

				System.out.println("Skor = " + skor[i]);
			}

			System.out.println();
		}

		ipk = bobot/9;

		System.out.println();
		System.out.println("Bobot nilai = " + bobot);
		System.out.println(String.format("IPK = %.2f", ipk));
	}
}
