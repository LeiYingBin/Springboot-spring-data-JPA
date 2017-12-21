package com.lyb.web;

import com.lyb.domain.Drug;
import com.lyb.domain.Record;
import com.lyb.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/drug")
public class DrugController {
    @Autowired
    DrugService drugService;

    @RequestMapping(method = RequestMethod.GET)
    public String getInventoryList(ModelMap map){
        map.addAttribute("invenlist",drugService.findAll());
        return "inventory";
    }

    @RequestMapping(value = "/modify_inventory/{drug_Num}",method = RequestMethod.GET)
    public String modifyInventoryByNum(@ModelAttribute(value="drug_Num" )String drug_Num, ModelMap map){
        map.addAttribute("newRecord",new Record());
        map.addAttribute("newInventory",drugService.findById(drug_Num));
        return "inventory_modify";
    }
    @RequestMapping(value = "/modify_inventory",method = RequestMethod.GET)
    public String modifyInventory(ModelMap map){
        map.addAttribute("newRecord",new Record());
        map.addAttribute("newInventory",new Drug());
        return "inventory_modify";
    }

    @RequestMapping(value="/add_drug",method = RequestMethod.GET)
    public String addDrug(ModelMap map){
        map.addAttribute("drug",new Drug());
        return "drug_add";
    }

    @RequestMapping(value="/add_drug",method = RequestMethod.POST)
    public String saveDrug(@ModelAttribute(value = "drug") Drug drug , ModelMap map ){
        drugService.addDrug(drug);
        return "drug_add";
    }

    @RequestMapping(value="/delete_drug",method = RequestMethod.GET)
    public String deleteDrug(){
        return "drug_delete";
    }

}
