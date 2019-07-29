package _06_minion;

import java.awt.Color;

public class Minion {
	
	private String MinionN;
	private int MinionE;
	private String MinionM;
	private String MinionC;





	public Minion(String MinionName, int MinionEyeCount, String MinionColor, String MinionMaster) {
		// TODO Auto-generated constructor stub
		MinionN = MinionName;
		MinionE = MinionEyeCount;
		MinionM = MinionMaster;
		MinionC = MinionColor;
	}


	public Object getMaster() {
		// TODO Auto-generated method stub
		return MinionM;
	}


	public void setMaster(String string) {
		// TODO Auto-generated method stub
		MinionM = string;
	}


	public Object getEyes() {
		// TODO Auto-generated method stub
		return MinionE;
	}


	public Object getName() {
		// TODO Auto-generated method stub
		return MinionN;
	}


	public Object getColor() {
		// TODO Auto-generated method stub
		return MinionC;
	}
}
