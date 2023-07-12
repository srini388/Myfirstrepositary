package com.jupyter.assignment;

	class A {
		public void showA(){
	    
	        System.out.println("This is ClassA show");
		}
	}

	class B {
		public void showB() {
	   
	        System.out.println("This is ClassB show");
	    }
	}
	

	class C {
	    public void showC() {
	        System.out.println("This is ClassC show");
	    }
	

	public class Task{
	    public static void main(String[] args) {
	        A objA = new A();
	        B objB = new B();
	        C objC = new C();

	        objA.showA();
	        objB.showB();
	        objC.showC();
	    }
	 }

  }
	

	
