package com.connect;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.core.NestedCheckedException;
import java.net.ConnectException;


@SpringBootTest
public class SpringCouchbaseConnectionApplicationTests {

	
//	@Rule
//	public final OutputCapture output = new OutputCapture();
//	
//	
//	@Test
//	public void contextLoads() {
//		
//		
//	}
//	@Test
//	public void testDefaultSettings() {
//		try {
//			new SpringApplicationBuilder(SpringCouchbaseConnectionApplication.class)
//					.run("--server.port=0");
//		}
//		catch (RuntimeException ex) {
//			if (serverNotRunning(ex)) {
//				return;
//			}
//		}
//		assertThat(this.output.toString())
//				.contains("firstName='Alice', lastName='Smith'");
//	}
//
//	
//	private boolean serverNotRunning(RuntimeException ex) {
//		@SuppressWarnings("serial")
//		NestedCheckedException nested = new NestedCheckedException("failed", ex) {
//		};
//		if (nested.contains(ConnectException.class)) {
//			Throwable root = nested.getRootCause();
//			if (root.getMessage().contains("Connection refused")) {
//				return true;
//			}
//		}
//		return false;
//	}
}
