package com.bw.mmcro.traces.service;

import com.bw.mmcro.common.core.domain.entity.SysDept;
import com.bw.mmcro.common.core.domain.entity.SysUser;
import com.bw.mmcro.traces.domain.TraceTransport;
import com.bw.mmcro.traces.domain.TraceUserCrops;

import java.util.List;

public interface FarmerService {
    int saveCrops(TraceUserCrops traceCrops);

    List<TraceUserCrops> getCropsByUsername(String username);

    List<SysUser> getAllDriverByDeptId(String deptId);

    int addTransport(TraceTransport traceTransport);

    List<SysDept> getFactoryByDeptId(Integer deptId);
}
