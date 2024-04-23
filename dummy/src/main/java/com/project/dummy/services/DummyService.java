package com.project.dummy.services;

import com.project.dummy.dtos.DummyDto;
import com.project.dummy.models.Dummy;

import java.util.List;

public interface DummyService {
    List<Dummy> create(List<DummyDto> dummyDto);

    Dummy fetch(Integer i);

    List<Dummy> fetchAll();
}
