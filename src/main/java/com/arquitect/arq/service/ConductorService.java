package com.arquitect.arq.service;

import com.arquitect.arq.interaface.IConductor;
import com.arquitect.arq.interfaceService.IConductorService;
import com.arquitect.arq.model.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorService implements IConductorService {

    @Autowired
    private IConductor data;
    @Override
    public List<Conductor> listar() {
        return (List<Conductor>)data.findAll();
    }

    @Override
    public Optional<Conductor> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Conductor c) {
        int res =0;
        Conductor conductor = data.save(c);
        if(!conductor.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);

    }
}
