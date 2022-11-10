import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		double distance;
		int age;
		int tripType;
		double amount,discountAge = 0,discountTripType=0;
		System.out.println("Mesafeyi km türünden giriniz:");
		distance=scn.nextDouble();
		if (distance<0) {
			System.out.println("Hatalý veri girdiniz.Lütfen 0'dan büyük deðer giriniz.");
			distance=scn.nextDouble();
		}
		System.out.println("Yaþýnýzý giriniz:");
		age=scn.nextInt();
		if (age<0) {
			System.out.println("Hatalý veri girdiniz.Lütfen 0'dan büyük deðer giriniz.");
			age=scn.nextInt();
		}
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
		tripType=scn.nextInt();
		if (tripType==1 || tripType==2) {
			
		}else {System.out.println("Hatalý veri girdiniz.Lütfen 0'dan büyük deðer giriniz.");
		tripType=scn.nextInt();}
		
		//indirimsiz bilet fiyatý
		amount=distance*0.10;
		System.out.println("Ýndirimsiz bilet tutarý:" + amount);
		if (age<12) {
			discountAge=amount*0.50;
			System.out.println("Yaþ indirimi :"+ discountAge);
		}
		else if (age>=12&&age<24) {
			discountAge=amount*0.10;
			System.out.println("Yaþ indirimi :"+ discountAge);
		}
		else if(age>65) {
			discountAge=amount*0.30;
			System.out.println("Yaþ indirimi :"+ discountAge);
		}
		amount=amount-discountAge;
		if (tripType==2) {
			discountTripType=amount*0.20;
			System.out.println("Gidiþ-Dönüþ bilet indirimi:"+discountTripType);
			amount=(amount-discountTripType)*2;
		}
		System.out.println("Toplam tutar :"+ amount);

	}

}
