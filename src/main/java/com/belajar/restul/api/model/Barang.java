package com.belajar.restul.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nama_barang", nullable = false)
    private String namaBarang;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "kategori", nullable = false)
    private String kategori;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "satuan", nullable = false)
    private String satuan;

    @NotNull
    @Min(value = 0, message = "Harga tidak boleh kurang dari 0")
    @Column(name = "harga", nullable = false)
    private Double harga;

    @NotNull
    @Min(value = 0, message = "Stok tidak boleh kurang dari 0")
    @Column(name = "stok", nullable = false)
    private Integer stok;
}
