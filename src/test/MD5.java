package test;

import java.util.ArrayList;
import java.util.List;

public class MD5 {
	public static void main(String args []) {
//		byte[] result = null;
//		try {
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			md.reset();
//			md.update("123456".getBytes("UTF-8"));
//			result = md.digest();
//			StringBuffer sb = new StringBuffer();
//			for(byte b:result){
//                sb.append(Integer.toHexString(b & 0xff));
//            }
//			System.out.println(sb);
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println((int)(Math.random() * 36));
//		String test = AccountLevelEnum.CAMPUS_AMBASSADOR.toString();
//		System.out.println(Byte.valueOf("100"));
//		System.out.println((int) Math.round(((double)225 / (double)60)));
		List<Integer> testList = new ArrayList<>();
		testList.add(1);
		testList.forEach(item -> {
		    System.out.println(item);
		});
	}
}
