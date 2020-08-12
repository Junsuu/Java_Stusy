package com.study.java;

public  class implements_test implements Constant_field{

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");	
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
		System.out.println("현재 TV 볼륨: "+ this.volume);
	}

}
