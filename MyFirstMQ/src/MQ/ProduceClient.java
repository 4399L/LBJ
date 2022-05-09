package MQ;

public class ProduceClient {
    public static void main(String[] args) throws Exception{
        MqClient client = new MqClient();
        client.produce("这是第四条消息，优先级为5"); //根据优先级进行消费，优先级越高越进行优先消费
    }
}
