package com.epam.clean.code.practice.thirdpartyjar;

public interface Command {
    public boolean canProcess(String command);
    public void process(String command);


}