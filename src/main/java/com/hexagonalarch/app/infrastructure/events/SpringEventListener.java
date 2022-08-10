package com.hexagonalarch.app.infrastructure.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SpringEventListener {

    private Logger log = LoggerFactory.getLogger(SpringEventListener.class);

    @Async
    @EventListener
    public void onApplicationEvent(LogSpringEvent event) throws InterruptedException {
        Thread.sleep(5000);
        log.info("Event received " + event.getMessage());
    }

}
