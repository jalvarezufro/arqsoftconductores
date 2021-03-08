package com.arquitect.arq.interfaceService;

import com.arquitect.arq.model.Conductor;

import java.util.List;
import java.util.Optional;

public interface IConductorService {
    public List<Conductor> listar ();
    public Optional<Conductor> listarId(int id);
    public Conductor save(Conductor c);
    public void delete(int id);
    public void saveOld(int id,Conductor c);

}
