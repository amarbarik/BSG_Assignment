package bsg.assignment.server.starter;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Server Starter
 *
 * @author  amar
 * @version 1.0
 *
 */
public class ServerStarter {

    private static Logger logger = Logger.getLogger(ServerStarter.class);


    //Server Application Context is started...
    public static void main(String[] args) {
        startServer();

    }

    public static void startServer() {
        new ClassPathXmlApplicationContext("serverAppContext.xml");
        logger.info("Server Started! Waiting for Request from Client ...");
    }
}
