import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		double distance;
		int age;
		int tripType;
		double amount,discountAge = 0,discountTripType=0;
		System.out.println("Mesafeyi km t�r�nden giriniz:");
		distance=scn.nextDouble();
		if (distance<0) {
			System.out.println("Hatal� veri girdiniz.L�tfen 0'dan b�y�k de�er giriniz.");
			distance=scn.nextDouble();
		}
		System.out.println("Ya��n�z� giriniz:");
		age=scn.nextInt();
		if (age<0) {
			System.out.println("Hatal� veri girdiniz.L�tfen 0'dan b�y�k de�er giriniz.");
			age=scn.nextInt();
		}
		System.out.println("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ):");
		tripType=scn.nextInt();
		if (tripType==1 || tripType==2) {
			
		}else {System.out.println("Hatal� veri girdiniz.L�tfen 0'dan b�y�k de�er giriniz.");
		tripType=scn.nextInt();}
		
		//indirimsiz bilet fiyat�
		amount=distance*0.10;
		System.out.println("�ndirimsiz bilet tutar�:" + amount);
		if (age<12) {
			discountAge=amount*0.50;
			System.out.println("Ya� indirimi :"+ discountAge);
		}
		else if (age>=12&&age<24) {
			discountAge=amount*0.10;
			System.out.println("Ya� indirimi :"+ discountAge);
		}
		else if(age>65) {
			discountAge=amount*0.30;
			System.out.println("Ya� indirimi :"+ discountAge);
		}
		amount=amount-discountAge;
		if (tripType==2) {
			discountTripType=amount*0.20;
			System.out.println("Gidi�-D�n�� bilet indirimi:"+discountTripType);
			amount=(amount-discountTripType)*2;
		}
		System.out.println("Toplam tutar :"+ amount);

	}

}
