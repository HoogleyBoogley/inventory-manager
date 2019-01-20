import java.util.ArrayList;

public class Type {

    private static int count = 0;

    private int id;
    private String name;
    private String shortcode;
    private int quanity;

    Type() {
        count++;
        this.id = count;
        this.name = "type" + this.id;
        this.shortcode = Integer.toString(this.id);
        this.quanity++;
    }

    Type(String name, String shortcode) {
        count++;
        this.id = count;
        this.name = name;
        this.shortcode = shortcode;
        this.quanity++;
    }

    public void addOne() {
        this.quanity++;
    }

    public void removeOne() {
        this.quanity--;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }
}
