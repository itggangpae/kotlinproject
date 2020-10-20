package chap13;

interface JavaInterface1 {
    void callback();
}
public class SAMTest {
    public JavaInterface1 callback;
    public void setInterface(JavaInterface1 callback){
        this.callback=callback;
    }
}

