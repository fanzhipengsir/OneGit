package com.bw.mmcro.quartz.util;

import org.quartz.JobExecutionContext;
import com.bw.mmcro.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 *
 * @作者  朱志广
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
