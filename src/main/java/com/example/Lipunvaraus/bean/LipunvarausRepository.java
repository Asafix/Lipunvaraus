package com.example.Lipunvaraus.bean;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LipunvarausRepository extends CrudRepository<Lipunvaraus, Long> {

	List<Lipunvaraus> findByName(String name);
}
