import java.lang.reflect.Method;

/**
 * Created by bungubbang
 * Email: bungubbang57@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Log log = new PrettyLog();
        client.setLog(log);
        client.biz("로그로그");
    }


}
