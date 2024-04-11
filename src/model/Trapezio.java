package model;

public class Trapezio extends Quadrilatero{
	
	private float baseMenor;
	
	public Trapezio () {
		baseMenor = 0.0f;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public float calcArea() {
        return ((getBase() + baseMenor) * getAltura()) / 2;
    }
	
}
