package com.bw.mmcro.traces.service;

import com.bw.mmcro.traces.domain.TraceTransport;

import java.util.List;

public interface MaterialService {
    List<TraceTransport> listCrops(String deptId);

    int changeInToOut(String cropsId);

    int addTransport(TraceTransport traceTransport);
}
