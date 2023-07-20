package com.bw.mmcro.traces.service.impl;

import com.bw.mmcro.traces.mapper.TraceTransportMapper;
import com.bw.mmcro.traces.service.MaterialService;
import com.bw.mmcro.traces.domain.TraceTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private TraceTransportMapper traceTransportMapper;
    @Override
    public List<TraceTransport> listCrops(String deptId) {
        return traceTransportMapper.listCrops(deptId);
    }

    @Override
    public int changeInToOut(String cropsId) {
        return traceTransportMapper.changeInToOut(cropsId);
    }

    @Override
    public int addTransport(TraceTransport traceTransport) {
        return traceTransportMapper.insertSelective(traceTransport);
    }
}
