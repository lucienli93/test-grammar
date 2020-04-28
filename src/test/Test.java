package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String [] args) throws IOException {
		//Calendar date = Calendar.getInstance();
		//date.add(Calendar.WEEK_OF_YEAR, -3);
		//date.add(Calendar.DAY_OF_YEAR, 2);
		//date.add(Calendar.DAY_OF_YEAR, -6);
//		date.add(Calendar.DAY_OF_YEAR, -1 * date.get(Calendar.DAY_OF_WEEK) + 1);

//	  date.add(Calendar.DAY_OF_WEEK, -30);
//      int year = Integer.valueOf(date.get(Calendar.YEAR));
      //int mo = Integer.valueOf(date.get(Calendar.MONTH));
      //System.out.println(date.get((Calendar.DAY_OF_MONTH)));
//      int day = Integer.valueOf(date.get(Calendar.DAY_OF_MONTH));
//      System.out.println(Calendar.YEAR);
//      System.out.println((year * 100 + mo + 1) * 100 + day);
//	  System.out.println(date.get(Calendar.DAY_OF_WEEK));

		//hour, minute, second set to 0
//		Date now = new Date();
//		// java.util.Date -> java.time.LocalDate
//		LocalDate localDate=now.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//		// java.time.LocalDate -> java.sql.Date
//		Date newDate=java.sql.Date.valueOf(localDate);
//		System.out.printf("%1$tF %1$tT\n", newDate);

//		Date date2 = new Date();
//		date2.setYear(121);
//		date2.setMonth(11);
//		date.setTime(date2);
//		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
//		System.out.println(date.getWeekYear());
//        int year = Integer.valueOf(date.get(Calendar.YEAR));
//        int mo = Integer.valueOf(date.get(Calendar.MONTH));
//        int day = Integer.valueOf(date.get(Calendar.DAY_OF_MONTH));
//        System.out.println(Calendar.YEAR);
//        System.out.println((year * 100 + mo + 1) * 100 + day);
//		int value = 20191219;
//		Date result = null;
//        if (value >= 19000101 && value <= 99991231) {
//            Calendar calendar = Calendar.getInstance();
//            calendar.set(calendar.YEAR, value % 100);
//            value = value / 100;
//            calendar.set(calendar.MONTH, value % 100 - 1);
//            value = value / 100;
//            calendar.set(calendar.DAY_OF_MONTH, value % 100);
//            result = calendar.getTime();
//        }
//        List<String> list = new ArrayList<>();
//        AbstractList<String> dd
//        list.add("2019-02-14T00:00:00");
//        System.out.println(JSON.toJSONString(list));
//
//        String url="http://p66wn86l4.bkt.clouddn.com/c2aa6b7c-2670-4576-85b9-e304e8503176.png";
//
//        String token="";
//       // String token="SiGBCH6QblUHs7NiouV09rL6uAA3Sv0cGicaSxJiC/78DoWIMzVbW6VCwwkymYsZaxndDkYqkm4=";
//        DownloadImage.downLoadFromUrl(url,"abc.png","D:\\",token);



        // expire time
//        Calendar nowTime = Calendar.getInstance();
//        Date expiresDate = nowTime.getTime();
//		DateFormat df = new SimpleDateFormat("yyyy骞碝M鏈� dd鏃�");
//		String result = df.format(new Date());
//		System.out.println(result);
//		int dayOfWeek = nowTime.get(Calendar.DAY_OF_WEEK);
//		System.out.println(expiresDate.getDay());
//		System.out.println(dayOfWeek);
//
//		DateFormat df2 = new SimpleDateFormat("HH:mm");
//		String result2 = df2.format(new Date());
//		System.out.println(result2);
//		nowTime.add(Calendar.MINUTE, 75);
//		result2 = df2.format(nowTime.getTime());
//		System.out.println(result2);
//		File file = new File("D:\\AMC\\signup-java\\amc-web\\src\\main\\resources\\file\\amc_email_body.html");
//		String name = file.getName();
//		FileInputStream inputStream = new FileInputStream(file);
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\AMC\\signup-java\\amc-web\\src\\main\\resources\\file\\amc_email_body.html"));
//		byte[] b = new byte[bis.available()];
//		bis.read(b);
//		System.out.println(new String(b));
//		bis.close();
//		Boolean bool = null;
//		Collections c = null;
//		EnumSet es = null;

//		Fruit.Builder fruitBuilder = new Fruit.Builder().setColor("red").setName("apple");
//		Fruit fruit = new Fruit.Builder().setColor("yellow").setName("banana").build();
//		System.out.println(fruitBuilder.toString());
//		ObjectOutputStream of = new ObjectOutputStream(new FileOutputStream(new File("D://fruit.txt")));
//		of.writeObject(fruit);
//		of.close();
//
//		ObjectInputStream oif = new ObjectInputStream(new FileInputStream(new File("D://fruit.txt")));
//		try {
//			Object ooo = oif.readObject();
//			Fruit fruit2 = (Fruit) ooo;
//			oif.close();
//			System.out.println(fruit.equals(fruit2));
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//sington serialize
//		SingtonExample singtonExample = SingtonExample.getInstance();
//		singtonExample.setName("test1");
//		ObjectOutputStream singtonExampleOf = new ObjectOutputStream(new FileOutputStream(new File("D://singtonExample.txt")));
//		singtonExampleOf.writeObject(singtonExample);
//		singtonExampleOf.close();
//		ObjectInputStream singtonExampleOif = new ObjectInputStream(new FileInputStream(new File("D://singtonExample.txt")));
//		try {
//			Object ooo2 = singtonExampleOif.readObject();
//			SingtonExample singtonExample2 = (SingtonExample) ooo2;
//			singtonExampleOif.close();
//			System.out.println(singtonExample.equals(singtonExample2));
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		String testNull = "test";
//		System.out.println(testNull.hashCode());
//		testNull = "52145dfasdfasd54641va5sdc465f";
//		System.out.println(testNull.hashCode());
//		if (null instanceof String ) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		float f1 = 99f;
//		float f2 = 94f;
//		System.out.println(f1 >= f2);
//
//		int testMax = 0;
//		testMax = Integer.MAX_VALUE * 3;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE + 2);
//		System.out.println(testMax);
//
//		Integer i = 5;
//		System.out.println(i);
//
//		Number [] testCovariant = null;
//		testCovariant = new Double[10];
//		testCovariant[0] = 3.0;
//		testCovariant[1] = 3.3;
//		System.out.println(testCovariant);

//		String test = "1asdfasfd涓璬.com";
//		System.out.println(test.substring(test.lastIndexOf("/") + 1));
//		System.out.println(test.substring(0, 0));

		//file to json string
//		String jsonString = ReadFileToJsonString.getJsonStringByFilePath("D:/examCode.txt");
//		System.out.println(jsonString);
//		List<String> listFormJSON = JSON.parseArray(jsonString, String.class);
//		System.out.println(listFormJSON);
//		System.out.println(listFormJSON.contains("g5dw7sun"));

		// test final and static
//		final StringBuffer testFinal = new StringBuffer("final");
//		System.out.println(testFinal);
//		System.out.println(testStatic);
//		System.out.println(testStaticFinal);
//		testFinal.append("1");
//		testStatic.append("1");
//		testStaticFinal.append("1");
//		StringBuffer test = new StringBuffer("sadfas");
//		testStatic = test;
//		System.out.println(testFinal);
//		System.out.println(testStatic);
//		System.out.println(testStaticFinal);

		//Mock ArrayList
//		List<String> test = new ArrayList<>(Arrays.asList());
//		for (String item : test) {
//			System.out.println(item);
//		}
//		List<Integer> test2 = new ArrayList<>(asList(1, 2));
//		Collections.unmodifiableList(Arrays.asList("1", "2"));

//		List<Integer> testCollUtilsList = new ArrayList<>(asList(1, 2, 3, 4, 5, 6, 7, 8));
//		CollectionUtils.filter(testCollUtilsList, new Predicate<Integer>() {
//
//			@Override
//			public boolean evaluate(Integer arg0) {
//				return arg0 % 2 == 0 ? true : false;
//			}
//
//		});
//		System.out.println(testCollUtilsList);
//
//		Integer integer = 3;
//		integer.intValue();
//		Locale locale = Locale.getDefault();

//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.DAY_OF_MONTH, 1);
//		calendar.set(Calendar.HOUR_OF_DAY, 0);
//		calendar.set(Calendar.MINUTE, 0);
//		calendar.set(Calendar.SECOND, 0);
//		calendar.set(Calendar.MILLISECOND, 0);
//		Date date = calendar.getTime();
//		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		System.out.println(date);
//		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println(calendar.get(Calendar.HOUR));
//		System.out.println(df.format(date));

		//System.out.println(getWeekFirstDay(new Date()));
//	    Object[] arr;
//	    final Object[] arrFinal = {2, 2};
//	    arr = arrFinal;
//	    arr[0] = arr[1] = 1;
//	    System.out.println();
//	    List<Long> te = new ArrayList<>();
//	    te.add(1L);
//	    Long a = 1L;
//	    System.out.println(te.indexOf(a));

		//StringBuilder
//		StringBuilder sb = new StringBuilder("123456");
//		sb.deleteCharAt(sb.length() - 2);
//		System.out.println(sb.toString());

	    //Set
//	    Set<String> strSet = new HashSet<>();
//	    strSet.add("a");
//        strSet.add("b");
//        strSet.add("a");
//	    System.out.println(strSet.size());

	    //AtomicInteger
//	    AtomicInteger test = new AtomicInteger();
//	    System.out.println(test.addAndGet(2));
//        System.out.println(test.addAndGet(2));
//        System.out.println(test.accumulateAndGet(3, new IntBinaryOperator() {
//            @Override
//            public int applyAsInt(int left, int right) {
//                return left * right;
//            }
//        }));

//	    //Input on cmd
//	    Scanner scanner = new Scanner(System.in);
//	    int length = 0;
//	    if (scanner.hasNextInt()) {
//	        length = scanner.nextInt();
//	    }
//	    int [] array = new int[length];
//	    for (int i = 0; i < length; i++) {
//	        if (scanner.hasNextInt()) {
//	            array[i] = scanner.nextInt();
//	        }
//	    }
//	    scanner.close();
//	    System.out.println(array);
//	    float f = 1.0f / 0.0f;
//	    System.out.println(Float.isNaN(f));
//	    //String split
//	    String url = "C:/Users/liyizheng/Desktop/Fryer (Grade 9)/题目/2003/1.png";
//	    String [] urlList = url.split("/");
//        String [] nameList = "1.png".split("\\.");
//	    System.out.println(urlList);

	    //test num ++
//	    TestNumADD.printCount();
//	    List<TestNumADD> testNum = new ArrayList<>(10);
//        TestNumADD.printCount();
//        new TestNumADD();
//        TestNumADD.printCount();
//        new TestNumADD();
//        TestNumADD.printCount();


	}
	@SuppressWarnings("unchecked")
    public static <T> List<T> asList(T... a) {
        return new MockArrays<>(a);
    }

	public static void m1(String s, String... ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
	// get first day of month basic on input date
    public static Date getMonthFirstDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(reservedDay(date));
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        return date;
    }

    //get Sunday of week basic on input date
    public static Date getWeekFirstDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(reservedDay(date));
        calendar.add(Calendar.DAY_OF_YEAR, -1 * calendar.get(Calendar.DAY_OF_WEEK) + 2);
        date = calendar.getTime();
        return date;
    }

    //set hour, minute, second, millisecond is 0
    public static Date reservedDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        date = calendar.getTime();
        return date;
    }
//	static StringBuffer testStatic = new StringBuffer("testStatic");
//	final static StringBuffer testStaticFinal = new StringBuffer("staticFinal");
}
