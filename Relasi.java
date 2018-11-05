package getStarted;

import java.util.Scanner;
public class Relasi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan banyaknya himpunan A: ");
		String s = input.nextLine();
		int x = Integer.parseInt(s); // memasukan/memindahkan isi variabel s ke variabel x, sekaligus ubah tipe data
		int[] himpA = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("Masukan elemen himpunan A ke-" + (i+1) + " : ");
			String a = input.nextLine();
			himpA[i] = Integer.parseInt(a);
		}
		System.out.print("A = {");
		for(int i=0; i<x; i++) {
			System.out.print(himpA[i]);
			if(i != x-1)
				System.out.print(",");
		}
		System.out.println("}");
		System.out.println();
		System.out.println(" Jenis Relasi");
		System.out.println("======================");
		System.out.println("1. Reflektif Sederhana");
		System.out.println("2. Simetris Sederhana");
		System.out.println("3. Transitif Sederhana");
		System.out.println("======================");
		System.out.print("Masukan pilihan anda: ");
		int d = Integer.parseInt(input.nextLine());
		switch(d) {
		case 1:
			System.out.print("Relasi R = {");
			for(int i=0; i<x; i++) {
				for(int j=0; j<x; j++) {
					if(himpA[i] == himpA[j]) {
						System.out.print("(" + himpA[i] + "," + himpA[j] + ")");
						if(j != x-1)
							System.out.print(",");
					}
				}
			}
			System.out.println("}");
			break;
		case 2:
			System.out.print("Relasi R = {");
			for(int i=0; i<x; i++) {
				for(int j=0; j<x; j++) {
					if(himpA[i] != himpA[j]) {
						System.out.print("(" + himpA [i] + "," + himpA [j] + ")");
						if(j != x-1)
							System.out.print(",");
					}
				}
			}
			System.out.println("}");
			break;
		case 3:
			System.out.print("Relasi R = {");
			for(int i=0; i<x; i++) {
				for(int j=0; j<x; j++) {
					if(himpA[i] != himpA[j]) {
						if(i%2 != 0) {
							if(j%2 == 0) {
								System.out.print("(" + himpA [i] + "," + himpA [j] + ")");
								if(j != x-1)
									System.out.print(",");
							} else {
								if(j%2 != 0) {
									System.out.print("(" + himpA [i] + "," + himpA [j] + ")");
									if(j != x-1)
										System.out.print(",");
								}
							}
						}
					}
				}
			}
			System.out.println("}");
			break;
		default:
			System.out.print("Pilihan tidak ada dalam daftar");
			break;
		}
		input.close();
	}
}