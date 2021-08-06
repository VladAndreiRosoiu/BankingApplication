package org.itss.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.itss.dao.CustomerRepository;
import org.itss.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("doSearch")
public class SearchCustomer implements JavaDelegate {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}
