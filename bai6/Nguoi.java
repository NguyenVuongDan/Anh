package bai6;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class Nguoi {
	protected String hvt,ns,scm;
	Nguoi(){}
}
class KhachSan {
	protected String snt,lp,gp;
	KhachSan(){}
	Nguoi kt;
}
class QL {
	static String nhapgt()throws IOException {
		String str;
		DataInputStream stream = new DataInputStream(System.in);
		str =stream.readLine();
		return str;
	}
	static void nhap(KhachSan ks)throws IOException {
		System.out.print("So ngay tro: ");
		ks.snt=nhapgt();
		System.out.print("Loai phong: ");
		ks.lp=nhapgt();
		System.out.print("Gia phong(d/ngay): ");
		ks.gp=nhapgt();
		ks.kt=new Nguoi();
		System.out.println("Thong tin ca nhan cua khach");
		System.out.print("Ho ten: ");
		ks.kt.hvt=nhapgt();
		System.out.print("Nam sinh: ");
		ks.kt.ns=nhapgt();
		System.out.print("So CM nhan dan: ");
		ks.kt.scm=nhapgt();
	}
	static void hienthi(KhachSan ks) {
		System.out.println("Ho ten: "+ks.kt.hvt);
		System.out.println("Nam sinh: "+ks.kt.ns);
		System.out.println("So CMND: "+ks.kt.scm);
	}
	public static void main(String args[])throws IOException {
		int n;
		System.out.print("So khach tro: ");
		n=Integer.valueOf(nhapgt()).intValue();
		KhachSan KT []=new KhachSan[n];
		System.out.println("--------NHAP THONG TIN---------");
		for(int j=0;j<n;j++) {
			System.out.println("Khach tro thu "+(j+1));
			KT[j]=new KhachSan();
			nhap(KT[j]);
		}
		System.out.println("----------HIEN THI------------- ");
		for(int j=0;j<n;j++) {
			System.out.println("----------------------- ");
			System.out.println("Khach tro thu "+(j+1));
			hienthi(KT[j]);
		}
	}
}