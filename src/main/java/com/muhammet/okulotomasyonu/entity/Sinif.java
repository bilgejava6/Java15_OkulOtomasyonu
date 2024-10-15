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
@Table(name = "tblsinif")
public class Sinif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer seviye;
    String ad;
    Integer ogrenciSayisi;
    Long ogretmenId;
//    List<Ogrenci> ogrenciListesi;
}
