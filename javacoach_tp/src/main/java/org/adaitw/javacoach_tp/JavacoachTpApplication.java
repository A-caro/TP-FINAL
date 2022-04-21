package org.adaitw.javacoach_tp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavacoachTpApplication {

    private static final Logger logger =
            LoggerFactory.getLogger(JavacoachTpApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JavacoachTpApplication.class, args);

       logger.info("Hola! iniciaste el servidor, que te vaya bien!");


    }

}
