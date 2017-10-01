
public class Damage {
	private double damageValue;
	private String type;
	
	static final String MAGIC ="MAGIC";
	static final String PHYSICAL = "PHYSICAL";
	static final String PURE = "PURE";
	
	public Damage(double v, String type){
		this.damageValue = v;
		this.type = type;
	}
}
