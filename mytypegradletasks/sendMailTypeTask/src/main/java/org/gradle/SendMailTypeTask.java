package org.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class SendMailTypeTask extends DefaultTask {

    private String to;

    @Input
    public void setTo(String to) {
        this.to = to;
    }

    @TaskAction
    public void action()  {
        String myaddress = (String) getProject().getProperties().get("myaddress");
        System.out.println("Sending message from " + myaddress + " to " + to);
    }

}
