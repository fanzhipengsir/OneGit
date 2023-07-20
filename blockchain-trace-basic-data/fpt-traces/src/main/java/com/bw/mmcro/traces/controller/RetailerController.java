package com.bw.mmcro.traces.controller;

import com.bw.mmcro.traces.service.RetailerService;
import com.bw.mmcro.common.core.domain.AjaxResult;
import com.bw.mmcro.traces.domain.TraceTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/traces/retailer")
public class RetailerController {

    @Autowired
    private RetailerService retailerService;

    @PostMapping("/updateReceiveStatus")
    public AjaxResult updateReceiveStatus(@RequestBody TraceTransport traceTransport){
        return AjaxResult.success(retailerService.updateReceiveStatus(traceTransport));
    }
}
