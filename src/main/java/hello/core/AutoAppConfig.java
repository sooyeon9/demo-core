package hello.core;

import hello.core.member.MemberRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // AppConfig.java 등등 지금 수동으로 Bean 등록해주고있는 @Configuration 예제 코드가 몇몇개 있으므로 원활한 테스트를 위해 예외처리함
)
public class AutoAppConfig {

}