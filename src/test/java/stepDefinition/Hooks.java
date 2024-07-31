package stepDefinition;

import io.cucumber.java.After;
import util.Drivers;

public class Hooks {

    @After
    public void tearDown() {
        Drivers.quitDriver();
    }
}
