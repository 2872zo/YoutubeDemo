package com.example.demo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeResponse {
	private String kind;
	private String etag;
	private String nextPageToken;
	private String prevPageToken;
	private String regionCode;
	private Map<String, String> pageInfo;
	private List<Video> items;
	
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
	public String getNextPageToken() {
		return nextPageToken;
	}
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
	public String getPrevPageToken() {
		return prevPageToken;
	}
	public void setPrevPageToken(String prevPageToken) {
		this.prevPageToken = prevPageToken;
	}
	public String getRegioncode() {
		return regionCode;
	}
	public void setRegioncode(String regioncode) {
		this.regionCode = regioncode;
	}
	public Map<String, String> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(Map<String, String> pageInfo) {
		this.pageInfo = pageInfo;
	}
	public List<Video> getItems() {
		return items;
	}
	public void setItems(List<Video> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "YoutubeResponse [kind=" + kind + ", etag=" + etag + ", nextPageToken=" + nextPageToken
				+ ", prevPageToken=" + prevPageToken + ", regioncode=" + regionCode + ", pageInfo=" + pageInfo
				+ ", items=" + items + "]";
	}
}
