package com.jupyter.assignment;


	class ClassA {
	    public void methodA() {
	        System.out.println("This is ClassA's method");
	    }
	}

	class ClassB extends ClassA {
	    public void methodB() {
	        System.out.println("This is ClassB's method");
	    }
	}

	class ClassC extends ClassB {
	    public void methodC() {
	        System.out.println("This is ClassC's method");
	    }
	}

	public class Tasktwo{
	    public static void main(String[] args) {
	        ClassC objC = new ClassC();

	        objC.methodA();      // Calls ClassC's method
	        objC.methodB();// Calls ClassB's method using super
	        objC.methodC(); //calsassA's method using super
	}


  }

