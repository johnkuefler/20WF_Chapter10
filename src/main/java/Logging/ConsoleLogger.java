/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logging;

/**
 *
 * @author johnk
 */
public class ConsoleLogger implements Logger {

    @Override
    public void logInfo(String info) {
        System.out.println("Info: " + info);
    }

    @Override
    public void logWarning(String warning) {
        System.out.println("Warning: " + warning);
    }

    @Override
    public void logError(String error) {
        System.out.println("Error: " + error);
    }

}
