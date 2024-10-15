package com.muhammet.okulotomasyonu.dto.request;

import com.muhammet.okulotomasyonu.entity.Cinsiyet;

public record OgrenciEklemeRequestDto(
        String ad,
        String soyad,
        String veli,
        String veliTelefon,
        String adres,
        Cinsiyet cinsiyet,
        Integer dogumTarihi
) {
}
