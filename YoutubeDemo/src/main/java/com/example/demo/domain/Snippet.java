package com.example.demo.domain;

import java.util.Date;
import java.util.Map;

public class Snippet {
	private Date publishedAt;
	private String channelId;
	private String title;
	private String description;
	private Map<String, Thumbnail> thumbnails;
	private String channelTitle;
	private String liveBroadcastContent;
	
	public Date getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(Date publishAt) {
		this.publishedAt = publishAt;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Map<String, Thumbnail> getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(Map<String, Thumbnail> thumbnails) {
		this.thumbnails = thumbnails;
	}
	public String getChannelTitle() {
		return channelTitle;
	}
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}
	public String getLiveBroadcastContent() {
		return liveBroadcastContent;
	}
	public void setLiveBroadcastContent(String liveBroadcastContent) {
		this.liveBroadcastContent = liveBroadcastContent;
	}
	
	@Override
	public String toString() {
		return "Snippet [publishAt=" + publishedAt + ", chnnelId=" + channelId + ", title=" + title + ", description="
				+ description + ", thumbnails=" + thumbnails + ", channelTitle=" + channelTitle
				+ ", liveBoradcastContent=" + liveBroadcastContent + "]";
	}
}
