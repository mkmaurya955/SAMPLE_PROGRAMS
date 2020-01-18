package com.manish.controller;
import javax.validation.Valid;
import com.manish.dao.*;
import com.manish.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
//@CrossOrigin("http://localhost:4200/")
@CrossOrigin("*")
//@CrossOrigin annotation in the above controller is used to enable Cross-Origin requests.
//This is required because we’ll be accessing the apis from angular’s frontend server.
public class springController{

    @Autowired
    springDao sdao;

    @GetMapping("/employees")
    public List<springDto> getAllspringemp() {
        //Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        //return sdao.findAll(sortByCreatedAtDesc);
        return sdao.findAll();
    }

    @PostMapping("/springemp")
    public springDto createspringDto(@Valid @RequestBody springDto springDto) {
        springDto.setCompleted(false);
        return sdao.save(springDto);
    }

    @GetMapping(value="/springemp/{id}")
    public ResponseEntity<springDto> getspringDtoById(@PathVariable("id") String id) {
        return sdao.findById(id)
                .map(springDto -> ResponseEntity.ok().body(springDto))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/springemp/{id}")
    public ResponseEntity<springDto> updatespringDto(@PathVariable("id") String id,
                                           @Valid @RequestBody springDto springDto) {
        return sdao.findById(id)
                .map(springDtoData -> {
                    springDtoData.setTitle(springDto.getTitle());
                    springDtoData.setCompleted(springDto.getCompleted());
                    springDto updatedspringDto = sdao.save(springDtoData);
                    return ResponseEntity.ok().body(updatedspringDto);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value="/springemp/{id}")
    public ResponseEntity<?> deletespringDto(@PathVariable("id") String id) {
        return sdao.findById(id)
                .map(springDto -> {
                    sdao.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

	
}
