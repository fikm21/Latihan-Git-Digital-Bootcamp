package Main;

import java.util.Scanner;

import Interface.Phone;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone XiaomiMi11 = new Xiaomi();
		
		PhoneUser Banu = new PhoneUser(XiaomiMi11);
		
		Banu.turnOnThePhone();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int aksi;
		boolean isLooping = true;
		
		do {
			System.out.println("=== Aplikasi Interface ===");
			System.out.println("1) Nyalakan HP");
			System.out.println("2) Matikan HP");
			System.out.println("3) Perbesar Volume");
			System.out.println("4) Perkecil Volume");
			System.out.println("0) Keluar");
			System.out.println("==========================");
			
			System.out.print("Pilih Aksi : ");
			aksi = input.nextInt();
					
			if(aksi == 1) {
				Banu.turnOnThePhone();
			}else if(aksi == 2) {
				Banu.turnOffThePhone();
			}else if(aksi == 3) {
				Banu.makePhoneLouder();
				
			}else if(aksi == 4) {
				Banu.makePhoneSilent();
			}else if(aksi == 0) {
				isLooping = false;
			}else {
				System.out.println("Aksi yang anda pilih tidak tersedia");
				System.out.println("Silahkan pilih aksi yang lain");
			}
		}while(isLooping);
		
	}

}
