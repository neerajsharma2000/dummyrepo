package com.project.dummy.controllers;

import com.project.dummy.dtos.DummyDto;
import com.project.dummy.services.DummyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/dummy")
public class DummyController {
    @Autowired
    DummyService dummyService;
    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> create(@RequestBody List<DummyDto> dummyDto){
        try{
            log.info("");
            return new ResponseEntity<>(dummyService.create(dummyDto),HttpStatus.OK);
        }catch(Exception e){
            log.info("");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(value = "/fetch/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> fetch(@PathVariable("id") Integer id){
        try{
            log.info("");
            return new ResponseEntity<>(dummyService.fetch(id),HttpStatus.OK);
        }catch(Exception e){
            log.info("");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(value = "/fetchAll",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> fetchAll(){
        try{
            log.info("");
            return new ResponseEntity<>(dummyService.fetchAll(),HttpStatus.OK);
        }catch(Exception e){
            log.info("");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
