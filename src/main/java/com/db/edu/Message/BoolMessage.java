package com.db.edu.Message;

import com.db.edu.ConsoleSaver;
import com.db.edu.Prefix;

public class BoolMessage implements Message {
    private boolean messageBody;

    public BoolMessage(boolean messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String toString() {
        return Prefix.PRIMITIVE.value + messageBody;
    }

    @Override
    public void accumulate(Message message) {
    }

    @Override
    public void printAccumulated() {
        ConsoleSaver.printToConsole(this.toString());
    }
}
