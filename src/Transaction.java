import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    private static int count = 0;

    private int id;
    private String time;
    private String item;
    private String status;

    Transaction(String item) {
        count++;
        this.id = count;
        this.time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        this.item = item;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Transaction.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        count++;
        this.id = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTime() {
        this.time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

}
