package com.bw.mmcro.traces.domain;

public class TraceUserCrops {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.username
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.crops_id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private String cropsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.crops_name
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private String cropsName;

    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace_user_crops.id
     *
     * @return the value of trace_user_crops.id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace_user_crops.id
     *
     * @param id the value for trace_user_crops.id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace_user_crops.username
     *
     * @return the value of trace_user_crops.username
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace_user_crops.username
     *
     * @param username the value for trace_user_crops.username
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace_user_crops.crops_id
     *
     * @return the value of trace_user_crops.crops_id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public String getCropsId() {
        return cropsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace_user_crops.crops_id
     *
     * @param cropsId the value for trace_user_crops.crops_id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public void setCropsId(String cropsId) {
        this.cropsId = cropsId == null ? null : cropsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trace_user_crops.crops_name
     *
     * @return the value of trace_user_crops.crops_name
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public String getCropsName() {
        return cropsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trace_user_crops.crops_name
     *
     * @param cropsName the value for trace_user_crops.crops_name
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    public void setCropsName(String cropsName) {
        this.cropsName = cropsName == null ? null : cropsName.trim();
    }
}