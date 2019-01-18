package com.aizoo;
import java.util.Scanner;

public class VClass1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] x = new int[5];
		int a;
		
		System.out.println("Masukkan 5 Angka Pilihan Anda");
		System.out.println("=============================");
		
		// menyimpan data kedalam array
		for(int i=0; i<x.length; i++) {
			System.out.print("Masukkan Data ke " + i + " = ");
			x[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.print("Masukkan Angka yang Dicari : ");
		a = input.nextInt();
		System.out.println();
		// memasukkan semua data pada array ke variable "data", kemudian di seleksi
		for(int data : x) {
			if(a == data) {
				System.out.println("Bilangan Tersebut Ada Dalam Daftar");
				break;
			}
		}
		
		input.close();
	}
}
