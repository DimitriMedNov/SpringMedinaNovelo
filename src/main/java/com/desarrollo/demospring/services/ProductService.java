package com.desarrollo.demospring.services;

import com.desarrollo.demospring.entities.*;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
