package com.koti.alexa;

/**
 * A simple service interface
 */
public interface HelloService {

    /**
     * @return the name of the underlying JCR repository implementation
     */
    String getRepositoryName();

    String echo(String msg);
}