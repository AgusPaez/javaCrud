package com.ucc.crudservice.repositories;

import com.ucc.crudservice.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<product, Long> {



}
