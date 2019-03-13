package com.latihan;
import java.util.*;

public class LoginForm {
	private static Scanner input = new Scanner(System.in);
	private static String pw,usr;

	private static void signUp() {
		System.out.println("\n===== SIGN UP =====");
		System.out.print("Username : ");
		usr = input.next();
		System.out.print("Password : ");
		pw = input.next();
		System.out.println();
	}

	private static void signIn() {
		String usrInput,pwInput;

		System.out.println("\n===== SIGN IN =====");
		System.out.print("Username : ");
		usrInput = input.next();
		System.out.print("Password : ");
		pwInput = input.next();

		if(usrInput.contains(usr) && pwInput.contains(pw))
			System.out.println("\nLogin Successfully!");
		else
			System.out.println("\nUsername or Password wrong!");
	}

	public static void main(String[] args) {
		byte pil;
		boolean eof = true;

		do {
			System.out.println("==============================");
			System.out.println("           RIZEARCH           ");
			System.out.println("==============================");
			System.out.println("1. SIGN UP");
			System.out.println("2. SIGN IN");
			System.out.println("3. EXIT");
			System.out.println("==============================");
			System.out.print("Masukkan pilihan: ");
			pil = input.nextByte();

			switch(pil) {
				case 1:
					signUp();
					break;
				case 2:
					signIn();
					eof = false;
					break;
				case 3:
					eof = false;
					break;
				default:
					System.out.println("Pilihan Salah!");
					eof = false;
					break;
			}
		} while(eof);

		input.close();
	}
}
