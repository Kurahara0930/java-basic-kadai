package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice;
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		myChoice = scanner.nextLine();
		
		while(!(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p"))) {
				System.out.println("入力が間違っています。もう一度入力してください。");
				myChoice = scanner.nextLine();
		}
		
		return myChoice;
		
	}
	
	public String getRandom() {
		String[] enemyChoice = {"r", "s", "p"};
		int random = (int)(Math.floor(Math.random() * 3));
		return enemyChoice[random];
	}
	
	public void playGame(String myChoice, String enemyChoice) {
		HashMap<String, String> handMap = new HashMap<String, String>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(myChoice) + "," + "対戦相手の手は" + handMap.get(enemyChoice));
		
		if (myChoice.equals(enemyChoice)) {
			System.out.println("あいこです");
		} else if (
				(myChoice.equals("r") && enemyChoice.equals("s")) ||
				(myChoice.equals("s") && enemyChoice.equals("p")) ||
				(myChoice.equals("p") && enemyChoice.equals("r"))
			) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
