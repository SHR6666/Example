public class Animal {
    String name; //动物的名称
    int eve;//眼睛的个数
    int legs; //几条腿

    /**
     * 输出动物吃的食物param food食物
     */
    public void eat(String food) {    //(String food)是形参，这个叫方法参数,方法的形参可以有多个，参数之间用逗号分割

        System.out.println("此种动物的食物是:" + food);
    }

    /**
     * 动物的移动方式
     * param moveType移动方式
     */
    public void move(String moveType) {
        int i = 0;  //这个叫方法局部变量
        System.out.println("此种动物的移动方式是:" + moveType);
    }
}
