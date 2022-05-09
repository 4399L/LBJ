package MQ;

public class Message implements Comparable<Message>{
    public String msg;
    public int priority;

    public Message(String msg,int priority) {
        this.msg=msg;
        this.priority=priority;
    }
      public int compareTo(Message o) {
        return o.priority - this.priority;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg +
                ", priority=" + priority + '\'' +
                '}';
    }
}
