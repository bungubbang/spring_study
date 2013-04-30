/**
 * Created by bungubbang
 * Email: bungubbang57@gmail.com
 */
public class Client {

    private Log log;

    public void setLog(Log log) {
        this.log = log;
    }

    void biz(String args){
        log.write(args);
    }
}
