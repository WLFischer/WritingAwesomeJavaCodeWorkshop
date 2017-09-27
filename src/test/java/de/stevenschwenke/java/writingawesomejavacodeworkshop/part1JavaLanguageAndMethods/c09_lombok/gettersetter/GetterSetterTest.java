package de.stevenschwenke.java.writingawesomejavacodeworkshop.part1JavaLanguageAndMethods.c09_lombok.gettersetter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterSetterTest {

    @Test
    public void name() throws Exception {
        GetterSetterExampleLombok object = new GetterSetterExampleLombok();
        object.setAge(12);
        assertEquals(12, object.getAge());
        object.setName("name");
        //object.getName();  // Only setter specified!
    }
}
