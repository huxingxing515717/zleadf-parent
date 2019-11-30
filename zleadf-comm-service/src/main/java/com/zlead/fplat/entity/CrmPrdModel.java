package com.zlead.fplat.entity;

import java.util.Date;

/**
 * �ͺ�
 */
public class CrmPrdModel {
    /**
     * �ֶ�����: id .
     * �ֶζ���: crm_prd_model.model_id
     *
     * @ET
     */
    private Integer modelId;

    /**
     * �ֶ�����: �ͺŴ��� .
     * �ֶζ���: crm_prd_model.model_no
     *
     * @ET
     */
    private String modelNo;

    /**
     * �ֶ�����: �ͺ����� .
     * �ֶζ���: crm_prd_model.model_name
     *
     * @ET
     */
    private String modelName;

    /**
     * �ֶ�����: ����Ʒ�� .
     * �ֶζ���: crm_prd_model.band_id
     *
     * @ET
     */
    private Integer bandId;

    /**
     * �ֶ�����: ����ϵ�� .
     * �ֶζ���: crm_prd_model.list_id
     *
     * @ET
     */
    private Integer listId;

    /**
     * �ֶ�����: ƴ�� .
     * �ֶζ���: crm_prd_model.pinyin
     *
     * @ET
     */
    private String pinyin;

    /**
     * �ֶ�����: ��ƴ .
     * �ֶζ���: crm_prd_model.pinyin_sh
     *
     * @ET
     */
    private String pinyinSh;

    /**
     * �ֶ�����: ͼƬ .
     * �ֶζ���: crm_prd_model.pic_path
     *
     * @ET
     */
    private String picPath;

    /**
     * �ֶ�����: ״̬ .
     * �ֶζ���: crm_prd_model.model_state
     *
     * @ET
     */
    private String modelState;

    /**
     * �ֶ�����: ��ע .
     * �ֶζ���: crm_prd_model.model_desc
     *
     * @ET
     */
    private String modelDesc;

    /**
     * �ֶ�����: ϵͳ .
     * �ֶζ���: crm_prd_model.sys_id
     *
     * @ET
     */
    private Integer sysId;

    /**
     * �ֶ�����: ������ .
     * �ֶζ���: crm_prd_model.creator
     *
     * @ET
     */
    private Integer creator;

    /**
     * �ֶ�����: �޸��� .
     * �ֶζ���: crm_prd_model.modifier
     *
     * @ET
     */
    private Integer modifier;

    /**
     * �ֶ�����: ����ʱ�� .
     * �ֶζ���: crm_prd_model.create_time
     *
     * @ET
     */
    private Date createTime;

    /**
     * �ֶ�����: �޸�ʱ�� .
     * �ֶζ���: crm_prd_model.modify_time
     *
     * @ET
     */
    private Date modifyTime;

    /**
     * This method:getModelId
     * crm_prd_model.model_id
     *
     * @return the value of crm_prd_model.model_id
     *
     * @ET
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * This method:setModelId
     *  crm_prd_model.model_id
     *
     * @param modelId the value for crm_prd_model.model_id
     *
     * @ET
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * This method:getModelNo
     * crm_prd_model.model_no
     *
     * @return the value of crm_prd_model.model_no
     *
     * @ET
     */
    public String getModelNo() {
        return modelNo;
    }

