package com.hibernate.auction.controller;

import com.hibernate.auction.dto.CategoryDto;
import com.hibernate.auction.helper.ApiResponse;
import com.hibernate.auction.helper.ApiResponseBuilder;
import com.hibernate.auction.model.Category;
import com.hibernate.auction.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 11/09/2023
 * @description
 */

@RestController
@RequestMapping("/api/category")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final ApiResponseBuilder<Category> apiResponseBuilder;
    @PostMapping
    public ResponseEntity<ApiResponse<Category>> create(@RequestBody Category category){
        Category createdCategory=categoryService.create(category);
        ApiResponse<Category> apiResponse=apiResponseBuilder.buildApiResponse("Category Created",createdCategory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Category>>> findAll(){
        List<Category> categories=categoryService.findAll();
        ApiResponse<List<Category>> apiResponse=apiResponseBuilder.buildApiResponse("",categories);
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(categoryService.findCategoryDtoById(id),HttpStatus.OK);
    }

}
