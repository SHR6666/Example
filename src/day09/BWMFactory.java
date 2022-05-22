package day09;

public interface BWMFactory {
    BWM productBWM();
}

/**
 * 实现具体车型的生产
 */
class BWM3Factory implements BWMFactory {
    @Override
    public BWM productBWM() {
        System.out.println("生产宝马3系车");
        return new BWM3();
    }
}
class BWM5Factory implements BWMFactory{
    @Override
    public BWM productBWM() {
        System.out.println("生产宝马3系车");
        return new BWM5();
    }
}
class BWM7Factory implements BWMFactory{
    @Override
    public BWM productBWM() {
        System.out.println("生产宝马7系车");
        return new BWM7();
    }
}
