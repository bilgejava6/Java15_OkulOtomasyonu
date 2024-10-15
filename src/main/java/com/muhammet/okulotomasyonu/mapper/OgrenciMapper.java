package com.muhammet.okulotomasyonu.mapper;

import com.muhammet.okulotomasyonu.dto.request.OgrenciEklemeRequestDto;
import com.muhammet.okulotomasyonu.entity.Ogrenci;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OgrenciMapper {
    OgrenciMapper INSTANCE = Mappers.getMapper(OgrenciMapper.class);

    Ogrenci fromOgrenciEklemeDto(final OgrenciEklemeRequestDto dto);
}
