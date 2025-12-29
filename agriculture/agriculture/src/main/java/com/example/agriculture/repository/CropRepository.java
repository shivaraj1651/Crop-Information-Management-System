package com.example.agriculture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.agriculture.model.Crop;

public interface CropRepository extends JpaRepository<Crop, String> {
}
