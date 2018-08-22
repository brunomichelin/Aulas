package br.edu.cefsa.ftt.ec;

public class People {
	
	private int size = 0;
	private String name;
	private float val = 0
	
	//Construtor
	public People(int Size, String name, float val) {
		super();
		
		setSize(Size);
		setName(name);
		setVal(val);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getVal() {
		return val;
	}
	public void setVal(float val) {
		this.val = val < 0 ? 0 : val;
	} //setVal
	
	public String toString() {
		return this.getName() + " " + this.getVal();
	} //toString
	
}
