package ObjectOrientedProgramming.m1;

import java.util.Random;

public class Role {

    private String name;
    private int blood;


    //构造方法
    public Role() {
    } //空参

    public Role(String name, int blood) {
        this.blood = blood;
        this.name = name;
    } //全参

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {

        Random r = new Random();
        int hurt = r.nextInt(20) + 1; //随机造成伤害
        int remainBoold = role.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold; //血量低于0时修改为0
        role.setBlood(remainBoold); //被攻击者剩余血量

        System.out.println(this.getName() + "对" + role.getName() + "发起攻击，造成了" + hurt + "点伤害" + role.getName() + "还剩" + remainBoold + "点血量");
    }
}
