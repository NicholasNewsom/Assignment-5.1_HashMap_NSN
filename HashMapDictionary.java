

import java.util.HashMap;

public class HashMapDictionary {
	
	public static void main(String[] args) {
		HashMap<String, String> archaicWords = new HashMap<String, String>();
		/**
		 * (word, definition)
		 */
		archaicWords.put("Cockalorum", "A braggart, a person with an overly high opinion of himself.");
		archaicWords.put("Fudgel", " Pretending to work when you’re really just goofing off.");
		archaicWords.put("Grog-Blossom", "The rosy red hue of an alcoholic’s nose.");
		archaicWords.put("Tittynope", "“a small quantity of something left over.”");
		archaicWords.put("Freck", "To move swiftly or nimbly");
		archaicWords.put("Sanguinolency", "Addiction to bloodshed");
		archaicWords.put("Jollux", "A word used to describe a fat person");
		archaicWords.put("Ludibrious", "“Apt to be a subject of jest or mockery”");
		archaicWords.put("Kench", "To laugh loudly");
		archaicWords.put("Jargogle", "To confuse, jumble");
		
		/**
		 * iterates through the hashmap and prints the key and its definition
		 */
    	for (String i : archaicWords.keySet())
    	{
    		System.out.println("Word: " + i + ", definition: " + archaicWords.get(i));
    	}
    	
    	System.out.println("\n\n");
    	
    	/**
    	 * printing specific values
    	 * saying its key name, using get(key) to find the value, and using get(key).hashCode() to find its hashCode value
    	 */
    	System.out.println("Key: Fudgel" + ", Value: " + archaicWords.get("Fudgel") + ", HashCode: "+ archaicWords.get("Fudgel").hashCode());
    	System.out.println("Key: Jargogle" + ", Value: " + archaicWords.get("Jargogle") + ", HashCode: "+ archaicWords.get("Jargogle").hashCode());
    	System.out.println("Key: Freck" + ", Value: " + archaicWords.get("Freck") + ", HashCode: "+ archaicWords.get("Freck").hashCode());
    	System.out.println("Key: TittyNope" + ", Value: " + archaicWords.get("Tittynope") + ", HashCode: "+ archaicWords.get("Tittynope").hashCode());
    	System.out.println("Key: Kench" + ", Value: " + archaicWords.get("Kench") + ", HashCode: "+ archaicWords.get("Kench").hashCode());
    	
  }
}