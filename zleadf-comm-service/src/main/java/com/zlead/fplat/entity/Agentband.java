package com.zlead.fplat.entity;

/**
 * �����̺�Ʒ��֮��Ĺ�����
 */
public class Agentband {
    /**
     * �ֶ�����: id .
     * �ֶζ���: oa_agent_band.id
     *
     * @ET
     */
    private Integer id;

    /**
     * �ֶ�����: ������id .
     * �ֶζ���: oa_agent_band.agent_id
     *
     * @ET
     */
    private Integer agentId;

    /**
     * �ֶ�����: Ʒ��id .
     * �ֶζ���: oa_agent_band.band_id
     *
     * @ET
     */
    private Integer bandId;

    /**
     * �ֶ�����: Ʒ������ .
     * �ֶζ���: oa_agent_band.band_name
     *
     * @ET
     */
    private String bandName;

    /**
     * �ֶ�����: ϵ�� .
     * �ֶζ���: oa_agent_band.list_name
     *
     * @ET
     */
    private String listName;

    /**
     * �ֶ�����: ϵ�� .
     * �ֶζ���: oa_agent_band.list_name
     *
     * @ET
     */
    private String listIds;

    /**
     * This method:getId
     * oa_agent_band.id
     *
     * @return the value of oa_agent_band.id
     *
     * @ET
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method:setId
     *  oa_agent_band.id
     *
     * @param id the value for oa_agent_band.id
     *
     * @ET
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method:getAgentId
     * oa_agent_band.agent_id
     *
     * @return the value of oa_agent_band.agent_id
     *
     * @ET
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * This method:setAgentId
     *  oa_agent_band.agent_id
     *
     * @param agentId the value for oa_agent_band.agent_id
     *
     * @ET
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    /**
     * This method:getBandId
     * oa_agent_band.band_id
     *
     * @return the value of oa_agent_band.band_id
     *
     * @ET
     */
    public Integer getBandId() {
        return bandId;
    }

    /**
     * This method:setBandId
     *  oa_agent_band.band_id
     *
     * @param bandId the value for oa_agent_band.band_id
     *
     * @ET
     */
    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    /**
     * This method:getBandName
     * oa_agent_band.band_name
     *
     * @return the value of oa_agent_band.band_name
     *
     * @ET
     */
    public String getBandName() {
        return bandName;
    }

    /**
     * This method:setBandName
     *  oa_agent_band.band_name
     *
     * @param bandName the value for oa_agent_band.band_name
     *
     * @ET
     */
    public void setBandName(String bandName) {
        this.bandName = bandName == null ? null : bandName.trim();
    }

    /**
     * This method:getListName
     * oa_agent_band.list_name
     *
     * @return the value of oa_agent_band.list_name
     *
     * @ET
     */
    public String getListName() {
        return listName;
    }

    /**
     * This method:setListName
     *  oa_agent_band.list_name
     *
     * @param listName the value for oa_agent_band.list_name
     *
     * @ET
     */
    public void setListName(String listName) {
        this.listName = listName == null ? null : listName.trim();
    }

    public String getListIds() {
        return listIds;
    }

    public void setListIds(String listIds) {
        this.listIds = listIds;
    }
}