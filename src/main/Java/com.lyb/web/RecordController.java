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
    public String addRecord(@ModelAttribute(value = "newInventory") Drug drug, @ModelAttribute Record newRecord  , ModelMap map){
        Drug updatedrug = drugService.findById(drug.getDrug_num());
        if(newRecord.getRestate().equals("0"))
            updatedrug.setAmount(updatedrug.getAmount()-newRecord.getAmount());
        else
            updatedrug.setAmount(updatedrug.getAmount()+newRecord.getAmount());
        drugService.updateDrug(updatedrug);
        newRecord.setDrug_num(updatedrug.getDrug_num());
        newRecord.setDrug_name(updatedrug.getDrug_name());
        if(newRecord.getInventory_time()==null)
        newRecord.setInventory_time(new Date());
        recordService.saveRecord(newRecord);
        map.addAttribute("newRecord",newRecord);
        map.addAttribute("newInventory",drug);
        map.addAttribute("action","save");
        return "inventory_modify";
    }

}
