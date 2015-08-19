package bsg.assignment.filereader;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reading the content of the file using FileReader
 *
 * @author amar
 * @version 1.0
 */
public class ReadContentUsingFileReader implements ContentReader {

    private static Logger logger = Logger.getLogger(ReadContentUsingFileReader.class);

    /**
     * Get the content of the file
     *
     * @param fileName Name of the file you want to read
     * @return content of the file as String
     */
    public String getFileContent(String fileName) throws Exception {
        BufferedReader br = null;
        StringBuilder content = new StringBuilder();
        try {
            String sCurrentLine;

            br = new BufferedReader(new FileReader(fileName));

            while ((sCurrentLine = br.readLine()) != null) {
                content.append(sCurrentLine).append("\n");
            }

        } catch (IOException e) {
            logger.error("Error occurred while reading the content of the file " + e.getMessage());
        } finally {
            //Close the connection to the file
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                logger.error("Exception while closing the reader " + ex.getMessage());
            }
        }
        return content.toString();
    }
}
