package day08;

public class Order {
    public Order(int OrderId, String OrderName){
        this.OrderId = OrderId;
        this.OrderName = OrderName;
    }
    int OrderId;
    String OrderName;

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if (obj instanceof Order){
            Order o = (Order) obj;
            if (this.OrderId == o.OrderId && this.OrderName.equals(o.OrderName)){
                flag = true;
            }
        }
        return flag;
    }
}
