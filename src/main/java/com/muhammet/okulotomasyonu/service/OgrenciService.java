package com.muhammet.okulotomasyonu.service;

import com.muhammet.okulotomasyonu.dto.request.OgrenciEklemeRequestDto;
import com.muhammet.okulotomasyonu.entity.Ogrenci;
import com.muhammet.okulotomasyonu.mapper.OgrenciMapper;
import com.muhammet.okulotomasyonu.repository.OgrenciRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciService {
    private final OgrenciRepository repository;
    // Default Constructor - Constructor Injection şeklinde parametre talep ediyoruz.
    public OgrenciService(OgrenciRepository repository){
        this.repository = repository;
    }

    public void ogrenciKaydet(OgrenciEklemeRequestDto dto){
//        Ogrenci ogrenci = OgrenciMapper.INSTANCE.fromOgrenciEklemeDto(dto);
//        repository.save(ogrenci);
        repository.save(OgrenciMapper.INSTANCE.fromOgrenciEklemeDto(dto));
    }

    public List<Ogrenci> ogrenciListesi() {
        return repository.findAll();
    }
}
