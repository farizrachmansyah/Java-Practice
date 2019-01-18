package com.aizoo;
import java.util.Scanner;

public class Biodata {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama,ttl,alamat,umur,hobi,cita2,almet,jurusan,kls;
		
		System.out.println("========================= BIODATA MAHASISWA =========================");
		System.out.print("Nama : ");
		nama = input.nextLine();
		System.out.print("Almamater : ");
		almet = input.nextLine();
		System.out.print("Jurusan : ");
		jurusan = input.nextLine();
		System.out.print("Kelas : ");
		kls = input.nextLine();
		System.out.print("Tempat,Tanggal Lahir : ");
		ttl = input.nextLine();
		System.out.print("Alamat : ");
		alamat = input.nextLine();
		System.out.print("Umur : ");
		umur = input.nextLine();
		System.out.print("Hobi : ");
		hobi = input.nextLine();
		System.out.print("Cita-cita : ");
		cita2 = input.nextLine();
		System.out.println("=====================================================================");
		System.out.println("Data Saved.");
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Nama anda " + nama);
		System.out.println("Almamater anda " + almet);
		System.out.println("Jurusan anda " + jurusan);
		System.out.println("Anda kelas " + kls);
		System.out.println("Tempat dan tanggal lahir anda " + ttl);
		System.out.println("Alamat anda " + alamat);
		System.out.println("Anda berumur " + umur + " tahun");
		System.out.println("Hobi anda " + hobi);
		System.out.println("Cita-cita anda " + cita2);
		System.out.println("=====================================================================");
		
		input.close();
	}
}







