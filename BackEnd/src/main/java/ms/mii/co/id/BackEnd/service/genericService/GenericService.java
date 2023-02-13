/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.mii.co.id.BackEnd.service.genericService;

import java.util.List;
import ms.mii.co.id.BackEnd.model.BaseEntity.BaseEntity;
import ms.mii.co.id.BackEnd.repository.GenericRepository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author alfia
 */
@Service
public class GenericService <T extends BaseEntity> {

    @Autowired
    protected GenericRepository<T> genericRepository;
    
    public List<T> getAll(){
        return genericRepository.findAll();
    }
    
    public T findById(Long id){
        return genericRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found!"));
    }
    
    public  T create(T entity){
        return genericRepository.save(entity);
    }
    
    public T update(Long id, T entity){
         if(!genericRepository.findById(id).isPresent()){
         throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not Found");
    }
        entity.setId(id);
         return genericRepository.save(entity);
    }
    
    public T delete(Long id){
         T data  = genericRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found!"));
        genericRepository.delete(data);
        return data;
    }
}
