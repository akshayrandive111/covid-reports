package com.poc.report.covidreports.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidReportController {

    @GetMapping("/getReport")
    public String getCovidReports() {
        return "its working!";
    }
}
