package com.example.demo;

public class VideoId {
	private String kind;
	private String videoId;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	
	@Override
	public String toString() {
		return "VideoId [kind=" + kind + ", videoId=" + videoId + ", getKind()=" + getKind() + ", getVideoId()="
				+ getVideoId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
