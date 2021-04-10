package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //현재 프로젝트의 AppConfig.class(수동설정방법)이 component로 포함되있기 때문에 충돌남.. 이것을 해결
public class AutoAppConfig {


}
