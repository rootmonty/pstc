package UrlParser;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParseURL extends UrlParser_pstc {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Url to parse");
		String uri = input.nextLine();
		URL url = new URL(uri);
		String path = url.getPath();
		HashMap<String, String> map = new HashMap<String, String>();
		map = gettype(path);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "	" + m.getValue());
		}
	}
}
