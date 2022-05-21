package day08;

public class MyDate {
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    int year, month, day;

    @Override
    public String toString() {
        String str = this.year + "-" + this.month + "-"+this.day;
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        int flag = 0;
        if (obj instanceof MyDate){
            MyDate md = (MyDate) obj;
            flag = 0;

            if (this.year != md.year){
                flag += 1;
            }
            if (this.month != md.month){
                flag += 1;
            }
            if (this.day != md.day){
                flag += 1;
            }
        }
        if (flag == 0){
            return true;
        }else {
            return false;
        }

    }
}
