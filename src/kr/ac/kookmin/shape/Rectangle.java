package kr.ac.kookmin.shape;

public class Rectangle extends Shape{

	private int h;
	private int w;
	
	public Rectangle(Point center, int w, int h) {
		this.center = center;
		this.h = h;
		this.w = w;
		
	}
		public Rectangle getBounds() {
			return this;
		}
		
		public int getHeight() {
			return this.h;
		}
		public int getWidth(){
			return this.w;
		}
		@Override
		public void draw(Graphics g) {
			g.draw(this);
		}
		@Override
		public String toString() {
			return "Rectangle";
		}

}
