package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

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

        Invoice invoice1 = new Invoice("6");
        Invoice invoice2 = new Invoice("2");
        Invoice invoice3 = new Invoice("3");

        invoice1.getItems().add(new Item(apple, BigDecimal.valueOf(5), 3));

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);
        //CleanUp
        invoiceDao.deleteById(id);


    }

}
