package com.github.jdk14.jep361;


import java.util.Arrays;
import lombok.extern.log4j.Log4j2;

@Log4j2
public final class SwitchSample2 {

    private static final String LOGGING_FORMAT_MESSAGE = "Your number is {}";

    enum DAYS {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args) {
        Arrays.stream(DAYS.values())
            .forEach(day -> {
                    var number = switch (day) {
                        case MONDAY, SATURDAY, THURSDAY -> 2;
                        case SUNDAY, WEDNESDAY -> 10;
                        case TUESDAY -> 100;
                    };

                    log.info(LOGGING_FORMAT_MESSAGE, number);
                }
            );
    }

}


