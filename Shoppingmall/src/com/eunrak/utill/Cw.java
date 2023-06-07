package com.eunrak.utill;

public class Cw {
	private static final String Double_line = "〓";
	private static final int line_length = 32;
	private static final String Arrow = "↓";

	public static void w(String s) {
		System.out.print(s);
	}

	public static void wn(String s) {
		System.out.println(s);
	}

	public static void wn() {
		System.out.println();
	}

public static void Dl() {
	for(int i=0;i<line_length;i++) {
		w(Double_line);
	}
	wn();
}

	public static void Aw() {
		for(int i=0;i<line_length;i++) {
			w(Arrow);
		}
		wn();
	}

	public static void space(int c) {
		for (int i = 0; i < c; i++) {
			w(" ");
		}
	}
}
