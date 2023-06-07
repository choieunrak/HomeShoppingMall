package com.eunrak.shopping;

import com.eunrak.shopping.display.Disp;

public class Board {
	public static final String VERSION = "ver 0.0.1";
	public static final String TITLE = "OO쇼핑몰  (" + VERSION + ")";

	public void run() {
		Disp.title();
		ShoppingObj.productLoad();
		ShoppingMain.run();
	}
}
