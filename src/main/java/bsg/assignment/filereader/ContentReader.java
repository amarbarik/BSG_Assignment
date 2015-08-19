package bsg.assignment.filereader;

/**
 * Content Reader Interface
 *
 * @author  amar
 * @version 1.0
 *
 */
public interface ContentReader {

    /**
     * Get the file content as String
     *
     * @param fileName name of the file
     * @return Content of the file as String
     */
    public String getFileContent(String fileName) throws Exception;
}
