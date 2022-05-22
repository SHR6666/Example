package day09;

/**
 * 宝马车的产品接口
 */
public interface BWM {
    //产品信息介绍
    //车的发动方式
    void showInfo();
}

class BWM3 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("这个是宝马3汽车");
    }
}

class BWM5 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("这个是宝马5汽车");
    }
}

class BWM7 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("这个是宝马7汽车");
    }
}
