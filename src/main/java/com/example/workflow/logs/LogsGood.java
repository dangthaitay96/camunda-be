package com.example.workflow.logs;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class LogsGood implements JavaDelegate {
    private final Logger log = Logger.getLogger(LogsGood.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("this is message from good weather - " + delegateExecution.getId());
    }
}
