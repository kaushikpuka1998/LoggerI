package Entities;

public class ConsoleLogSink implements LogSink {
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
