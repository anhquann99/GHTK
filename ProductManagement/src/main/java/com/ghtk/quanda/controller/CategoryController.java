package com.ghtk.quanda.controller;

import com.ghtk.quanda.model.entity.CategoryEntity;
import com.ghtk.quanda.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/category")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("")
    // Phân trang snaker case
    public ResponseEntity get(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "page_size") int pageSize
    ) {
        Page<CategoryEntity> categoryEntityList = categoryRepository.findAll(PageRequest.of(page,pageSize));
        return ResponseEntity.ok(categoryEntityList);
    }



    @PostMapping()
    public ResponseEntity create(@RequestBody CategoryEntity categoryEntity) {
        return ResponseEntity.ok(categoryRepository.save(categoryEntity));
    }

    @PutMapping()
    public ResponseEntity update(@RequestBody CategoryEntity categoryEntity) {
        return ResponseEntity.ok(categoryRepository.save(categoryEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        categoryRepository.deleteById(id);
        return ResponseEntity.ok("Thành công");
    }
}
