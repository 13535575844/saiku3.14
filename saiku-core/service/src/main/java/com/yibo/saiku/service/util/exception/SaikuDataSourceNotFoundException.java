package com.yibo.saiku.service.util.exception;

public class SaikuDataSourceNotFoundException extends SaikuDataSourceException {

    /**
     * @see Exception#Exception()
     */
    public SaikuDataSourceNotFoundException() {
        super();
    }

    /**
     * @see Exception#Exception(String))
     */

    public SaikuDataSourceNotFoundException(String message) {
        super(message);
    }

    /**
     * @see Exception#Exception(Throwable)
     */
    public SaikuDataSourceNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * @see Exception#Exception(String, Throwable)
     */
    public SaikuDataSourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
