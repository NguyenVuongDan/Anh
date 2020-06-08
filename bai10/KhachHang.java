package bai10;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class KhachHang {
	protected String hvt,sn,mct;
	KhachHang(){}
}
class BienLai {
	protected int csc,csm,tt;
	KhachHang kh=new KhachHang();
	BienLai(){}
	static String nhapgt()throws IOException {
		String str;
		DataInputStream stream = new DataInputStream(System.in);
		str =stream.readLine();
		return str;
	}
	static void nhapttr(KhachHang khsd) throws IOException {
		System.out.print("Ho ten: ");
		khsd.hvt=nhapgt();
		System.out.print("So nha: ");
		khsd.sn=nhapgt();
		System.out.print("Ma cong to: ");
		khsd.mct=nhapgt();
	}
	static void hienthittr(KhachHang khsd) {
		System.out.println("Ho ten: "+khsd.hvt);
		System.out.println("So nha: "+khsd.sn);
		System.out.println("Ma cong to: "+khsd.mct);
	}
}
class QL {
	static void nhap(BienLai bl)throws IOException {
		bl.nhapttr(bl.kh);
		System.out.print("Chi so moi: ");
		bl.csm=Integer.valueOf(bl.nhapgt()).intValue();
		System.out.print("Chi so cu: ");
		bl.csc=Integer.valueOf(bl.nhapgt()).intValue();
		bl.tt=(bl.csm-bl.csc)*750;
	}
	static void hienthi(BienLai bl) {
		bl.hienthittr(bl.kh);
		System.out.println("Chi so moi: "+bl.csm);
		System.out.println("Chi so cu: "+bl.csc);
		System.out.println("Tien tra: "+bl.tt);
	}
	public static void main(String args[])throws IOException {
		int n;
		System.out.print("So khach hang: ");
		n=Integer.valueOf(BienLai.nhapgt()).intValue();
		BienLai KH []=new BienLai[n];
		System.out.println("--------NHAP THONG TIN---------");
		for(int j=0;j<n;j++) {
			System.out.println("Khach hang thu "+(j+1));
			KH[j]=new BienLai();
			nhap(KH[j]);
		}
		System.out.println("----------HIEN THI ---------- ");
		for(int j=0;j<n;j++) {
			System.out.println("----------------------- ");
			hienthi(KH[j]);
		}
	}
}