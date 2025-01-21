package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void searchFruits(String[] selectFruits) {
	    
		HashMap<String, String> fruitMap = new HashMap<String, String>();
	
	    fruitMap.put("apple", "りんご");
	    fruitMap.put("peach", "桃");
	    fruitMap.put("banana", "バナナ");
	    fruitMap.put("lemon", "レモン");
	    fruitMap.put("pear", "梨");
	    fruitMap.put("kiwi", "キウィ");
	    fruitMap.put("strawberry", "いちご");
	    fruitMap.put("grape", "ぶどう");
	    fruitMap.put("muscat", "マスカット");
	    fruitMap.put("cherry", "さくらんぼ");
	    
	    for(String selectFruit : selectFruits) {
	    	if(fruitMap.containsKey(selectFruit)) {
	    		System.out.println(selectFruit + "の意味は" + fruitMap.get(selectFruit));
	    	} else {
				System.out.println(selectFruit + "は辞書に存在しません");
			}
	    }
    
	}
}
