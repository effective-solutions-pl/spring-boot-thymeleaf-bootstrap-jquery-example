package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.configurations;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tomasz Sokół on 2019-03-18.
 */
@Configuration
public class ThymeleafConfiguration {

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
