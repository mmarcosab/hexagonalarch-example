package com.hexagonalarch.app.infrastructure.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;



@Component
public class EventListener implements ApplicationListener<LogSpringEvent> {

    private Logger log = LoggerFactory.getLogger(EventListener.class);

    @Override
    public void onApplicationEvent(LogSpringEvent event) {
        log.info("Event received " + event.getMessage());
    }

}
