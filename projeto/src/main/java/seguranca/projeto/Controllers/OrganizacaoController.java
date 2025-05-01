package seguranca.projeto.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import seguranca.projeto.dtos.organizacao.*;
import seguranca.projeto.services.OrganizacaoServices;


@RequiredArgsConstructor
@RestController
@RequestMapping("organizacoes")
public class OrganizacaoController {

    private final OrganizacaoServices service;

    @GetMapping
    public List<OrganizacaoResponseDto> findAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public OrganizacaoResponseDto findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizacaoResponseDto create(@Valid @RequestBody OrganizacaoRequestDto request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public OrganizacaoResponseDto update(@PathVariable Long id, @Valid @RequestBody OrganizacaoRequestDto request){
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) 
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


    }