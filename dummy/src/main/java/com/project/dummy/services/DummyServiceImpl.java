package com.project.dummy.services;

import com.project.dummy.dtos.DummyDto;
import com.project.dummy.models.Dummy;
import com.project.dummy.repositories.DummyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DummyServiceImpl implements DummyService {
    @Autowired
    DummyRepository dummyRepository;
    @Override
    public List<Dummy> create(List<DummyDto> dummyDtoList) {
        List<Dummy> dummyList=new ArrayList<>();
        try{
            setDummy(dummyDtoList, dummyList);
            dummyList=dummyRepository.saveAll(dummyList);
        }catch (Exception e){
            log.info("");
        }
        return dummyList;
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

    @Override
    public List<Dummy> fetchAll() {
        List<Dummy> dummylist = new ArrayList<>();
        try{
            dummylist=dummyRepository.findAll();
           
        }catch (Exception e){
            log.info("");
        }
        return dummylist;    }

    public static void setDummy(List<DummyDto> dummyDtoList, List<Dummy> dummyList) {
        dummyDtoList.forEach(dummyDto -> {dummyList.add(new Dummy(dummyDto.getId(),dummyDto.getName()));});
    }
}
