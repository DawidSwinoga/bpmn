package pl.bpmn.demo.rest;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dawid on 27.05.2018 at 19:14.
 */

@RestController
public class RigczRest {

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("/rest/api/{processId}")
    public void getRigcz(@PathVariable String processId, @RequestParam Boolean rigcz) {
        System.out.println("Proces id: " + processId + " is rigcz: " + rigcz);
        MessageCorrelationResult result = runtimeService.createMessageCorrelation("msg_test")
                .processInstanceBusinessKey(processId)
                .setVariable("rigcz", rigcz)
                .correlateWithResult();
    }
}
