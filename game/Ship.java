package game;

public class Ship {
private String type;
private int times;
public Ship(String t,int a) {
	type = t;
	times=a;
}
public String getship() {
	return type;
}
public int hit() {
	times--;
	return times;
}
public int checkremain() {
	return times;
}
public void add() {
	times++;
}
}
