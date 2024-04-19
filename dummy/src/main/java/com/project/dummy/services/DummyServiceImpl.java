package com.project.dummy.services;

import com.project.dummy.dtos.DummyDto;
import com.project.dummy.models.Dummy;
import com.project.dummy.repositories.DummyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DummyServiceImpl implements DummyService {
    @Autowired
    DummyRepository dummyRepository;
    @Override
    public Dummy create(DummyDto dummyDto) {
        Dummy dummy=new Dummy();
        try{
            setDummy(dummyDto, dummy);
            dummy=dummyRepository.save(dummy);
        }catch (Exception e){
            log.info("");
        }
        return dummy;
    }

    @Override
    public Dummy fetch(Integer i) {
        Dummy dummy=new Dummy();
        try{
            Optional<Dummy> optionalDummy =dummyRepository.findById(i);
            if(optionalDummy.isPresent()){
                dummy=optionalDummy.get();
            }
        }catch (Exception e){
            log.info("");
        }
        return dummy;    }

    private static void setDummy(DummyDto dummyDto, Dummy dummy) {
        dummy.setId(dummyDto.getId());
        dummy.setName(dummyDto.getName());
    }
}
