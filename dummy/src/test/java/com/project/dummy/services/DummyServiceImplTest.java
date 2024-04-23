package com.project.dummy.services;

import com.project.dummy.models.Dummy;
import com.project.dummy.repositories.DummyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DummyServiceImplTest {

    @Mock
    DummyRepository dummyRepository;
    @InjectMocks
    DummyServiceImpl dummyService;

    @Test
    void check(){
        ArrayList<Dummy> dummyArrayList=new ArrayList<>();
        dummyArrayList.add(new Dummy(1,"Testing"));
        dummyArrayList.add(new Dummy(2,"Aniket"));
        Mockito.when(dummyRepository.findAll()).thenReturn((dummyArrayList));
        assertEquals(dummyService.fetch(1),dummyArrayList);

    }
}