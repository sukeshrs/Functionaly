package com.sukesh.functional.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableCompare implements Runnable{
    Logger LOGGER = LoggerFactory.getLogger(RunnableCompare.class);
    @Override
    public void run() {
        LOGGER.info("Thread : {}" , Thread.currentThread().getId());
    }
}
