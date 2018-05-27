package pl.bpmn.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity;

import java.util.UUID;

/**
 * Created by Dawid on 27.05.2018 at 19:01.
 */
public class StartProcessDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String uuid = UUID.randomUUID().toString();
        System.out.println("Business key: " + uuid);
        ((ExecutionEntity) delegateExecution).setBusinessKey(uuid);
    }
}
