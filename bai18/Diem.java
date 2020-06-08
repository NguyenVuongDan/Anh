package bai18;
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
	class TamGiac {
		private Diem A=new Diem();
		private Diem B=new Diem();
		private Diem C=new Diem();
		TamGiac(){}
		TamGiac(Diem d1,Diem d2,Diem d3) {
			A=d1;
			B=d2;
			C=d3;
		}
		double AB,BC,AC;
		double chuvi() {
			double cv=0;
			cv=AB+BC+AC;
			return cv;
		}
		double dtich() {
			double dt;
			float p;
			p=(float)(AB+BC+AC)/2;
			dt=Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
			return dt;
		}
		static String nhapgt()throws IOException {
			String str;
			DataInputStream stream = new DataInputStream(System.in);
			str=stream.readLine();
			return str;
		}
		static Diem nhapdiem(String x)throws IOException { 
			int a,b;
			System.out.println("Diem "+x);
			System.out.print("Hoanh do: ");
			a=Integer.valueOf(nhapgt()).intValue();
			System.out.print("Tung do: ");
			b=Integer.valueOf(nhapgt()).intValue();
			Diem nd=new Diem(a,b);
			return nd;
		}
		static TamGiac nhaptgiac()throws IOException {
			Diem d1=new Diem();
			Diem d2=new Diem();
			Diem d3=new Diem();
			d1=nhapdiem("A");
			d2=nhapdiem("B");
			d3=nhapdiem("C");
			TamGiac tg=new TamGiac(d1,d2,d3);
			tg.AB=d1.tinhkc(tg.A,tg.B);
			tg.AC=d1.tinhkc(tg.A,tg.C);
			tg.BC=d1.tinhkc(tg.B,tg.C);
			return tg;
		}
		public static void main(String args[])throws IOException {
			TamGiac TG=new TamGiac();
			TG=nhaptgiac();
			System.out.println("Chu vi: "+TG.chuvi());
			System.out.println("Dien tich : "+TG.dtich());
		}
}
