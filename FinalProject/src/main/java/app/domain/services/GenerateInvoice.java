package app.domain.services;

import app.domain.model.Invoice;
import app.domain.ports.InvoicePort;

public class GenerateInvoice {

    private InvoicePort invoicePort;
    
    public void generate(Invoice invoice) throws Exception {
        invoicePort.save(invoice);
    }
}
