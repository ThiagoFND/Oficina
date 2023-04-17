package com.br.thiago.software.oficina.services;

import java.util.Scanner;

public class Exceptions {

	static Scanner scann = new Scanner(System.in);

	public int readWhole() {
		int ok = 0;
		int inteiro = 0;
		do {
			try {
				inteiro = Integer.parseInt(scann.nextLine());
				ok = 0;

			} catch (Exception e) {
				System.out.println("Você digitou errado, digite um número: ");
				ok = 1;
				break;
			}
		} while (ok == 1);
		return inteiro;
	}

	public double readDouble() {
		int ok = 0;
		double floating = 0;
		do {
			try {
				floating = Double.parseDouble(scann.nextLine());
				ok = 0;

			} catch (Exception e) {
				System.out.println("Você digitou errado, digite um número: ");
				ok = 1;
			}
		} while (ok == 1);
		return floating;

	}

	public String read() {
		return scann.nextLine();

	}

	public long readLong() {
		long ok = 0;
		long inteiro = 0;
		do {
			try {
				inteiro = Long.parseLong(scann.nextLine());
				ok = 0;

			} catch (Exception e) {
				System.out.println("Você digitou errado, digite um número: ");
				ok = 1;
				break;
			}
		} while (ok == 1);
		return inteiro;
	}

	public Double double2() {
		return scann.nextDouble();
	}

}
