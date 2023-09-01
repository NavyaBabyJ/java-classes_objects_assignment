package com.nissan.app;

public class box {
	public int width;
	public int height;
	public int depth;
	public int volume;
	public box() {
	
	}
	public int volume() {
		volume=width*height*depth;
		return volume;
	}
	

}
