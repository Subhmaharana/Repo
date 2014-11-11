package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShowCity {
	HashMap<String, ArrayList<String>> country = new HashMap<String, ArrayList<String>>();

	public ShowCity() {
		ArrayList<String> indiaCity = new ArrayList<String>();
		indiaCity.add("Hyderabad");
		indiaCity.add("Kolkata");
		indiaCity.add("Bangalore");
		indiaCity.add("Pune");
		country.put("India", indiaCity);
		ArrayList<String> UsaCity = new ArrayList<String>();
		UsaCity.add("LosAngeles");
		UsaCity.add("LosVegas");
		UsaCity.add("SanFransisco");
		UsaCity.add("NewYork");
		country.put("USA", UsaCity);
		ArrayList<String> AustraliaCity = new ArrayList<String>();
		AustraliaCity.add("Melbourne");
		AustraliaCity.add("Brisbane");
		AustraliaCity.add("Canberra");
		AustraliaCity.add("Sydney");
		country.put("Australia", AustraliaCity);
	}

	public ArrayList<String> getCities(String nation) {
		Set set = country.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry<String, ArrayList<String>> entry = (Map.Entry<String, ArrayList<String>>) i
					.next();
			if (entry.getKey().equalsIgnoreCase(nation))
				return entry.getValue();

		}
		return null;
	}

	public static void main(String[] args) {
		ShowCity c = new ShowCity();
		// System.out.println(c.getCities("usa"));
	}

}
