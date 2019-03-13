package com.latihan;
import java.io.*;
import java.util.ArrayList;

public class MenuBuah {
	private static ArrayList listBuah = new ArrayList();
	private static boolean runing = true;
	private static InputStreamReader iSR = new InputStreamReader(System.in);
	private static BufferedReader input = new BufferedReader(iSR);

	private static void showMenu() throws IOException {
		System.out.println("\n================================");
		System.out.println("              MENU              ");
		System.out.println();
		System.out.println("[1] Tampilkan Daftar Buah");
		System.out.println("[2] Daftarkan Buah Baru");
		System.out.println("[3] Edit Buah");
		System.out.println("[4] Hapus Buah");
		System.out.println("[5] Exit");
		System.out.println("================================");
		System.out.print("Masukkan pilihan: ");
		int pil = Integer.valueOf(input.readLine());

		switch(pil) {
			case 1:
				showBuah();
				break;
			case 2:
				insertBuah();
				break;
			case 3:
				editBuah();
				break;
			case 4:
				deleteBuah();
				break;
			case 5:
				System.out.println("\nPROGRAM CLOSED");
				System.exit(0);
				break;
			default:
				System.out.println("Pilihan Salah!");
		}
	}
	private static void showBuah() {
		if(listBuah.isEmpty()) {
			System.out.println("Belum ada buah disini, \ndaftar buah kosong.");
		} else {
			for(int i=0; i<listBuah.size(); i++) {
				System.out.println(String.format("%d. %s", (i+1), listBuah.get(i)));
			}
		}
	}
	private static void insertBuah() throws IOException {
		System.out.print("Nama buah: ");
		String namaBuah = input.readLine();
		listBuah.add(namaBuah);
	}
	private static void editBuah() throws IOException {
		if(listBuah.isEmpty()) {
			System.out.println("Belum ada buah disini, \ndaftar buah kosong.");
		} else {
			for(int i=0; i<listBuah.size(); i++) {
				System.out.println(String.format("%d. %s", (i+1), listBuah.get(i)));
			}

			System.out.print("Pilih nomor buah: ");
			int indexBuah = Integer.valueOf(input.readLine());

			System.out.print("Nama baru: ");
			String namaBaru = input.readLine();

			// ngubah nama buahnya
			listBuah.set((indexBuah-1), namaBaru);
		}

	}
	private static void deleteBuah() throws IOException {
		if(listBuah.isEmpty()) {
			System.out.println("Belum ada buah disini, \ntidak bisa menghapus.");
		} else {
			for(int i=0; i<listBuah.size(); i++) {
				System.out.println(String.format("%d. %s", (i+1), listBuah.get(i)));
			}

			System.out.print("Pilih nomor buah: ");
			int indexBuah = Integer.valueOf(input.readLine());

			// hapus buahnya
			listBuah.remove(indexBuah-1);
		}
	}
	public static void main(String[] args) throws IOException {
		do {
			showMenu();
		} while(runing);
	}
}
