
public class StatGrowth {
	double inteP;
	double strP;
	double agiP;
	
	public StatGrowth(double inte, double str, double agi){
		this.inteP = inte;
		this.strP = str;
		this.agiP = agi;
	}

	@Override
	public String toString() {
		return "StatGrowth [inteP=" + inteP + ", strP=" + strP + ", agiP=" + agiP + "]";
	}
}
