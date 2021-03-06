package util;



import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class RandomUtil {
	public static int numberRandomicoInt(int qIncial, int qfinal) {
		int number = nextInt(qIncial, qfinal);
		return number;
	}

	
	public static int number3() {
		int number = nextInt(0, 4);
		int[] num = new int[] {1000, 1200, 1500, 1800, 2000};
		num.toString();
		return num[number];
	}
	public static double number4() {
		int number = nextInt(0, 4);
		double[] num = new double[] {1.0, 1.2, 1.5, 1.8, 2.0};
		num.toString();
		return num[number];
	}
	public static String fabricacao() {
		Date hoje = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, - numberRandomicoInt(1, 5));
		cal.add(Calendar.MONTH, - numberRandomicoInt(1, 12));
		
		hoje = cal.getTime();
		return sdf.format(hoje);
	}
	public static int assentos() {
		int number = nextInt(2, 10);
		return number;
	}
	public static double price() {
		int number = nextInt(0, 4);
		double[] num = new double[] {41000, 100000, 90000, 18000, 20000};
		num.toString();
		return num[number];
	}
	public static String placa() {
	  
	  int num = nextInt(1000, 9999);
	  String placa = randomAlphabetic(3)+num;
	  return placa;
	}
	public static String birthDate() {
		Date hoje = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, - numberRandomicoInt(18, 50));
		cal.add(Calendar.MONTH, - numberRandomicoInt(1, 12));
		
		hoje = cal.getTime();
		return sdf.format(hoje);
	
}

	public static String startDate() {
		Date hoje = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, + 1);
		cal.add(Calendar.MONTH, + 1);
		
		hoje = cal.getTime();
		return sdf.format(hoje);
	
}
}
