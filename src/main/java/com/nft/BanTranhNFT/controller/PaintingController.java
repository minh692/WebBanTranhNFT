package com.nft.BanTranhNFT.controller;

import com.nft.BanTranhNFT.model.Painting;
import com.nft.BanTranhNFT.service.PaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("painting")
public class PaintingController {
    @Autowired
    PaintingService paintingService;

    @PostMapping("/add")
    public Painting addPainting(@RequestBody Painting painting){
        return paintingService.addPainting(painting);
    }

    @PutMapping("/update")
    public Painting updatePainting(@RequestParam("id") int id, @RequestBody Painting painting){
        return paintingService.updatePainting(id, painting);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePainting(@PathVariable("id") int id){
        return paintingService.deletePainting(id);
    }

    @GetMapping("/list")
    public List<Painting> getListPainting(){
        return paintingService.getAllPainting();
    }
}
