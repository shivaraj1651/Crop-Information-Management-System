package com.example.agriculture.controller;

import com.example.agriculture.model.Crop;
import com.example.agriculture.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CropController {

    @Autowired
    private CropRepository cropRepository;

    @GetMapping("/index")
    public String showHomePage() {
        return "index";
    }

    
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("crops", cropRepository.findAll());
        return "add";
    }
   
    @PostMapping("/add")
    public String addCrop(@ModelAttribute Crop crop) {
        cropRepository.save(crop);
        return "redirect:/";
    }

    @GetMapping("/edit/{serialNumber}")
    public String editCropForm(@PathVariable String serialNumber, Model model) {
        Crop crop = cropRepository.findById(serialNumber).orElse(null);
        model.addAttribute("crop", crop);
        return "edit";
    }

    @PostMapping("/update")
    public String updateCrop(@ModelAttribute Crop crop) {
        cropRepository.save(crop);
        return "redirect:/";
    }

    @GetMapping("/delete/{serialNumber}")
    public String deleteCrop(@PathVariable String serialNumber) {
        cropRepository.deleteById(serialNumber);
        return "redirect:/";
    }
}
