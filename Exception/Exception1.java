package Exception;

//捕获异常
public class Exception1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try { //捕获异常
            System.out.println(arr[10] + 2 / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            //根据出现的异常进行捕获(| 表示或者,可以同时捕获多个异常,但采取同一种处理方案)
            System.out.println("出现异常"); //捕获成功结束try catch语句（）

        } /*catch (Exception e) { //异常中如果存在父子类关系，父类一定要写在下面
            System.out.println("索引越界了");
        }*/
        System.out.println("看看我执行了吗");
    }
}
