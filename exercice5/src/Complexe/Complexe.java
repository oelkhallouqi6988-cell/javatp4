package Complexe;

public class Complexe {
	
	    private int a;
	    private int b;

	    public Complexe(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }

	    public Complexe plus(Complexe c) {
	        return new Complexe(
	        		this.a + c.a,
	        		this.b + c.b
	        );
	    }

	    public Complexe moins(Complexe c) {
	        return new Complexe(
	        		this.a  - c.a,
	        		this.b- c.b);
	    }

	    public String toString() {
	        if (a >= 0)
	            return a+ " +" + b+ "i";
	        else
	            return a+ " " + b + "i";
	    }
	}

