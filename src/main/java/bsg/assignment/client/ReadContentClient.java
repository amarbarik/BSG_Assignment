package bsg.assignment.client;

import bsg.assignment.server.IReadContent;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * RMI Service Client
 *
 * @author amar barik
 * @version 1.0
 */
public class ReadContentClient {

    private static Logger logger = Logger.getLogger(ReadContentClient.class);

    /**
     * Main method of the RMI Service Client
     */
    public static void main(String[] args) {

        logger.debug("Read Content Client is starting...");
        startClient();
        logger.debug("Client is stopped...");
    }

    public static void startClient() {
        String userInput;
        try {
            //Client Application Context is started...
            ApplicationContext context = new ClassPathXmlApplicationContext("clientAppContext.xml");

            //Server bean initialized
            IReadContent readContentClient = (IReadContent) context.getBean("readContent");

            do {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the file name you want to read. \n");
                //Reading the file name
                userInput = br.readLine();
                System.out.println("## Using File Reader...");
                System.out.println(readContentClient.readContentUsingReader(userInput));
                System.out.println("===================================================");
                System.out.println("## Using File Stream...");
                System.out.println(readContentClient.readContentUsingStream(userInput));
                System.out.println("===================================================");
                System.out.println("\nWould you like to read another file ?(y/n)");
                userInput = br.readLine();
            } while (userInput.equals("y"));
        } catch (Exception e) {
            logger.error("Error occurred while running the client. \n" + e.getMessage());
        }
    }

}
