package com.juno.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juno.mreview.entity.MovieImage;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long> {
}
