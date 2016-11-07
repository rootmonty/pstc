import java.util.HashMap;

public class Parsing_Segment {


		/**
		 * The following function calculates the city id and surgery id for a specific kind of URL that contains 3 directories .
		 * @param path
		 * @return HashMap<String,String>
		 */

		public static HashMap<String,String> dir_three(String path){

			String[] city = path.split("/");
			String city_detail = city[2];
			String[] city_split = city_detail.split("-");
			String city_id = city_split[1];
			String surgery_id = city_split[2];
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("City_Id", city_id);
			map.put("Surgery_Id", surgery_id);
			return map;

		}

		/**
		 * The following function calculates the city id and surgery id for a specific kind of URL which contains 4 directories
		 * @param path
		 * @return HashMap<String,String>
		 */
		public static HashMap<String,String> dir_four(String path){

			String[] city = path.split("/");
			String city_detail = city[2];
			String surgery_detail = city[3];
			String[] city_split = city_detail.split("-");
			String city_id = city_split[1];
			String[] surgery_split = surgery_detail.split("-");
			String surgery_id = surgery_split[surgery_split.length-1];
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("City_Id", city_id);
			map.put("Surgery_Id", surgery_id);
			return map;

		}

		/**
		 * the following function calculates the city id, curgery id and locality id at the same time for URL that contains 5 directories
		 * @param path
		 * @return HashMap<String,String>
		 */

		public static HashMap<String,String> dir_five(String path){

			String[] city = path.split("/");
			String city_detail = city[2];
			String locality_detail = city[3];
			String surgery_detail = city[4];
			String[] city_split = city_detail.split("-");
			String city_id = city_split[1];
			String[] surgery_split = surgery_detail.split("-");
			String surgery_id = surgery_split[surgery_split.length-1];
			String[] locality_split = locality_detail.split("-");
			String locality_id = locality_split[locality_split.length -1];
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("City_Id", city_id);
			map.put("Surgery_Id", surgery_id);
			map.put("Locality_Id", locality_id);
			return map;

		}

		/**
		 * The following method calls the three respective methods for 
		 * @param uri
		 * @return HashMap<String,String>
		 * 
		 */
		
		public static HashMap<String,String> gettype(String uri){

			HashMap<String,String> map = new HashMap<String,String>();
			String[] type = uri.split("/");
			switch(type.length){
			case 0:break;
			case 1:break;
			case 2: break;
			case 3:
				map = dir_three(uri);
				break;
			case 4: 
				map = dir_four(uri);
				break;
			case 5:
				map = dir_five(uri);
				break;
			default:
			}
			return map;
		}

	}

