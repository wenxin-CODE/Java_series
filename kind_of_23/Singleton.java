public class Singleton{
    public static void main(String[] args) {
        //饿汉模式测试
//        Singleton1 demo1 = Singleton1.getInstance();
//        Singleton1 demo2 = Singleton1.getInstance();
//        System.out.println(demo1 == demo2);
//        System.out.println("demo1.hashCode="+demo1.hashCode());
//        System.out.println("demo2.hashCode="+demo2.hashCode());
        //在同一对象上多次调用 hashCode 方法时，必须一致地返回相同的整数
        //二者的hashcode相同

        //______________________________________
//        Singleton2 demo3 = Singleton2.getInstance();
//        Singleton2 demo4 = Singleton2.getInstance();
//        System.out.println(demo3 == demo4);
//        System.out.println("demo1.hashCode="+demo3.hashCode());
//        System.out.println("demo2.hashCode="+demo4.hashCode());

        //------------------------------------------
//        Singleton3 demo3 = Singleton3.getInstance();
//        Singleton3 demo4 = Singleton3.getInstance();
//        System.out.println(demo3 == demo4);
//        System.out.println("demo1.hashCode="+demo3.hashCode());
//        System.out.println("demo2.hashCode="+demo4.hashCode());

        //---------------------------------------
        Singleton4 demo3 = Singleton4.getInstance();
        Singleton4 demo4 = Singleton4.getInstance();
        System.out.println(demo3 == demo4);
        System.out.println("demo1.hashCode="+demo3.hashCode());
        System.out.println("demo2.hashCode="+demo4.hashCode());
    }
}

//饿汉模式（静态变量）
/*
 * 类装载完成就实例化，避免线程同步问题，但可能未被使用，浪费了
 * */
class Singleton1{
    private Singleton1(){

    }

    private final static Singleton1 instance = new Singleton1();

    //返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }
}

//饿汉模式（静态变量）
//和上一种类似
class Singleton2{
    private Singleton2() {

    }

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}

//懒汉模式
/*
* 只能在单线程中使用，多线程会产生多个实例
* 一个线程还未执行if内部，另一个也经过判断
* */
class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){

    }

    //提供静态方法，使用该方法才创建
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

//懒汉模式，线程安全
/*
* 效率低，实例化代码实际只执行一次，后面直接return
* */
class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){}

    //静态方法，加入同步处理，解决线程问题
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}