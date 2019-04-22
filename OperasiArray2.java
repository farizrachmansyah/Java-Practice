package com.latihan;
import java.util.Arrays;
import java.util.Scanner;

public class OperasiArray2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] angka1 = new int[5];
		int[] angka2 = new int[5];

		for(int i=0; i<angka1.length; i++) {
			System.out.print("Input array angka1 ke-" + (i+1) + " : ");
			angka1[i] = input.nextInt();
		}
		System.out.println();
		for(int i=0; i<angka2.length; i++) {
			System.out.print("Input array angka2 ke-" + (i+1) + " : ");
			angka2[i] = input.nextInt();
		}

		// Penjumlahan 2 buah array
		int[] hasil = tambahArray(angka1,angka2);

		System.out.println("\nPenjumlahan Array\n==========");
		printArray(angka1, "angka1\t= ");
		printArray(angka2, "angka2\t= ");
		printArray(hasil, "hasil\t= ");

		// Menggabungkan 2 buah array
		int[] gabung = gabungArray(angka1,angka2);

		System.out.println("\nMenggabungkan Array\n==========");
		printArray(angka1, "angka1\t= ");
		printArray(angka2, "angka2\t= ");
		printArray(gabung, "gabung\t= ");

		// Menyusun terbalik array (sorting reverse)
		System.out.println("\nSorting reverse Array\n==========");

		printArray(angka1, "angka1\t\t= ");
		reversed(angka1);
		printArray(angka1, "reversed\t= ");

		input.close();
	}

	private static void reversed(int[] dataArray) {
		Arrays.sort(dataArray);
		printArray(dataArray, "sorted\t\t= ");

		int[] arrayBuffered = Arrays.copyOf(dataArray,dataArray.length);
		for(int i=0; i<dataArray.length; i++) {
			dataArray[i] = arrayBuffered[(arrayBuffered.length - 1) - i];
		}
	}

	private static int[] gabungArray(int[] dataArray1, int[] dataArray2) {
		int[] dataGabung = new int[dataArray1.length + dataArray2.length];

		for(int i=0; i<dataArray1.length; i++) {
			dataGabung[i] = dataArray1[i];
		}
		for(int i=0; i<dataArray2.length; i++) {
			dataGabung[i+dataArray1.length] = dataArray2[i];
		}

		return dataGabung;
	}

	private static int[] tambahArray(int[] array1, int[] array2) {
		int[] hasil = new int[array1.length];

		for(int i=0; i<array1.length; i++) {
			hasil[i] = array1[i] + array2[i];
		}

		return hasil;
	}

	private static void printArray(int[] dataArray, String message) {
		System.out.println(message + Arrays.toString(dataArray));
	}
}
