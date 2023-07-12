package com.jupyter.assignment;


	class F
	{
	   public void methodF()
	   {
	      System.out.println("method of Class F");
	   }
	}
	class G extends F
	{
	   public void methodG()
	   {
	      System.out.println("method of Class G");
	   }
	}
	class H extends F
	{
	  public void methodH()
	  {
	     System.out.println("method of Class H");
	  }
	}
	class I extends F
	{
	  public void methodI()
	  {
	     System.out.println("method of Class I");
	  }
	}
	public class Taskthree {
	
	  public static void main(String args[])
	  {
	     G obj1 = new G();
	     H obj2 = new H();
	     I obj3 = new I();
	     //All classes can access the method of class A
	     obj1.methodG();
	     obj2.methodH();
	     obj3.methodI();
	  }
	
  }

