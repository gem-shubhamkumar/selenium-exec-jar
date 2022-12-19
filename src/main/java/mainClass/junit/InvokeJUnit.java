package mainClass.junit;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class InvokeJUnit {

    public static void main(String[] args) {
        System.out.println("Started from Junit!");
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        Result result = junit.run(JunitSuite.class);
        resultReport(result);
    }

    public static void resultReport(Result result) {
        System.out.println("===============================================" +
                "\nJUnit Suite" +
                "\nTotal tests run: "+result.getRunCount()+
                ", Passes: "+(result.getRunCount()-result.getFailureCount()-result.getIgnoreCount()) +
                ", Failures: "+result.getFailureCount() +
                ", Failures: "+result.getIgnoreCount() +
                "\n===============================================");
    }
}
