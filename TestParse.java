import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class TestParse extends UrlParserClass {

	UrlParserClass testobject = new UrlParserClass();
	
	@Test
	public void check_scrapingpath(){
		String url = "/category-eye-surgeries-in-andheri-west-mumbai/ci-3-3-1";
		HashMap<String,String> map = new HashMap<String,String>();
		map = testobject.scraping_path(url);
		
		assertEquals("3",map.get("City_Id"));
		assertEquals("3",map.get("Surgery_Id"));
			
	}
	
	@Test
	public void check_followco(){
		String url = "/category-eye-surgeries-in-andheri-west-mumbai/co-3-3";
		HashMap<String,String> map = new HashMap<String,String>();
		map = testobject.scraping_path(url);
		
		assertEquals("3",map.get("Country_Id"));
		assertEquals("3",map.get("Surgery_Id"));
			
	}
	

	@Test
	public void followci(){
		String url = "/category-eye-surgeries-in-andheri-west-mumbai/ci-3-3-1";
		HashMap<String,String> map = new HashMap<String,String>();
		map = testobject.scraping_path(url);
		
		assertEquals("3",map.get("City_Id"));
		assertEquals("3",map.get("Surgery_Id"));		
	}
	
	
	

}
