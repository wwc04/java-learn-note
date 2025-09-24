package ObjectOrientedProgramming.m1;
//面向对象综合训练 文字格斗游戏

public class test {
        public static void main(String[] args) {
            //创建角色
            Role r1 = new Role("阿斯塔",100);
            Role r2 = new Role("夜见", 100);

            while (true){ //开始循环
                r1.attack(r2); //r1攻击r2
                if(r2.getBlood() == 0){ //判断血量是否为0
                    System.out.println(r1.getName()+"取得了胜利");
                    break;//符合判断结束循环
                }
                r2.attack(r1);
                if (r1.getBlood()==0){
                    System.out.println(r2.getName()+"取得了胜利");
                    break;
                }
            }
        }
}
