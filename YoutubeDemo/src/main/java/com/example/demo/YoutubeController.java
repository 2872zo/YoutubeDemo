package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Video;
import com.example.demo.domain.YoutubeResponse;

@Controller
public class YoutubeController {

	private YoutubeDaoImpl youtubeDaoImpl;

	public YoutubeController() {
		youtubeDaoImpl = new YoutubeDaoImpl();
	}

	@RequestMapping(value = "/")
	public String YoutubeSearch() {
		return "search";
	}

	@RequestMapping(value = "/list")
	public String YoutubeList(@ModelAttribute Search search, Map<String, Object> map) throws Exception {
		YoutubeResponse youtubeResponse = youtubeDaoImpl.searchVideo(search);

		List<Video> videoList = new ArrayList<Video>();
		for (int i = 0; i < youtubeResponse.getItems().length; i++) {
			videoList.add(youtubeResponse.getItems()[i]);
		}
		
		search.setNextPageToken(youtubeResponse.getNextPageToken());
		search.setPrevPageToken(youtubeResponse.getPrevPageToken());
		search.setRegioncode(youtubeResponse.getRegionCode());
		search.setResultsPerPage(youtubeResponse.getPageInfo().getResultsPerPage());
		search.setTotalResults(youtubeResponse.getPageInfo().getTotalResults());

		map.put("search", search);
		map.put("videoList", videoList);
		
		System.out.println(search);
		System.out.println(videoList);
		
		return "list";
	}

	@GetMapping(value = "/play")
	public String YoutubePlay() {
		return "play";
	}
}
