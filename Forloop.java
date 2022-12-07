package com.pack1;

public class Forloop 
{
void meth1()
{
	System.out.println("-----meth1()-----");
	for(int i=1;i<=5;++i)
	{
	System.out.println("i value:"+i);	
	}
	System.out.println("meth1() execution completed");
}
void meth2()
{
	System.out.println("-----meth2()-----");
	for(int i=1;i<=10;i++)
{
		System.out.println("i value:"+(++i));
}
	System.out.println("meth2() execution completed");
}
void meth3()
{
	System.out.println("-----meth3()-----");
	int i=1;
	for(;i<=3;)
	{
		System.out.println("i value:"+i);
		i++;
	}
	System.out.println("meth3() execution completed");
}
void meth4()
{
	System.out.println("-----meth4()-----");
	int i=1;
	for(;true;)
	{
		System.out.println("i value:"+i);
		i++;
		break; //when ever the compailer came across break statement it will come out from the loop.
	}
	System.out.println("meth4() execution completed"); //c.e unreachable code
}
void meth5() //will generate an infine for loop
{
	System.out.println("-----meth5()-----");
	int i=1;
	for(;i<=3;)
		//int x=100; //C.E bcz we should not write any declarative statement in this line.
	System.out.println("i value:"+i);
	i++;
	System.out.println("meth5() execution completed");
}
void meth6()
{
	System.out.println("-----meth6()-----");
	int i=1;
	for(;;)
	{
		System.out.println("i value:+i");
	}
	//System.out.println("meth6() execution completed"); //C.E bcz Unreachable code
}
void meth7() 
{
     int i=1;
     for(System.out.print("-----meth7()-----"),System.out.println("-----");i<=3;i++)
{
	 System.out.println("i value:"+i);
}
     System.out.println("meth7() execution completed");
}
int meth8()
{
	System.out.println("meth8() called");
	return 'A';
}
void meth9()
{
	System.out.println("-----");
}
void meth10()
{
	System.out.println("-----meth10()-----");
	Forloop obj=new Forloop();
	for(int i=-(obj.meth8()-'B');i<=5;obj.meth9())
	{
		System.out.println("i value:"+i++);
	}
	System.out.println("meth10() execution completed");
}
public static void main(String[] args)
{
	Forloop obj=new Forloop();
	obj.meth1();
	obj.meth2();
	obj.meth3();
	obj.meth4();
	obj.meth5();
	obj.meth6();
	obj.meth7();
	obj.meth10();
}
}













