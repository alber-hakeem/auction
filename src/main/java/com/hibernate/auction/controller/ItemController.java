package com.hibernate.auction.controller;

import com.hibernate.auction.helper.ApiResponse;
import com.hibernate.auction.helper.ApiResponseBuilder;
import com.hibernate.auction.model.Item;
import com.hibernate.auction.repository.ItemRepo;
import com.hibernate.auction.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 12/09/2023
 * @description
 */

@RestController
@RequestMapping("/api/item")
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;
    private final ApiResponseBuilder apiResponseBuilder;

    @PostMapping
    public ResponseEntity<ApiResponse<Item>> create(@RequestBody Item item){
        Item createdItem=itemService.create(item);
        ApiResponse apiResponse= apiResponseBuilder.buildApiResponse("",createdItem);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Item>>> findAll(){
        List<Item> items=itemService.findAll();
        ApiResponse apiResponse=apiResponseBuilder.buildApiResponse("",items);
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Item>> findById(@PathVariable Long id){
        Item item=itemService.findById(id);
        ApiResponse apiResponse=apiResponseBuilder.buildApiResponse("",item);
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        itemService.delete(id);
    }
}
