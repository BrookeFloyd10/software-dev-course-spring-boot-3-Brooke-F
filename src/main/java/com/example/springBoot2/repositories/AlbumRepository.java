
package com.example.springBoot2.repositories;

import com.example.springboot2.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
}