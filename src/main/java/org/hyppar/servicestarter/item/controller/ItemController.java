package org.hyppar.servicestarter.item.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hyppar.servicestarter.item.dto.ItemDto;
import org.hyppar.servicestarter.item.service.ItemService;
import org.hyppar.servicestarter.response.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Items", description = "Operations related to items")
public class ItemController {

    private final ItemService itemService;

    @Operation(summary = "Create a new item", description = "Creates a new item with validation checks")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Item created successfully"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Validation failed")
    })
    @PostMapping
    public ApiResponse<ItemDto> create(@Valid @RequestBody ItemDto dto) {
        log.info("API - Create item");
        return ApiResponse.ok(itemService.create(dto));
    }

    @Operation(summary = "Get all items", description = "Fetches all available items")
    @GetMapping
    public ApiResponse<List<ItemDto>> getAll() {
        log.info("API - Get all items");
        return ApiResponse.ok(itemService.getAll());
    }

    @Operation(summary = "Get item by ID", description = "Fetches a single item by its ID")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Item found"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "Item not found")
    })
    @GetMapping("/{id}")
    public ApiResponse<ItemDto> getById(@PathVariable @Positive(message = "ID must be positive") Long id) {
        log.info("API - Get item by id: {}", id);
        return ApiResponse.ok(itemService.getById(id));
    }

}
