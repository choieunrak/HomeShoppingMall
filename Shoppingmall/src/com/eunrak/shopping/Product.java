package com.eunrak.shopping;

public class Product {
	String name;
	String size;
	int prise;

	Product(String xx, String yy, int zz) {
		name = xx;
		size = yy;
		prise = zz;
	}

	Product(String xx, int zz) {
		name = xx;
		prise = zz;
	}

	void info() {
		System.out.println("상품명 : " + name + "사이즈 : " + size + "가격 : " + prise);
	}
}
