/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.mii.co.id.BackEnd.controller;

import ms.mii.co.id.BackEnd.controller.genericController.GenericController;
import ms.mii.co.id.BackEnd.model.Rental;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfia
 */
@RequestMapping("/rental")
@RestController
public class RentalController extends GenericController<Rental>{
    
}
