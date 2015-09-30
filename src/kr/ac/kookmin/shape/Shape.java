package kr.ac.kookmin.shape;

public abstract class Shape {
	
	protected Point center;
	
	public Shape(){
	}

	protected Shape(Point center){
		this.center = center;
	}
	
	public Point getCenter(){
		return center;
	}
	
	public Rectangle getBounds(){
		return this.getBounds();
	}
	public void draw(Graphics g){
		g.draw(this);
	}


}
