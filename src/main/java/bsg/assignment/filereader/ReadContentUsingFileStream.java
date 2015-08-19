package bsg.assignment.filereader;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Reading the content of the file using FileStream
 *
 * @author amar
 * @version 1.0
 */
public class ReadContentUsingFileStream implements ContentReader {

    private static Logger logger = Logger.getLogger(ReadContentUsingFileStream.class);

    /**
     * Get the content of the file
     *
     * @param fileName Name of the file you want to read
     * @return content of the file as String
     */
    public String getFileContent(String fileName) throws Exception {

        File file = new File(fileName);
        FileInputStream fis = null;
        StringBuilder readableContent = new StringBuilder();

        try {
            fis = new FileInputStream(file);

            logger.info("Total file size to read (in bytes) : " + fis.available());

            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                readableContent.append((char) content);
            }

        } catch (IOException e) {
            logger.error("Error occurred while reading the content of the file " + e.getMessage());
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                logger.error("Exception while closing the reader " + ex.getMessage());
            }
        }

        return readableContent.toString();
    }
}
