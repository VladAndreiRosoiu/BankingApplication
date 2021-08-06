package org.itss.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("checkInput")
public class CheckInput implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegate) throws Exception {
        //in felul acesta se pot prelua variabilele introduse in form-ul camunda
        String firstName = (String) delegate.getVariable("custFirstName");
        String lastName = (String) delegate.getVariable("custLastName");

        if( delegate.getVariable("custCIC") != null) {
            long cic = (Long) delegate.getVariable("custCIC");
            System.out.println(cic);

        }

        System.out.println(firstName);
        System.out.println(lastName);

        delegate.setVariable("inputOk", true);
    }
}
