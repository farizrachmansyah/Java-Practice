package com.aizoo;
import java.util.Scanner;

public class ArrayMultidimensi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][][] matriks = new int [2][2][2];
		
		// looping buat inputan nilai matirks
		System.out.println("---------- MASUKKAN NILAI MATRIKS ---------- \n");
		for (int i=0; i<matriks.length; i++) {
			for (int j=0; j<matriks[0].length; j++) {
				for (int k=0; k<matriks[0][0].length; k++) {
					System.out.print("Matriks ke-" + (i+1) + " Baris ke-" + (j+1) + " kolom ke-" + (k+1) + ": ");
					matriks[i][j][k] = input.nextInt();
				}
			}
			if (i==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		// ngebaca 4 inputan pertama
		System.out.println("MATRIKS PERTAMA");
		for (int i=0; i<1; i++) {
			for (int j=0; j<matriks[0].length; j++) {
				for (int k=0; k<matriks[0][0].length; k++) {
					System.out.print(matriks[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
		
		// ngebaca 4 inputan kedua
		System.out.println("MATRIKS KEDUA");
		for (int i=1; i<2; i++) {
			for (int j=0; j<matriks[0].length; j++) {
				for (int k=0; k<matriks[0][0].length; k++) {
					System.out.print(matriks[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
		
		// proses penjumlahan tapi kodingannya noob! bagian ini harus bisa di kembangin!
		System.out.println("-------- HASIL PENJUMLAHAN MATRIKS --------- \n");
		int nM=0,nM2=0,nM3=0,nM4=0,nM5=0,nM6=0,nM7=0,nM8=0;
		for(int i=0; i<matriks.length; i++) {
			for(int j=0; j<matriks[0].length; j++) {
				for(int k=0; k<matriks[0][0].length; k++) {
					if(i == 0 && j == 0 && k == 0) {
						nM = matriks[i][j][k];
					} else if(i == 0 && j == 0 &&k == 1) {
						nM2 = matriks[i][j][k];
					} else if(i == 0 && j == 1 && k == 0) {
						nM3 = matriks[i][j][k];
					} else if(i == 0 && j == 1 && k == 1) {
						nM4 = matriks[i][j][k];
					} else if(i == 1 && j == 0 && k == 0) {
						nM5 = matriks[i][j][k];
					} else if(i == 1 && j == 0 && k == 1) {
						nM6 = matriks[i][j][k];
					} else if(i == 1 && j == 1 && k == 0) {
						nM7 = matriks[i][j][k];
					} else {
						nM8 = matriks[i][j][k];
					}
				}
			}
		}
		System.out.println((nM+nM5) + " " + (nM2+nM6));
		System.out.println((nM3+nM7) + " " + (nM4+nM8));
		
		input.close();
	}
}
