package com.hexagonalarch.app.infrastructure.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class SpringEventListener /*implements ApplicationListener<LogSpringEvent>*/ {

    private Logger log = LoggerFactory.getLogger(SpringEventListener.class);

    @EventListener
    public void onApplicationEvent(LogSpringEvent event) {
        log.info("Event received " + event.getMessage());
    }

}
