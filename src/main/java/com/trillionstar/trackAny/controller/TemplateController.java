package com.trillionstar.trackAny.controller;

import com.trillionstar.trackAny.model.TrackerTemplate;
import com.trillionstar.trackAny.model.TrackerTemplateAdditionResponse;
import com.trillionstar.trackAny.model.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class TemplateController {

    private static final Logger logger = LoggerFactory.getLogger(TemplateController.class);

    @PostMapping(value = "/templates/template/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Template greeting(@RequestBody Template templateDetails) {

        logger.info("Recieved a request to add a template.");

        String templateId = templateDetails.getTemplateId();
        String templateName = templateDetails.getTemplateName();
        String templateDescription = templateDetails.getTemplateDescription();

        TrackerTemplateAdditionResponse response = new TrackerTemplateAdditionResponse();
        response.setStatus("Success  Soma");
        response.setDescription("Template addition successful.");

        logger.info("Template creation is successful.");

        return templateDetails;

    }
}
