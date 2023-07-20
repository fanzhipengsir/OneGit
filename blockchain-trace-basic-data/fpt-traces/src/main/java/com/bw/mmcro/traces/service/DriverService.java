package com.bw.mmcro.traces.service;

import com.bw.mmcro.traces.domain.TraceLngLat;
import com.bw.mmcro.traces.domain.TraceTransport;

import java.util.List;

public interface DriverService {
    List<TraceTransport> listTransport(String driverId);

    int saveAndUpdateTransportInfoToDb(TraceLngLat traceLngLat);
}
