package bsg.assignment.main;

import bsg.assignment.client.ReadContentClient;
import bsg.assignment.server.starter.ServerStarter;
import org.apache.log4j.Logger;

/**
 * This is used to start the app in server and/or clint mode
 *
 * @author  amar barik
 * @version 1.0
 */
public class RunTheAppBasedOnArgument {
    private static Logger logger = Logger.getLogger(RunTheAppBasedOnArgument.class);

    public static void main(String[] args) {
        String mode = "no mode";
        try {
            mode = args[0];
        } catch (ArrayIndexOutOfBoundsException ex) {
            logger.error("Please run with a valid mode or no mode");
        }

        if(mode.equals("server")){
            logger.info("Running app in Server Mode Only");
            ServerStarter.startServer();
        } else if(mode.equals("client")) {
            logger.info("Running app in Client Mode Only");
            ReadContentClient.startClient();
        } else {
            logger.info("Running the whole app");
            ServerStarter.startServer();
            ReadContentClient.startClient();
        }

    }
}
