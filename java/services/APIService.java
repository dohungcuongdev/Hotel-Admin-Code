package services;

import java.io.IOException;

import org.apache.http.ParseException;
import org.json.JSONArray;
import org.json.JSONException;

public interface APIService {
	
	public String getResource(String name);
	
	public JSONArray getListFollowUsers() throws IOException, ParseException, JSONException;
}