    /**
     * This method:setModelNo
     *  crm_prd_model.model_no
     *
     * @param modelNo the value for crm_prd_model.model_no
     *
     * @ET
     */
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo == null ? null : modelNo.trim();
    }

    /**
     * This method:getModelName
     * crm_prd_model.model_name
     *
     * @return the value of crm_prd_model.model_name
     *
     * @ET
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method:setModelName
     *  crm_prd_model.model_name
     *
     * @param modelName the value for crm_prd_model.model_name
     *
     * @ET
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * This method:getBandId
     * crm_prd_model.band_id
     *
     * @return the value of crm_prd_model.band_id
     *
     * @ET
     */
    public Integer getBandId() {
        return bandId;
    }

    /**
     * This method:setBandId
     *  crm_prd_model.band_id
     *
     * @param bandId the value for crm_prd_model.band_id
     *
     * @ET
     */
    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    /**
     * This method:getListId
     * crm_prd_model.list_id
     *
     * @return the value of crm_prd_model.list_id
     *
     * @ET
     */
    public Integer getListId() {
        return listId;
    }

    /**
     * This method:setListId
     *  crm_prd_model.list_id
     *
     * @param listId the value for crm_prd_model.list_id
     *
     * @ET
     */
    public void setListId(Integer listId) {
        this.listId = listId;
    }

    /**
     * This method:getPinyin
     * crm_prd_model.pinyin
     *
     * @return the value of crm_prd_model.pinyin
     *
     * @ET
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method:setPinyin
     *  crm_prd_model.pinyin
     *
     * @param pinyin the value for crm_prd_model.pinyin
     *
     * @ET
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * This method:getPinyinSh
     * crm_prd_model.pinyin_sh
     *
     * @return the value of crm_prd_model.pinyin_sh
     *
     * @ET
     */
    public String getPinyinSh() {
        return pinyinSh;
    }

    /**
     * This method:setPinyinSh
     *  crm_prd_model.pinyin_sh
     *
     * @param pinyinSh the value for crm_prd_model.pinyin_sh
     *
     * @ET
     */
    public void setPinyinSh(String pinyinSh) {
        this.pinyinSh = pinyinSh == null ? null : pinyinSh.trim();
    }

    /**
     * This method:getPicPath
     * crm_prd_model.pic_path
     *
     * @return the value of crm_prd_model.pic_path
     *
     * @ET
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * This method:setPicPath
     *  crm_prd_model.pic_path
     *
     * @param picPath the value for crm_prd_model.pic_path
     *
     * @ET
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    /**
     * This method:getModelState
     * crm_prd_model.model_state
     *
     * @return the value of crm_prd_model.model_state
     *
     * @ET
     */
    public String getModelState() {
        return modelState;
    }

    /**
     * This method:setModelState
     *  crm_prd_model.model_state
     *
     * @param modelState the value for crm_prd_model.model_state
     *
     * @ET
     */
    public void setModelState(String modelState) {
        this.modelState = modelState == null ? null : modelState.trim();
    }

    /**
     * This method:getModelDesc
     * crm_prd_model.model_desc
     *
     * @return the value of crm_prd_model.model_desc
     *
     * @ET
     */
    public String getModelDesc() {
        return modelDesc;
    }

    /**
     * This method:setModelDesc
     *  crm_prd_model.model_desc
     *
     * @param modelDesc the value for crm_prd_model.model_desc
     *
     * @ET
     */
    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc == null ? null : modelDesc.trim();
    }

    /**
     * This method:getSysId
     * crm_prd_model.sys_id
     *
     * @return the value of crm_prd_model.sys_id
     *
     * @ET
     */
    public Integer getSysId() {
        return sysId;
    }

    /**
     * This method:setSysId
     *  crm_prd_model.sys_id
     *
     * @param sysId the value for crm_prd_model.sys_id
     *
     * @ET
     */
    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    /**
     * This method:getCreator
     * crm_prd_model.creator
     *
     * @return the value of crm_prd_model.creator
     *
     * @ET
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method:setCreator
     *  crm_prd_model.creator
     *
     * @param creator the value for crm_prd_model.creator
     *
     * @ET
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method:getModifier
     * crm_prd_model.modifier
     *
     * @return the value of crm_prd_model.modifier
     *
     * @ET
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     * This method:setModifier
     *  crm_prd_model.modifier
     *
     * @param modifier the value for crm_prd_model.modifier
     *
     * @ET
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * This method:getCreateTime
     * crm_prd_model.create_time
     *
     * @return the value of crm_prd_model.create_time
     *
     * @ET
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method:setCreateTime
     *  crm_prd_model.create_time
     *
     * @param createTime the value for crm_prd_model.create_time
     *
     * @ET
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method:getModifyTime
     * crm_prd_model.modify_time
     *
     * @return the value of crm_prd_model.modify_time
     *
     * @ET
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method:setModifyTime
     *  crm_prd_model.modify_time
     *
     * @param modifyTime the value for crm_prd_model.modify_time
     *
     * @ET
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}