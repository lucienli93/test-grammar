package model;

import java.util.ArrayList;
import java.util.List;

public class CoursePreparationMobel {
	private int order;
	private String title;
	private String desc;
	private List<AttachmentMobel> attachmentList;
	
	public CoursePreparationMobel() {
		setAttachmentList(new ArrayList<>());
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<AttachmentMobel> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<AttachmentMobel> attachmentList) {
		this.attachmentList = attachmentList;
	}
	
}
