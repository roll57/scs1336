package app;

import java.util.concurrent.ExecutorService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.task.support.ExecutorServiceAdapter;
import org.springframework.security.concurrent.DelegatingSecurityContextExecutorService;

@Profile("failing")
@Configuration
public class FailingConfiguration {


    @Bean
    public ExecutorService executorService() {
        return new DelegatingSecurityContextExecutorService(new ExecutorServiceAdapter((task) -> task.run()));
    }
}
