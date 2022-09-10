package com.trillionstar.trackAny.controller;

import com.trillionstar.trackAny.model.Organization;
import com.trillionstar.trackAny.model.OrganizationResponse;
import com.trillionstar.trackAny.model.TrackerTemplate;
import com.trillionstar.trackAny.model.TrackerTemplateAdditionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrgnaizationController {

    private static final Logger logger = LoggerFactory.getLogger(OrgnaizationController.class);

    @PostMapping(value = "/organizations/organization/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody OrganizationResponse greeting(@RequestBody Organization templateDetails) {

        logger.info("Request received to add a new oragnization.");

        long templateId = templateDetails.getOrgId();
        String templateName = templateDetails.getOrgName();
        String templateDescription = templateDetails.getDescription();

        OrganizationResponse response = new OrganizationResponse();
        response.setStatus("Success");
        response.setDescription("Organization addition successful.");

        logger.info("Organization creation successfully completed.");

        return response;

    }
}
