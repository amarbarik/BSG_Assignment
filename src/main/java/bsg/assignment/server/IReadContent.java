package bsg.assignment.server;

/**
 * File Content Read Service Interface
 *
 * @author  amar
 * @version 1.0
 *
 */
public interface IReadContent {
    /**
     * Read Content using the File Stream
     *
     * @param  fileName Name of the file
     * @return string response of the method
     */
    public String readContentUsingStream(String fileName) throws Exception;

    /**
     * Read Content using the File Reader
     *
     * @param  fileName Name of the file
     * @return string response of the method
     */
    public String readContentUsingReader(String fileName) throws Exception;
}
