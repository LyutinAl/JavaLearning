package com.ltp.globalsuperstore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class InventoryController {
    List<Item> itemList = new ArrayList<Item>();

    @GetMapping(value = "/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = checkItem(id);
        model.addAttribute("categories", Constants.CATEGORIES);
            model.addAttribute("item", index == Constants.ITEM_NOT_FIND ? new Item() : itemList.get(index));
        return "form";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(Item item, RedirectAttributes redirectAttributes) {
        int index = checkItem(item.getId());
        String status = Constants.SUCCESS_STATUS;
        if (index == Constants.ITEM_NOT_FIND) {
            itemList.add(item);
            
        }
        else {
            if (within5Days(item.getDate(), itemList.get(index).getDate())){
                itemList.set(index, item);
            } else {
                status = Constants.FAILED_STATUS;
            }
        }
        redirectAttributes.addFlashAttribute("status", status);
        return "redirect:/inventory";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", itemList);
        return "inventory";
    }

    public int checkItem(String id) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId().equals(id)) return i;
        }
        return Constants.ITEM_NOT_FIND;
    }

    public boolean within5Days(Date newDate, Date oldDate) {
        long diff = Math.abs(newDate.getTime() - oldDate.getTime());
        return (int) (TimeUnit.MILLISECONDS.toDays(diff)) <= 5;
    }

    
}
