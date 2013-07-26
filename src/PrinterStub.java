/**
 * User: hwpeng
 * Date: 7/26/13
 * Time: 12:05 PM
 * Project: TWU_CashregisterDojo-master
 */
public class PrinterStub implements Printer {
    private String lastPrintedItem;
    private int printItemTimes = 0;

    @Override
    public void print(String printThis) {
        printItemTimes++;
        lastPrintedItem = printThis;
    }

    public String getLastPrintedItem() {
        return lastPrintedItem;
    }

    public int getPrintItemTimes() {
        return printItemTimes;
    }
}
