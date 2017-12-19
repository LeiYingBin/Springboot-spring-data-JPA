package com.lyb.web;

import com.lyb.domain.Drug;
import com.lyb.domain.Record;
import com.lyb.service.DrugService;
import com.lyb.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping(value = "/record")
public class RecordController {

    @Autowired
    RecordService recordService;

    @Autowired
    DrugController drugController;

    @RequestMapping(method=RequestMethod.GET)
    public String Record(ModelMap map){
        return "inventory_record";
    }

    @RequestMapping(value = "add_record",method = RequestMethod.POST)
    public String addRecord(@ModelAttribute(value = "newInventory") Drug drug, @ModelAttribute(value = "newRecord") Record record  , ModelMap map){
        System.out.println(drug.getDrug_num());
        map.addAttribute("newRecord",record);
        map.addAttribute("newInventory",drug);
        map.addAttribute("save","true");
        return "inventory_modify";
    }

}
