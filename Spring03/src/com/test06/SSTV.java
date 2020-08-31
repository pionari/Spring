package com.test06;

public class SSTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SSTV POWER ON");
	}

	@Override
	public void powerOff() {
		System.out.println("SSTV POWER OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("SSTV VOLUME UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("SSTV VOLUME DOWN");
	}

}
