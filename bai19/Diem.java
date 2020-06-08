package bai19;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class Diem {
	protected double hd,td;
	Diem (){}
	Diem (int a,int b) {
		hd=a;
		td=b;
	}
	void in () {
		System.out.println("("+hd+","+td+")");
	}
	double tinhkc(Diem d1,Diem d2) {
		double kc=0;
		kc=Math.sqrt(Math.pow(d1.hd-d2.hd,2)+Math.pow(d1.td-d2.td,2));
		return kc;
	}
}
class HinhTron {
	private Diem O=new Diem();
	private int R;
	HinhTron(){}
	HinhTron(Diem d,int bk) {
		O=d;
		R=bk;
	}
	HinhTron(int bk,Diem d) {
		O=d;
		R=bk;
	}
	double chuvi() {
		double cv=0;
		cv=2*Math.PI*R;
		return cv;
	}
	double dtich() {
		double dt;
		dt=R*R*Math.PI;
		return dt;
	}
	static String nhapgt()throws IOException {
		String str;
		DataInputStream stream = new DataInputStream(System.in);
		str=stream.readLine();
		return str;
	}
	static Diem nhapdiem()throws IOException { 
		int a,b;
		System.out.println("Toa do tam: ");
		System.out.print("Hoanh do: ");
		a=Integer.valueOf(nhapgt()).intValue();
		System.out.print("Tung do: ");
		b=Integer.valueOf(nhapgt()).intValue();
		Diem nd=new Diem(a,b);
		return nd;
	}
	static HinhTron nhapht() throws IOException { 
		int bk;
		Diem tam=new Diem();
		tam=nhapdiem();
		System.out.print("Nhap do dai ban kinh: ");
		bk=Integer.valueOf(nhapgt()).intValue();
		HinhTron ht=new HinhTron(tam,bk);
		return ht;
	}
	public static void main(String args[])throws IOException {
		HinhTron HT=new HinhTron();
		HT=nhapht();
		System.out.println("Chu vi: "+HT.chuvi());
		System.out.println("Dien tich : "+HT.dtich());
	}
}
