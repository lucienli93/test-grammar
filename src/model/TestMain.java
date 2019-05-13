package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
public class TestMain {
    public static void main(String [] args) {

//        List<List<CounterpartModel>> counterpartTable = new ArrayList<>();
//        CounterpartModel[][] counterpartTableTemp = new CounterpartModel[10][10];
//        String data = "[[{\"conCode\":\"wertyu\",\"proCode\":\"\"},{\"conCode\":\"EERT\",\"proCode\":\"YTRE\"}],[{\"conCode\":\"EERT\",\"proCode\":\"wertyu\"},{\"conCode\":\"\",\"proCode\":\"YTRE\"}],[{\"conCode\":\"wertyu\",\"proCode\":\"YTRE\"},{\"conCode\":\"EERT\",\"proCode\":\"\"}]]";
//        CounterpartModel[][] counterpartTableTemp = JSON.parseObject(data, CounterpartModel[][].class);
//        counterpartTable = (List<List<CounterpartModel>>) JSON.parseArray(data, new ArrayList<CounterpartModel>().getClass());
//        CounterpartModel model1 = new CounterpartModel("1", "2");
//        CounterpartModel model2 = new CounterpartModel("3", "4");
//        CounterpartModel model3 = new CounterpartModel("5", "6");
//        List<CounterpartModel> CounterpartModelList = new ArrayList<>(Arrays.asList(model1, model2, model3));
//        Map<String, CounterpartModel> counterpartModelMap = CounterpartModelList.stream().collect(Collectors.toMap(CounterpartModel :: getConCode, item -> item));
//        CounterpartModel model4 = counterpartModelMap.get("2");
//        CounterpartModel model5 = counterpartModelMap.get("1");
//        System.out.println(counterpartModelMap.get("1") == null ? "" : counterpartModelMap.get("1").getConCode());
//        System.out.println(counterpartModelMap.get("2") == null ? "" : counterpartModelMap.get("2").getConCode());
//        System.out.println();
    	List<CoursePreparationMobel> modelList = new ArrayList<>();
    	for (int i = 1; i < 4; i++) {
        	CoursePreparationMobel model = new CoursePreparationMobel();
        	model.setDesc("desc");
        	model.setOrder(i);
        	model.setTitle("title");
        	List<AttachmentMobel> attachmentList = new ArrayList<>();
        	for (int j = 1; j < 4; j++) {
        		AttachmentMobel attachmentMobel = new AttachmentMobel();
        		attachmentMobel.setId(j);
        		attachmentMobel.setName("name");
        		attachmentMobel.setOrder(j);
        		attachmentMobel.setType((byte)1);
        		attachmentList.add(attachmentMobel);
        	}
        	model.setAttachmentList(attachmentList);
        	modelList.add(model);
    	}
    	String result = JSON.toJSONString(modelList);
    	System.out.println(result);
    	List<CoursePreparationMobel> resultList = new ArrayList<>();
    	resultList = JSON.parseArray(result, CoursePreparationMobel.class);
    	System.out.println();
    	
    	List<CoursewareProcessMobel> processList = new ArrayList<>();
    	for (int i = 1; i < 4; i++) {
    		CoursewareProcessMobel model = new CoursewareProcessMobel();
    		model.setDuration(30);
    		model.setOrder(i);
    		model.setTitle("title" + i);
    		model.setPoints("points" + i);
    		List<AttachmentMobel> attachmentList = new ArrayList<>();
        	for (int j = 1; j < 4; j++) {
        		AttachmentMobel attachmentMobel = new AttachmentMobel();
        		attachmentMobel.setId(j);
        		attachmentMobel.setName("name");
        		attachmentMobel.setOrder(j);
        		attachmentMobel.setType((byte)1);
        		attachmentList.add(attachmentMobel);
        	}
        	model.setAttachmentList(attachmentList);
        	processList.add(model);
    	}
    	String processResult = JSON.toJSONString(processList);
    	System.out.println(processResult);
    	List<CoursewareProcessMobel> processListRec = new ArrayList<>();
    	processListRec = JSON.parseArray(processResult, CoursewareProcessMobel.class);
    	System.out.println();
    }
}
