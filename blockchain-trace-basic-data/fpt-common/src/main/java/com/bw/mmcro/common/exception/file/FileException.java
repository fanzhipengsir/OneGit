package com.bw.mmcro.common.exception.file;

import com.bw.mmcro.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @作者  朱志广
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
