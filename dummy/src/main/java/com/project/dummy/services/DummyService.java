package com.project.dummy.services;

import com.project.dummy.dtos.DummyDto;
import com.project.dummy.models.Dummy;

public interface DummyService {
    Dummy create(DummyDto dummyDto);

    Dummy fetch(Integer i);
}
