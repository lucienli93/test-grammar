package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;

public class AdmissionGenerate {
	public static void generateAdmissionTickeet() {
		String examNameDate = "2019";
		String examNamePrefix = "年美国数学竞赛";
		String examName = "上海赛区AMC10";
		String admissionTicket = "19A0021123456";
		String name = "张三丰";
		String school = "上海市交通大学附属中学";
		String grade = "10年级";
		String group = "AMC10";
		String examRoomNo = "202";
		String examDay = "2019年2月14日";
		String examWeek = "周四上午";
		String examDuration = "9:30-10:45";
		String examSite = "浦东新区高科西路899弄中建时代广场二号楼211室（近东明路）";
		
		
		try {
			BufferedImage parentImg = ImageIO.read(new File("D:\\nsda_files\\AMC\\AdmissionTicket.png"));
			Graphics editor = parentImg.createGraphics();
			Font font = new Font("微软雅黑",Font.PLAIN,59);  
			FontMetrics fontMetrics = editor.getFontMetrics(font);
			int titleWith = fontMetrics.stringWidth(examNameDate + examNamePrefix + examName);
			editor.setFont(font);
			editor.setColor(Color.RED);
			editor.drawString(examName, (parentImg.getWidth() - titleWith) / 2 + fontMetrics.stringWidth(examNameDate + examNamePrefix), 160);
			editor.setColor(new Color(52, 92, 131));
			editor.drawString(examNameDate + examNamePrefix, (parentImg.getWidth() - titleWith) / 2, 160);

			editor.setFont(new Font("微软雅黑", Font.PLAIN, 48));
			editor.drawString(admissionTicket, 430, 401);
			editor.drawString(name, 430, 512);
			editor.drawString(school, 430, 623);
			editor.drawString(grade, 430, 734);
			editor.drawString(group, 430, 845);
			editor.drawString(examRoomNo, 1030, 845);
			editor.setFont(new Font("微软雅黑", Font.BOLD, 38));
			editor.drawString(examDay, 450, 950);
			editor.drawString(examWeek, 900, 950);
			editor.drawString(examDuration, 1300, 950);
			editor.drawString(examSite, 450, 1047);
			

	        URL url = new URL("http://p66wn86l4.bkt.clouddn.com/c2aa6b7c-2670-4576-85b9-e304e8503176.png");
	        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	        conn.setConnectTimeout(3*1000);
	        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
	        //conn.setRequestProperty("lfwywxqyh_token","");

	        InputStream inputStream = conn.getInputStream();
	        BufferedImage bimg = ImageIO.read(inputStream);
	        if (bimg != null) {
	        	editor.drawImage(bimg, 1210, 355, 302, 426, null);
	        }
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write( parentImg, "png", baos);
			baos.flush();
			byte[] imageInByte = baos.toByteArray();
			baos.close();
            FileOutputStream fos = new FileOutputStream("D:\\nsda_files\\AMC\\AdmissionTicket2.png");
            fos.write(imageInByte);
            fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args) {
		generateAdmissionTickeet();
	}
}
