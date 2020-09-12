package com.test07;

public class IgTV implements TV {
	
	public IgTV() {
		System.out.println("IgTV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("IGTV POWER ON");
	}

	@Override
	public void powerOff() {
		System.out.println("IGTV POWER OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("IGTV VOLUME UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("IGTV VOLUME DOWN");
	}

}
