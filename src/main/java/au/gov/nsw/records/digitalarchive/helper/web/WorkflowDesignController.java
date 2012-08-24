package au.gov.nsw.records.digitalarchive.helper.web;

import au.gov.nsw.records.digitalarchive.helper.model.WorkflowDesign;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/workflowdesigns")
@Controller
@RooWebScaffold(path = "workflowdesigns", formBackingObject = WorkflowDesign.class)
public class WorkflowDesignController {
}
