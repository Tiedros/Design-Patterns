package com.tiedros.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
