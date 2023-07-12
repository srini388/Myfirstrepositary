package com.jupyter.assemen1;

	class ClassA {
	    private ClassB classB;

	    public void setClassB(ClassB classB) {
	        this.classB = classB;
	    }

	    public void methodA() {
	        System.out.println("This is ClassA's method");
	        if (classB != null) {
	            classB.methodB();
	        }
	    }
	}

	class ClassB {
	    private ClassA classA;

	    public void setClassA(ClassA classA) {
	        this.classA = classA;
	    }

	    public void methodB() {
	        System.out.println("This is ClassB's method");
	        if (classA != null) {
	            classA.methodA();
	        }
	    }
	}

	class ClassC extends ClassA {
	    public void methodC() {
	        System.out.println("This is ClassC's method");
	      
	    }
	}

	public class Afdyfsefs  {
	    public static void main(String[] args) {
	        ClassA classA = new ClassA();
	        ClassB classB = new ClassB();
	        ClassC classC = new ClassC();

	        classA.setClassB(classB);
	        classB.setClassA(classA);
	        

	        classA.methodA();
	        classC.methodA();
	        classC.methodC();
	    }
	}



