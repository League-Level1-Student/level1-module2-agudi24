import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isMan;
	private boolean isKnighted;
	 
	
	public String getName() {
		return this.name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public boolean getisWoman() {
		return this.isWoman;
	}
	
	public void getisWoman(boolean isWoman) {
		this.isWoman = isWoman;
	}
	
	public boolean getisMan() {
		return this.isMan;
	}
	
	public void getisMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	public boolean getisKnighted() {
		return this.isKnighted;
	}
	
	public void getisKnighted(boolean isKnighted) {
		this.isKnighted = isKnighted;
	}
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted) {
		if (isWoman) {
				return "Hello Ms." + name;
				
			}
			else  {
				System.out.println("Sir" + name);
				return "Hello Sir" + name;
			}
		}
		else {
			return "Hello" + name;
		}
		
    }
	
}
