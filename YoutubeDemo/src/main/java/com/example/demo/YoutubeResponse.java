package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeResponse {
	private String kind;
	private String etag;
	private String nextPageToken;
	private String prevPageToken;
	private String regionCode;
	private PageInfo pageInfo;
	@JsonProperty("items")
	private Video[] items;
	
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
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	public Video[] getItems() {
		return items;
	}
	public void setItems(Video[] items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "YoutubeResponse [kind=" + kind + ", etag=" + etag + ", nextPageToken=" + nextPageToken
				+ ", prevPageToken=" + prevPageToken + ", regionCode=" + regionCode + ", pageInfo=" + pageInfo
				+ ", items=" + Arrays.toString(items) + "]";
	}
}
