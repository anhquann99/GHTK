package com.ghtk.quanda.controller;

import com.ghtk.quanda.model.entity.ProductEntity;
import com.ghtk.quanda.repository.CategoryRepository;
import com.ghtk.quanda.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping("")
    public ResponseEntity get(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "page_size") int pageSize
    ) {
        Page<ProductEntity> productEntities = productRepository.findAll(PageRequest.of(page, pageSize));
        return ResponseEntity.ok(productEntities);
    }

    @PostMapping()
    public ResponseEntity create(@RequestBody ProductEntity productEntities) {
        return ResponseEntity.ok(productRepository.save(productEntities));
    }

    @PutMapping()
    public ResponseEntity update(@RequestBody ProductEntity productEntities) {
        return ResponseEntity.ok(productRepository.save(productEntities));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok("Thành công");
    }

    @GetMapping("/search")
    // Phân trang snaker case
    public ResponseEntity search(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "page_size") int pageSize,
            @RequestParam(value = "sort_by") String sortBy,
            @RequestParam(value = "price") float price,
            @RequestParam(value = "name") String name

    ) {
        Pageable paging = PageRequest.of(page, pageSize, Sort.by(sortBy).descending());
        Page<ProductEntity> productEntities = productRepository.findByPriceAndName(paging,price,name);
        return ResponseEntity.ok(productEntities);
    }
}
