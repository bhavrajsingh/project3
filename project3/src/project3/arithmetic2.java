package project3;

public class arithmetic2 {
public int mul(int a,int b) {
	int c;
	c=a*b;
	System.out.println("multiplication result is "+c);
	return c;
}
public int sub(int c,int d)
{
	int e;
	e=c-d;
	System.out.println("subtraction result is  "+e);
	return e;
}
public int sum(int s1,int s2)
{
	int sum=s1+s2;
	System.out.println("sum result is "+sum);
	return sum;
}
public void div(int d1,int d2)
{
	int div =d1/d2;
	System.out.println("final result/division is "+div);
}
public static void main(String[] args) {
	arithmetic2 ob=new arithmetic2();
	int mulresult=ob.mul(10, 2);
	int subresult=ob.sub(mulresult, 2);
	int subresult2=ob.sub(subresult, 2);
	int sumresult=ob.sum(subresult2, 2);
	ob.div(sumresult, 2);
}
}
