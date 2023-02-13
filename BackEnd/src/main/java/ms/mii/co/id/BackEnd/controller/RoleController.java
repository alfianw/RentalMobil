/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms.mii.co.id.BackEnd.controller;

import ms.mii.co.id.BackEnd.controller.genericController.GenericController;
import ms.mii.co.id.BackEnd.model.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfia
 */
@RequestMapping("/role")
@RestController
public class RoleController extends GenericController<Role>{
    
}
