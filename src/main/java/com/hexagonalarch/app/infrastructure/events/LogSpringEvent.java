package com.hexagonalarch.app.infrastructure.events;

import org.springframework.context.ApplicationEvent;

public class LogSpringEvent extends ApplicationEvent {

    private String message;

    public LogSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
