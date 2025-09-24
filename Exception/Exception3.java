package Exception;

//异常中的常见方法(后面的语句可正常执行)
public class Exception3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //1.返回此throwable的详情消息字符串
            String message = e.getMessage();
            System.out.println(message);

            //2.返回此可抛出的简短描述
            /*String str = e.toString();
            System.out.println(str);*/

            // 3.把异常的错误消息输出在控制台(常用)
            /*e.printStackTrace();*/
        }
        System.out.println("执行");
    }
}
