package game;

public class Cruiser extends Ship{
	private int count_beinghit;
	public Cruiser(String t,int a) {
		super(t,a);
		count_beinghit=100;
	}
	public int hitc() {
		count_beinghit++;
		return count_beinghit;
	}
	public boolean remain_cru() {
		return count_beinghit==3;
	}
	
}
