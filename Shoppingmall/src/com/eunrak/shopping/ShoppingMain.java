package com.eunrak.shopping;

import com.eunrak.utill.Cw;

public class ShoppingMain {
	public static void run() {
		ShoppingObj.productLoad();
		zz: while (true) {
			Cw.wn("쇼핑 목록[1,남성의류 2,여성의류 3,장신구 x,계산]:");
			ShoppingObj.cmd = ShoppingObj.sc.next();
			switch (ShoppingObj.cmd) {
			case "1":
				MensClothing.run();
				break;
			case "2":
				WomensClothing.run();
				break;
			case "3":
				Jewelry.run();
				break;
			case "x":
				Cw.wn("장바구니에 담긴 상품 갯수:" + ShoppingObj.basket.size());
				int sum = 0;
				for (Order o : ShoppingObj.basket) {
					sum = sum + o.selectedProduct.prise;
				}
				Cw.wn("총 계산 금액은 :" + sum + "원 입니다.");
				for (Order o : ShoppingObj.basket) {
					Cw.wn(o.selectedProduct.name);
					Cw.wn("이용해주셔서 감사합니다.");
					break;
				}
			}
		}
	}
}
