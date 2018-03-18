import javax.swing.JOptionPane;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEyes() {
		return this.eyes;
	}
	public void getEyes(int eyes) {
		this.eyes = eyes;
	}
	public String getColor() {
		return this.color;
	}
	public void getColor(String color) {
		this.color=color;
	}
	public String getMaster() {
		return this.master;
	}
	public void getMaster(String master) {
		this.master=master;
	}
	public void setMaster(String master) {
		this.master=master;
	}
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

}
