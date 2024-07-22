package com.nft.BanTranhNFT.service.impl;

import com.nft.BanTranhNFT.model.Painting;
import com.nft.BanTranhNFT.repository.PaintingRepository;
import com.nft.BanTranhNFT.service.PaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaintingServiceImpl implements PaintingService {
    @Autowired
    PaintingRepository paintingRepository;

    @Override
    public Painting addPainting(Painting painting) {
        if(painting != null){
            return paintingRepository.save(painting);
        }
        return null;
    }

    @Override
    public Painting updatePainting(int id, Painting painting) {
        if(painting != null){
            Painting painting1 = paintingRepository.getById(id);
            if(painting1 != null){
                painting1.setTitle(painting.getTitle());
                painting1.setPaintingDescription(painting.getPaintingDescription());
                painting1.setPrice(painting.getPrice());
                painting1.setArtist(painting.getArtist());
                painting1.setImageUrl(painting.getImageUrl());
                painting1.setCreatedAt(painting.getCreatedAt());
                return paintingRepository.save(painting1);
            }
        }
        return null;
    }

    @Override
    public boolean deletePainting(int id) {
        if(id >=1){
            Painting painting = paintingRepository.getById(id);
            if(painting != null){
                paintingRepository.delete(painting);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Painting> getAllPainting() {
        return paintingRepository.findAll();
    }

    @Override
    public Optional<Painting> getOnePainting(int id) {
        return paintingRepository.findById(id);
    }
}
