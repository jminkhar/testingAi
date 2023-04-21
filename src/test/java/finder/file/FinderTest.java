package finder.file;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinderTest {

    @Test
    public void testLocateUniverseFormula() {
        String path = Finder.locateUniverseFormula();
        assertEquals("C:\\projects\\testingAi\\src\\test\\resources\\tmp\\documents\\a\\basic\\test\\universe-formula", path, "The path to the universe-formula file is incorrect.");
    }
}
