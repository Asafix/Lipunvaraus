package com.example.Lipunvaraus.bean;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TeatteriRepository extends CrudRepository<Teatteri, Long> {

	List<Teatteri> findByName(String name);
}
