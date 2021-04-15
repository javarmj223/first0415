import com.dahua.service.EmpImp;
import com.dahua.service.EmpService;
import org.junit.Test;

public class TestDemo {

    EmpService empService=new EmpImp();
    @Test
    public void test1(){
        System.out.println(empService.listemps().size());
    }

}
