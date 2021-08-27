package com.db.edu.Message;

import com.db.edu.ConsoleSaver;
import com.db.edu.Prefix;

public class IntMessage implements Message {
    private int messageBody;

    public void printAccumulated() {
            ConsoleSaver.printToConsole(this.toString());
            messageBody = 0;
    }

    public IntMessage(int messageBody) {
        this.messageBody = messageBody;
    }

    public void accumulate(Message message) {
        messageBody += ((IntMessage)message).messageBody;
    }

    @Override
    public String toString() {
        return Prefix.PRIMITIVE.value + messageBody;
    }
}
