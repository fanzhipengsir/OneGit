package com.bw.mmcro.traces.service.impl;

import com.bw.mmcro.traces.mapper.TraceTaskMapper;
import com.bw.mmcro.traces.mapper.TraceTransportMapper;
import com.bw.mmcro.traces.mapper.TraceUserCropsMapper;
import com.bw.mmcro.traces.service.ProductService;
import com.bw.mmcro.traces.domain.TraceTask;
import com.bw.mmcro.traces.domain.vo.CropsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private TraceTransportMapper traceTransportMapper;
    @Autowired
    private TraceTaskMapper traceTaskMapper;
    @Autowired
    private TraceUserCropsMapper traceUserCropsMapper;

    @Override
    public List<CropsVo> queryCropsList(Integer deptId) {
        return traceTransportMapper.queryCropsList(deptId);
    }

    @Override
    public int addTask(TraceTask traceTask) {
        return traceTaskMapper.insertSelective(traceTask);
    }

    @Override
    public int updateMachingStatus(CropsVo cropsVo) {
        return traceUserCropsMapper.updateMachingStatus(cropsVo);
    }

    @Override
    public TraceTask queryTaskByCropsId(String cropsId) {
        return traceTaskMapper.queryTaskByCropsId(cropsId);
    }

    @Override
    public int updateProductWriteStatus(String cropsId) {
        return traceUserCropsMapper.updateProductWriteStatus(cropsId);
    }

    @Override
    public List<TraceTask> queryTaskList() {
        return traceTaskMapper.queryTaskList();
    }

    @Override
    public int productOutFactory(String cropsId) {
        return traceUserCropsMapper.productOutFactory(cropsId);
    }
}
