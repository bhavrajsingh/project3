package project3;

import project2.airthmatic1;

public class airthmatic1 {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int c,int d)
	{
		int e;
		e=c-d;
		System.out.println("sub result is "+e);
		return e;
	}
	public int mul(int m1,int m2)
	{
		int mul;
		mul=m1*m2;
		System.out.println("mul result= "+mul);
		return mul;
	}
	public void div(int d1,int d2)
	{
		int div;
		div=d1/d2;
		System.out.println("div result= "+div);
	}
	public static void main(String[] args) {
		airthmatic1 ob= new airthmatic1();
		int sumresult=ob.sum(10, 2);
		int subresult=ob.sub(sumresult, 2);
		int sumresult2=ob.sum(subresult, 2);
		int mulresult=ob.mul(sumresult2, 2);
		ob.div(mulresult, 2);
	}
	}

