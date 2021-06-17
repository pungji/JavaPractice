package Finaltermexam;

class  A{
	int k =20;
	void callme() {
		System.out.println("A의 callme()메소드 실행");
	}
}

class B extends A{
	int g =10;
	void callme(){
		System.out.println("B의 callme()메소드 실행");
	}
}


public class FinaltermPrm1{
public static void main(String[] args)  {
	A r2 =new B();//r2는 a에만 접근 가능 B는 k,g 다 접근 가능 
	//r2.callme();
	B r3 = new B();
	System.out.println(r3.k);//B는 k에 접근 가능
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
		System.out.print("2/0은:");
		int div =b/a;
	System.out.println(div);
	}catch(ArithmeticException e) {
		System.out.println("프로그램 오류");
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
			belong ="학부";
		
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int c) {
			return c;
		}
		
		public void ComputeGrade() {
			if(score>70) {
				compute ="통과";
			}
			else {
				compute ="불합격";
			}
			
		}
}

class PGstudent extends Student{

		public void Belong() {	
			belong ="대학원생";
			
			
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
				compute ="통과";
			}
			else {
				compute ="불합격";
			}
		}
		}





public class FinaltermPrm1{
public static void main(String[] args)  {
	// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
	UGstudent sc2 = new UGstudent();
	PGstudent sc3 = new PGstudent();
	System.out.println("값을 입력하세요");
	int a =sc.nextInt();
	String b =sc.next();
	int c =sc.nextInt();
	//String d =sc.next();	
	if(a==1) {
		sc2.Belong();
		sc2.ComputeGrade();
		System.out.println("소속  이름  점수  학점");
			System.out.println(sc2.belong+"   "+sc2.Name(b)+"   "+sc2.Score(c)+"   "+sc2.compute);
	}
	else if(a==2) {
		sc3.Belong();
		sc3.ComputeGrade();
		System.out.println("소속      이름     점수      학점");
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
		System.out.println("합계"+total);
		System.out.println("평균"+average);
		

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
		System.out.println("값을 입력하세요");
		int a =sc.nextInt();
		char b =sc.next().charAt(0);
		int c =sc.nextInt();
		if(b=='+') 
			System.out.println(a+c);	
		else if(b=='-') 
			System.out.println(a-c);
		else {
			throw new UserException1("값이 아닙니다.");
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
	System.out.println("첫번째 값이 1~20사이 값입니다. 다시 입력하세요.");
	return a;
	
}
public int 	ChangeNum2(int b) {
	System.out.println("두번째 값이 1~20사이 값입니다. 다시 입력하세요.");
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
		System.out.println("A기능");
	}
}
class B extends A{
		int num = 30;
		public void function() {
			System.out.println("B기능");
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
	protected int c=3;//접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 
	//메소드는 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능하다.
	public int b=4;
	private int d=5;//x안된다.
	void am() {
		System.out.println("am");
	}
	public void bm() {
		
		System.out.println("bm");
	}
	protected void cm() {
		System.out.println("cm");	
	}
	
	private void dm() {//x안된다.
		System.out.println("dm");
		
	}
	
	
	
}

class B extends A{
	
	
}
public class FinaltermPrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B sc =new B();
		System.out.println("int a출력 "+sc.a+" c출력"+sc.c);
		System.out.println("int b출력 "+sc.b+" d출력안됨");
		sc.am();
		sc.bm();
		sc.cm();
		//sc.dm();//x
		
	}

}*/
