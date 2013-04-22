/**
 * Created by bungubbang
 * Email: bungubbang57@gmail.com
 */
public class DefaultLog implements Log {
    @Override
    public void write(String data) {
        System.out.println("data = [" + data + "]");
    }
}
