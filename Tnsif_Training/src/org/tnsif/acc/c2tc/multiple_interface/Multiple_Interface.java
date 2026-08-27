package org.tnsif.acc.c2tc.multiple_interface;

class SmartPhone implements Camera,MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("Playing music using SmartPhone");
	}

	@Override
	public void TakePhoto() {
		System.out.println("Taking Photo using SmartPhone");
		
	}
	
	
}

public class Multiple_Interface {
	public static void main(String[]args) {
		SmartPhone phone=new SmartPhone();
		phone.playMusic();
		phone.TakePhoto();
	}
	

}
