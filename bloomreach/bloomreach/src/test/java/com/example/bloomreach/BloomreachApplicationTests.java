package com.example.bloomreach;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bloomreach.controller.BloomreachController;

@RunWith(SpringRunner.class)
@SpringBootTest
class BloomreachApplicationTests {

	@Test
	public void testControllerMan() {
		BloomreachController controller = new BloomreachController();
		String result = controller.classifyPerson(25, true);
		assertEquals(result, "MAN");
	}

	@Test
	public void testControllerBoy() {
		BloomreachController controller = new BloomreachController();
		String result = controller.classifyPerson(7, true);
		assertEquals(result, "BOY");
	}

	@Test
	public void testControllerGirl() {
		BloomreachController controller = new BloomreachController();
		String result = controller.classifyPerson(12, false);
		assertEquals(result, "GIRL");
	}

	@Test
	public void testControllerWoman() {
		BloomreachController controller = new BloomreachController();
		String result = controller.classifyPerson(25, false);
		assertEquals(result, "WOMAN");
	}

}
