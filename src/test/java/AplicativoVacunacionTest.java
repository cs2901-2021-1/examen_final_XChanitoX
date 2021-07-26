import org.testng.Assert;
import org.testng.annotations.Test;
import vacunacion.AplicativoVacunacion;

import java.io.IOException;
import java.util.logging.Logger;

public class AplicativoVacunacionTest {

    AplicativoVacunacion app = AplicativoVacunacion.getInstance();

    static final Logger logger = Logger.getLogger(AplicativoVacunacion.class.getName());

    @Test(invocationCount = 1, threadPoolSize = 50)
    public void test5() throws IOException {

        long beginTime = System.currentTimeMillis();
        long maxExecutionTime = 2000;

        //TEST


        long finalTime = System.currentTimeMillis();
        long executionTime = finalTime - beginTime;
        logger.info(String.valueOf(executionTime));
        Assert.assertTrue(executionTime < maxExecutionTime);
    }
}
