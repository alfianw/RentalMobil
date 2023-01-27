/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.mii.co.id.BackEnd.controller.genericController;

import java.util.List;
import ms.mii.co.id.BackEnd.model.BaseEntity.BaseEntity;
import ms.mii.co.id.BackEnd.service.genericService.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author alfia
 */
@ResponseBody
public class GenericController<T extends BaseEntity>{
    
    @Autowired
    private GenericService<T> serviceGeneric;
    
    @GetMapping
    public ResponseEntity<List<T>> getAll() {
        return new ResponseEntity(serviceGeneric.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable("id") Long id) {
        return new ResponseEntity(serviceGeneric.getById(id), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        return new ResponseEntity(serviceGeneric.create(entity), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable("id")Long id, T entity) {
        return new ResponseEntity(serviceGeneric.update(id, entity),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<T> delete(@PathVariable("id") Long id) {
        return new ResponseEntity(serviceGeneric.delete(id), HttpStatus.OK);
    }
}
