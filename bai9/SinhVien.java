package bai9;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class SinhVien {
	protected String hvt,ns,lop;
	SinhVien(){}
}
class TheMuon {
	protected String spm,nm,ht,shs;
	TheMuon(){}
	SinhVien sv;
}
class QL {
	static String nhapgt()throws IOException {
		String str;
		DataInputStream stream = new DataInputStream(System.in);
		str =stream.readLine();
		return str;
	}
	static void nhap(TheMuon svm)throws IOException {	
		svm.sv=new SinhVien();
		System.out.println("Thong tin rieng cua sinh vien ");
		System.out.print("Ho ten: ");
		svm.sv.hvt=nhapgt();
		System.out.print("Nam sinh: ");
		svm.sv.ns=nhapgt();
		System.out.print("Lop: ");
		svm.sv.lop=nhapgt();
	 	}
	static void hienthi(TheMuon svm) {
		System.out.println("Ho ten: "+svm.sv.hvt);
		System.out.println("Nam sinh: "+svm.sv.ns);
		System.out.println("Lop: "+svm.sv.lop);
	}
	public static void main(String args[])throws IOException {
		int n;
		System.out.print("So Sinh vien: ");
		n=Integer.valueOf(nhapgt()).intValue();
		TheMuon SV []=new TheMuon[n];
		System.out.println("--------NHAP THONG TIN---------");
		for(int j=0;j<n;j++) {
			System.out.println("Sinh vien thu "+(j+1));
			SV[j]=new TheMuon();
			nhap(SV[j]);
		}
		System.out.println("----------HIEN THI------------- ");
		for(int j=0;j<n;j++) {
			System.out.println("----------------------- ");
			System.out.println("Sinh vien thu "+(j+1));
			hienthi(SV[j]);
		}
	}
}