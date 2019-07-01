package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//@ActiveProfiles("working")
@ActiveProfiles("failing")
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoBugSleuthTest {

    @Autowired
    private DemoService demoService;



    @Test
    public void testCall() throws InterruptedException {
        demoService.execute();
    }

}