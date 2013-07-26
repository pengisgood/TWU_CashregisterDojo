/**
 * User: hwpeng
 * Date: 7/26/13
 * Time: 11:46 AM
 * Project: TWU_CashregisterDojo-master
 */
public class CashRegisterImpl implements CashRegister {
    private Printer printer;

    public CashRegisterImpl(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void process(Purchase purchase) {
        printer.print(purchase.asString());
    }
}
