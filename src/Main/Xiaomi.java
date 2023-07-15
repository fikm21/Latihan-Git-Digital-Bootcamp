package Main;

import Interface.Phone;

public class Xiaomi implements Phone{
	private int volume;
	private boolean isPowerOn;
	
	public Xiaomi() {
		this.volume = 50;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Handphone menyala ...");
		System.out.println("Selamat menggunakan Xiaomi");
		System.out.println("Android version 10");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		isPowerOn = false;
		System.out.println("Mematikan Handphone ...");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(isPowerOn) {
			if(this.volume == MAX_VOLUME) {
				System.out.println("Volume Sudah Maksimal");
				System.out.println("Volume saat ini " + this.volume  + "%");
			}else {
				this.volume += 10;
				System.out.println("Volume saat ini " + this.volume  + "%");
			}
		}else {
			System.out.println("Handphone mati, hidupkan terlebih dahulu ");
		}
		
	}

	@Override
	public void volumedown() {
		// TODO Auto-generated method stub
		if(isPowerOn) {
			if(this.volume == MIN_VOLUME) {
				
				System.out.println("Volume saat ini " + this.volume  + "%");
			}else {
				this.volume -= 10;
				System.out.println("Volume saat ini " + this.volume  + "%");
			}
		}else {
			System.out.println("Handphone mati, hidupkan terlebih dahulu ");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	

}
