package bai11;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;
public class VanBan {
	protected String str;
	VanBan(){}
	VanBan(String st) {
		str=st;
	}
	public static void main(String args[])throws IOException {
		String st;
		System.out.print("Nhap xau: ");
		DataInputStream stream = new DataInputStream(System.in);
		st =stream.readLine();
		VanBan VB =new VanBan(st);
		System.out.println("So tu trong xau la: "+dem(VB));
		System.out.println("So kt H (hoac h) trong xau la: "+demkt(VB));
		VB.str=ChuanHoa(VB);
		System.out.println("Xau chuan hoa: "+VB.str);
	}
	static int dem(VanBan vb) {
		int d;
		vb.str=ChuanHoa(vb);
		if (vb.str.charAt(0)==' ') d=0;
		else d=1;
		for (int i=0;i<vb.str.length();i++)
			if (vb.str.charAt(i)==' '&&vb.str.charAt(i+1)!=' ')d++;
		return d;
	}
	static int demkt(VanBan vb) {
		int d=0;
		for (int i=0;i<vb.str.length();i++)
			if (vb.str.charAt(i)=='H'||vb.str.charAt(i)=='h')d++;
		return d;
	}
	static String ChuanHoa(VanBan vb) {
		StringBuffer vbn=new StringBuffer (vb.str);
		while(vbn.charAt(0)==' ') vbn=vbn.delete(0,1);
		while(vbn.charAt(vbn.length()-1)==' ')
			vbn=vbn.delete(vbn.length()-1,vbn.length());
		for (int i=1;i<vbn.length();i++)
			while (vbn.charAt(i)==' '&&vbn.charAt(i+1)==' ')
				vbn=vbn.delete(i,i+1);
		return(vbn.toString());
	}
}
