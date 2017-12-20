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
    DrugService drugService;

    @RequestMapping(method=RequestMethod.GET)
    public String Record(ModelMap map){
        map.addAttribute("recordList",recordService.findAll());
        return "inventory_record";
    }

    @RequestMapping(value = "add_record",method = RequestMethod.POST)
    public String addRecord(@ModelAttribute(value = "newInventory") Drug drug, @ModelAttribute(value = "newRecord") Record record  , ModelMap map){
        Drug updatedrug = drugService.findById(drug.getDrug_num());
        if(record.getRestate().equals("0"))
            updatedrug.setAmount(updatedrug.getAmount()-record.getAmount());
        else
            updatedrug.setAmount(updatedrug.getAmount()+record.getAmount());
//        drugService.updateDrug(updatedrug);
        record.setSerial_num(100002);
        record.setDrug_num(updatedrug.getDrug_num());
        record.setDrug_name(updatedrug.getDrug_name());
        record.setInventory_time(new Date());
        System.out.println(record.getInventory_time());
        recordService.insertByRecord(record);
        map.addAttribute("newRecord",record);
        map.addAttribute("newInventory",drug);
        map.addAttribute("action","save");
        return "inventory_modify";
    }

}
