package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void InvoiceDaoSave() {
        //Given
        Product apple = new Product("Apple");
        Product orange = new Product("Orange");
        Product banana = new Product("banana");

        Invoice invoice1 = new Invoice("1");


        invoice1.getItems().add(new Item(apple, BigDecimal.valueOf(5), 3));
        invoice1.getItems().add(new Item(orange, BigDecimal.valueOf(8), 2));
        invoice1.getItems().add(new Item(banana, BigDecimal.valueOf(1), 9));
        //When

        Invoice savedInvoice = invoiceDao.save(invoice1);

       // List<Item> items = savedInvoice.getItems();
        Product product1 = savedInvoice.getItems().get(0).getProduct();
        Product product2 = savedInvoice.getItems().get(1).getProduct();
        Product product3 = savedInvoice.getItems().get(2).getProduct();


        //Then
        assertNotEquals(0, savedInvoice.getId());
        assertEquals(3, savedInvoice.getItems().size());
        assertEquals("Apple",product1.getName());
        assertEquals("Orange", product2.getName());
        assertEquals("banana",product3.getName());
        //CleanUp
        invoiceDao.deleteById(invoice1.getId());


    }

}
