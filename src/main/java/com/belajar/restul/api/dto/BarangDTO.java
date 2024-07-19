package com.belajar.restul.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BarangDTO {
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    private String namaBarang;

    @NotNull
    @Size(min = 1, max = 255)
    private String kategori;

    @NotNull
    @Size(min = 1, max = 255)
    private String satuan;

    @NotNull
    @Min(value = 0, message = "Harga tidak boleh kurang dari 0")
    private Double harga;

    @NotNull
    @Min(value = 0, message = "Stok tidak boleh kurang dari 0")
    private Integer stok;
}