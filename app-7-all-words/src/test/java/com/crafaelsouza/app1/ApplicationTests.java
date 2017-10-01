package com.crafaelsouza.app1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.crafaelsouza.app7allwords.App7AllWords;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App7AllWords.class)
@ActiveProfiles("sentence")
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}