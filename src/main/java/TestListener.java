import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class TestListener implements ITestListener {
  public void onTestStart(ITestResult result) {

  }

  public void onTestSuccess(ITestResult result) {
    printTestSummary(result);
  }

  public void onTestFailure(ITestResult result) {

  }

  public void onTestSkipped(ITestResult result) {

  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

  }

  public void onStart(ITestContext context) {

  }

  public void onFinish(ITestContext context) {

  }

  private void printTestSummary(ITestResult result){
    Method method = result.getMethod().getConstructorOrMethod().getMethod();
    TestSummary testSummaryAnnotation = method.getAnnotation(TestSummary.class);
    System.out.println("Test Case Summary: " + testSummaryAnnotation.summaryText());
  }
}
