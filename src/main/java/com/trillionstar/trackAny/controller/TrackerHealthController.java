package com.trillionstar.trackAny.controller;

import com.trillionstar.trackAny.model.TrackerHealthResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerHealthController {

    private static final Logger logger = LoggerFactory.getLogger(TrackerHealthController.class);

    @GetMapping("/services/health")
    public TrackerHealthResponse greeting() {

        logger.info("Received a request to check services health.");

        TrackerHealthResponse response = new TrackerHealthResponse();
        response.setStatus("OK Soma, Welcome to Open shift, great it is working!!! AAAAWEsome!!!!!!!");
        response.setDescription("Tracker Service is healthy and running successfully in AWS. Thank you!!!.");

        logger.info("Tracker health response completed");

        return response;

    }
}
