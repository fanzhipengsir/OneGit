package com.bw.mmcro.traces.mapper;

import com.bw.mmcro.traces.domain.TraceLngLat;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TraceLngLatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trace_lng_lat
     *
     * @mbg.generated Fri Nov 06 19:35:15 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trace_lng_lat
     *
     * @mbg.generated Fri Nov 06 19:35:15 CST 2020
     */
    int insert(TraceLngLat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trace_lng_lat
     *
     * @mbg.generated Fri Nov 06 19:35:15 CST 2020
     */
    int insertSelective(TraceLngLat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trace_lng_lat
     *
     * @mbg.generated Fri Nov 06 19:35:15 CST 2020
     */
    TraceLngLat selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trace_lng_lat
     *
     * @mbg.generated Fri Nov 06 19:35:15 CST 2020
     */
    int updateByPrimaryKeySelective(TraceLngLat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trace_lng_lat
     *
     * @mbg.generated Fri Nov 06 19:35:15 CST 2020
     */
    int updateByPrimaryKey(TraceLngLat record);
}
