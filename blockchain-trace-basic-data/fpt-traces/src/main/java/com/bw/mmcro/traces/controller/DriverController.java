package com.bw.mmcro.traces.controller;

import com.bw.mmcro.common.core.domain.AjaxResult;
import com.bw.mmcro.traces.domain.TraceLngLat;
import com.bw.mmcro.traces.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/traces/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/listTransport/{driverId}")
    public AjaxResult listTransport(@PathVariable("driverId") String driverId){
        return AjaxResult.success(driverService.listTransport(driverId));
    }

    @PostMapping("/saveAndUpdateTransportInfoToDb")
    public AjaxResult saveAndUpdateTransportInfoToDb(@RequestBody TraceLngLat traceLngLat){
        System.out.println("lat   "+traceLngLat);
        return AjaxResult.success(driverService.saveAndUpdateTransportInfoToDb(traceLngLat));
    }

}
