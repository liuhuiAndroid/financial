package com.lh.manager.repositories;

import com.lh.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 产品管理
 */
public interface ProductRepository extends JpaRepository<Product, String>,JpaSpecificationExecutor<Product> {

}
