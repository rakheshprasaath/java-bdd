package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@regression")
    public void Regression_Setup()
    {
        System.out.println("Regression setup");
    }

    @Before("@smoketest")
    public void Smoke_Setup()
    {
        System.out.println("smoke setup");
    }
    
}
