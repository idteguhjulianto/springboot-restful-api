package com.belajar.restul.api.controller;

import com.belajar.restul.api.dto.ApiResponse;
import com.belajar.restul.api.dto.BarangDTO;
import com.belajar.restul.api.model.Barang;
import com.belajar.restul.api.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/barang")
public class BarangController {

    @Autowired
    private BarangService barangService;

    @PostMapping
    public ResponseEntity<ApiResponse<Barang>> createBarang(@Validated @RequestBody BarangDTO barangDTO) {
        Barang createdBarang = barangService.createBarang(barangDTO);
        ApiResponse<Barang> response = new ApiResponse<>("Barang berhasil ditambahkan", createdBarang);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Barang>> updateBarang(@PathVariable Long id, @Validated @RequestBody BarangDTO barangDTO) {
        Barang updatedBarang = barangService.updateBarang(id, barangDTO);
        ApiResponse<Barang> response = new ApiResponse<>("Barang berhasil diperbarui", updatedBarang);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteBarang(@PathVariable Long id) {
        barangService.deleteBarang(id);
        ApiResponse<Void> response = new ApiResponse<>("Barang berhasil dihapus");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Barang>> getBarangById(@PathVariable Long id) {
        Barang barang = barangService.getBarangById(id);
        ApiResponse<Barang> response = new ApiResponse<>("Barang berhasil ditemukan", barang);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Barang>>> getAllBarangs() {
        List<Barang> barangs = barangService.getAllBarangs();
        if (barangs.isEmpty()) {
            ApiResponse<List<Barang>> response = new ApiResponse<>("Tidak ada data barang", null);
            return ResponseEntity.status(HttpStatus.OK).body(response); // Menggunakan HttpStatus.OK agar body tetap ada
        } else {
            ApiResponse<List<Barang>> response = new ApiResponse<>("Daftar barang berhasil ditemukan", barangs);
            return ResponseEntity.ok(response);
        }
    }
}
