package com.nestorcicardini.D2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class TestApplicationProperties {
	@Value("${application.secretPassword}")
	String secret;

}
