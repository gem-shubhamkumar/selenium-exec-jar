package mainClass.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testcases.junit.SeleniumTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SeleniumTest.class
})
public class JunitSuite {
}
