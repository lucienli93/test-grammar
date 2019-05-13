package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class ReadFileToJsonString {
	public static String getJsonStringByFilePath(String path) {
		String result = "";
		List<String> dataList = new ArrayList<>();
		
		try (FileReader fr = new FileReader(path)) {
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
			    String[] resultList = line.split("&");
				dataList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!dataList.isEmpty()) {
			result = JSON.toJSONString(dataList);
		}
		return result;
	}
	
	public static void main(String [] args) {
      String jsonString = ReadFileToJsonString.getJsonStringByFilePath("D:/langueage.txt");
      System.out.println(jsonString);
      List<String> listFormJSON = JSON.parseArray(jsonString, String.class);
      System.out.println(listFormJSON);
      System.out.println(listFormJSON.contains("g5dw7sun"));
	}
}