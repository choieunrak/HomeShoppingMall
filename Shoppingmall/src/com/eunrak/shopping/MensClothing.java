package com.eunrak.shopping;

import com.eunrak.utill.Cw;

public class MensClothing {
	public static void run() {
		for (String key : ShoppingObj.products.keySet()) {
			Product p = ShoppingObj.products.get(key);
			Cw.wn(p.name);
		}
		zz: while (true) {
			Cw.wn("[1,티셔츠 2,셔츠 3,청바지 x,이전메뉴로]");
			ShoppingObj.cmd = ShoppingObj.sc.next();
			switch (ShoppingObj.cmd) {
			case "1":
				Cw.wn(ShoppingObj.products.get("M-1").name + (" 상품추가"));
				ShoppingObj.basket.add(new Order(ShoppingObj.products.get("M-1")));
				break;
			case "2":
				Cw.wn(ShoppingObj.products.get("M-2").name + (" 상품추가"));
				ShoppingObj.basket.add(new Order(ShoppingObj.products.get("M-2")));
				break;
			case "3":
				Cw.wn(ShoppingObj.products.get("M-3").name + (" 상품추가"));
				ShoppingObj.basket.add(new Order(ShoppingObj.products.get("M-3")));
				break;
			case "x":
				Cw.wn("[이전메뉴로]");
				break zz;
			}
		}
	}
}
