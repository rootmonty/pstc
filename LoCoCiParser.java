
import java.net.*;
import java.io.*;
import java.util.*;

/**
 * The Class LoCoCiParser takes a URL path as an input and parses it to give results for locality id,city id and country id
 * Dependency on the type of URL
 * Four methods work in the class
 * first is the scrapingpath method which splits the path in different tokens of string
 * On the dependency of the length of Splitted Array we call three methods
 * city_type, local_type, country_type 
 * city_type :: returns the cityid and surgery id
 * country_type :: returns the countryid and surgeryid
 * local_type :: returns the locality id,city id and surgery id
 * 
 * 
 * @author monty
 * @version 1
 * 
 */
class LoCoCiParser{

 //List<String> output ;

	/* Default constructor */
	public LoCoCiParser(){	
	}
	
 public HashMap<String,String> scraping_path(String path){
	 

 String[] distinct = path.split("/");
 /** 
  * string split
  * check for the string component of the last indicating pattern
  * if co: country
  * if ci : city
  * else lo:locality
  * each come with different ids
  * Country : country_id, surgery id
  * City : city_id,surgery_id
  * Locality : locality_id,city _id, surgery_id
  */

 String com = distinct[distinct.length -1];
 String[] component = com.split("-");
  if(component[0].equals("co")){
	   return country_type(component);
	   }
  
 else if(component[0].equals("ci")){
	 
    return city_type(component);
 }
  
  else if(component[0].equals("lo")){
	   
    return local_type(component);
  }
  else
   return null;

}
 
//****************Method for Country********************
 public HashMap<String,String> country_type(String[] component){
   String country_id = component[1];
   String surgery_id = component[2];
 
   /* co_su is the map containing the country and surgery ids */
   HashMap<String,String> co_su = new HashMap<String,String>();
   co_su.put("Country_Id", country_id);
   co_su.put("Surgery_Id", surgery_id);
   
   return co_su;
}

//****************Method for City***********************
public HashMap<String,String> city_type(String[] component){
   String city_id = component[1];
   String surgery_id = component[2];
 
 /* ci_su is the map containing the city and surgery ids */
   HashMap<String,String> ci_su = new HashMap<String,String>();
   ci_su.put("City_Id",city_id);
   ci_su.put("Surgery_Id", surgery_id);
   
   return ci_su;
   
}

//*****************Method for locality******************
public HashMap<String,String> local_type(String[] component){
   String locality_id= component[1];
   String city_id = component[2];
   String country_id = component[component.length -1];
 
 /*lococi is the map containing the locality, city, country ids */
   HashMap<String,String> lococi = new HashMap<String,String>();
   lococi.put("Locality_Id",locality_id);
   lococi.put("City_Id", city_id);
   lococi.put("Country_Id", country_id);
   
   return lococi;
   
}

}

