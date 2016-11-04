package UrlParser;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class OldUrlTest extends UrlParser_pstc {

	@Test
	public void test_dir_four() {
		String url = "/surgery/mumbai-1/total-abdominal-hysterectomy-tah-1457";
		HashMap<String,String> map = new HashMap<String,String>();
		map = gettype(url);
		assertEquals("1",map.get("City_Id"));
		assertEquals("1457",map.get("Surgery_Id"));
	}
	
	@Test
	public void test_dir_three(){
		String url = "/surgery-total-knee-replacement-(tkr)-in-india/1451-1";
		HashMap<String,String> map = new HashMap<String,String>();
		map = gettype(url);
		assertEquals("1",map.get("City_Id"));
		assertEquals("1451",map.get("Surgery_Id"));
	}
	
	@Test
	public void test_dir_five(){
		String url = "/surgery/bangalore-3/koramangala-148/cataract-extraction-799";
		HashMap<String,String> map = new HashMap<String,String>();
		map = gettype(url);
		assertEquals("3",map.get("City_Id"));
		assertEquals("799",map.get("Surgery_Id"));
		assertEquals("148",map.get("Locality_Id"));
	}

}
