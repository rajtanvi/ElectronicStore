package com.lcwd.electronic.store.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private String categoryId;

    @NotBlank(message = "title is requires !!")
    @Size(min = 4,message = "title must be of minimum 4 character !!")
    private String title;

    @NotBlank(message = "Description Required !!")
    private String description;

    @NotBlank
    private String coverImage;

    //other attribute if you have.....
}
