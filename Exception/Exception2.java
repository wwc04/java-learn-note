package Exception;

//抛出异常
public class Exception2 {
    public static void main(String[] args) {
        //获取数组最大值
        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }
        System.out.println(max);
    }
    public static int getMax(int[] arr) throws RuntimeException{ //
        //手动创建一个异常对象，并把这个异常交给方法的调用者处理
        if(arr == null){
            throw new NullPointerException();//(抛出异常后下面的语句不会执行)
        }

        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("看看是否执行");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
