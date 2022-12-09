package com.github.jdk10.jep286;


import java.util.Arrays;
import lombok.extern.log4j.Log4j2;

@Log4j2
public final class LocalVariableTypeInferenceSample1 {

    public static void main(final String[] args) {

        var inferenceString = "Hello String";
        var inferenceStream = Arrays.stream(inferenceString.split(" "));

        log.info(inferenceString);
        log.info(inferenceStream.toList());

    }

}


