package finder.file;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class Finder {
    /**
     * Locates the universe-formula file.
     */

    public static String locate(String name, File file){
        File[] files = file.listFiles();

        //loop in files and subfiles
        String absolutePath = null;
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().equals(name)) {
                    absolutePath =  f.getAbsolutePath();
                }
            } else {
                absolutePath = locate(name, f);
            }
        }
        return absolutePath;
    }
    public static String locateUniverseFormula() {
        // find the file named universe-formula
        // in the directory /tmp/documents/a/basic/test
        // and return the path to the file
        File dir = new File("C:/projects/testingAi/src/test/resources/tmp/");
        String absolutePath = locate("universe-formula", dir);
    
        return absolutePath;
    }
}
