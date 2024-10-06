package Entities;

public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARN(4),
    ERROR(5);

        private final int value;

    LogLevel(int value) {
        this.value = value;
    }
}
