package game;
import java.util.*;
public class Computer {
	private static String[][] m;
	private boolean check[][];
	private static Ship[][] computer;
	private static Ship[][] player;
	private static String[][] playerf;
	private String[][] player_look;
	private Ship cru1;
	private Ship des1;
	private Ship air;
	int row1,col1,row1s,col1s;;//one pair
	int row2,col2,row2s,col2s;//second pair
	int row3,col3,row3s,col3s;//third pair
	int row4,col4,row4s,col4s;//four pair
	private ArrayList<String> direction;
	private boolean f1,f2,f3,f4;
	public Computer() {
		f1=false;f2=false;f3=false;f4=false;
		check = new boolean[10][10];
		computer = new Ship[10][10];
		row1=-1;col1=-1;row2=-1;col2=-1;row3=-1;col3=-1;row4=-1;col4=-1;row1s=-1;col1s=-1;row2s=-2;col2s=-1;row3s=-1;col3s=-1;row4s=-1;col4=-1;
		player_look=new String[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				player_look[i][j]="unhit";
			}
		}
		direction = new ArrayList<String>();
		direction.add("left");direction.add("up");direction.add("right");direction.add("down");
		playerf=new String[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				playerf[i][j]="a";
			}
		}
	}
	public void getplayer() {
		player = Player.pass();
	}
	public void setcru1() {
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		int direction = (int)(4*Math.random());
		if(direction==0) {
			if(col-2>=0) {
				Cruiser c1 = new Cruiser("cruiser1_c",3);
				cru1=c1;
				computer[row][col]=c1;
				computer[row][col-1]=c1;
				computer[row][col-2]=c1;
			} else {
				setcru1();
			}
		}
		if(direction==1) {
			if(row-2>=0) {
				Cruiser c1 = new Cruiser("cruiser1_c",3);
				cru1=c1;
				computer[row][col]=c1;
				computer[row-1][col]=c1;
				computer[row-2][col]=c1;
			} else {
				setcru1();
			}
		}
		if(direction==2) {
			if(col+2<=9) {
				Cruiser c1 = new Cruiser("cruiser1_c",3);
				cru1=c1;
				computer[row][col]=c1;
				computer[row][col+1]=c1;
				computer[row][col+2]=c1;
			} else {
				setcru1();
			}
		}
		if(direction==3) {
			if(row+2<=9) {
				Cruiser c1 = new Cruiser("cruiser1_c",3);
				cru1=c1;
				computer[row][col]=c1;
				computer[row+1][col]=c1;
				computer[row+2][col]=c1;
			} else {
				setcru1();
			}
		}
	}
	public void setcru2() {
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		if(computer[row][col]!=null) {
			setcru2();
		}
		else {
			int direction = (int)(4*Math.random());
			if(direction==0) {
				if(col-2>=0 && computer[row][col-1]==null&&computer[row][col-2]==null) {
					Cruiser c2 = new Cruiser("cruiser2_c",3);
					computer[row][col]=c2;
					computer[row][col-1]=c2;
					computer[row][col-2]=c2;
				} else {
					setcru2();
				}
			}
			if(direction==1) {
				if(row-2>=0 && computer[row-1][col]==null&&computer[row-2][col]==null) {
					Cruiser c2 = new Cruiser("cruiser2_c",3);
					computer[row][col]=c2;
					computer[row-1][col]=c2;
					computer[row-2][col]=c2;
				} else {
					setcru2();
				}
			}
			if(direction==2) {
				if(col+2<=9 && computer[row][col+1]==null&&computer[row][col+2]==null) {
					Cruiser c2 = new Cruiser("cruiser2_c",3);
					computer[row][col]=c2;
					computer[row][col+1]=c2;
					computer[row][col+2]=c2;
				} else {
					setcru2();
				}
			}
			if(direction==3) {
				if(row+2<=9 && computer[row+1][col]==null&&computer[row+2][col]==null) {
					Cruiser c2 = new Cruiser("cruiser2_c",3);
					computer[row][col]=c2;
					computer[row+1][col]=c2;
					computer[row+2][col]=c2;
				} else {
					setcru2();
				}
			}
		}
	}
	public void setcru3() {
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		if(computer[row][col]!=null) {
			setcru3();
		}
		else {
			int direction = (int)(4*Math.random());
			if(direction==0) {
				if(col-2>=0 && computer[row][col-1]==null&&computer[row][col-2]==null) {
					Cruiser c3 = new Cruiser("cruiser3_c",3);
					computer[row][col]=c3;
					computer[row][col-1]=c3;
					computer[row][col-2]=c3;
				} else {
					setcru3();
				}
			}
			if(direction==1) {
				if(row-2>=0 && computer[row-1][col]==null&&computer[row-2][col]==null) {
					Cruiser c3 = new Cruiser("cruiser3_c",3);
					computer[row][col]=c3;
					computer[row-1][col]=c3;
					computer[row-2][col]=c3;
				} else {
					setcru3();
				}
			}
			if(direction==2) {
				if(col+2<=9 && computer[row][col+1]==null&&computer[row][col+2]==null) {
					Cruiser c3 = new Cruiser("cruiser3_c",3);
					computer[row][col]=c3;
					computer[row][col+1]=c3;
					computer[row][col+2]=c3;
				} else {
					setcru3();
				}
			}
			if(direction==3) {
				if(row+2<=9 && computer[row+1][col]==null&&computer[row+2][col]==null) {
					Cruiser c3 = new Cruiser("cruiser3_c",3);
					computer[row][col]=c3;
					computer[row+1][col]=c3;
					computer[row+2][col]=c3;
				} else {
					setcru3();
				}
			}
		}
	}
	public void setdes1() {
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		if(computer[row][col]!=null) {
			setdes1();
		}
		else {
			int direction = (int)(4*Math.random())+1;
			if(direction==1) {
				if(col-3>=0  && computer[row][col-1]==null&&computer[row][col-2]==null&&computer[row][col-3]==null) {
					Destroyer d1 = new Destroyer("destroyer1_c",4);
					des1=d1;
					computer[row][col]=d1;
					computer[row][col-1]=d1;
					computer[row][col-2]=d1;
					computer[row][col-3]=d1;
				} else {
					setdes1();
				}
			}
			if(direction==2) {
				if(row-3>=0 && computer[row-1][col]==null&&computer[row-2][col]==null&&computer[row-3][col]==null) {
					Destroyer d1 = new Destroyer("destroyer1_c",4);
					des1=d1;
					computer[row][col]=d1;
					computer[row-1][col]=d1;
					computer[row-2][col]=d1;
					computer[row-3][col]=d1;
				} else {
					setdes1();
				}
			}
			if(direction==3) {
				if(col+3<=9 && computer[row][col+1]==null&&computer[row][col+2]==null&&computer[row][col+3]==null) {
					Destroyer d1 = new Destroyer("destroyer1_c",4);
					des1=d1;
					computer[row][col]=d1;
					computer[row][col+1]=d1;
					computer[row][col+2]=d1;
					computer[row][col+3]=d1;
				} else {
					setdes1();
				}
			}
			if(direction==4) {
				if(row+3<=9 && computer[row+1][col]==null&&computer[row+2][col]==null&&computer[row+3][col]==null) {
					Destroyer d1 = new Destroyer("destroyer1_c",4);
					des1=d1;
					computer[row][col]=d1;
					computer[row+1][col]=d1;
					computer[row+2][col]=d1;
					computer[row+3][col]=d1;
				} else {
					setdes1();
				}
			}
		}
	}
	public void setdes2() {
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		if(computer[row][col]!=null) {
			setdes2();
		}
		else {
			int direction = (int)(4*Math.random())+1;
			if(direction==1) {
				if(col-3>=0  && computer[row][col-1]==null&&computer[row][col-2]==null&&computer[row][col-3]==null) {
					Destroyer d2 = new Destroyer("destroyer2_c",4);
					computer[row][col]=d2;
					computer[row][col-1]=d2;
					computer[row][col-2]=d2;
					computer[row][col-3]=d2;
				} else {
					setdes2();
				}
			}
			if(direction==2) {
				if(row-3>=0 && computer[row-1][col]==null&&computer[row-2][col]==null&&computer[row-3][col]==null) {
					Destroyer d2 = new Destroyer("destroyer2_c",4);
					computer[row][col]=d2;
					computer[row-1][col]=d2;
					computer[row-2][col]=d2;
					computer[row-3][col]=d2;
				} else {
					setdes2();
				}
			}
			if(direction==3) {
				if(col+3<=9 && computer[row][col+1]==null&&computer[row][col+2]==null&&computer[row][col+3]==null) {
					Destroyer d2 = new Destroyer("destroyer2_c",4);
					computer[row][col]=d2;
					computer[row][col+1]=d2;
					computer[row][col+2]=d2;
					computer[row][col+3]=d2;
				} else {
					setdes2();
				}
			}
			if(direction==4) {
				if(row+3<=9 && computer[row+1][col]==null&&computer[row+2][col]==null&&computer[row+3][col]==null) {
					Destroyer d2 = new Destroyer("destroyer2_c",4);
					computer[row][col]=d2;
					computer[row+1][col]=d2;
					computer[row+2][col]=d2;
					computer[row+3][col]=d2;
				} else {
					setdes2();
				}
			}
		}
	}
	public void setair() {
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		if(computer[row][col]!=null) {
			setair();
		}
		else {
			int direction = (int)(4*Math.random())+1;
			if(direction==1) {
				if(col-4>=0 && computer[row][col-1]==null&&computer[row][col-2]==null&&computer[row][col-3]==null&&computer[row][col-4]==null) {
					Aircraft a = new Aircraft("aircraft_c",5);
					air=a;
					computer[row][col] = a;
					computer[row][col-1]=a;
					computer[row][col-2]=a;
					computer[row][col-3]=a;
					computer[row][col-4]=a;
				} else {
					setair();
				}
			}
			if(direction==2) {
				if(row-4>=0 && computer[row-1][col]==null&&computer[row-2][col]==null&&computer[row-3][col]==null&&computer[row-4][col]==null) {
					Aircraft a = new Aircraft("aircraft_c",5);
					air=a;
					computer[row][col]=a;
					computer[row-1][col]=a;
					computer[row-2][col]=a;
					computer[row-3][col]=a;
					computer[row-4][col]=a;
				} else {
					setair();
				}
			}
			if(direction==3) {
				if(col+4<=9 && computer[row][col+1]==null&&computer[row][col+2]==null&&computer[row][col+3]==null&&computer[row][col+4]==null) {
					Aircraft a = new Aircraft("aircraft_c",5);
					air=a;
					computer[row][col]=a;
					computer[row][col+1]=a;
					computer[row][col+2]=a;
					computer[row][col+3]=a;
					computer[row][col+4]=a;
				} else {
					setair();
				}
			}
			if(direction==4) {
				if(row+4<=9 && computer[row+1][col]==null&&computer[row+2][col]==null&&computer[row+3][col]==null&&computer[row+4][col]==null) {
					Aircraft a = new Aircraft("aircraft_c",5);
					air=a;
					computer[row][col]=a;
					computer[row+1][col]=a;
					computer[row+2][col]=a;
					computer[row+3][col]=a;
					computer[row+4][col]=a;
				} else {
					setair();
				}
			}
		}
	}
	public void print() {
		for(int i = 0; i < computer.length; i++) {
			for(int j = 0; j < computer[0].length; j++) {
				if(computer[i][j]!=null) {
					if(computer[i][j].getship()=="destroyer1_c" || computer[i][j].getship()=="destroyer2_c") {
						System.out.print(computer[i][j].getship()+" ");
					} else {
					System.out.print(computer[i][j].getship()+"   ");
					}
				} else {
					System.out.print("null" + "    ");
				}
			}
			System.out.println();
		}
	}
	public static Ship[][] pass(){
		return computer;
	}
	public boolean computersink() {
		boolean flag_cru1=false;
		boolean flag_cru2=false;
		boolean flag_cru3=false;
		boolean flag_des1=false;
		boolean flag_des2=false;
		boolean flag_air=false;
		for(int i = 0; i < computer.length; i++) {
			for(int j = 0 ; j < computer[0].length; j++) {
				if(computer[i][j]!=null) {
					if(computer[i][j].getship().equals("cruiser1_c") && computer[i][j].checkremain()==0) {
						flag_cru1=true;
					}
					if(computer[i][j].getship().equals("cruiser2_c") && computer[i][j].checkremain()==0) {
						flag_cru2=true;
					}
					if(computer[i][j].getship().equals("cruiser3_c") && computer[i][j].checkremain()==0) {
						flag_cru3=true;
					}
					if(computer[i][j].getship().equals("destroyer1_c")&&computer[i][j].checkremain()==0) {
						flag_des1=true;
					}
					if(computer[i][j].getship().equals("destroyer2_c")&&computer[i][j].checkremain()==0) {
						flag_des2=true;
					}
					if(computer[i][j].getship().equals("aircraft_c")&&computer[i][j].checkremain()==0) {
						flag_air=true;
					}
				}
			}
		}
		return flag_cru1==true&&flag_cru2==true&&flag_cru3==true&&flag_des1==true&&flag_des2==true&&flag_air==true;
	}

	public void activeattack() {
		if(direction.size()>0) {
		if(row1!=-1) {
			if(player[row1][col1]!=null) {
			if(player[row1][col1].checkremain()==0) {
				row1=-1;col1=-1;row1s=-1;col1s=-1;
				reset();
				activeattack();
			}
			else {
				if(f1==false) {
				if(row1==0&&direction.size()>1) {
					direction.remove("up");
					if(col1==0)direction.remove("left");
					if(col1==9)direction.remove("right");
				} if(row1==9&&direction.size()>1) {
					direction.remove("down");
					if(col1==0)direction.remove("left");
					if(col1==9)direction.remove("right");
				} if(col1==0&&direction.size()>1) {
					direction.remove("left");
					if(row1==0)direction.remove("up");
					if(row1==9)direction.remove("down");
				} if(col1==9&&direction.size()>1) {
					direction.remove("right");
					if(row1==0)direction.remove("left");
					if(row1==9)direction.remove("down");
				}
				}
				String t =direction.get(0);
				if(t=="left") {
					if(col1-1>=0) {
					if(playerf[row1][col1-1]=="nullf") {
						direction.remove(0);
						col1=getstart(row1,col1,"right");
						f1=true;
						activeattack();
					}
					else if(col1==0&&player[row1][col1].checkremain()!=0) {
						direction.remove("left");
						col1=getstart(row1,col1,"right");
						f1=true;
						activeattack();
					}
					else {
						String get = attack(row1,col1-1);
						f1=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(!get.equals(player[row1][col1].getship())) {
								direction.remove(0);
								if(row2==-1) {row2=row1;col2=col1-1;row2s=row1;col2s=col1-1;}
								else if(row3==-1) {row3=row1;col3=col3-1;row3s=row1;col3s=col1-1;}
								else {row4=row1;col4=col1-1;row4s=row1;col4s=col1-1;}
							} else {
								row1=row1;
								col1=col1-1;
								direction.remove("up");direction.remove("down");
							}
						}
						
					}
					} else {
						if(player[row1][col1].checkremain()!=0) {
							col1=getstart(row1,col1,"right");
							setdtr();
							activeattack();
						} else {
							direction.remove("left");
							activeattack();
						}
					}
				} else if(t=="up") {
					if(row1-1>=0) {
					if(!playerf[row1-1][col1].equals("nullf")) {
						direction.remove(0);
						f1=true;
						activeattack();
					} else if(row1==0&&player[row1][col1].checkremain()!=0) {
						direction.remove("up");
						row1=getstart(row1,col1,"down");
						f1=true;
						activeattack();
					}
					else {
						String get=attack(row1-1,col1);
						f1=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(!get.equals(player[row1][col1].getship())) {
								direction.remove(0);
								if(row2==-1) {row2=row1-1;col2=col1;row2s=row2-1;col2s=col1;}
								else if(row3==-1) {row3=row1-1;col3=col1;row3s=row3-1;col3s=col1;}
								else {row4=row1-1;col4=col1;row4s=row1-1;col4s=col1;}
							} else {
								direction.remove("right");
								row1=row1-1;
								col1=col1;
							}
						}
					}
					} else {
						if(player[row1][col1].checkremain()!=0) {
							row1=getstart(row1,col1,"down");
							setdtd();
							activeattack();
						} else {
							direction.remove("up");
							activeattack();
						}
					}
				} else if(t=="right") {
					if(col1+1<=9) {
					if(playerf[row1][col1+1]=="nullf") {
						direction.remove(0);
						f1=true;
						activeattack();
					} else {
						String get=attack(row1,col1+1);
						f1=true;
						if(!get.equals("empty")) {
						if(!get.equals(player[row1][col1].getship())) {
							direction.remove(0);
							if(row2==-1) {row2=row1;col2=col1+1;row2s=row1;col2s=col1+1;}
							else if(row3==-1) {row3=row1;col3=col1+1;row3s=row1;col3s=col1+1;}
							else {row4=row1;col4=col1+1;row4s=row1;col4s=col1+1;}
						} else {
							direction.remove("down");
						}
						} else {
							direction.remove(0);
						}
					}
					} else {
						direction.remove("right");
						activeattack();
					}
				} else {//t==down
					attack(row1+1,col1);
					f1=true;
					if(player[row1][col1].checkremain()==0) {
						f1=false;;reset();col1=-1;row1=-1;row1s=-1;col1s=-1;
					} else {
						row1=row1+1;col1=col1;
					}
				}
			}
			//
			} else {
				row1=-1;col1=-1;f1=false;reset();
				activeattack();
			}
		}
		else if(row2!=-1) {
			if(player[row2][col2].checkremain()==0) {
				row2=-1;col2=-1;row2s=-1;col2s=-1;
				reset();
				activeattack();
			} else {
				if(f2==false) {
				if(row2==0&&direction.size()>1) {
					direction.remove("up");
					if(col2==0)direction.remove("left");
					if(col2==9)direction.remove("right");
				} if(row2==9&&direction.size()>1) {
					direction.remove("down");
					if(col2==0)direction.remove("left");
					if(col2==9)direction.remove("right");
				} if(col2==0&&direction.size()>1) {
					direction.remove("left");
					if(row2==0)direction.remove("up");
					if(row2==9)direction.remove("down");
				} if(col2==9&&direction.size()>1) {
					direction.remove("right");
					if(row2==0)direction.remove("left");
					if(row2==9)direction.remove("down");
				}
				}
				String t = direction.get(0);
				if(t.equals("left")) {
					if(col2-1>=0) {
					if(playerf[row2][col2-1]=="nullf") {
						direction.remove(0);
						f2=true;
						activeattack();
					} else if(col2==0&&player[row2][col2].checkremain()!=0) {
						direction.remove("left");
						col2=getstart(row2,col2,"right");
						f2=true;
						activeattack();
					}
					else {
						String get = attack(row2,col2-1);
						f2=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(!get.equals(player[row2][col2].getship())){
								direction.remove(0);
								if(row3==-1) {row3=row2;col3=col2-1;row3s=row2;col3s=col2-1;}
								else {row4=row2;col4=col2-1;}
							} else {
								row2=row2;col2=col2-1;
							}
						}
					}
					} else {
						if(player[row2][col2].checkremain()!=0) {
							col2=getstart(row2,col2,"right");
							setdtr();
							activeattack();
							
						} else {
							direction.remove("left");
							activeattack();
						}
					}
				} else if(t.equals("up")) {
					if(row2-1>=0) {
					if(playerf[row2-1][col2]=="nullf") {
						direction.remove(0);
						f2=true;
						activeattack();
					} else if(row2==0) {
						direction.remove("up");
						row2=getstart(row2,col2,"down");
						f2=true;
						activeattack();
					}
					else {
						String get = attack(row2-1,col2);
						f2=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(get.equals(player[row2][col2].getship())) {
								row2=row2-1;
							} else {
								direction.remove(0);
								if(row3==-1) {row3=row2-1;col3=col2;}
								else {row4=row2-1;col4=col2;}
							}
						}
					}
					} else {
						if(player[row2][col2].checkremain()!=0) {
							row2=getstart(row2,col2,"down");
							setdtd();
							activeattack();
						} else {
							direction.remove("up");
							activeattack();
						}
					}
				} else if(t.equals("right")) {
					if(col2+1<=9) {
					if(playerf[row2][col2+1].equals("nullf")) {
						direction.remove(0);
						f2=true;
						activeattack();
					} else {
						String get = attack(row2,col2+1);
						f2=true;
						if(!get.equals("empty")) {
							if(get.equals(player[row2][col2].getship())) {
								col2=col2+1;
							} else {
								direction.remove(0);
								if(row3==-1) {row3=row2;col3=col2+1;}
								else {row4=row2;col4=col2+1;}
							}
						} else {
							direction.remove(0);
							activeattack();
						}
					}
					} else {
						direction.remove("right");
					}
				} else {
					attack(row2+1,col2);
					f2=true;
					if(player[row2+1][col2].checkremain()==0) {
						reset();
						row2=-1;col2=-1;
						f2=false;
					} else {
						row2=row2+1;
					}
				}
				
			}
		}
		else if(row3!=-1) {
			if(player[row3][col3].checkremain()==0) {
				row3=-1;col3=-1;
				reset();
				activeattack();
			} else {
				if(f3==false) {
				if(row3==0&&direction.size()>1) {
					direction.remove("up");
					if(col3==0)direction.remove("left");
					if(col3==9)direction.remove("right");
				} if(row3==9&&direction.size()>1) {
					direction.remove("down");
					if(col3==0)direction.remove("left");
					if(col3==9)direction.remove("right");
				} if(col3==0&&direction.size()>1) {
					direction.remove("left");
					if(row3==0)direction.remove("up");
					if(row3==9)direction.remove("down");
				} if(col3==9&&direction.size()>1) {
					direction.remove("right");
					if(row3==0)direction.remove("left");
					if(row3==9)direction.remove("down");
				}
				}
				String t = direction.get(0);
				if(t.equals("left")) {
					if(col3-1>=0) {
					if(playerf[row3][col3-1]!="nullf") {
						direction.remove(0);
						f3=true;
						activeattack();
					} else if(col3==0&&player[row3][col3].checkremain()!=0) {
						direction.remove("left");
						col3=getstart(row3,col3,"right");
						f3=true;
						activeattack();
					}
					else {
						String get = attack(row3,col3);
						f3=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(get.equals(player[row3][col3].getship())) {
								col3=col3-1;
								direction.remove("up");direction.remove("down");
							} else {
								direction.remove(0);
								row4=row3;col4=col3-1;
							}
						}
					}
					} else {
						if(player[row3][col3].checkremain()!=0) {
							col3=getstart(row3,col3,"right");
							setdtr();
							activeattack();
						} else {
							direction.remove("left");
							activeattack();
						}
					}
				} else if(t.equals("up")) {
					if(row3-1>=0) {
					if(playerf[row3-1][col3]=="nullf") {
						direction.remove(0);
						f3=true;
						activeattack();
					} else if((row3==0) && player[row3][col3].checkremain()!=0) {
						direction.remove("up");
						row3=getstart(row3,col3,"down");
						f3=true;
						activeattack();
					} else {
						String get=attack(row3-1,col3);
						f3=true;
						if(!get.equals("empty")) {
							if(get.equals(player[row3][col3].getship())) {
								row3=row3-1;
								direction.remove("right");
							} else {
								direction.remove("up");
								row4=row3-1;
								col4=col3;
							}
						} else {
							direction.remove("up");
						}
					}
					} else {
						if(player[row3][col3].checkremain()!=0) {
							row3=getstart(row3,col3,"down");
							setdtd();
							activeattack();
						} else {
							direction.remove("up");
							activeattack();
						}
					}
				} else if(t.equals("right")) {
					if(col3+1<=9) {
					if(playerf[row3][col3+1]=="nullf") {
						direction.remove("right");
						f3=true;
						activeattack();
					} else {
						String get = attack(row3,col3+1);
						f3=true;
						if(get.equals("empty")) {
							direction.remove("right");
						} else {
							if(get.equals(player[row3][col3].getship())) {
								col3=col3+1;
							} else {
								direction.remove("right");
								row4=row3;
								col4=col3+1;
							}
						}
					}
					} else {
						direction.remove("right");
						activeattack();
					}
				} else {
					attack(row3+1,col3);
					if(player[row3+1][col3].checkremain()==0) {
						reset();f3=false;
						row3=-1;col3=-1;
					} else {
						row3=row3+1;
					}
				}
			}
		}
		else if(row4!=-1) {
			if(player[row4][col4].checkremain()==0) {
				row4=-1;col4=-1;row4s=-1;col4s=-1;
				reset();
				activeattack();
			} else {
				if(f4==false) {
				if(row4==0&&direction.size()>1) {
					direction.remove("up");
					if(col4==0)direction.remove("left");
					if(col4==9)direction.remove("right");
				} if(row4==9&&direction.size()>1) {
					direction.remove("down");
					if(col4==0)direction.remove("left");
					if(col4==9)direction.remove("right");
				} if(col4==0&&direction.size()>1) {
					direction.remove("left");
					if(row4==0)direction.remove("up");
					if(row4==9)direction.remove("down");
				} if(col4==9&&direction.size()>1) {
					direction.remove("right");
					if(row4==0)direction.remove("left");
					if(row4==9)direction.remove("down");
				}
				}
				String t = direction.get(0);
				if(t.equals("left")) {
					if(col4-1>=0) {
					if(playerf[row4][col4-1].equals("nullf")) {
						direction.remove(0);
						f4=true;
						activeattack();
					} else if(col4==0&&player[row4][col4].checkremain()!=0) {
						direction.remove("left");
						col4=getstart(row4,col4,"right");
						f4=true;
						activeattack();
					} else {
						String get = attack(row4,col4-1);
						f4=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(get.equals(player[row4][col4].getship())) {
								col4=col4-1;
							} else {
								direction.remove("left");
							}
						}
					}
					} else {
						if(player[row4][col4].checkremain()!=0) {
							col4=getstart(row4,col4,"right");
							setdtr();
							activeattack();
						} else {
							direction.remove("left");
							activeattack();
						}
					}
				} else if(t.equals("up")) {
					if(row4-1>=0) {
					if(playerf[row4-1][col4]=="nullf") {
						direction.remove(0);
						f4=true;
						activeattack();
					} else if(row4==0&&player[row4][col4].checkremain()!=0) {
						direction.remove("up");
						row4=getstart(row4,col4,"down");
						f4=true;
						activeattack();
					} else {
						String get = attack(row4-1,col4);
						f4=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(get.equals(player[row4][col4].getship())) {
								row4=row4-1;
								direction.remove("right");
							} else {
								direction.remove(0);
							}
						}
					}
					} else {
						if(player[row4][col4].checkremain()!=0) {
							row4=getstart(row4,col4,"down");
							setdtd();
							activeattack();
						} else {
							direction.remove("up");
							activeattack();
						}
					}
				} else if(t.equals("right")) {
					if(col4+1<=9) {
					if(playerf[row4][col4+1]=="nullf") {
						direction.remove("right");
						f4=true;
						activeattack();
					} else {
						String get = attack(row4,col4+1);
						f4=true;
						if(get.equals("empty")) {
							direction.remove(0);
						} else {
							if(get.equals(player[row4][col4].getship())) {
								col4=col4+1;
							} else {
								direction.remove(0);
							}
						}
					}
					} else {
						direction.remove("right");
						activeattack();
					}
				} else {
					String get = attack(row4+1,col4);
					if(player[row4][col4].checkremain()==0) {
						row4=-1;col4=-1;f4=false;
						reset();
					} else {
						row4=row4+1;
					}
				}
			} 
		}
		else {
			int i = (int)(10*Math.random());
			int j = (int)(10*Math.random());
			if(check[i][j]==true) {
				while(check[i][j]==true) {
					i=(int)(10*Math.random());
					j=(int)(10*Math.random());
				}
			}
			String get = attack(i, j);
			if(get.equals("empty")) {
				row1=-1;
				col1=-1;
			} else {
				row1=i;
				col1=j;
			}
		}
		}else {
			reset();
			activeattack();
		}
	}

	public String attackl(int a, int b) {
		String s=attack(a,b-1);
		return s;
	}
	public String attacku(int a, int b) {
		String s =attack(a-1,b);
		return s;
	}
	public String attackr(int a, int b) {
		String s = attack(a,b+1);
		return s;
	}
	public String attackd(int a, int b) {
		String s =attack(a+1,b);
		return s;
	}
	public void setdtr() {
		for(int i = 0; i < direction.size();i++) {
			direction.remove(0);
		}
		direction.add("right");
	}
	public void setdtd() {
		for(int i = 0; i < direction.size();i++) {
			direction.remove(0);
		}
		direction.add("down");
	}
	public void setdtl() {
		for(int i = 0; i < direction.size();i++) {
			direction.remove(0);
		}
		direction.add("left");
	}
	public void setdtu() {
		for(int i = 0; i < direction.size();i++) {
			direction.remove(0);
		}
		direction.add("up");
	}
		
		






	public String attack(int row, int col) {
		if(player[row][col]==null) {
			player_look[row][col]="hit";
			playerf[row][col]="nullf";
			System.out.println("The computer does not hit your ships");
			print2();
			check[row][col]=true;
			return "empty";
		} else {
			if(player[row][col].getship().equals("cruiser1")) {
				player_look[row][col]="hitcruiser1";
				player[row][col].hit();
				playerf[row][col]="nullf";
				System.out.println("your cruiser1 is hit");
				print2();
				check[row][col]=true;
				return "cruiser1";
			}
			if(player[row][col].getship().equals("cruiser2")) {
				player_look[row][col]="hitcruiser2";
				player[row][col].hit();
				playerf[row][col]="nullf";
				System.out.println("your cruiser2 is hit");
				print2();
				check[row][col]=true;
				return "cruiser2";
			}
			if(player[row][col].getship().equals("cruiser3")) {
				player_look[row][col]="hitcruiser3";
				player[row][col].hit();
				playerf[row][col]="nullf";
				System.out.println("your cruiser3 is hit");
				print2();
				check[row][col]=true;
				return "cruiser3";
			}
			if(player[row][col].getship().equals("destroyer1")) {
				player_look[row][col]="hitdestroyer1";
				player[row][col].hit();
				playerf[row][col]="nullf";
				System.out.println("your destroyer1 is hit");
				print2();
				check[row][col]=true;
				return "destroyer1";
			}
			if(player[row][col].getship().equals("destroyer2")) {
				player_look[row][col]="hitdestroyer2";
				player[row][col].hit();
				playerf[row][col]="nullf";
				System.out.println("your destroyer2 is hit");
				print2();
				check[row][col]=true;
				return "destroyer2";
			}
			if(player[row][col].getship().equals("aircraft")) {
				player_look[row][col]="hitaircraft";
				player[row][col].hit();
				playerf[row][col]="nullf";
				System.out.println("your aircraft is hit");
				print2();
				check[row][col]=true;
				return "aircraft";
			}
		}
		return "empty";
	}
	//print player's ships
	public void print2() {
		for(int i = 0; i < 10; i++) {
			System.out.print("                                      ");
			for(int j = 0; j < 10; j++) {
				if(player_look[i][j]=="hit") {
					System.out.print("hit         ");
				}if(player_look[i][j]=="hitcruiser1") {
				    System.out.print("hitcruiser1  ");
				}
				if(player_look[i][j]=="hitcruiser2") {
				    System.out.print("hitcruiser2  ");
				}
				if(player_look[i][j]=="hitcruiser3") {
				    System.out.print("hitcruiser3  ");
				}if(player_look[i][j]=="hitdestroyer1") {
					System.out.print("hitdestroyer1");
				}
				if(player_look[i][j]=="hitdestroyer2") {
					System.out.print("hitdestroyer2");
				}if(player_look[i][j]=="hitaircraft") {
					System.out.print("hitaircraft ");
				} if(player_look[i][j]=="unhit") {
					System.out.print("unhit       ");
				}
			}
			System.out.println();
		}
	}
	//for player to compare results
	public void print3() {
		for(int i = 0; i < player.length; i++) {
			for(int j = 0; j < player[0].length; j++) {
				if(player[i][j]!=null) {
					if(player[i][j].getship()=="destroyer1" || player[i][j].getship()=="destroyer2") {
						System.out.print(player[i][j].getship()+" ");
					} else if(player[i][j].getship()=="cruiser1" || player[i][j].getship()=="cruiser2" ||player[i][j].getship()=="cruiser3") {
						System.out.print(player[i][j].getship()+"   ");
					} else if(player[i][j].getship()=="aircraft") {
						System.out.print(player[i][j].getship()+"   ");
					}
				} else {
					System.out.print("null" + "       ");
				}
			}
			System.out.println();
		}
	}
	public void reset() {
		for(int i = 0; i < direction.size(); i++) {
			direction.remove(0);
		}
		direction.add("left");direction.add("up");direction.add("right");direction.add("down");
	}
	public int getstart(int a, int b, String d) {
		String result = player_look[a][b];
		if(d.equals("left")) {
			for(int i = 0;  i < 100; i++) {
				String compare = player_look[a][b-1];
				if(compare.equals(result)) {
					b--;
				} else {
					return b;
				}
			}
		} else if(d.equals("up")) {
			for(int i = 0; i < 100; i++) {
				String compare = player_look[a-1][b];
				if(compare.equals(result)) {
					a--;
				} else {
					return a;
				}
			}
		} else if(d.equals("right")) {
			int i = 100;
			while(i-->0) {
				String compare = player_look[a][b+1];
				if(compare.equals(result)) {
					b++;
				} else {
					return b;
				}
			}
		} else {
			int i = 100;
			while(i-->0) {
				String compare = player_look[a+1][b];
				if(compare.equals(result)) {
					a++;
				} else {
					return a;
				}
			}
		}
		return b;
	}
	public boolean checkplayer() {
		int countc=0;
		int countd=0;
		int counta=0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0 ; j < 10; j++) {
				if(!player_look[i][j].substring(0,3).equals("hi")||!player_look[i][j].substring(0,3).equals("un")) {
				  if(player_look[i][j].substring(0,7).equals("hitcrui")) {
					countc++;
				  } if(player_look[i][j].substring(0,7).equals("hitdest")) {
					countd++;
				  } if(player_look[i][j].substring(0,7).equals("hitairc")) {
					counta++;
				}
				}
			}
		}
		if(countc==9&&countd==8&&counta==5) {
			return false;//clear
		} else {
			return true;//not clear
		}
	}
	public int[][] sink1(){
		int[][] r = new int[10][10];
		for(int i =0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(player[i][j]!=null) {
					r[i][j]=player[i][j].checkremain();
				} else {
					r[i][j]=-1;
				}
			}
		}
		return r;
	}
	public boolean sink2() {
		int[][] r= sink1();
		int count=0;
		for(int i =0;i<10;i++) {
			for(int j = 0; j<10;j++) {
				if(r[i][j]==0) {
					count++;
				}
			}
		}
		return count==12;
	}
	public boolean dcheck() {
		boolean flag=false;
		int count=0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(player_look[i][j].equals("hitcruiser1")) count++;
				if(player_look[i][j].equals("hitdestroyer1")) count++;
				if(player_look[i][j].equals("hitaircraft")) count++;
			}
		}
		if(count==12) {
			flag=true;
		} else {
			flag=false;
		}
		return flag;
	}
	public boolean checkcomputer3() {
		return cru1.checkremain()==0 && des1.checkremain()==0 && air.checkremain()==0;
	}
}

