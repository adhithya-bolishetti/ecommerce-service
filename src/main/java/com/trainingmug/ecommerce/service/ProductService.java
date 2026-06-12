package com.trainingmug.ecommerce.service;

import com.trainingmug.ecommerce.entity.Product;
import com.trainingmug.ecommerce.exception.ProductExistsException;
import com.trainingmug.ecommerce.exception.ProductNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProductService {
    Product save(Product product) throws ProductExistsException;
    Product update(Product product) throws ProductNotFoundException;
    Product getById(String id) throws ProductNotFoundException;
    List<Product> getAll();
    void delete() throws ProductNotFoundException;
    List<Product> getProductsByAvailability(boolean isAvailable);
    List<Product> getProductsByCategory(String category);
    Product getProductById(int id) throws ProductNotFoundException;
    List<String> getAllCategories();
    List<Product> getProductsAbovePrice(double price);
    List<String> getAllProductNames();
    long getAvailableProductCount();
    boolean existsByCompany(String company);
    boolean areAllProductsAvailable();
    Optional<Product> getFirstProduct();
    List<Product> getTopNExpensiveProducts(int n);
    List<Product> sortProductsByPriceAsc();
    List<Product> sortProductsByPriceDesc();
    double getTotalInventoryValue();
    double getTotalPriceAfterDiscount();
    List<Product> getProductsManufacturedAfter(int year);
    List<Product> getAvailableProductsAbovePrice(double price);
    Map<String, Long> getProductCountByCategory();
    Map<String, List<Product>> groupProductsByCategory();
    Map<String, List<Product>> groupProductsByCompany();
    Map<Boolean, List<Product>> partitionProductsByAvailability();
    Optional<Product> getMostExpensiveProduct();
    Optional<Product> getCheapestProduct();
    Map<Integer, Product> mapProductsById();
    Map<String, Double> getAveragePriceByCategory();
    Map<String, List<Product>> getTop3ExpensiveProductsByCategory();
}
