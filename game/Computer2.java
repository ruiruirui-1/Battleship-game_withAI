package game;

public class Computer2 extends Computer{
	public void activeattack() {
		if(row1!=-1) {
			//move impossible direction
			if(player[row1][col1].checkremain()!=0) {
			if(row1==0) {
				direction.remove("up");
				if(col1==0)direction.remove("left");
				if(col1==9)direction.remove("right");
			} if(row1==9) {
				direction.remove("down");
				if(col1==0)direction.remove("left");
				if(col1==9)direction.remove("right");
			} if(col1==0) {
				direction.remove("left");
				if(row1==0)direction.remove("up");
				if(row1==9)direction.remove("down");
			} if(col1==9) {
				direction.remove("right");
				if(row1==0)direction.remove("left");
				if(row1==9)direction.remove("down");
			}//checking condition ends
			String to = direction.get(0);
			//have four possibilities
			if(to.equals("left")) {
				if(col1-1>=0) {
				String result=attack(row1,col1-1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row1][col1].getship())) {
						direction.remove("up");direction.remove("down");
						
						//prepare for next attack
					} else if(!result.equals(player[row1][col1].getship()) && direction.size()>=2) {
						direction.remove(0);
						if(row2==-1) { row2=row1;col2=col1-1;}
						else if(row3==-1) {row3=row1;col3=col1-1;}
						else if(row4==-1) {row4=row1;col4=col1-1;}
					} else if(!result.equals(player[row1][col1].getship()) && direction.size()<=1) {
						direction.remove("left");
						col1=getstart(row1,col1,"right");
					}
				}
			    } else {
					direction.remove("left");
					col1 = getstart(row1,col1,"right");
					activeattack();
				}
			} if(to.equals("up")) {
				if(row1-1>=0) {
				String result=attack(row1-1,col1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row1][col1].getship())) {
						direction.remove("left");direction.remove("right");
					} else if(!result.equals(player[row1][col1].getship())&&direction.size()>=2) {
						direction.remove(0);
						if(row2==-1) {row2=row1-1;col2=col1;}
						else if(row3==-1) {row3=row1-1;col3=col1;}
						else if(row4==-1) {row4=row1-1;col4=col1;}
					} else if(!result.equals(player[row1][col1].getship())&&direction.size()<2) {
						direction.remove("up");
						row1=getstart(row1,col1,"down");
					}
				}
				} else {
					direction.remove("up");
					row1=getstart(row1,col1,"up");
					activeattack();
				}
			} if(to.equals("right")) {
				if(col1+1<=9) {
				String result=attack(row1,col1+1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row1][col1].getship())) {
						direction.remove("up");direction.remove("down");
						if(col1+1<=9) {
						col1=col1+1;
						} else {
							direction.remove("right");
						}
					}  else if(!result.equals(player[row1][col1].getship())&&direction.size()>=2) {
						direction.remove(0);
						if(row2==-1) {row2=row1;col2=col1+1;}
						else if(row3==-1) {row3=row1;col3=col1+1;}
						else if(row4==-1) {row4=row1;col4=col1+1;}
					} else if(!result.equals(player[row1][col1].getship())&&direction.size()<2) {
						direction.remove("right");
						col1=getstart(row1,col1,"left");
					}
				}
				} else {
					direction.remove("right");
					col1 = getstart(row1,col1,"left");
					activeattack();
				}
			} if(to.equals("down")) {
				if(row1+1<=9) {
				String result=attack(row1,col1+1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row1][col1].getship())) {
						direction.remove("left");direction.remove("right");
						if(row1+1<=9) {
						row1=row1+1;
						} else {
							direction.remove("down");
						}
					} else if(!result.equals(player[row1][col1].getship())&& direction.size()>=2) {
						direction.remove(0);
						if(row2==-1) {row2=row1+1;col2=col1;}
						else if(row3==-1) {row3=row1+1;col3=col1;}
						else if(row4==-1) {row4=row1+1;col4=col1;}
					} else if(!result.equals(player[row1][col1].getship())&&direction.size()<2) {
						direction.remove("down");
						row1=getstart(row1,col1,"up");
					}
				}
			}
			} else {
				direction.remove("down");
				row1=getstart(row1,col1,"up");
				activeattack();
			}
			
			
			
		  } else {//already clear
			  reset();
			  row1=-1;col1=-1;
			  activeattack();
		  }
		}
		else if(row2!=-1) {
			//move impossible direction
					if(player[row2][col2].checkremain()!=0) {
					if(row2==0) {
						direction.remove("up");
						if(col2==0)direction.remove("left");
						if(col2==9)direction.remove("right");
					} if(row2==9) {
						direction.remove("down");
						if(col2==0)direction.remove("left");
						if(col2==9)direction.remove("right");
					} if(col2==0) {
						direction.remove("left");
						if(row2==0)direction.remove("up");
						if(row2==9)direction.remove("down");
					} if(col2==9) {
						direction.remove("right");
						if(row2==0)direction.remove("left");
						if(row2==9)direction.remove("down");
					}//checking condition ends
					String to = direction.get(0);
					//have four possibilities
					if(to.equals("left")) {
						if(col2-1>=0) {
						String result=attack(row2,col2-1);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row2][col2].getship())) {
								direction.remove("up");direction.remove("down");
								if(col2-1>=0) {
								col2=col2-1;//prepare for next attack
								} else {
									direction.remove("left");
								}
							} if(!result.equals(player[row2][col2].getship())) {
								direction.remove(0);
							}
							  if(row3==-1) {row3=row2;col3=col2-1;}
								else if(row4==-1) {row4=row2;col4=col2-1;}
							
						}
						} else {
							direction.remove("left");
							col2 = getstart(row2,col2,"right");
							activeattack();
						}
					} if(to.equals("up")) {
						if(row2-1>=0) {
						String result=attack(row2-1,col2);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row2][col2].getship())) {
								direction.remove("left");direction.remove("right");
								if(row2-1>=0) {
								row2=row2-1;//prepare for next attack
								} else {
									direction.remove("up");
								}
							} if(!result.equals(player[row2][col2].getship())) {
								direction.remove(0);
								if(row3==-1) {row3=row2-1;col3=col2;}
								else if(row4==-1) {row4=row2-1;col4=col2;}
							}
						}
						} else {
							direction.remove("up");
							row2 = getstart(row2,col2,"down");
							activeattack();
						}
					} if(to.equals("right")) {
						if(col2+1<=9) {
						String result=attack(row2,col2+1);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row2][col2].getship())) {
								direction.remove("up");direction.remove("down");
								if(col2+1<=9) {
								col2=col2+1;
								} else {
									direction.remove("right");
								}
							} if(!result.equals(player[row2][col2].getship())) {
								direction.remove(0);
							    if(row3==-1) {row3=row2;col3=col2+1;}
								else if(row4==-1) {row4=row2;col4=col2+1;}
							}
						}
						} else {
							direction.remove("right");
							col2=getstart(row2,col2,"left");
							activeattack();
						}
					} if(to.equals("down")) {
						if(row2+1<=9) {
							
						
						String result=attack(row2,col2+1);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row2][col2].getship())) {
								direction.remove("left");direction.remove("right");
								if(row2+1<=9) {
								row2=row2+1;
								} else {
									direction.remove("down");
								}
							} else if(!result.equals(player[row2][col2].getship())&& ) {
								direction.remove(0);
								if(row3==-1) {row3=row2+1;col3=col2;}
								else if(row4==-1) {row4=row2+1;col4=col2;} 
							}
						}
						} else {
							direction.remove("down");
							row2=getstart(row2,col2,"up");
							activeattack();
						}
					}
					
					
					
					
				  } else {//already clear
					  reset();
					  row2=-1;col2=-1;
					  activeattack();
				  }
				}

		else if(row3!=-1) {
			//move impossible direction
					if(player[row3][col3].checkremain()!=0) {
					if(row3==0) {
						direction.remove("up");
						if(col3==0)direction.remove("left");
						if(col3==9)direction.remove("right");
					} if(row3==9) {
						direction.remove("down");
						if(col3==0)direction.remove("left");
						if(col3==9)direction.remove("right");
					} if(col3==0) {
						direction.remove("left");
						if(row3==0)direction.remove("up");
						if(row3==9)direction.remove("down");
					} if(col3==9) {
						direction.remove("right");
						if(row3==0)direction.remove("left");
						if(row3==9)direction.remove("down");
					}//checking condition ends
					String to = direction.get(0);
					//have four possibilities
					if(to.equals("left")) {
						if(col3-1>=0) {
						String result=attack(row3,col3-1);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row3][col3].getship())) {
								direction.remove("up");direction.remove("down");
								if(col3-1>=0) {
								col3=col3-1;//prepare for next attack
								} else {
									direction.remove("left");
								}
							} if(!result.equals(player[row3][col3].getship())) {
								direction.remove(0);
								if(row4==-1) {row4=row3;col4=col3-1;}
							}
						}
						} else {
							direction.remove("left");
							col3=getstart(row3,col3,"right");
							activeattack();
						}
					} if(to.equals("up")) {
						if(row3-1>=0) {
						String result=attack(row3-1,col3);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row3][col3].getship())) {
								direction.remove("left");direction.remove("right");
								if(row3-1>=0) {
								row3=row3-1;//prepare for next attack
								} else {
									direction.remove("up");
								}
							} if(!result.equals(player[row3][col3].getship())) {
								direction.remove(0);
								if(row4==-1) {row4=row3-1;col4=col3;}
							}
						}
						} else {
							direction.remove("up");
							row3=getstart(row3,col3,"down");
							activeattack();
						}
					} if(to.equals("right")) {
						if(col3+1<=9) {
						String result=attack(row3,col3+1);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row3][col3].getship())) {
								direction.remove("up");direction.remove("down");
								if(col3+1<=9) {
								col3=col3+1;
								} else {
									direction.remove("right");
								}
							} if(!result.equals(player[row3][col3].getship())) {
								direction.remove(0);
								if(row4==-1) {row4=row3;col4=col3+1;}
							}
						}
						} else {
							direction.remove("right");
							col3=getstart(row3,col3,"left");
							activeattack();
						}
					} if(to.equals("down")) {
						String result=attack(row3,col3+1);
						if(result.equals("empty")) {
							direction.remove(0);
						} else {
							if(result.equals(player[row3][col3].getship())) {
								direction.remove("left");direction.remove("right");
								if(row3+1<=9) {
								row3=row3+1;
								} else {
									direction.remove("down");
								}
							} if(!result.equals(player[row3][col3].getship())) {
								direction.remove(0);
								if(row4==-1) {row4=row3+1;col4=col3;}
							}
						}
					}
					
					
					
				  } else {//already clear
					  reset();
					  row3=-1;col3=-1;
					  activeattack();
				  }
		}
		else if(row4!=-1) {
			//move impossible direction
			if(player[row4][col4].checkremain()!=0) {
			if(row4==0) {
				direction.remove("up");
				if(col4==0)direction.remove("left");
				if(col4==9)direction.remove("right");
			} if(row4==9) {
				direction.remove("down");
				if(col4==0)direction.remove("left");
				if(col4==9)direction.remove("right");
			} if(col4==0) {
				direction.remove("left");
				if(row4==0)direction.remove("up");
				if(row4==9)direction.remove("down");
			} if(col4==9) {
				direction.remove("right");
				if(row4==0)direction.remove("left");
				if(row4==9)direction.remove("down");
			}//checking condition ends
			String to = direction.get(0);
			//have four possibilities
			if(to.equals("left")) {
				String result=attack(row4,col4-1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row4][col4].getship())) {
						direction.remove("up");direction.remove("down");
						if(col4-1>=0) {
						col4=col4-1;//prepare for next attack
						} else {
							direction.remove("left");
						}
					} if(!result.equals(player[row4][col4].getship())) {
						direction.remove(0);
					}
				}
			} if(to.equals("up")) {
				String result=attack(row4-1,col4);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row4][col4].getship())) {
						direction.remove("left");direction.remove("right");
						if(row4-1>=0) {
						row4=row4-1;//prepare for next attack
						} else {
							direction.remove("up");
						}
					} if(!result.equals(player[row4][col4].getship())) {
						direction.remove(0);
					}
				}
			} if(to.equals("right")) {
				String result=attack(row4,col4+1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row4][col4].getship())) {
						direction.remove("up");direction.remove("down");
						if(col4+1<=9) {
						col4=col4+1;
						} else {
							direction.remove("right");
						}
					} if(!result.equals(player[row4][col4].getship())) {
						direction.remove(0);
					}
				}
			} if(to.equals("down")) {
				String result=attack(row4,col4+1);
				if(result.equals("empty")) {
					direction.remove(0);
				} else {
					if(result.equals(player[row4][col4].getship())) {
						direction.remove("left");direction.remove("right");
						if(row4+1<=9) {
						row4=row4+1;
						} else {
							direction.remove("down");
						}
					} if(!result.equals(player[row4][col4].getship())) {
						direction.remove(0);
					}
				}
			}
			
			
		  } else {//already clear
			  reset();
			  row4=-1;col4=-1;
			  activeattack();
		  }
		}
		//start or first
		else {
			int i = (int)(10*Math.random());
			int j = (int)(10*Math.random());
			if(check[i][j]==true) {
				while(check[i][j]==true) {
					i=(int)(10*Math.random());
					j=(int)(10*Math.random());
				}
			}
			String result = attack(i, j);
			if(!result.equals("empty")) {
				row1=i;
				col1=j;
			} else {
				row1=-1;col1=-1;
			}
		}
		
	}
}
