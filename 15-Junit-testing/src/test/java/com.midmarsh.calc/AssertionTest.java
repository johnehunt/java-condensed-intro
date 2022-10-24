package com.midmarsh.calc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Test cases for assertions")
public class AssertionTest {

    @Test
    void testAssertions() {

        assertThat(
                "".isEmpty())
                .isTrue();

        List<String> list = Arrays.asList("1", "2", "3");
        assertThat(list)
                .isNotEmpty();

        assertThat(list)
                .startsWith("1");

    }

    @Test
    void testFrodoData() {
        String frodo = "Frodo";
        List<String> fellowshipOfTheRing = Arrays.asList(frodo, "Sam");
        assertThat(frodo)
                .isNotEqualTo("Sauron")
                .isIn(fellowshipOfTheRing);

        assertThat(frodo)
                .startsWith("Fro")
                .endsWith("do")
                .isEqualToIgnoringCase("frodo");

        assertThat(fellowshipOfTheRing)
                .hasSize(2)
                .contains(frodo, "Sam")
                .doesNotContain("Sauron");
    }
}
