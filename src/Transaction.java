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

}
