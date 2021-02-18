public class annotation {

    public static void main(String[] args) {
        try {
            //获取User的Class对象，参数为需要获取类对象的全类名
           Class c1 = Class.forName("User");
           System.out.println(c1.getName());
        //因为是动态编译，所有我们需要抛出类未找到的异常   
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("==============");

        //new一个user对象
        User user = new User();
        //通过user对象来获取User类对象
        Class c2 = user.getClass();
        System.out.println(c2.getName());
        System.out.println("==============");

        //通过导包获取类名点class来获取类对象
        Class c3 = User.class;
        System.out.println(c3.getName());
    }
}

class User {

    //这里name用的是私有类型
    private String name;
    //这里age用的是公有类型
    public int age;

	//无参构造器
    public User(){}
    
    //有参构造器
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}