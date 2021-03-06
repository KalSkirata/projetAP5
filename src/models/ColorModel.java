package models;

public class ColorModel {
	
	public static final ColorModel WHITE = new ColorModel(255,255,255,255);
	public static final ColorModel BLACK = new ColorModel(0,0,0,255);
	
	private int r,g,b,a;
	
	public ColorModel(int r, int g, int b,int a){
		this.r=r;
		this.g=g;
		this.b=b;
		this.a=a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

}
