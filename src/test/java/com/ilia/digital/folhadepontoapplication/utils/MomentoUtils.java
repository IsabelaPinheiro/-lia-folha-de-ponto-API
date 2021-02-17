package com.ilia.digital.folhadepontoapplication.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;
import com.ilia.digital.folhadepontoapplication.dto.MomentoDTO;
import com.ilia.digital.folhadepontoapplication.model.Momento;

public class MomentoUtils {


    private static final Faker faker = Faker.instance();

    public static MomentoDTO createFakeMomentoDTO() {
        return MomentoDTO.builder()
                .id(faker.number().randomNumber())
                .dataHora("2019-07-21 12:00:00")
                .build();
    }

    public static Momento createFakeMomento() {
        return Momento.builder()
                .id(faker.number().randomNumber())
                .dataHora("2018-08-22 08:00:00")
                .build();
    }

    public static Momento createFakeMomentoFrom(MomentoDTO momentoDTO) {
        return Momento.builder()
                .id(momentoDTO.getId())
                .dataHora(momentoDTO.getDataHora())
                .build();
    }

    public static String asJsonString(MomentoDTO momentoDTO) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModules(new JavaTimeModule());

            return objectMapper.writeValueAsString(momentoDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
