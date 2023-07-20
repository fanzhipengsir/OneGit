package com.bw.mmcro.traces.service.impl;

import com.bw.mmcro.traces.mapper.TraceTransportMapper;
import com.bw.mmcro.traces.mapper.TraceUserCropsMapper;
import com.bw.mmcro.traces.service.FarmerService;
import com.bw.mmcro.common.core.domain.entity.SysDept;
import com.bw.mmcro.common.core.domain.entity.SysUser;
import com.bw.mmcro.system.mapper.SysDeptMapper;
import com.bw.mmcro.system.mapper.SysUserMapper;
import com.bw.mmcro.traces.domain.TraceTransport;
import com.bw.mmcro.traces.domain.TraceUserCrops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerServiceImpl implements FarmerService {
    @Autowired
    private TraceUserCropsMapper traceCropsMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private TraceTransportMapper traceTransportMapper;
    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public int saveCrops(TraceUserCrops traceCrops) {
        return traceCropsMapper.insert(traceCrops);
    }

    @Override
    public List<TraceUserCrops> getCropsByUsername(String username) {
        return traceCropsMapper.getCropsByUsername(username);
    }

    @Override
    public List<SysUser> getAllDriverByDeptId(String deptId) {
        return sysUserMapper.selectUserByDeptId(deptId);
    }

    @Override
    public int addTransport(TraceTransport traceTransport) {
        int i = traceCropsMapper.updateByCropsId(traceTransport.getCropsId());
        return traceTransportMapper.insertSelective(traceTransport);
    }

    @Override
    public List<SysDept> getFactoryByDeptId(Integer deptId) {
        return sysDeptMapper.getFactoryByDeptId(deptId);
    }


}
