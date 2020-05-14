package no7 inner class;

public class BBB{
     public static void main(String[] args) {
	aaa aa = new aaa() { 
	    void methodDiaaa() { 
		i++;
		System.out.println("i = " + i);
	    }
	};

	aa.methodDiaaa();
     }
}