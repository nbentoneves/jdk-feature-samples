package com.github.jdk16.jep394;


import lombok.extern.log4j.Log4j2;

@Log4j2
public final class PatternMatchingInstanceOfSample1 {

    private static void loggingObject(Object obj) {
        if (obj instanceof String value) {
            log.info("This is a String: {}", value);
        } else if (obj instanceof Integer value) {
            log.info("This is a Integer: {}", value);
        } else {
            log.error("Please implement a new print object!");
        }
    }

    public static void main(final String[] args) {

        loggingObject("Hey! I'm a String");
        loggingObject(200);
        loggingObject(40.5);

    }

}


