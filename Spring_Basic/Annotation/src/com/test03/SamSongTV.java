package com.test03;

import org.springframework.stereotype.Component;

@Component("samsong")
public class SamSongTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("파워온");
	}

	@Override
	public void powerOff() {
		System.out.println("파워오프");
	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨업");
	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨다운");
	}

}
