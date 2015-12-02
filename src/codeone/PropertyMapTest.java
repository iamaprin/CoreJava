/**
 * /codeone/ProoertyMap.java
 * author: iamaprin
 * date: 2015/12/2
 * time: 17:07
 * description: property map test
 */
package codeone;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyMapTest {

    public static void main(String[] args) throws IOException {
        Properties settings = new Properties();
        settings.put("width", "200");
        settings.put("title", "Hello, world!");

        //FileOutputStream outFile = new FileOutputStream("program.properties");
        FileWriter outFile = new FileWriter("./src/codeone/program.properties");
        settings.store(outFile, "Program Properties");

        FileReader inFile = new FileReader("./src/codeone/program.properties");
        settings.load(inFile);

        /*
        result:
            #Program Properties
            #Wed Dec 02 17:15:43 CST 2015
            width=200
            title=Hello, world\!
         */

    }
}