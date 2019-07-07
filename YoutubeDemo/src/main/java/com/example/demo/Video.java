package com.example.demo;

public class Video {
	private String kind;
	private String etag;
	private VideoId id;
	private Snippet snippet;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public VideoId getId() {
		return id;
	}
	public void setId(VideoId id) {
		this.id = id;
	}
	public Snippet getSnippet() {
		return snippet;
	}
	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}
	
	@Override
	public String toString() {
		return "Video [kind=" + kind + ", etag=" + etag + ", id=" + id + ", snippet=" + snippet + "]";
	}
}
