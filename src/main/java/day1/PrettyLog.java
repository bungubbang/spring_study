package day1;

/**
 * Created by bungubbang
 * Email: bungubbang57@gmail.com
 */
public class PrettyLog implements Log{

    @Override
    public void write(String data) {
        System.out.println("*****************");
        System.out.println("data = [" + data + "]");
        System.out.println("*****************");
    }
}
