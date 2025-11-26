package com.mphasis;

public abstract class  Video {
		
	protected ProccessingQuality quality;
	
	public Video(ProccessingQuality quality) {
		
		this.quality=quality;
	}
	
	public abstract void playVideo();
	
	
	
	

}
