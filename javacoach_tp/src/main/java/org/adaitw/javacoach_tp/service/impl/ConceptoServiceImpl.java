package org.adaitw.javacoach_tp.service.impl;
import org.adaitw.javacoach_tp.model.dto.ConceptoDTO;
import org.adaitw.javacoach_tp.model.entity.ConceptoEntity;
import org.adaitw.javacoach_tp.model.repository.ConceptoRepository;
import org.adaitw.javacoach_tp.service.ConceptoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConceptoServiceImpl implements ConceptoService {

    @Autowired
    private ConceptoRepository conceptoRepository;

    ModelMapper modelMapper = new ModelMapper();
    public List<ConceptoDTO> findAllConceptos() {
        List<ConceptoEntity> conceptoEntities = conceptoRepository.findAll();
        List<ConceptoDTO> conceptoDTOList = new ArrayList<>();
        conceptoEntities.forEach(concepto -> conceptoDTOList.add(modelMapper.map(concepto, ConceptoDTO.class)));
        return conceptoDTOList;

    }
    @Override
    public String crearConcepto(ConceptoDTO crear) {
        ConceptoEntity concepto = new ConceptoEntity();
        concepto = modelMapper.map(crear, ConceptoEntity.class);
        conceptoRepository.save(concepto);
        return "Excelente! creaste un concepto nuevo";
    }


    @Override
    public String actualizarConcepto(ConceptoDTO actualizarConcepto) {
        ConceptoEntity actconcepto = new ConceptoEntity();
        actconcepto = modelMapper.map(actualizarConcepto, ConceptoEntity.class);
        conceptoRepository.save(actconcepto);
        return "Excelente! actualizaste un concepto";
    }



    public String eliminarConcepto(ConceptoDTO eliminarConcepto) {
        ConceptoEntity elimconcepto = new ConceptoEntity();
        elimconcepto = modelMapper.map(eliminarConcepto, ConceptoEntity.class);
        conceptoRepository.delete(elimconcepto);
        return "Excelente! eliminaste un concepto";
    }


}


