package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import co.grandcircus.AssessmentPractice;

class TakeItAwayTest {

	@Test
	void removesGivenKey() {
		Map<String, String> map = new HashMap<>(Map.of("Pea", "Green", "Cherry", "Red", "Pear", "Yellow"));
		AssessmentPractice.takeItAway(map, "Pea");
		assertEquals("Red", map.get("Cherry"));
		assertEquals("Yellow", map.get("Pear"));
		assertFalse(map.containsKey("Pea")); //if this works, it should put False
		assertEquals(2, map.size());
	}
	
	@Test
	void removesNothingIfNoMatchingKey() {
		Map<String, String> map = new HashMap<>(Map.of("Pea", "Green", "Cherry", "Red", "Pear", "Yellow"));
		AssessmentPractice.takeItAway(map, "Green");
		assertEquals("Green", map.get("Pea"));
		assertEquals("Red", map.get("Cherry"));
		assertEquals("Yellow", map.get("Pear"));
		assertEquals(3, map.size());
	}

	@Test
	void removesGivenKeyIfLast() {
		Map<String, String> map = new HashMap<>(Map.of("Java", "Cool"));
		AssessmentPractice.takeItAway(map, "Java");
		assertEquals(0, map.size());
	}
	
	@Test
	void returnsTrueIfFound() {
		Map<String, String> map = new HashMap<>(Map.of("Pea", "Green", "Cherry", "Red", "Pear", "Yellow"));
		assertTrue(AssessmentPractice.takeItAway(map, "Pea"));
	}
	
	@Test
	void returnsFalseIfNotFound() {
		Map<String, String> map = new HashMap<>(Map.of("Pea", "Green", "Cherry", "Red", "Pear", "Yellow"));
		assertFalse(AssessmentPractice.takeItAway(map, "Bean"));
	}

}