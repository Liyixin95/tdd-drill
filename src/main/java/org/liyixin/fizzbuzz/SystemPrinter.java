package org.liyixin.fizzbuzz;

/**
 * @author Liyixin
 */
public class SystemPrinter implements Printer{
    @Override
    public void print(String word) {
        System.out.println(word);
    }
}
