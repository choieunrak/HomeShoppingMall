package com.eunrak.shopping.display;

import com.eunrak.shopping.Board;
import com.eunrak.utill.Cw;

public class Disp {
public static void title() {
	Cw.Dl();
	Cw.space(14);
	Cw.w(Board.TITLE);
	Cw.wn();
	Cw.Dl();
}
public static void mainmenu() {
	Cw.wn();
	Cw.w("[1,남성의류 2,여성의류 3,장신류 4,계산 5,리뷰작성]");
	Cw.wn();
}
public static void buyThings(int price) {
	Cw.Aw();
	Cw.w("총 구매가격은 "+price+"원 입니다.");
	Cw.wn();
	Cw.w("[리뷰 작성 시 랜덤 사은품을 증정해드립니다. 리뷰 작성을 원하신다면 y를 입력해주세요.]");
	Cw.wn();
	Cw.w("[y : 리뷰작성, n : 나가기]");
	
}
}
