package PrinterErrors;

import static org.junit.Assert.*;

import org.junit.Test;


public class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
    @Test
    public void test1() {
        System.out.println("printerError Fixed Tests");
        String s="abm";
        assertEquals("0/3", Printer.printerError(s));
    }
}