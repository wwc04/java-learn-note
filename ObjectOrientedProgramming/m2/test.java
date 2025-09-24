package ObjectOrientedProgramming.m2;
//面向对象综合训练 两个数组对象

public class test {
    public static void main(String[] args) {

        //1.商品
        /*Goods[] arr = new Goods[3]; //创建数组

        //创建三个商品对象
        Goods g1 = new Goods("001", "水月雨Edge耳机", 399.0, 10000);
        Goods g2 = new Goods("002", "寿屋Roxy手办", 879.0, 1000);
        Goods g3 = new Goods("003", "小米15", 4399.0, 10000);

        //把商品添加到数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }*/

        //2.汽车 （数据使用键盘录入）
        /*Car[] arr = new Car[3]; //创建数组

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car(); //创建汽车对象

            System.out.println("输入第"+(i+1)+"汽车品牌：");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("输入汽车价格:");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("输入汽车颜色：");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c; //把汽车对象添加到数组中
        }

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }*/

        //3.手机 （求价格平均值）
       /* Phone[] arr = new Phone[3];

        Phone p1 = new Phone("苹果16", 8999, "黑色");
        Phone p2 = new Phone("vivoX200Promini", 4499, "粉色");
        Phone p3 = new Phone("小米15", 4399, "白色");

        //把手机对象添加到数组
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0; //定义总和
        for (int i = 0; i < arr.length; i++) { //遍历
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        int avg = sum / arr.length; //求得平均值
        System.out.println(avg);*/

        //4.学生 增删改查
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 18);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "赵六", 18);

        boolean flag = contains(arr, stu4.getId()); //调用contains方法
        if (flag) {
            System.out.println("id重复");
        } else {
            int count = getCount(arr); //调用getcount方法，统计数组存了几个元素
            if (count == arr.length) { //判断数组是否存满
                Student[] Newarr = creatNewarr(arr); //调用creatNewarr方法，使数组长度加一
                Newarr[count] = stu4; //将stu4添加到新数组中
                printArr(Newarr);//调用printArr方法，打印学生信息
            } else {
                arr[count] = stu4; //数组未存满，将stu4加入到count索引的位置
            }
        }
        //删除
        int index = getIndex(arr, 3);
        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        } else {
            System.out.println("id不存在");
        }
    }

    //判断id是否唯一的方法
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i]; //获取每个学生对象
            int sid = stu.getId(); //获取每个学生对象的id
            if (sid == id) {
                return true;
            }
        }
        return false;
    }

    //判断数组中存了几个元素的方法
    public static int getCount(Student[] arr) {
        int count = 0; //统计已存元素个数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //使数组长度加一的方法
    public static Student[] creatNewarr(Student[] arr) {
        Student[] Newarr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) { //将旧数组中的元素加入到新数组
            Newarr[i] = arr[i];
        }
        return Newarr;
    }

    //查找id在数组中对应的索引的方法
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    //打印信息的方法
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }
}
