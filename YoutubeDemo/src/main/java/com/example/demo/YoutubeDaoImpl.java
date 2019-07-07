package com.example.demo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class YoutubeDaoImpl {
	
	private final String youtubeAPI = "AIzaSyAnRsFVJgnbKy0IMb8CAo-4seoXBl1lExY";
	
	public List<Video> searchVideo(Search search) throws Exception {
		HttpConnection httpConnection = new HttpConnection();
		
//		String targetUrl = "https://www.googleapis.com/youtube/v3/search?key=" + youtubeAPI + "&part=snippet&q=" + search.getKeyword();
		
//		String searchResult = httpConnection.sendGet(targetUrl);
		String searchResult = "{ \"kind\": \"youtube#searchListResponse\", \"etag\": \"\\\"Bdx4f4ps3xCOOo1WZ91nTLkRZ_c/yAlKordED0hW9aJL8OH4NHlGvy8\\\"\", \"nextPageToken\": \"CAUQAA\", \"regionCode\": \"KR\", \"pageInfo\": {  \"totalResults\": 1000000,  \"resultsPerPage\": 5 }, \"items\": [  {   \"kind\": \"youtube#searchResult\",   \"etag\": \"\\\"Bdx4f4ps3xCOOo1WZ91nTLkRZ_c/tlGvyGanhq4w4WsvHb7Th9lL6P8\\\"\",   \"id\": {    \"kind\": \"youtube#video\",    \"videoId\": \"dS-ti6XjT4A\"   },   \"snippet\": {    \"publishedAt\": \"2019-06-10T01:39:45.000Z\",    \"channelId\": \"UCUnRn1f78foyP26XGkRfWsA\",    \"title\": \"DOOM Eternal – Official Story Trailer | E3 2019\",    \"description\": \"Raze Hell. DOOM Eternal launches on 11.22.19. Watch the all-new Story Trailer for DOOM Eternal, the much-anticipated sequel to DOOM (2016). DOOM Eternal ...\",    \"thumbnails\": {     \"default\": {      \"url\": \"https://i.ytimg.com/vi/dS-ti6XjT4A/default.jpg\",      \"width\": 120,      \"height\": 90     },     \"medium\": {      \"url\": \"https://i.ytimg.com/vi/dS-ti6XjT4A/mqdefault.jpg\",      \"width\": 320,      \"height\": 180     },     \"high\": {      \"url\": \"https://i.ytimg.com/vi/dS-ti6XjT4A/hqdefault.jpg\",      \"width\": 480,      \"height\": 360     }    },    \"channelTitle\": \"GameSpot Trailers\",    \"liveBroadcastContent\": \"none\"   }  },  {   \"kind\": \"youtube#searchResult\",   \"etag\": \"\\\"Bdx4f4ps3xCOOo1WZ91nTLkRZ_c/ahQH7AFbY89yXcQCs0-jd2JOsbA\\\"\",   \"id\": {    \"kind\": \"youtube#video\",    \"videoId\": \"eqbmlCxECQY\"   },   \"snippet\": {    \"publishedAt\": \"2019-06-10T01:54:25.000Z\",    \"channelId\": \"UCVS9tA3PI8Gard_LrTx0YsQ\",    \"title\": \"Doom Eternal Gameplay | E3 2019\",    \"description\": \"Gameplay from Doom Eternal, from Bethesda's E3 2019 press conference. For more videos, news, previews and reviews, go to http://kotaku.com.\",    \"thumbnails\": {     \"default\": {      \"url\": \"https://i.ytimg.com/vi/eqbmlCxECQY/default.jpg\",      \"width\": 120,      \"height\": 90     },     \"medium\": {      \"url\": \"https://i.ytimg.com/vi/eqbmlCxECQY/mqdefault.jpg\",      \"width\": 320,      \"height\": 180     },     \"high\": {      \"url\": \"https://i.ytimg.com/vi/eqbmlCxECQY/hqdefault.jpg\",      \"width\": 480,      \"height\": 360     }    },    \"channelTitle\": \"Kotaku\",    \"liveBroadcastContent\": \"none\"   }  },  {   \"kind\": \"youtube#searchResult\",   \"etag\": \"\\\"Bdx4f4ps3xCOOo1WZ91nTLkRZ_c/KllEs0A7tY0-JN1aiCRnXDOdIfA\\\"\",   \"id\": {    \"kind\": \"youtube#video\",    \"videoId\": \"CGq8Ee2gOe4\"   },   \"snippet\": {    \"publishedAt\": \"2018-08-10T22:07:35.000Z\",    \"channelId\": \"UCvZHe-SP3xC7DdOk4Ri8QBw\",    \"title\": \"DOOM Eternal – Official Gameplay Reveal\",    \"description\": \"Watch the exclusive reveal of DOOM Eternal, featuring over 15 minutes of gameplay. The DOOM Slayer returns in DOOM Eternal, the much-anticipated sequel to ...\",    \"thumbnails\": {     \"default\": {      \"url\": \"https://i.ytimg.com/vi/CGq8Ee2gOe4/default.jpg\",      \"width\": 120,      \"height\": 90     },     \"medium\": {      \"url\": \"https://i.ytimg.com/vi/CGq8Ee2gOe4/mqdefault.jpg\",      \"width\": 320,      \"height\": 180     },     \"high\": {      \"url\": \"https://i.ytimg.com/vi/CGq8Ee2gOe4/hqdefault.jpg\",      \"width\": 480,      \"height\": 360     }    },    \"channelTitle\": \"Bethesda Softworks\",    \"liveBroadcastContent\": \"none\"   }  },  {   \"kind\": \"youtube#searchResult\",   \"etag\": \"\\\"Bdx4f4ps3xCOOo1WZ91nTLkRZ_c/uOM5dksKf6JN2uMT5uzUbP4rUgk\\\"\",   \"id\": {    \"kind\": \"youtube#video\",    \"videoId\": \"uz7YK7tx-D8\"   },   \"snippet\": {    \"publishedAt\": \"2009-07-26T09:31:20.000Z\",    \"channelId\": \"UCWnX7jdDzy0qMqRSPgFzwYw\",    \"title\": \"dhoom again full song HQ ...\",    \"description\": \"\",    \"thumbnails\": {     \"default\": {      \"url\": \"https://i.ytimg.com/vi/uz7YK7tx-D8/default.jpg\",      \"width\": 120,      \"height\": 90     },     \"medium\": {      \"url\": \"https://i.ytimg.com/vi/uz7YK7tx-D8/mqdefault.jpg\",      \"width\": 320,      \"height\": 180     },     \"high\": {      \"url\": \"https://i.ytimg.com/vi/uz7YK7tx-D8/hqdefault.jpg\",      \"width\": 480,      \"height\": 360     }    },    \"channelTitle\": \"latinapower91\",    \"liveBroadcastContent\": \"none\"   }  },  {   \"kind\": \"youtube#searchResult\",   \"etag\": \"\\\"Bdx4f4ps3xCOOo1WZ91nTLkRZ_c/ZSnno2tHxCI2g7ZrMgZgoHQfaDA\\\"\",   \"id\": {    \"kind\": \"youtube#video\",    \"videoId\": \"cQYSf7r_HpA\"   },   \"snippet\": {    \"publishedAt\": \"2019-06-27T00:34:11.000Z\",    \"channelId\": \"UCrDg4SA_YyX4kUqh6W3IWjA\",    \"title\": \"DOOM ETERNAL - ALL WEAPONS AND MONSTERS (SO FAR)\",    \"description\": \"\",    \"thumbnails\": {     \"default\": {      \"url\": \"https://i.ytimg.com/vi/cQYSf7r_HpA/default.jpg\",      \"width\": 120,      \"height\": 90     },     \"medium\": {      \"url\": \"https://i.ytimg.com/vi/cQYSf7r_HpA/mqdefault.jpg\",      \"width\": 320,      \"height\": 180     },     \"high\": {      \"url\": \"https://i.ytimg.com/vi/cQYSf7r_HpA/hqdefault.jpg\",      \"width\": 480,      \"height\": 360     }    },    \"channelTitle\": \"LeonardoETC\",    \"liveBroadcastContent\": \"none\"   }  } ]}";
		
		System.out.println("SearchResult : " + searchResult);
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> videoMap = objectMapper.readValue(searchResult, new TypeReference<Map<String, Object>>(){});
		
		System.out.println("videoMap : " + videoMap);
		search.setNextPageToken((String) videoMap.get("nextPageToken"));
		search.setPrevPageToken((String) videoMap.get("prevPageToken"));
		search.setRegioncode((String) videoMap.get("regionCode"));
		
		
		
		search.setResultsPerPage(Integer.parseInt((String)((Map)videoMap.get("pageInfo")).get("resultPerPages")));
		search.setTotalResults(Integer.parseInt((String)((Map)videoMap.get("pageInfo")).get("totalResults")));
		
		return null;
	}
}
