package game;

public class Aircraft extends Ship{
private int hit;
public Aircraft(String a,int b) {
	super(a,b);
}
public int hita() {
	hit++;
	return hit;
}
public boolean remain_air() {
	return hit==5;
}
}
