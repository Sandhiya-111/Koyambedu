package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The test on start"+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test on success"+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test on Failure"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The test on skipped"+result.getName()); }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("The test on start"+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("The test on start"+context.getName());
    }
}
