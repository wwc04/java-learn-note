package Exception;

//自定义异常
public class Exception4 {
    public static void main(String[] args) {
        try {
            saveAge(10); //自定义运行时异常
        } catch (Exception e) { //抓住抛出的异常
            e.printStackTrace(); //打印异常信息
            System.out.println("saveAge底层出现bug");
        }

        try {
            saveAge2(1200);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("saveAge2底层出现bug");
        }
    }

    public static void saveAge(int age) {
        if (age > 0 && age < 150) {
            System.out.println("年龄保留成功：" + age);
        } else {
            throw new AgeIllegalRuntimeException("age is illegal, your age is " + age); //抛出自定义运行时异常对象(问题不严重)
        }
    }

    public static void saveAge2(int age) throws AgeIllegalException{
        if (age > 0 && age < 150) {
            System.out.println("年龄保留成功：" + age);
        } else {
            throw new AgeIllegalException("age is illegal, your age is " + age); //抛出自定义编译时异常对象(问题严重)
        }
    }
}
