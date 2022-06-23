package com.ghtk.quanda.repository;

import com.ghtk.quanda.model.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    @Query(value="SELECT p FROM ProductEntity p WHERE p.price > :price AND p.name like %:name%")
    Page<ProductEntity> findByPriceAndName(Pageable pageable,@Param("price") float price,@Param("name") String name);

}
