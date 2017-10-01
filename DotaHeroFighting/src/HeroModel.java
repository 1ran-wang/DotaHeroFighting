
public class HeroModel {
	private String name;
	private int atk;
	private double def;
	private double atkInterval;
	private double magicRes;
	
	public HeroModel(String name, int atk, double def, double atkInterval, double magicRes){
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.atkInterval = atkInterval;
		this.magicRes = magicRes;
	}

	@Override
	public String toString() {
		return "HeroModel [name=" + name + ", atk=" + atk + ", def=" + def + ", atkInterval=" + atkInterval
				+ ", magicRes=" + magicRes + "]";
	}
}
