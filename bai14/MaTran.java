package bai14;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class MaTran {
	private int n,m;
	private int a[][];
	public static String nhapXau() {
		String st;
		DataInputStream s=new DataInputStream(System.in);
		try {
			st = s.readLine();
		}catch(IOException e){st = "0";}
		return st;
	}
	public static int doiXau(String st) {
		int so;
		try	{
			so = Integer.valueOf(st).intValue();
		}catch(NumberFormatException e) {so = 0;}
		return so;
	}
	public void nhapMT() {
		System.out.print(" Nhap so dong");
		n = doiXau(nhapXau());
		System.out.print(" Nhap so cot");
		m = doiXau(nhapXau());
		a= new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				System.out.print("a["+i+"]["+j+"]=" );
				a[i][j] = doiXau(nhapXau());
			}
	}
	public void hienThiMT() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]+ " ");
				System.out.print(" ");
		}
	}
	public MaTran tong(MaTran A,MaTran B) {
		MaTran C = new MaTran();
		if(( A.n!=B.n )||(A.m!= B.m)) {
			System.out.print(" Khong the cong hai ma tran");
			System.exit(0);
		}
		else {
			C.n=A.n;
			C.m=A.m;
			C.a=new int[n][m];
			for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			C.a[i][j]=A.a[i][j]+B.a[i][j];
		}
		return C;
	}
	public MaTran tru(MaTran A,MaTran B) {
		MaTran C=new MaTran();
		if((A.n!=B.n || A.m!=B.m)) {
			System.out.println("khong the tru 2 ma tran");
			System.exit(0);
		}
		else {
			C.n = A.n;
			C.a = new int[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					C.a[i][j]=A.a[i][j]-B.a[i][j];
		}
		return C;
	}
	public static void main(String arg[]) {
		MaTran A,B,C;
		A=new MaTran();
		C=new MaTran();
		B=new MaTran();
		System.out.println("Nhap Ma tran A");
		A.nhapMT();
		System.out.println("Nhap Ma tran B");
		B.nhapMT();
		System.out.println("Ma tran A da nhap:");
		A.hienThiMT();
		System.out.println("Ma tran B da nhap:");
		B.hienThiMT();
		C=C.tong(A,B);
		System.out.println("Ma tran tong C=A+B la");
		C.hienThiMT();
	}
}
