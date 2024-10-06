package Entities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogSink implements LogSink {
    private String filename;

    public FileLogSink(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(String msg){
        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename, true));
            writer.println(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
