package utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	@DataProvider( indices = {2,0}, parallel = true)
	public String[][] getData( ) {
		String data[][] = new String[3][2];
		data[0][0] = "koushik350@gmail.com";
		data[0][1] ="Pass123$";
		data[1][0] ="koushik1@letcode.in";
		data[1][1] = "Pass123$";
		data[2][0]= "kkkkkk";
		data[2][1] ="lllll";
		return data;
	}
}
