package com.mphasis;

public class PrimeChannel extends Video{

	
	public PrimeChannel(ProccessingQuality quality) {
		super(quality);
	}
	
	@Override
	public void playVideo() {
	System.out.print("play video in prime with");
	quality.processVideo();
		
	}

}
