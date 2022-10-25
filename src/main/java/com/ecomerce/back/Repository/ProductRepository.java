package com.ecomerce.back.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.back.models.ProductModels;


@Repository
public interface ProductRepository extends JpaRepository<ProductModels, Integer> {

}
