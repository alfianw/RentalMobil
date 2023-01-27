/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.mii.co.id.BackEnd.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Rental extends BaseEntity{
    
    @Column(nullable = false)
    private Date rentalDate;
    
    @Column(nullable = false)
    private Date returnDate;
    
    @Column(nullable = false)
    private Long rentcost;
    
    @Column(nullable = false)
    private String status;
    
    @ManyToOne
    private Car car; 
    
    @ManyToOne
    private Profile profile;
}
