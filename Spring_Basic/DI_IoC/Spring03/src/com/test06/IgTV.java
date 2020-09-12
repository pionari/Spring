package com.test06;

public class IgTV implements TV {

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
