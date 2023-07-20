package com.bw.mmcro.traces.service.impl;

import com.bw.mmcro.traces.mapper.TraceTransportMapper;
import com.bw.mmcro.traces.service.RetailerService;
import com.bw.mmcro.traces.domain.TraceTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerServiceImpl implements RetailerService {
    @Autowired
    private TraceTransportMapper traceTransportMapper;

    @Override
    public int updateReceiveStatus(TraceTransport traceTransport) {
        return traceTransportMapper.updateReceiveStatus(traceTransport);
    }
}
