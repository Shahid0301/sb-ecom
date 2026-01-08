package com.ecommerce.project.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private Long categoryId;

    @NotEmpty(message = "Category name must not be empty")
    @Size(min = 5, message = "Category name must contain at least 5 characters")
    private String categoryName;
}
