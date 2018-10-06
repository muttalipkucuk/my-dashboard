package com.kucuk.mydashboard.cucumber.stepdefs;

import com.kucuk.mydashboard.MyDashboardApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyDashboardApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
