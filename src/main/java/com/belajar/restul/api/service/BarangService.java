package com.belajar.restul.api.service;

import com.belajar.restul.api.dto.BarangDTO;
import com.belajar.restul.api.model.Barang;

import java.util.List;

public interface BarangService {
    Barang createBarang(BarangDTO barangDTO);
    Barang updateBarang(Long id, BarangDTO barangDTO);
    void deleteBarang(Long id);
    Barang getBarangById(Long id);
    List<Barang> getAllBarangs();
}