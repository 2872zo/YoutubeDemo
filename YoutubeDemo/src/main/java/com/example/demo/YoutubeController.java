package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoutubeController {

	private YoutubeDaoImpl youtubeDaoImpl;
	
	public YoutubeController() {
		youtubeDaoImpl = new YoutubeDaoImpl();
	}
	
	@RequestMapping(value="/")    
    public String YoutubeSearch() {
        return "search";            
    }
	
	@RequestMapping(value="/list")
	public String YoutubeList(@ModelAttribute Search search, Map<String, Object> map) throws Exception {
		List<Video> videoList = youtubeDaoImpl.searchVideo(search);
		
		map.put("search",search);
		map.put("Video", videoList);
		return "list";
	}
	
	@GetMapping(value="/play")    
    public String YoutubePlay(@PathVariable String videoId) {
        return "play";            
    }
}
