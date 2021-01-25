package com.arquitect.arq.interaface;

import com.arquitect.arq.model.Conductor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConductor extends CrudRepository<Conductor, Integer> {
}
