package com.example.demo.repository;

import com.example.demo.Model.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepository  extends JpaRepository<Shipper, Long> {
}
