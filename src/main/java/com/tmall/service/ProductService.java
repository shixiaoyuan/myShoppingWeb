package com.tmall.service;

import java.util.List;
 
import com.tmall.pojo.Category;
import com.tmall.pojo.Product;
 
public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);
}