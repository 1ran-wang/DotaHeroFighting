
public class Stat {
	private double inte;
	private double str;
	private double agi;
	private String mStat;
	private StatGrowth statGrowth;
	
	static final String STR = "STR";
	static final String AGI = "AGI";
	static final String INT = "INT";
	
	public Stat(double inte, double str, double agi, String mStat,StatGrowth sg){
		this.inte = inte;
		this.str = str;
		this.agi = agi;
		this.mStat = mStat;
		this.statGrowth = sg;
	}

	@Override
	public String toString() {
		return "Stat [inte=" + inte + ", str=" + str + ", agi=" + agi + ", mStat=" + mStat + ", statGrowth="
				+ statGrowth + "]";
	}

}
