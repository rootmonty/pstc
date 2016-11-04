import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class ParsingUrl extends LoCoCiParser {

	public ParsingUrl(){

	}

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the URL to parse??");
		String uri = input.nextLine();
		URL url = new URL(uri);	
		String path = url.getPath();

		LoCoCiParser scraper = new LoCoCiParser();

		//returns a hashed object
		//scrapingpath should return a hashed object 

		HashMap<String,String> map = new HashMap<String,String>();

		map = scraper.scraping_path(path);

		System.out.println(map);
	}

}
