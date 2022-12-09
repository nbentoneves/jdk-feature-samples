package com.github.jdk14.jep354;


import java.util.Arrays;
import lombok.extern.log4j.Log4j2;

@Log4j2
public final class SwitchSample1 {

    private static final String LOGGING_FORMAT_MESSAGE = "Your number is {}";

    enum DAYS {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args) {
        Arrays.stream(DAYS.values())
            .forEach(day -> {
                    switch (day) {
                        case MONDAY, SATURDAY, THURSDAY -> log.info(LOGGING_FORMAT_MESSAGE, 2);
                        case SUNDAY, WEDNESDAY -> log.info(LOGGING_FORMAT_MESSAGE, 10);
                        case TUESDAY -> log.info(LOGGING_FORMAT_MESSAGE, 100);
                        default -> log.info("invalid day");
                    }
                }
            );
    }

}


