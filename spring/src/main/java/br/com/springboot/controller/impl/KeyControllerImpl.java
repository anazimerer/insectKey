package br.com.springboot.controller.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.database.model.ativos.Orders;
import br.com.springboot.dto.BranchesResponse;
import br.com.springboot.service.impl.KeyServiceImpl;

@RestController
@RequestMapping("/api")
public class KeyControllerImpl{

    @Autowired
    private KeyServiceImpl keyService;

    @GetMapping(value= "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Orders>> getOrders() throws Exception {
        List<Orders> response = keyService.getOrders();        
        return new ResponseEntity(response, HttpStatus.OK);
    }
    

    @GetMapping(value= "/branches", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BranchesResponse> getBranches(@PathVariable("idOrdem") Integer idOrdem,
    												@PathVariable("idEtapa") Integer idEtapa) throws Exception {
        BranchesResponse response = keyService.getBranches(idOrdem, idEtapa);        
        return new ResponseEntity(response, HttpStatus.OK);
    }
    
    @PostMapping(value= "/terms/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Orders>> getTermsById(@PathVariable("idTermo") Integer idTermo) throws Exception {
        keyService.getTermsById(idTermo);       
        return new ResponseEntity(HttpStatus.OK);
    }
}
