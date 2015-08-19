package bsg.assignment.server;

import bsg.assignment.filereader.ReadContentUsingFileReader;
import bsg.assignment.filereader.ReadContentUsingFileStream;
import org.apache.log4j.Logger;

/**
 * File Content Read Service Implementation
 *
 * @author amar
 * @version 1.0
 */
public class ReadContent implements IReadContent {

    private static Logger logger = Logger.getLogger(ReadContent.class);

    //Reader Service Injected
    ReadContentUsingFileReader readContentUsingFileReader;
    ReadContentUsingFileStream readContentUsingFileStream;

    /**
     * Read Content using the File Stream
     *
     * @param fileName Name of the file
     * @return string response of the method
     */
    public String readContentUsingStream(String fileName) throws Exception {
        return readContentUsingFileStream.getFileContent(fileName);
    }

    /**
     * Read Content using the File Reader
     *
     * @param fileName Name of the file
     * @return string response of the method
     */
    public String readContentUsingReader(String fileName) throws Exception {
        return readContentUsingFileReader.getFileContent(fileName);
    }


    /**
     * Get the service
     *
     * @return ReadContentUsingFileReader Service
     */
    public ReadContentUsingFileReader getReadContentUsingFileReader() {
        return readContentUsingFileReader;
    }

    public void setReadContentUsingFileReader(ReadContentUsingFileReader readContentUsingFileReader) {
        this.readContentUsingFileReader = readContentUsingFileReader;
    }

    /**
     * Get the service
     *
     * @return ReadContentUsingFileStream Service
     */
    public ReadContentUsingFileStream getReadContentUsingFileStream() {
        return readContentUsingFileStream;
    }

    public void setReadContentUsingFileStream(ReadContentUsingFileStream readContentUsingFileStream) {
        this.readContentUsingFileStream = readContentUsingFileStream;
    }
}
