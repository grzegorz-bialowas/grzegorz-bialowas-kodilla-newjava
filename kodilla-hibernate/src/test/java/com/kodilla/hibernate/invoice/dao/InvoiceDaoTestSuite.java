package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("product");
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Item item = new Item(product, new BigDecimal(10), 2, new BigDecimal(3));
        Item item1 = new Item(product1, new BigDecimal(20), 3, new BigDecimal(4));
        Item item2 = new Item(product2, new BigDecimal(9), 2, new BigDecimal(5));
        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("12/12/2000");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item.setValue(new BigDecimal(2));
        item1.setValue(new BigDecimal(3));
        item2.setValue(new BigDecimal(5));
        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        Invoice readInvoice = invoiceDao.findOne(invoiceId);
        Assert.assertEquals(invoiceId, readInvoice.getId());
        //CleanUp
        try {
            invoiceDao.delete(invoiceId);
        } catch (Exception e) {
        }
    }
}
