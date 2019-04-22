package com.latihan;
import java.util.Arrays;
import java.util.Scanner;

public class OperasiArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] angka1 = {1,2,3,4,5};

		// Merubah array menjadi string
		System.out.println("\nMerubah Array Menjadi String\n==========");
		printArray(angka1, "angka 1 = ");

		// Mengkopi array
		System.out.println("\nMengkopi Array\n==========");

		System.out.println("> mengkopi dengan loop");
		int[] angka2 = new int[5];
		for(int i=0; i<angka1.length; i++) {
			angka2[i] = angka1[i];
		}
		printArray(angka1, "angka 1 = ");
		printArray(angka2, "angka 2 = ");

		System.out.println("> mengkopi dengan copyOf");
		int[] angka3 = Arrays.copyOf(angka1, 5);
		printArray(angka1, "angka 1 = ");
		printArray(angka3, "angka 3 = ");

		System.out.println("> mengkopi dengan copyOfRange");
		int[] angka4 = Arrays.copyOfRange(angka1, 2, 5);
		/* from index ke berapa, sampe batas akhirnya index ke berapa. dimana batas akhir gaikutan ke bawa */
		printArray(angka1, "angka 1 = ");
		printArray(angka4, "angka 4 = ");

		// Fill array
		System.out.println("\nFill Array\n==========");
		int[] angka5 = new int[5];
		printArray(angka5, "kosong\t\t= ");
		Arrays.fill(angka5, 1);
		printArray(angka5, "abis diisi\t= ");

		// Komparasi array
		int[] angka6 = {1,2,3,6,5};
		int[] angka7 = {1,2,3,4,5};
		System.out.println("\nMembandingkan Array\n==========");

		System.out.println("> membandingkan antara dua buah array, sama atau engga");
		System.out.println(Arrays.equals(angka6,angka7));
		if(Arrays.equals(angka6,angka7)) {
			System.out.println("Arraynya sama");
		} else {
			System.out.println("Arraynya beda");
		}

		System.out.println("> mengecek mana array yang lebih besar");
		System.out.println(Arrays.compare(angka6,angka7));
		if(Arrays.compare(angka6,angka7) == 1) {
			System.out.println("Array angka6 lebih besar");
		} else if(Arrays.compare(angka6,angka7) == 0) {
			System.out.println("Kedua array bernilai sama besar");
		} else if(Arrays.compare(angka6,angka7) == -1) {
			System.out.println("Array angka7 lebih besar");
		}

		System.out.println("> ngecek mana index yang berbeda");
		// tapi cuma bisa ngecek sekali, yang paling pertama ketemu ada perbedaan
		// langsung di ambil indexnya, jadi kalo ada yang beda di index berikutnya
		// ga akan kebaca.
		System.out.println("index ke-" + Arrays.mismatch(angka6,angka7));

		// Sort array
		System.out.println("\nMenaorting Array\n==========");
		int[] angka8 = {3,1,4,8,5,7,9,2,6};
		printArray(angka8, "default\t\t= ");
		Arrays.sort(angka8);
		printArray(angka8, "berurutan\t= ");

		// Search array
		System.out.println("\nMencari Array\n==========");
		System.out.print("Cari angka : ");
		int cari = input.nextInt();
		int index = Arrays.binarySearch(angka8,cari);
		System.out.println("angka " + cari + " ada di index " + index);

		input.close();
	}

	private static void printArray(int[] dataArray, String message) {
		System.out.println(message + Arrays.toString(dataArray));
	}
}
