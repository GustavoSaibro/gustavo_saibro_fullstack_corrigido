package net.bridge.spring.controller;

import net.bridge.spring.model.Fatorial;

public class FatorialCalculator {
	private static Fatorial fatorial;

	public FatorialCalculator(){
		
	}
	public static Fatorial calcFatorial(int number) {
		fatorial = new Fatorial();
		fatorial.setNumber(Integer.toString(number));
		int x = Integer.parseInt(fatorial.getNumber());
		int y = x;

		if (x == 0 || x == 1) {
			if (x == 0) {
				fatorial.setFatorial("1");
				fatorial.setNumber("0");
			} else {
				fatorial.setFatorial("1");
				fatorial.setNumber("1");
			}
		} else {
			while (x > 1) {
				y = y * (x - 1);
				x--;
			}
			fatorial.setFatorial(Integer.toString(y));
		}
		return fatorial;
	}
}
