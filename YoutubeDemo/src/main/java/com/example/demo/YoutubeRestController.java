package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Video;
import com.example.demo.domain.YoutubeResponse;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@RestController
public class YoutubeRestController {

	private YoutubeDaoImpl youtubeDaoImpl;

	public YoutubeRestController() {
		youtubeDaoImpl = new YoutubeDaoImpl();
	}

	@PostMapping(value = "/appendContent")
	public String YoutubeList(@RequestBody Map<String, String> reqParam) throws Exception {
		System.out.println("RestController====================");
		
		System.out.println("RestSearch : " + reqParam);
		
		Search search = new Search();
		search.setPageToken(reqParam.get("nextPageToken"));
		search.setKeyword(reqParam.get("keyword"));
		
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

		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("search", search);
		map.put("videoList", videoList);
		
//		System.out.println(search);
//		System.out.println(videoList);
		
//		System.out.println("RestResultMap : " + map);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
	
//		System.out.println("jsonString : " + jsonString);
		
		return jsonString;
	}
}
