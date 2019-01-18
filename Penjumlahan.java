package com.aizoo;
import java.util.*;

public class Penjumlahan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int naw,nak;
		int tot = 1;
		
		System.out.print("Masukkan Nilai Awal: ");
		naw = input.nextInt();
		System.out.print("Masukkan Nilai Akhir: ");
		nak = input.nextInt();
		System.out.println();
		
		// menggunakan while loop
		
		while(naw<nak) {
			tot = tot + (naw+1);
			System.out.println((tot-(naw+1)) + " + " + (naw+1) + " = " + tot);
			naw++;
		}
		
		// menggunakan do-while loop
		
//		do {
//			tot = tot + (naw+1);
//			System.out.println((tot-(naw+1)) + " + " + (naw+1) + " = " + tot);
//			naw++;
//		} while(naw<nak);
		
		// menggunakan for loop (jangan lupa menghapus variable tot pada pendeklarasian diatas)
		
//		for(int tot=1; naw<nak; naw++) {
//			tot = tot + (naw+1);
//			System.out.println((tot-(naw+1)) + " + " + (naw+1) + " = " + tot);
//		}
		
		input.close();
	}
}