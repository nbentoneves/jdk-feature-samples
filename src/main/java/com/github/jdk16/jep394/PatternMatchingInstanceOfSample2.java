package com.github.jdk16.jep394;


import lombok.extern.log4j.Log4j2;

@Log4j2
public final class PatternMatchingInstanceOfSample2 {

    private static void loggingObjectIfGreaterThenX(Object obj, int x) {
        if (obj instanceof Integer value && value > x) {
            log.info("This is a String: {}", value);
        }
    }

    public static void main(final String[] args) {

        loggingObjectIfGreaterThenX(200, 30);

        //This one will not be logged
        loggingObjectIfGreaterThenX(300, 400);

    }

}


