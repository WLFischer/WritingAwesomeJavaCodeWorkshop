package de.stevenschwenke.java.writingawesomejavacodeworkshop.part1JavaLanguageAndMethods.c09_lombok.nonnull;

import org.junit.Test;

public class NonNullTest {

    @Test(expected = NullPointerException.class)
    public void nonNullTest() throws Exception {
        NonNullExampleLombok x = new NonNullExampleLombok(null);
    }
}
