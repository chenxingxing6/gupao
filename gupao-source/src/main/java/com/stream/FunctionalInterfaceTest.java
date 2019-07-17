package com.stream;

/**
 * User: lanxinghua
 * Date: 2019/7/17 10:49
 * Desc: 函数式编程
 */
public class FunctionalInterfaceTest {
    @FunctionalInterface // 编译器进行检查,只能有一个抽象方法
    interface Interface1{
        int doubleNum(int i);


        default int add(int x, int y){
            return x + y;
        }
    }

    public static void main(String[] args) {
        // 接口doubleNum实现方法
        Interface1 i1 = (i) -> i * 2;
        System.out.println(i1.doubleNum(2));

        //调用接口add方法
        System.out.println(i1.add(1, 3));

        // 注入service
        IMyService myService = () -> {
            System.out.println("方法实现");
            return "ok";
        };
        // 比如这里是controller
        templateRequest(() -> myService.pageQuery());
    }


    // 实际在项目中的用法

    /**
     * 真正的业务处理
     */
    @FunctionalInterface
    public static interface RequestExecutor {
        Object doExecute() throws Exception;
    }

    /**
     * 请求模板
     */
    public static void templateRequest(RequestExecutor executor){
        try {
            Object result = executor.doExecute();
            System.out.println("处理成功：" + result);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("处理失败：" + e.getMessage());
        }
    }

    /**
     * 接口代码
     */
    interface IMyService{
        public Object pageQuery();
    }
}
