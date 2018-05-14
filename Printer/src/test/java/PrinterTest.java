import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }
    @Test
    public void hasNumberOfSheets(){
        assertEquals(100,printer.getNumberOfSheets());

    }

    @Test
    public void canCheckToner(){
        assertEquals(100,printer.getToner());

    }


    @Test
    public void canPrint(){
        printer.print(2,10);
        assertEquals(80,printer.getNumberOfSheets());
    }

    @Test
    public void cannotPrint() {
        Printer lessPaperPrinter = new Printer(18);
        lessPaperPrinter.print(2, 10);
        assertEquals(18, lessPaperPrinter.getNumberOfSheets());
        assertEquals(100, lessPaperPrinter.getToner());
    }

    @Test
    public void canRefill(){
        printer.print(2,10);
        printer.refill();
        assertEquals(100,printer.getNumberOfSheets());
    }


    @Test
    public void canReduceToner(){
        int numberOfPages = 2;
        int numberOfCopies = 10;
        printer.print(numberOfPages,numberOfCopies);
        assertEquals(80,printer.getNumberOfSheets());
        assertEquals(80,printer.getToner());
    }



}
