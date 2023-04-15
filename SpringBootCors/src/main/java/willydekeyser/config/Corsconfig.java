package willydekeyser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Corsconfig {

	@Bean
	WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/cors")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET", "POST");
            }
		};
		
	}
}
