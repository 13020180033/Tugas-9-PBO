No.6 inner class



class B { 
    void aksesLocalVar() { 
	System.out.println("nonFinalVar = + nonFinalVar");
	System.out.println("finalVar = + finalVar"); 
  B b = new B();
  b.aksesLocalVar();
 } 
} 