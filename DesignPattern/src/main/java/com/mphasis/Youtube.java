package com.mphasis;

public class Youtube extends Video {

	
	public Youtube(ProccessingQuality quality) {
		super(quality);
	}
	@Override
	public void playVideo() {
		System.out.print("playing video in Youtube with");
		quality.processVideo();
	}

}
