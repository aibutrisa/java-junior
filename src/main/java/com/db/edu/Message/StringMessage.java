package com.db.edu.Message;

import com.db.edu.ConsoleSaver;
import com.db.edu.Prefix;

public class StringMessage implements Message {
    private String messageBody;
    int stringCount = 1;

    public StringMessage(String messageBody) {
        this.messageBody = messageBody;
    }
    /*
    void printAccumulatedString() {
        if (stringCount != 0) {
            ConsoleSaver.printToConsole(this.toString());
            stringCount = 0;
            messageBody = "";
        }
    }
     */
    /*
    public void accumulate(StringMessage message) {
        if (stringCount > 0 && !messageBody.equals(message.messageBody)) {
            this.printAccumulatedString();
        }
        messageBody = message.messageBody;
        stringCount++;
    }
    */

    @Override
    public String toString() {
        return Prefix.STRING.value + messageBody + (stringCount > 1 ? " (x" + stringCount + ")" : "");
    }

    @Override
    public void accumulate(Message message) {
        if (stringCount > 0 && !messageBody.equals(((StringMessage)message).messageBody)) {
            this.printAccumulated();
        }
        messageBody = ((StringMessage)message).messageBody;
        stringCount++;
    }

    @Override
    public void printAccumulated() {
        ConsoleSaver.printToConsole(this.toString());
        stringCount = 0;
        messageBody = "";
    }
}
