package com.muhammet.okulotomasyonu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblogrenci")
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long sinifId;
    String ad;
    String soyad;
    String veli;
    String veliTelefon;
    Integer dogumTarihi;
    String adres;
    Cinsiyet cinsiyet;

    Boolean isActive;
    Long createAt;
    Long updateAt;

}
