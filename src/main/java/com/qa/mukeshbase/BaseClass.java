package com.qa.mukeshbase;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;

public class BaseClass {
    public ExtentReports reporter;
    public ExtentTest logger;


    @BeforeSuite
    public void setup(){
        ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("src/Reports/Demo.html"));
        reporter = new ExtentReports();
        reporter.attachReporter(extent);

    }

    @AfterMethod
    public void tearDownMethod(){
        reporter.flush();
    }



}
