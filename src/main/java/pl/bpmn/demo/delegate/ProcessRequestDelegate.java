package pl.bpmn.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Created by Dawid on 27.05.2018 at 17:58.
 */
public class ProcessRequestDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Processing request by '" + execution.getVariable("customerId") + "'..." + " business key: " + execution.getProcessBusinessKey());
    }
}