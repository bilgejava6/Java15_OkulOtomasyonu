package com.muhammet.okulotomasyonu.controller;

import com.muhammet.okulotomasyonu.dto.request.OgrenciEklemeRequestDto;
import com.muhammet.okulotomasyonu.dto.response.BaseResponse;
import com.muhammet.okulotomasyonu.entity.Ogrenci;
import com.muhammet.okulotomasyonu.service.OgrenciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.muhammet.okulotomasyonu.constants.RestApis.*;

@RestController
@RequestMapping(OGRENCI)
@RequiredArgsConstructor
public class OgrenciController {
/**
 * Öğrenci Ekleme, Düzenleme, Listeleme, Arama, Öğrenciyi bir sınıfa atama,
 */
    private final OgrenciService ogrenciService;

    @PostMapping(ADD)
    public ResponseEntity<BaseResponse<Boolean>> ogrenciEkleme(@RequestBody OgrenciEklemeRequestDto dto){
        ogrenciService.ogrenciKaydet(dto);
        return ResponseEntity.ok(
                BaseResponse.<Boolean>builder()
                        .data(true)
                        .code(200)
                        .message("Kayıt Başarılı")
                        .success(true)
                        .build());
    }

    @GetMapping(FINDALL)
    public ResponseEntity<BaseResponse<List<Ogrenci>>> ogrenciListesi(){
        return ResponseEntity.ok(
                BaseResponse.<List<Ogrenci>>builder()
                        .success(true)
                        .message("Tüm öğenci listesi getirildi")
                        .code(200)
                        .data(ogrenciService.ogrenciListesi())
                        .build()
        );
    }

}
