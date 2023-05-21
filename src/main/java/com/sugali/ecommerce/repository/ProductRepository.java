/**
 * 
 */
package com.sugali.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sugali.ecommerce.entity.Product;

/**
 * @author Administrator
 *
 */
public interface ProductRepository extends JpaRepository<Product,Long> {

}
