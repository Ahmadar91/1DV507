package aa224fn_assign3;

public class NorseGods {

	String name;
	String race;
	String desc;
	
	public NorseGods() {
	
	}
	
	public NorseGods(String name,String race,String desc) {
		this.name= name;
		this.race=race;
		this.desc= desc;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public void setName(String name) {
		 this.name=name;
	}
	
	public String getRace() {
		return this.race;
		
	}
	
	public void setRace(String race) {
		 this.race=race;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setDesc(String desc) {
		 this.desc=desc;
	}
	
	
}
