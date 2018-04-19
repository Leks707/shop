package com.ua.controller.api;

import com.ua.dto.ProductDto;

/**
 * @autor Oleksii_Shylo
 */
public interface ProductController {

    /**
     * Create new product.
     * @param productDto - product that will be created
     * @return true if product was created otherwise - false
     */
    boolean create(ProductDto productDto);

    /**
     * Update existing product.
     * @param productDto - product that will be updated
     * @return true if product was updated otherwise - false
     */
    boolean update(ProductDto productDto);

    /**
     *
     * @param id
     * @return
     */
    ProductDto getProductById(long id);
}
