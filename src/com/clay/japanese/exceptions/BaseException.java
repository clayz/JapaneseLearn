/**
 * 
 */
package com.clay.japanese.exceptions;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Sep 9, 2013
 * @version 0.1
 */
public class BaseException extends Exception {
    private static final long serialVersionUID = -1252887619010928586L;

    /**
     * 
     */
    public BaseException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param detailMessage
     */
    public BaseException(String detailMessage) {
        super(detailMessage);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param throwable
     */
    public BaseException(Throwable throwable) {
        super(throwable);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param detailMessage
     * @param throwable
     */
    public BaseException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
        // TODO Auto-generated constructor stub
    }
}
