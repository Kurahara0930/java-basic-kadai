package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

	public KatoTaro_Chapter18() {
		super("加藤", "東京都中野区〇×");
		setGivenName();
	}
	
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
