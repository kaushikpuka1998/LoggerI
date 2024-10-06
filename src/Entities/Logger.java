package Entities;

import java.util.Date;

public class Logger {
    private static Logger INSTANCE;
    private LogLevel logLevel;
    private LogSink logSink;


    private Logger(){
        logLevel = LogLevel.INFO;
        logSink = new ConsoleLogSink();
    }

    public static Logger getInstance(){
        if(INSTANCE == null){
            return new Logger();
        }
        return INSTANCE;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public LogSink getLogSink() {
        return logSink;
    }

    public void setLogSink(LogSink logSink) {
        this.logSink = logSink;
    }

    public void log(LogLevel level, String msg){
        if(level.ordinal() >= logLevel.ordinal()){
            String logMessage = "[" + new Date() + "] [" + level + "] " + msg;
            logSink.log(logMessage);
        }
    }
}
