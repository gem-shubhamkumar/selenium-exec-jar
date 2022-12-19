package mainClass.testng;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class InvokeTestNG {
    public static void main(String[] args) {
        System.out.println("Started from TestNG!");
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        File file = new File("classes/testng.xml");
        String fileName = "testng.xml";
        if (file.exists()) {
            suites.add("classes/" + fileName);
        } else {
            suites.add("src/main/resources/" + fileName);
        }
        testng.setTestSuites(suites);
        testng.run();
    }
}

