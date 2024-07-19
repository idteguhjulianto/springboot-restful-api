package com.belajar.restul.api.service_impl;

import com.belajar.restul.api.dto.BarangDTO;
import com.belajar.restul.api.exception.ResourceNotFoundException;
import com.belajar.restul.api.model.Barang;
import com.belajar.restul.api.repository.BarangRepository;
import com.belajar.restul.api.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangRepository barangRepository;

    @Override
    public Barang createBarang(BarangDTO barangDTO) {
        Barang barang = new Barang();
        barang.setNamaBarang(barangDTO.getNamaBarang());
        barang.setKategori(barangDTO.getKategori());
        barang.setSatuan(barangDTO.getSatuan());
        barang.setHarga(barangDTO.getHarga());
        barang.setStok(barangDTO.getStok());
        return barangRepository.save(barang);
    }

    @Override
    public Barang updateBarang(Long id, BarangDTO barangDTO) {
        Barang barang = barangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Barang tidak ditemukan dengan id " + id));

        barang.setNamaBarang(barangDTO.getNamaBarang());
        barang.setKategori(barangDTO.getKategori());
        barang.setSatuan(barangDTO.getSatuan());
        barang.setHarga(barangDTO.getHarga());
        barang.setStok(barangDTO.getStok());
        return barangRepository.save(barang);
    }

    @Override
    public void deleteBarang(Long id) {
        Barang barang = barangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Barang tidak ditemukan dengan id " + id));
        barangRepository.delete(barang);
    }

    @Override
    public Barang getBarangById(Long id) {
        return barangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Barang tidak ditemukan dengan id " + id));
    }

    @Override
    public List<Barang> getAllBarangs() {
        return barangRepository.findAll();
    }
}
