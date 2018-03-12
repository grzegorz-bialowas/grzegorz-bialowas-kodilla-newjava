package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
     private InvoiceDao invoiceDao;
    @Ignore
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("product");
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");
        Product product4 = new Product("product4");
        Item item = new Item();
        Item item1 = new Item();
        Item item2 = new Item();
        Invoice invoice = new Invoice();
        item.getProduct(product);
        item.getProduct(product2);
        item.getProduct(product3);
        item1.getProduct(product1);
        item1.getProduct(product2);
        item1.getProduct(product4);
        item2.getProduct(product3);
        item2.getProduct(product4);
        invoice.getItems(item);
        invoice.getItems(item1);
        invoice.getItems(item2);
        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        Assert.assertNotEquals(0, invoiceId);
        //CleanUp
        //    try {
          //  invoiceDao.delete(invoiceId);
       // } catch (Exception e) {
       // }
    }
}
