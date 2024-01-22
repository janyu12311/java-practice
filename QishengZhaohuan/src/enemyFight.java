import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class enemyFight implements ActionListener {
    int chaozai = 3;
    int FireZhengfa = 4;
    int WaterZhengfa = 5;
    int pugong = 2;
    JFrame jFrame;
    JButton jButton = new JButton("关闭按钮");

    public enemyFight() throws HeadlessException {
        jFrame = new JFrame("敌方攻击界面");
        //设置界面宽高
        jFrame.setSize(800, 800);
        jFrame.setLocationRelativeTo(null);
        //设置界面标题
        jButton.setBounds(650, 0, 100, 30);
        jButton.addActionListener(this);
        jFrame.getContentPane().add(jButton);
        //      this.getContentPane().setBackground(new Color(255,192,203));
        JTextArea jTextArea = new JTextArea(500, 700);
        jTextArea.setFont(new Font("宋体", Font.BOLD, 13));
        jFrame.add(jTextArea);
        if(Frame.DshaiziNums>=2){
            System.out.println("显示敌方行动");
            jFrame.setVisible(true);
        }else{
            if(Frame.wanjiaIsGiveup){
                Random r=new Random();
                Frame.MshaiziNums=r.nextInt(10)+1;
                Frame.DshaiziNums=r.nextInt(10)+1;
                int tmp=r.nextInt(3);
                if(tmp!=0){
                    int tmp2=r.nextInt(Frame.tools.length);
                    Frame.toolsHave.add(Frame.tools[tmp2]);
                }
                if(Frame.partnerNums!=0){
                    Frame.partnerNums--;
                    Frame.MshaiziNums+=2;
                }
            }
            Frame.wanjiaIsGiveup=false;
            jFrame.setVisible(false);

            new Frame();
            return;
        }

        Random r = new Random();
        System.out.println("我在判读之前看看"+Frame.DshaiziNums);
        if (!Frame.wanjiaIsGiveup&&Frame.DshaiziNums>=2) {
            Frame.DshaiziNums-=2;
            int tmp = r.nextInt(3);
            //换位置
            if (tmp != 0&&Frame.Ddiluke.ifLive&&Frame.Dhuangnv.ifLive&&Frame.Dxingqiu.ifLive) {
                if (Frame.DCurrent == 1) {
                    Frame.DCurrent = 2;
                } else if (Frame.DCurrent == 3) {
                    Frame.DCurrent = 2;
                } else {
                    int tmp2 = r.nextInt(2);
                    if (tmp2 == 0) {
                        Frame.DCurrent--;
                    } else {
                        Frame.DCurrent++;
                    }
                }
                jTextArea.append("敌方进行了一次换位置\n");
            }//攻击
            else {
                int fightWho = r.nextInt(3) + 1;
                if (Frame.DshaiziNums < 2) {
                    Frame.EgiveUp = true;
                    jTextArea.append("敌方放弃这回合\n");
                } else {
                    if(Frame.DCurrent==1&&!Frame.Ddiluke.ifLive){
                        Frame.DCurrent=2;
                    }
                    if(Frame.DCurrent==2&&!Frame.Dxingqiu.ifLive){
                        Frame.DCurrent=3;
                    }
                    if (Frame.DCurrent == Frame.DILUKE) {
                        //攻击了敌方迪卢克
                        if (fightWho == 1) {
                            if (Frame.Mdiluke.curElement.equals("雷") && Frame.Mdiluke.ifLive) {
                                Frame.Mdiluke.blood -= chaozai;
                                Frame.Mdiluke.curElement = "无";
                                //改变敌方上场角色
                                changeFightCharacter();
                                jTextArea.append("激发超载,敌方对你迪卢克造成了" + chaozai + "点伤害,并改变你上场角色\n");
                            } else if (Frame.Mdiluke.curElement.equals("水") && Frame.Mdiluke.ifLive) {
                                Frame.Mdiluke.blood -= FireZhengfa;
                                Frame.Mdiluke.curElement = "无";
                                jTextArea.append("造成蒸发,敌方对你迪卢克造成了" + FireZhengfa + "点伤害\n");
                            } else {
                                if (Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= pugong;
                                    Frame.Mdiluke.curElement = Frame.Ddiluke.element;
                                    jTextArea.append("攻击成功,敌方对你迪卢克造成了" + pugong + "点伤害\n");
                                }
                            }
                        }
                        //攻击了敌方行秋
                        if (fightWho == 2) {
                            System.out.println("点击了攻击敌方行秋");
                            if (Frame.Mxingqiu.curElement.equals("雷") && Frame.Mxingqiu.ifLive) {
                                Frame.Mxingqiu.blood -= chaozai;
                                Frame.Mxingqiu.curElement = "无";
                                //改变敌方上场角色
                                changeFightCharacter();
                                jTextArea.append("激发超载,敌方对你的行秋造成了" + chaozai + "点伤害,并改变你的上场角色\n");
                            } else if (Frame.Mxingqiu.curElement.equals("水") && Frame.Mxingqiu.ifLive) {
                                Frame.Mxingqiu.blood -= FireZhengfa;
                                Frame.Mxingqiu.curElement = "无";
                                jTextArea.append("造成蒸发,敌方对你的行秋造成了" + FireZhengfa + "点伤害\n");
                            } else {
                                if (Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= pugong;
                                    Frame.Mxingqiu.curElement = Frame.Dxingqiu.element;
                                    jTextArea.append("攻击成功,敌方对你的行秋造成了" + pugong + "\n");
                                }

                            }
                        }
                        //攻击了敌方皇女
                        if (fightWho == 3) {
                            System.out.println("点击了攻击敌方皇女");
                            if (Frame.Mhuangnv.curElement.equals("雷") && Frame.Mhuangnv.ifLive) {
                                Frame.Mhuangnv.blood -= chaozai;
                                Frame.Mhuangnv.curElement = "无";
                                //改变敌方上场角色
                                changeFightCharacter();
                                jTextArea.append("激发超载,敌方对你皇女造成了" + chaozai + "点伤害,并改变你的上场角色\n");
                            } else if (Frame.Mhuangnv.curElement.equals("水") && Frame.Mhuangnv.ifLive) {
                                Frame.Mhuangnv.blood -= FireZhengfa;
                                Frame.Mhuangnv.curElement = "无";
                                jTextArea.append("造成蒸发,敌方对你的皇女造成了" + FireZhengfa + "点伤害\n");
                            } else {
                                if (Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= pugong;
                                    Frame.Mhuangnv.curElement = Frame.Ddiluke.element;
                                    jTextArea.append("攻击成功,敌方对你的皇女造成了" + pugong + "点伤害\n");
                                }

                            }
                        }
                    } else if (Frame.DCurrent == Frame.XINGQIU) {
                        //攻击了敌方迪卢克
                        if (fightWho == 1) {
                            if (Frame.Mdiluke.curElement.equals("雷") && Frame.Mdiluke.ifLive) {
                                Frame.Mdiluke.blood -= chaozai;
                                Frame.Mdiluke.curElement = "无";
                                Frame.Mxingqiu.blood -= 1;
                                jTextArea.append("激发感电,敌方对你的迪卢克,行秋分别造成了" + chaozai + "点,1点伤害\n");
                            } else if (Frame.Mdiluke.curElement.equals("火") && Frame.Mdiluke.ifLive) {
                                Frame.Mdiluke.blood -= WaterZhengfa;
                                Frame.Mdiluke.curElement = "无";
                                jTextArea.append("造成蒸发,敌方对你的迪卢克造成了" + WaterZhengfa + "点伤害\n");
                            } else {
                                if (Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= pugong;
                                    Frame.Mdiluke.curElement = Frame.Dxingqiu.element;
                                    jTextArea.append("攻击成功,敌方对你的迪卢克造成了" + pugong + "点伤害\n");
                                }
                            }
                        }
                        //攻击了敌方行秋
                        if (fightWho == 2) {
                            System.out.println("点击了攻击敌方行秋");
                            if (Frame.Mxingqiu.curElement.equals("雷") && Frame.Mxingqiu.ifLive) {
                                Frame.Mxingqiu.blood -= chaozai;
                                Frame.Mxingqiu.curElement = "无";
                                Frame.Mdiluke.blood -= 1;
                                Frame.Mhuangnv.blood -= 1;
                                jTextArea.append("激发感电,敌方对你的行秋,迪卢克和皇女分别造成了" + chaozai + "点,1点,1点伤害\n");

                            } else if (Frame.Mxingqiu.curElement.equals("火") && Frame.Mxingqiu.ifLive) {
                                Frame.Mxingqiu.blood -= WaterZhengfa;
                                Frame.Mxingqiu.curElement = "无";
                                jTextArea.append("造成蒸发,敌方对你的行秋造成了" + WaterZhengfa + "点伤害\n");

                            } else {
                                if (Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= pugong;
                                    Frame.Mxingqiu.curElement = Frame.Dxingqiu.element;
                                    jTextArea.append("攻击成功,敌方对你的行秋造成了" + pugong + "点伤害\n");
                                }


                            }
                        }
                        //攻击了敌方皇女
                        if (fightWho == 3) {
                            System.out.println("点击了攻击敌方皇女");
                            if (Frame.Mhuangnv.curElement.equals("雷") && Frame.Mhuangnv.ifLive) {
                                Frame.Mhuangnv.blood -= chaozai;
                                Frame.Mxingqiu.blood -= 1;
                                Frame.Mhuangnv.curElement = "无";
                                jTextArea.append("激发感电,敌方对你的皇女,行秋分别造成了" + chaozai + "点,1点伤害\n");

                            } else if (Frame.Mhuangnv.curElement.equals("火") && Frame.Mhuangnv.ifLive) {
                                Frame.Mhuangnv.blood -= WaterZhengfa;
                                Frame.Mhuangnv.curElement = "无";
                                jTextArea.append("造成蒸发,敌方对你的皇女造成了" + WaterZhengfa + "点伤害\n");

                            } else {
                                if (Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= pugong;
                                    Frame.Mhuangnv.curElement = Frame.Dxingqiu.element;
                                    jTextArea.append("攻击成功,敌方对你的皇女造成了" + pugong + "点伤害\n");
                                }


                            }
                        }
                    } else if (Frame.DCurrent == Frame.HUANGNV) {
                        //攻击了敌方迪卢克
                        if (fightWho == 1) {
                            if (Frame.Mdiluke.curElement.equals("水") && Frame.Mdiluke.ifLive) {
                                Frame.Mdiluke.blood -= chaozai;
                                Frame.Mdiluke.curElement = "无";
                                Frame.Mxingqiu.blood -= 1;
                                jTextArea.append("激发感电,敌方对你的迪卢克,行秋分别造成了" + chaozai + "点,1点伤害\n");

                            } else if (Frame.Mdiluke.curElement.equals("火") && Frame.Mdiluke.ifLive) {
                                Frame.Mdiluke.blood -= chaozai;
                                Frame.Mdiluke.curElement = "无";
                                changeFightCharacter();
                                jTextArea.append("激发超载,敌方对你的迪卢克造成了" + chaozai + "点伤害,并改变敌方上场角色\n");

                            } else {
                                if (Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= pugong;
                                    Frame.Mdiluke.curElement = Frame.Dhuangnv.element;
                                    jTextArea.append("攻击成功,敌方对你的迪卢克造成了" + pugong + "点伤害\n");

                                }

                            }
                        }
                        //攻击了敌方行秋
                        if (fightWho == 2) {
                            System.out.println("点击了攻击敌方行秋");
                            if (Frame.Mxingqiu.curElement.equals("水") && Frame.Mxingqiu.ifLive) {
                                Frame.Mxingqiu.blood -= chaozai;
                                Frame.Mxingqiu.curElement = "无";
                                Frame.Mdiluke.blood -= 1;
                                Frame.Mhuangnv.blood -= 1;
                                jTextArea.append("激发感电,敌方对你的行秋,敌方迪卢克和皇女分别造成了" + chaozai + "点,1点,1点伤害\n");

                            } else if (Frame.Mxingqiu.curElement.equals("火") && Frame.Mxingqiu.ifLive) {
                                Frame.Mxingqiu.blood -= chaozai;
                                Frame.Mxingqiu.curElement = "无";
                                changeFightCharacter();
                                jTextArea.append("激发超载,敌方对你的行秋造成了" + chaozai + "点伤害,并改变敌方上场角色\n");

                            } else {
                                if (Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= pugong;
                                    Frame.Mxingqiu.curElement = Frame.Dhuangnv.element;
                                    jTextArea.append("攻击成功,敌方对你的行秋造成了" + pugong + "点伤害\n");
                                }

                            }
                        }
                        //攻击了敌方皇女
                        if (fightWho == 3) {
                            System.out.println("点击了攻击敌方皇女");
                            if (Frame.Mhuangnv.curElement.equals("水") && Frame.Mhuangnv.ifLive) {
                                Frame.Mhuangnv.blood -= chaozai;
                                Frame.Mhuangnv.curElement = "无";
                                Frame.Mxingqiu.blood -= 1;
                                jTextArea.append("激发感电,敌方对你的皇女,行秋分别造成了" + chaozai + "点,1点伤害\n");

                            } else if (Frame.Mhuangnv.curElement.equals("火") && Frame.Mhuangnv.ifLive) {
                                Frame.Mhuangnv.blood -= chaozai;
                                Frame.Mhuangnv.curElement = "无";
                                changeFightCharacter();
                                jTextArea.append("激发超载,敌方对你的皇女造成了" + chaozai + "点伤害,并改变敌方上场角色\n");

                            } else {
                                if (Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= pugong;
                                    Frame.Mhuangnv.curElement = Frame.Dhuangnv.element;
                                    jTextArea.append("攻击成功,敌方对你的皇女造成了" + pugong + "点伤害\n");
                                }
                            }
                        }
                    }
                }
            }
        } else if(Frame.wanjiaIsGiveup){
            System.out.println("玩家放弃，进入循环");
            int index=0;
            while (Frame.DshaiziNums >= 2) {
                System.out.println("我在进循环的时候看看"+Frame.DshaiziNums);
                Frame.DshaiziNums -= 2;
                int tmp = r.nextInt(3);
                //换位置
                if (tmp != 0) {
                    System.out.println("换位置");
                    if (Frame.DCurrent == 1) {
                        Frame.DCurrent = 2;
                    } else if (Frame.DCurrent == 3) {
                        Frame.DCurrent = 2;
                    } else {
                        int tmp2 = r.nextInt(2);
                        if (tmp2 == 0) {
                            Frame.DCurrent--;
                        } else {
                            Frame.DCurrent++;
                        }
                    }
                    jTextArea.append("敌方进行了一次换位置\n");
                }//攻击
                else {
                    int fightWho = r.nextInt(3) + 1;
                    if (Frame.DshaiziNums < 2) {
                        Frame.EgiveUp = true;
                        jTextArea.append("敌方放弃这回合\n");
                    } else {
                        if (Frame.DCurrent == Frame.DILUKE) {
                            //攻击了敌方迪卢克
                            if (fightWho == 1) {
                                if (Frame.Mdiluke.curElement.equals("雷") && Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= chaozai;
                                    Frame.Mdiluke.curElement = "无";
                                    //改变敌方上场角色
                                    changeFightCharacter();
                                    jTextArea.append("激发超载,敌方对你迪卢克造成了" + chaozai + "点伤害,并改变你上场角色\n");
                                } else if (Frame.Mdiluke.curElement.equals("水") && Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= FireZhengfa;
                                    Frame.Mdiluke.curElement = "无";
                                    jTextArea.append("造成蒸发,敌方对你迪卢克造成了" + FireZhengfa + "点伤害\n");
                                } else {
                                    if (Frame.Mdiluke.ifLive) {
                                        Frame.Mdiluke.blood -= pugong;
                                        Frame.Mdiluke.curElement = Frame.Ddiluke.element;
                                        jTextArea.append("攻击成功,敌方对你迪卢克造成了" + pugong + "点伤害\n");
                                    }
                                }
                            }
                            //攻击了敌方行秋
                            if (fightWho == 2) {
                                System.out.println("点击了攻击敌方行秋");
                                if (Frame.Mxingqiu.curElement.equals("雷") && Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= chaozai;
                                    Frame.Mxingqiu.curElement = "无";
                                    //改变敌方上场角色
                                    changeFightCharacter();
                                    jTextArea.append("激发超载,敌方对你的行秋造成了" + chaozai + "点伤害,并改变你的上场角色\n");
                                } else if (Frame.Mxingqiu.curElement.equals("水") && Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= FireZhengfa;
                                    Frame.Mxingqiu.curElement = "无";
                                    jTextArea.append("造成蒸发,敌方对你的行秋造成了" + FireZhengfa + "点伤害\n");
                                } else {
                                    if (Frame.Mxingqiu.ifLive) {
                                        Frame.Mxingqiu.blood -= pugong;
                                        Frame.Mxingqiu.curElement = Frame.Dxingqiu.element;
                                        jTextArea.append("攻击成功,敌方对你的行秋造成了" + pugong + "\n");
                                    }

                                }
                            }
                            //攻击了敌方皇女
                            if (fightWho == 3) {
                                System.out.println("点击了攻击敌方皇女");
                                if (Frame.Mhuangnv.curElement.equals("雷") && Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= chaozai;
                                    Frame.Mhuangnv.curElement = "无";
                                    //改变敌方上场角色
                                    changeFightCharacter();
                                    jTextArea.append("激发超载,敌方对你皇女造成了" + chaozai + "点伤害,并改变你的上场角色\n");
                                } else if (Frame.Mhuangnv.curElement.equals("水") && Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= FireZhengfa;
                                    Frame.Mhuangnv.curElement = "无";
                                    jTextArea.append("造成蒸发,敌方对你的皇女造成了" + FireZhengfa + "点伤害\n");
                                } else {
                                    if (Frame.Mhuangnv.ifLive) {
                                        Frame.Mhuangnv.blood -= pugong;
                                        Frame.Mhuangnv.curElement = Frame.Ddiluke.element;
                                        jTextArea.append("攻击成功,敌方对你的皇女造成了" + pugong + "点伤害\n");
                                    }

                                }
                            }
                        } else if (Frame.DCurrent == Frame.XINGQIU) {
                            //攻击了敌方迪卢克
                            if (fightWho == 1) {
                                if (Frame.Mdiluke.curElement.equals("雷") && Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= chaozai;
                                    Frame.Mdiluke.curElement = "无";
                                    Frame.Mxingqiu.blood -= 1;
                                    jTextArea.append("激发感电,敌方对你的迪卢克,行秋分别造成了" + chaozai + "点,1点伤害\n");
                                } else if (Frame.Mdiluke.curElement.equals("火") && Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= WaterZhengfa;
                                    Frame.Mdiluke.curElement = "无";
                                    jTextArea.append("造成蒸发,敌方对你的迪卢克造成了" + WaterZhengfa + "点伤害\n");
                                } else {
                                    if (Frame.Mdiluke.ifLive) {
                                        Frame.Mdiluke.blood -= pugong;
                                        Frame.Mdiluke.curElement = Frame.Dxingqiu.element;
                                        jTextArea.append("攻击成功,敌方对你的迪卢克造成了" + pugong + "点伤害\n");
                                    }
                                }
                            }
                            //攻击了敌方行秋
                            if (fightWho == 2) {
                                System.out.println("点击了攻击敌方行秋");
                                if (Frame.Mxingqiu.curElement.equals("雷") && Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= chaozai;
                                    Frame.Mxingqiu.curElement = "无";
                                    Frame.Mdiluke.blood -= 1;
                                    Frame.Mhuangnv.blood -= 1;
                                    jTextArea.append("激发感电,敌方对你的行秋,迪卢克和皇女分别造成了" + chaozai + "点,1点,1点伤害\n");

                                } else if (Frame.Mxingqiu.curElement.equals("火") && Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= WaterZhengfa;
                                    Frame.Mxingqiu.curElement = "无";
                                    jTextArea.append("造成蒸发,敌方对你的行秋造成了" + WaterZhengfa + "点伤害\n");

                                } else {
                                    if (Frame.Mxingqiu.ifLive) {
                                        Frame.Mxingqiu.blood -= pugong;
                                        Frame.Mxingqiu.curElement = Frame.Dxingqiu.element;
                                        jTextArea.append("攻击成功,敌方对你的行秋造成了" + pugong + "点伤害\n");
                                    }


                                }
                            }
                            //攻击了敌方皇女
                            if (fightWho == 3) {
                                System.out.println("点击了攻击敌方皇女");
                                if (Frame.Mhuangnv.curElement.equals("雷") && Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= chaozai;
                                    Frame.Mxingqiu.blood -= 1;
                                    Frame.Mhuangnv.curElement = "无";
                                    jTextArea.append("激发感电,敌方对你的皇女,行秋分别造成了" + chaozai + "点,1点伤害\n");

                                } else if (Frame.Mhuangnv.curElement.equals("火") && Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= WaterZhengfa;
                                    Frame.Mhuangnv.curElement = "无";
                                    jTextArea.append("造成蒸发,敌方对你的皇女造成了" + WaterZhengfa + "点伤害\n");

                                } else {
                                    if (Frame.Mhuangnv.ifLive) {
                                        Frame.Mhuangnv.blood -= pugong;
                                        Frame.Mhuangnv.curElement = Frame.Dxingqiu.element;
                                        jTextArea.append("攻击成功,敌方对你的皇女造成了" + pugong + "点伤害\n");
                                    }


                                }
                            }
                        } else if (Frame.DCurrent == Frame.HUANGNV) {
                            //攻击了敌方迪卢克
                            if (fightWho == 1) {
                                if (Frame.Mdiluke.curElement.equals("水") && Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= chaozai;
                                    Frame.Mdiluke.curElement = "无";
                                    Frame.Mxingqiu.blood -= 1;
                                    jTextArea.append("激发感电,敌方对你的迪卢克,行秋分别造成了" + chaozai + "点,1点伤害\n");

                                } else if (Frame.Mdiluke.curElement.equals("火") && Frame.Mdiluke.ifLive) {
                                    Frame.Mdiluke.blood -= chaozai;
                                    Frame.Mdiluke.curElement = "无";
                                    changeFightCharacter();
                                    jTextArea.append("激发超载,敌方对你的迪卢克造成了" + chaozai + "点伤害,并改变敌方上场角色\n");

                                } else {
                                    if (Frame.Mdiluke.ifLive) {
                                        Frame.Mdiluke.blood -= pugong;
                                        Frame.Mdiluke.curElement = Frame.Dhuangnv.element;
                                        jTextArea.append("攻击成功,敌方对你的迪卢克造成了" + pugong + "点伤害\n");

                                    }

                                }
                            }
                            //攻击了敌方行秋
                            if (fightWho == 2) {
                                System.out.println("点击了攻击敌方行秋");
                                if (Frame.Mxingqiu.curElement.equals("水") && Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= chaozai;
                                    Frame.Mxingqiu.curElement = "无";
                                    Frame.Mdiluke.blood -= 1;
                                    Frame.Mhuangnv.blood -= 1;
                                    jTextArea.append("激发感电,敌方对你的行秋,敌方迪卢克和皇女分别造成了" + chaozai + "点,1点,1点伤害\n");

                                } else if (Frame.Mxingqiu.curElement.equals("火") && Frame.Mxingqiu.ifLive) {
                                    Frame.Mxingqiu.blood -= chaozai;
                                    Frame.Mxingqiu.curElement = "无";
                                    changeFightCharacter();
                                    jTextArea.append("激发超载,敌方对你的行秋造成了" + chaozai + "点伤害,并改变敌方上场角色\n");

                                } else {
                                    if (Frame.Mxingqiu.ifLive) {
                                        Frame.Mxingqiu.blood -= pugong;
                                        Frame.Mxingqiu.curElement = Frame.Dhuangnv.element;
                                        jTextArea.append("攻击成功,敌方对你的行秋造成了" + pugong + "点伤害\n");
                                    }

                                }
                            }
                            //攻击了敌方皇女
                            if (fightWho == 3) {
                                System.out.println("点击了攻击敌方皇女");
                                if (Frame.Mhuangnv.curElement.equals("水") && Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= chaozai;
                                    Frame.Mhuangnv.curElement = "无";
                                    Frame.Mxingqiu.blood -= 1;
                                    jTextArea.append("激发感电,敌方对你的皇女,行秋分别造成了" + chaozai + "点,1点伤害\n");

                                } else if (Frame.Mhuangnv.curElement.equals("火") && Frame.Mhuangnv.ifLive) {
                                    Frame.Mhuangnv.blood -= chaozai;
                                    Frame.Mhuangnv.curElement = "无";
                                    changeFightCharacter();
                                    jTextArea.append("激发超载,敌方对你的皇女造成了" + chaozai + "点伤害,并改变敌方上场角色\n");

                                } else {
                                    if (Frame.Mhuangnv.ifLive) {
                                        Frame.Mhuangnv.blood -= pugong;
                                        Frame.Mhuangnv.curElement = Frame.Dhuangnv.element;
                                        jTextArea.append("攻击成功,敌方对你的皇女造成了" + pugong + "点伤害\n");
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        if(!Frame.Ddiluke.ifLive&&!Frame.Dxingqiu.ifLive&&!Frame.Dhuangnv.ifLive){
            showJDialog("你赢了！");
            System.exit(0);
        }
        if(!Frame.Mdiluke.ifLive&&!Frame.Mxingqiu.ifLive&&!Frame.Mhuangnv.ifLive){
            showJDialog("你输了");
            System.exit(0);
        }

    }

    public void changeFightCharacter() {
        if (Frame.DCurrent == 1) {
            Frame.DCurrent = 2;
        } else if (Frame.DCurrent == 3) {
            Frame.DCurrent = 2;
        } else {
            Random r = new Random();
            int tmp = r.nextInt(2);
            if (tmp == 0) {
                Frame.DCurrent--;
            } else {
                Frame.DCurrent++;
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(Frame.wanjiaIsGiveup){
           Random r=new Random();
           Frame.MshaiziNums=r.nextInt(10)+1;
           Frame.DshaiziNums=r.nextInt(10)+1;
           int tmp=r.nextInt(3);
           if(tmp!=0){
               int tmp2=r.nextInt(Frame.tools.length);
               Frame.toolsHave.add(Frame.tools[tmp2]);
           }
           if(Frame.partnerNums!=0){
               Frame.partnerNums--;
               Frame.MshaiziNums+=2;
           }
       }
        if(!Frame.Ddiluke.ifLive&&!Frame.Dxingqiu.ifLive&&!Frame.Dhuangnv.ifLive){
            showJDialog("你赢了！");
            System.exit(0);
        }
        if(!Frame.Mdiluke.ifLive&&!Frame.Mxingqiu.ifLive&&!Frame.Mhuangnv.ifLive){
            showJDialog("你输了");
            System.exit(0);
        }
        if(Frame.Mdiluke.blood<=0){
            Frame.Mdiluke.ifLive=false;
            Frame.Mdiluke.blood=0;
        }
        if(Frame.Mxingqiu.blood<=0){
            Frame.Mxingqiu.ifLive=false;
            Frame.Mxingqiu.blood=0;
        }
        if(Frame.Mhuangnv.blood<=0){
            Frame.Mhuangnv.ifLive=false;
            Frame.Mhuangnv.blood=0;
        }
        if(!Frame.Mdiluke.ifLive&&Frame.myCurrent==1){
            Frame.myCurrent=2;
        }
        if(!Frame.Mxingqiu.ifLive&&Frame.myCurrent==2){
            Frame.myCurrent=3;
        }
        if(!Frame.Mhuangnv.ifLive&&Frame.myCurrent==3){
            Frame.myCurrent=1;
        }
        if(!Frame.Mdiluke.ifLive&&Frame.myCurrent==1){
            Frame.myCurrent=2;
        }
        if(!Frame.Mxingqiu.ifLive&&Frame.myCurrent==2){
            Frame.myCurrent=3;
        }
        if(!Frame.Mdiluke.ifLive&&Frame.myCurrent==1){
            Frame.myCurrent=2;
        }
        Object choice = e.getSource();
        if (choice == jButton) {
            jFrame.setVisible(false);
            Frame.wanjiaIsGiveup=false;
            new Frame();
        }
    }
    JDialog jDialog = new JDialog();

    //弹窗
    public void showJDialog(String content) {
        if (!jDialog.isVisible()) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(400, 100);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 400, 100);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

}

