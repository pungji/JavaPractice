package Finaltermexam;

class  A{
	int k =20;
	void callme() {
		System.out.println("A�� callme()�޼ҵ� ����");
	}
}

class B extends A{
	int g =10;
	void callme(){
		System.out.println("B�� callme()�޼ҵ� ����");
	}
}


public class FinaltermPrm1{
public static void main(String[] args)  {
	A r2 =new B();//r2�� a���� ���� ���� B�� k,g �� ���� ���� 
	//r2.callme();
	B r3 = new B();
	System.out.println(r3.k);//B�� k�� ���� ����
	System.out.println(r3.g);
	System.out.println(r2.k);
	//System.out.println(r2.g);

	}
}

/*
public class FinaltermPrm1{
public static void main(String[] args)  {
	// TODO Auto-generated method stub
	try {	
		int a =0;
		int b=2;
		System.out.print("2/0��:");
		int div =b/a;
	System.out.println(div);
	}catch(ArithmeticException e) {
		System.out.println("���α׷� ����");
		}
	}
}*/
/*import java.util.Scanner;

class Student{
public String belong =null;
public int score=0;
public String compute=null;
	public void Belong() {
		
	}
	public void Name() {
		
	}
	public void Score() {
		
	}
	
	public void ComputeGrade() {
		
	}
}

class UGstudent extends Student {
	
		public void Belong() {
			belong ="�к�";
		
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int c) {
			return c;
		}
		
		public void ComputeGrade() {
			if(score>70) {
				compute ="���";
			}
			else {
				compute ="���հ�";
			}
			
		}
}

class PGstudent extends Student{

		public void Belong() {	
			belong ="���п���";
			
			
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int c) {
			return c;
		}
		
		public void ComputeGrade(int a) {
			//compute =d;
			if(a>80) {
				compute ="���";
			}
			else {
				compute ="���հ�";
			}
		}
		}





public class FinaltermPrm1{
public static void main(String[] args)  {
	// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
	UGstudent sc2 = new UGstudent();
	PGstudent sc3 = new PGstudent();
	System.out.println("���� �Է��ϼ���");
	int a =sc.nextInt();
	String b =sc.next();
	int c =sc.nextInt();
	//String d =sc.next();	
	if(a==1) {
		sc2.Belong();
		sc2.ComputeGrade();
		System.out.println("�Ҽ�  �̸�  ����  ����");
			System.out.println(sc2.belong+"   "+sc2.Name(b)+"   "+sc2.Score(c)+"   "+sc2.compute);
	}
	else if(a==2) {
		sc3.Belong();
		sc3.ComputeGrade();
		System.out.println("�Ҽ�      �̸�     ����      ����");
		System.out.println(sc3.belong+"   "+sc3.Name(b)+"   "+sc3.Score(c)+"   "+sc3.compute);
	}
	
	
	

	
	
	}
}
*/
/*
class Corn{
	int getTotal(int arr[]) {
		int sum = 0;
		for(int i =0; i<3; i++) {
			 sum += arr[i];
		}
		return sum;
	}
	int getAverage(int arr2[]) {
		int sum2=0;
		for(int i =0; i<3; i++) {
			 sum2 += arr2[i];
		}
		return sum2/4;
	}
}




public class FinaltermPrm1{



public static void main(String[] args)  {
	// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		Corn obj = new Corn();
		int total = obj.getTotal(arr);
		int average = obj.getAverage(arr);
		System.out.println("�հ�"+total);
		System.out.println("���"+average);
		

	}
}



*/












/*public class FinaltermPrm1{



public static void main(String[] args)  {
	// TODO Auto-generated method stub

	Ever class Ever{
		public static void main(String[] args) {
			Change ch = new Change();
			int num1, num2;
			num1 = 2;
			num2 =3;
			ch.change(num1,num2);
			System.out.println("num1 = "+num1+"num2 = "+num2);
			
		}
	}
	class Change{
		void change(int num1, int num2) {
			num1 =120;
			num2 =130;
		}
	}
			
		
	}
}
*/
/*import java.util.Scanner;

class UserException1 extends Exception{
	public UserException1(String message) {
		super(message);
	}
}

public class FinaltermPrm1{



public static void main(String[] args)  {
	// TODO Auto-generated method stub
	
		
	try {
	Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int a =sc.nextInt();
		char b =sc.next().charAt(0);
		int c =sc.nextInt();
		if(b=='+') 
			System.out.println(a+c);	
		else if(b=='-') 
			System.out.println(a-c);
		else {
			throw new UserException1("���� �ƴմϴ�.");
		}
	
			
	
		} catch (UserException1 e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}
}

}
*/
/*import java.util.Scanner;




public class FinaltermPrm1 {
Scanner sc3 =new Scanner(System.in);	
public int Area(int a, int b) {
	return (a+b)*2;
	
	
}
public int Perimeter(int a, int b) {
	return a*b;
	
}

public int  ChangeNum(int a) {
	System.out.println("ù��° ���� 1~20���� ���Դϴ�. �ٽ� �Է��ϼ���.");
	return a;
	
}
public int 	ChangeNum2(int b) {
	System.out.println("�ι�° ���� 1~20���� ���Դϴ�. �ٽ� �Է��ϼ���.");
	return b;

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		FinaltermPrm1 sc2 =new FinaltermPrm1();
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a<20) {
			sc2.ChangeNum(a);
			a =sc.nextInt();
		}	
		else if(b<20) {
			sc2.ChangeNum2(b);
			b =sc.nextInt();
			
		}
		System.out.println(sc2.Area(a,b));
		System.out.println(sc2.Perimeter(a,b));
		
		
	

	}
}
*/

/*interface I{
	int num =10;
	void function();
}
class A implements I{
	int num = 20;
	public void function() {
		System.out.println("A���");
	}
}
class B extends A{
		int num = 30;
		public void function() {
			System.out.println("B���");
		}
		
}
	





public class FinaltermPrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A sc =new B();
		sc.function();
		System.out.println(sc.num);
		
	}

}
*/
/*class A{
	int a=2;
	protected int c=3;//���������ڰ� protected�� �����Ǿ��ٸ� protected�� ���� ����, 
	//�޼ҵ�� ���� ��Ű������ Ŭ���� �Ǵ� �ش� Ŭ������ ��ӹ��� �ܺ� ��Ű���� Ŭ�������� ������ �����ϴ�.
	public int b=4;
	private int d=5;//x�ȵȴ�.
	void am() {
		System.out.println("am");
	}
	public void bm() {
		
		System.out.println("bm");
	}
	protected void cm() {
		System.out.println("cm");	
	}
	
	private void dm() {//x�ȵȴ�.
		System.out.println("dm");
		
	}
	
	
	
}

class B extends A{
	
	
}
public class FinaltermPrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B sc =new B();
		System.out.println("int a��� "+sc.a+" c���"+sc.c);
		System.out.println("int b��� "+sc.b+" d��¾ȵ�");
		sc.am();
		sc.bm();
		sc.cm();
		//sc.dm();//x
		
	}

}*/
