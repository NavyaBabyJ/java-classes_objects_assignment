package com.nissan.beam;


import com.nissan.app.box;

public class boxapp {

	public static void main(String[] args) {
		box b1=new box();
		box b2=new box();
		b1.width=4;
		b1.height=2;
		b1.depth=3;
		b2.width=10;
		b2.height=8;
		b2.depth=7;
		int x=b1.volume();
		System.out.println("Volume of first box: "+x);
		int y=b2.volume();
		System.out.println("Volume of second box: "+y);
		
		

	}

}
