package cl.lge.paidme.cucumber.stepdefs;

import cl.lge.paidme.PaidmeBackendApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PaidmeBackendApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
