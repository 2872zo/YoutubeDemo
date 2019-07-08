package com.example.demo;

public class Search {
	private String nextPageToken;
	private String prevPageToken;
	private String pageToken; 
	private int resultsPerPage;
	private int totalResults;
	private String regioncode;
	private String keyword;
	
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
	public int getResultsPerPage() {
		return resultsPerPage;
	}
	public void setResultsPerPage(int resultsPerPage) {
		this.resultsPerPage = resultsPerPage;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public String getRegioncode() {
		return regioncode;
	}
	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getPageToken() {
		return pageToken;
	}
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	@Override
	public String toString() {
		return "Search [nextPageToken=" + nextPageToken + ", prevPageToken=" + prevPageToken + ", resultsPerPage="
				+ resultsPerPage + ", totalResults=" + totalResults + ", regioncode=" + regioncode + ", keyword="
				+ keyword + "]";
	}
}
