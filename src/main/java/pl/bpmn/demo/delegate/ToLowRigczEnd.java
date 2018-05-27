package pl.bpmn.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Created by Dawid on 27.05.2018 at 18:41.
 */
public class ToLowRigczEnd implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("To low rigcz: " + delegateExecution.getVariable("customerId"));
    }
}
