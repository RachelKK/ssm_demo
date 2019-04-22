import com.chixing.util.PageHelperUtil;

public class Test {


    @org.junit.Test
    public void test(){
        System.out.println( Math.ceil(27/5));
        System.out.println( Math.round(27/5));
        System.out.println( Math.floor(27/5));
        System.out.println(  27%5==0?27/5:27/5+1);
    }
}
