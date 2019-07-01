package app;

import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private final Logger LOGGER = LoggerFactory.getLogger(DemoService.class);

    private final ExecutorService executorService;

    public DemoService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void execute() throws InterruptedException {
        executorService.invokeAll(Collections.singletonList(callable()));
    }

    private Callable<Object> callable() {
        return () -> {
            LOGGER.error("CALLED");
            return null;
        };
    }
}
