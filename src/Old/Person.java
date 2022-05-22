package Old;

public class Person {
        //属性，成员变量,类的成员变量可以先声明，不用初始化，类成员变量是有默认值string name; l[姓名，string的默认值是null
        String name;
        int age ; //年龄，int的黑默t认值是。
        //行为，方法，也叫函数
        //   玄食
        //打印姓名*/

        public void showName () {//万法的名称如果是多个单词，首个的单词的首字母小写，其他的单词首字母大写，这样就像一个驼!
            System.out.println("姓名:" + name);
            getAge();  //同一个类中所有方法可以互相调用，不用new去实例化对象
//            public void xx(){}    //这是不可以的，方法中不能再定义方法
        }

    /*宋食
    ★获取年龄*@return*/
        public int getAge () { //如果是一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据，使用return关键字，返
            return age;  //方法上定义的int是返回值的类型，return后跟的是方法的返回值

    }
}
