package model;

import java.util.ArrayList;
import java.util.List;

public class CoursewareProcessMobel {
	private int order;
	private String title;
	private int duration;
	private String points;
	private List<AttachmentMobel> attachmentList;
	
	public CoursewareProcessMobel() {
		attachmentList = new ArrayList<>();
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<AttachmentMobel> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<AttachmentMobel> attachmentList) {
		this.attachmentList = attachmentList;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}
}
