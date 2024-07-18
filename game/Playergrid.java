package game;

public class Playergrid {
private Ship[][] map;
public static void main(String[] args) {
Computer c1 = new Computer();
c1.setcru1();
c1.setdes1();
c1.setair();
c1.print2();
Player p1 = new Player();
p1.setcru1();
p1.setdes1();
p1.setair();
p1.getcomputer();

c1.getplayer();
int i=0;
while(c1.sink2()==false) {
	c1.activeattack();
	i++;
	System.out.println(i);
}
System.out.println(i);
}


}