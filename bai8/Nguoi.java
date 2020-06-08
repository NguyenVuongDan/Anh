package bai8;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class Nguoi {
	protected String hvt,qq;
	protected int ns;
	Nguoi(){}
}
class CBGV {
	protected int lc,tg,ph,tl;
	CBGV(){}
	Nguoi gv;
}
class QL {
	static String nhapgt()throws IOException {
		String str;
		DataInputStream stream = new DataInputStream(System.in);
		str =stream.readLine();
		return str;
	}
	static void nhap(CBGV cbgv)throws IOException {
		cbgv.gv=new Nguoi();
		System.out.println("Thong tin cua Giao vien ");
		System.out.print("Ho ten: ");
		cbgv.gv.hvt=nhapgt();
		System.out.print("Nam sinh: ");
		cbgv.gv.ns=Integer.valueOf(nhapgt()).intValue();
		System.out.print("Que quan: ");
		cbgv.gv.qq=nhapgt();
	}
	static int tinh(CBGV cbgv)throws IOException {
		System.out.print("Luong cung: ");
		cbgv.lc=Integer.valueOf(nhapgt()).intValue();
		System.out.print("Thuong: ");
		cbgv.tg=Integer.valueOf(nhapgt()).intValue();
		System.out.print("Phat: ");
		cbgv.ph=Integer.valueOf(nhapgt()).intValue();
		return cbgv.lc+cbgv.tg-cbgv.ph;
	}
	static void hienthi(CBGV cbgv) {
		System.out.println("Ho ten: "+cbgv.gv.hvt);
		System.out.println("Nam sinh: "+cbgv.gv.ns);
		System.out.println("Que quan: "+cbgv.gv.qq);
		System.out.println("Thuc linh: "+cbgv.tl);
	}
	public static void main(String args[])throws IOException {
		int n;
		System.out.print("So giao vien: ");
		n=Integer.valueOf(nhapgt()).intValue();
		CBGV GV []=new CBGV[n];
		System.out.println("--------NHAP THONG TIN---------");
		for(int j=0;j<n;j++) {
			System.out.println("Giao vien thu "+(j+1));
			GV[j]=new CBGV();
			nhap(GV[j]);
			GV[j].tl=tinh(GV[j]);
		}
		int d=0;
		System.out.println("----------HIEN THI ---------- ");
		for(int j=0;j<n;j++) {
			System.out.println("----------------------- ");
			hienthi(GV[j]);
		}
	}
}