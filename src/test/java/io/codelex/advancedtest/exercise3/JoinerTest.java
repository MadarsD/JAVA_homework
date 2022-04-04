package io.codelex.advancedtest.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void testJoin() {
        Joiner joiner = new Joiner("-");
        Joiner joiner2 = new Joiner("+");
        String expected = "1-2-3-4";
        String expected2 = "a+b+c";

        String actual = joiner.join(1, 2, 3, 4);
        String actual2 = joiner2.join("a", "b", "c");

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}
