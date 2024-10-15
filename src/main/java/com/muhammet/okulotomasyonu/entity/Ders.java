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
@Table(name = "tblders")
public class Ders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String dersKodu;
    Long ogretmenId;
    String ad;
    String aciklama;

}
