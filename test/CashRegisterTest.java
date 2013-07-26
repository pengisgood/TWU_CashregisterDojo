import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * User: hwpeng
 * Date: 7/26/13
 * Time: 11:31 AM
 * Project: TWU_CashregisterDojo-master
 */
public class CashRegisterTest {
    @Test
    public void shouldPrintPurchase() throws Exception {
        PrinterStub printer = new PrinterStub();
        CashRegister cashRegister = new CashRegisterImpl(printer);
        Purchase purchase = new Purchase(new Item[]{new Item("foo", 10d)});

        cashRegister.process(purchase);
        cashRegister.process(purchase);

        assertEquals(purchase.asString(), printer.getLastPrintedItem());

        assertEquals(2, printer.getPrintItemTimes());
    }
}
