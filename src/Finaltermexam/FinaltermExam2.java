package Finaltermexam;


import java.util.Scanner;

	class Student{

		public String Belong(String a) {
			return a;
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int a) {
			return a;
		}
		
		public void ComputeGrade(int a) {
			String compute=null;
			if(a>70) {
				compute ="통과";
			}
			else {
				compute ="불합격";
			}
		}
	}

	class UGstudent2 extends Student {
		
		public void Belong() {
			
		}
		public String Name(String b) {
			return b;
		}
		public int Score(int a) {
			return a;
		}
		
		public void ComputeGrade(int a) {
			String compute=null;
			if(a>70) {
				compute ="통과";
			}
			else {
				compute ="불합격";
			}
		}
	}
/*
	class PGstudent extends Student{

			public void Belong() {	
				belong ="대학원생";
				
				
			}
			public void Name(String b) {
				name =b;
			}
			public void Score(int c) {
				score =c;
			}
			
			public void ComputeGrade() {
				//compute =d;
				if(score>80) {
					compute ="통과";
				}
				else {
					compute ="불합격";
				}
			}
			}

*/



	public class FinaltermExam2 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		UGstudent2 sc2 = new UGstudent2();
		//PGstudent2 sc3 = new PGstudent2();
		System.out.println("값을 입력하세요");
		int a =sc.nextInt();
		String b =sc.next();
		int c =sc.nextInt();
		//String d =sc.next();
		if(a==1) {
			sc2.Belong();
		}
	
			System.out.println("소속  이름  점수  학점");
			System.out.println("   "+sc2.Name(b));

		}	
}