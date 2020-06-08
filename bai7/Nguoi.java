package bai7;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class Nguoi {
	protected String hvt,qq;
	protected int ns;
	Nguoi(){}
}
class HSHocSinh {
	protected String kh,lp,kyh;
	HSHocSinh(){}
	Nguoi hs;
}
class QL {
	static String nhapgt()throws IOException {
		String str;
		DataInputStream stream = new DataInputStream(System.in);
		str =stream.readLine();
		return str;
	}
	static void nhap(HSHocSinh hspp)throws IOException {
		hspp.hs=new Nguoi();
		System.out.println("Thong tin cua Hoc Sinh ");
		System.out.print("Ho ten: ");
		hspp.hs.hvt=nhapgt();
		System.out.print("Nam sinh: ");
		hspp.hs.ns=Integer.valueOf(nhapgt()).intValue();
		System.out.print("Que quan: ");
		hspp.hs.qq=nhapgt();
		System.out.print("Lop: ");
		hspp.lp=nhapgt();
		System.out.print("Khoa hoc: ");
		hspp.kh=nhapgt();
		System.out.print("Ky hoc: ");
		hspp.kyh=nhapgt();
	}
	static void hienthi(HSHocSinh hspp) {
		System.out.println("Ho ten: "+hspp.hs.hvt);
		System.out.println("Nam sinh: "+hspp.hs.ns);
		System.out.println("Que quan: "+hspp.hs.qq);
	}
	public static void main(String args[])throws IOException {
		int n;
		System.out.print("So hoc sinh: ");
		n=Integer.valueOf(nhapgt()).intValue();
		HSHocSinh HS []=new HSHocSinh[n];
		System.out.println("--------NHAP THONG TIN---------");
		for(int j=0;j<n;j++) {
			System.out.println("Hoc sinh thu "+(j+1));
			HS[j]=new HSHocSinh();
			nhap(HS[j]);
		}
		int d=0;
		System.out.println("----------HIEN THI NHUNG HS SINH NAM 1985---------- ");
		for(int j=0;j<n;j++) {
			if(HS[j].hs.ns==1985) {
				System.out.println("----------------------- ");
				hienthi(HS[j]);
				if (HS[j].hs.qq.equalsIgnoreCase("Thai Nguyen") )d++;
			}
		}
		System.out.println("Co "+d+ " hoc sinh sinh nam 1985 va que o Thai nguyen");
	}
}