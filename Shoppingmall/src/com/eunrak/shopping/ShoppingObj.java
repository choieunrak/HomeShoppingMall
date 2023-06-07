package com.eunrak.shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingObj {
	public static ArrayList<Order> basket = new ArrayList<>();
//	public static ArrayList<Product> products = new ArrayList<>();
	public static HashMap<String, Product> products = new HashMap<>();
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;

	public static void productLoad() {
		products.put("M-1", new Product("티셔츠", "XL", 15000));
		products.put("M-2", new Product("셔츠", "XL", 35000));
		products.put("M-3", new Product("청바지", "XL", 50000));
		products.put("W-1", new Product("원피스", "S", 50000));
		products.put("W-2", new Product("크롭티", "S", 25000));
		products.put("W-3", new Product("스커트", "S", 50000));
		products.put("J-1", new Product("목걸이", 70000));
		products.put("J-2", new Product("반지", 100000));
		products.put("J-3", new Product("팔찌", 30000));
	}
}
