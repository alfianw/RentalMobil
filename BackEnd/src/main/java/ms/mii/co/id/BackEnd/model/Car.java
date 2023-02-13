/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.mii.co.id.BackEnd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ms.mii.co.id.BackEnd.model.BaseEntity.BaseEntity;

/**
 *
 * @author alfia
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Car extends BaseEntity{
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private Long cost;
    
    @Column(nullable = false)
    private String plat;
    
    @Lob
    private String image;
    
    @ManyToOne
    private Brand brand;
    
    @ManyToOne
    private Type type;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Rental> rentals;
}
