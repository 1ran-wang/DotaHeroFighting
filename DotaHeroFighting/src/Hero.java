
public class Hero {
	private HeroModel hm;
	private Stat s;
	private StatGrowth sg;
	
	public Hero(HeroModel hm, Stat s, StatGrowth sg){
		this.hm = hm;
		this.s = s;
		this.sg = sg;	
	}

	@Override
	public String toString() {
		return "Hero [hm=" + hm + ", s=" + s + ", sg=" + sg + "]";
	}
	
	
	
	
	
}
