package com.study.java;

public class Audio implements Constant_field{

	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");	
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume>Constant_field.MAX_VAOLUME) {
			this.volume = Constant_field.MAX_VAOLUME;
		}else if(volume<Constant_field.MIN_VAOLUME) {
			this.volume = Constant_field.MIN_VAOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: "+ this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}

}
