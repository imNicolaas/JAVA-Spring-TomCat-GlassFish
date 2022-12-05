/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.example.demo.contoller;

import com.entity.repository.AppRepository;
import com.entity.usuarios;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Nicolas Corredor Moya
 */
@RestController
@RequestMapping("/url")
public class AppController {
    
    @Autowired  
    private AppRepository appRepository;
    
    @GetMapping()
    public List<Object> list() {
        return null;
    }
    
    //http;//localhost:8080/url/
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        appRepository.findById(Integer.parseInt(id));
        return null;
    }
    
    @PutMapping("/{id}")
    public Object insertar(@PathVariable String id, @RequestBody Object input) {
        return "Se invoca PUT con el id: " + id + " " + input.toString();
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        
        try{
            usuarios usuario=new usuarios ():
            ObjectMapper objectMapper=new ObjectMapper ():
            JsonNode jsonNoder- objectMapper.readTree (input);
            usuario.deleteNombreUsuario (jsonNode.get ("nombretisuaric").asText ()):
            usuario.deleteClave (jsonNode.get ("clave").tostring () ):
            usuario.deleteId (Integer.parseInt(id) ):
            return usuario;
 }catch (Exception e){
            return null:
        
    }
    
}
