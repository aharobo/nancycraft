package com.mtx.lesson1129;

/**
 * @Author: 沙陌  微信Matongxue_2
 * @Date: 2020/11/29 16:38
 */
public class ExceptionStudy {

    public static void main(String[] args) throws InterruptedException{
        //异常如果不处理的情况下会阻塞程序的运行，在报异常的错误代码之后都不会被运行

        int[] iArray={1,4,5};

        //当有风险的代码的异常出错在业务上不能影响我的正常后续执行时，则需要做异常处理
        //异常捕获处理
        try{
            //有可能会报异常的代码放在try代码块里
            System.out.println(2/0);
            iArray[3]=8;
        }catch (Exception e){
            System.out.println("这啥异常都捕获"+e);
        }finally {
            System.out.println("不管上面有没有异常，这句话都会被执行");
        }

//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组越界啦"+e);
//        } catch (ArithmeticException e){
//            System.out.println("分母不能为0"+e);
//        }

        System.out.println("赋值完成");
        //当所调用的方法向你throws了一个异常，此时需要考虑该异常是否在能力处理范围之内，如果在则做捕获处理，如果不在则向上层抛出，throws
        Thread.sleep(3000);//表示线程休眠3000毫秒

    }
}
