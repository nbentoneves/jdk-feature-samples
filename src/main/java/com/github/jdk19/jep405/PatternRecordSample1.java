package com.github.jdk19.jep405;


import lombok.extern.log4j.Log4j2;

@Log4j2
public final class PatternRecordSample1 {

    record Point(int x, int y) {

    }

    record Rectangle(int x, int y) {

    }

    private static void loggingObject(Object obj) {
        if (obj instanceof Point point) {
            log.info("Point: {{}, {}}", point.x(), point.y());
        } else if (obj instanceof Rectangle rectangle) {
            var area = rectangle.x() * rectangle.y();
            log.info("Rectangle: {{}, {}} - Area: {}", rectangle.x(), rectangle.y(), area);
        } else {
            log.error("Please implement a new print object!");
        }
    }

    public static void main(final String[] args) {

        loggingObject(new Point(10, 30));
        loggingObject(new Point(20, 20));
        loggingObject(new Point(30, 10));

        loggingObject(new Rectangle(30, 10));
        loggingObject(new Rectangle(30, 10));
        loggingObject(new Rectangle(30, 10));

        loggingObject("Hey! I'm a String");

    }

}


