package com.at.notes.msvc_notes.config.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:properties/mongodb-prod.properties")
@Profile("prod")
public class AppConfigProd {
}
