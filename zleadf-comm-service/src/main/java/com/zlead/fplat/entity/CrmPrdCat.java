package com.zlead.fplat.entity;

import java.util.Date;

public class CrmPrdCat {
    /**
    * id
    */
    private Integer catId;

    /**
    * �������
    */
    private String catNo;

    /**
    * ��������
    */
    private String catName;

    /**
    * �ϼ�����
    */
    private Integer pcatId;

    /**
    * ƴ��
    */
    private String pinyin;

    /**
    * ��ƴ
    */
    private String pinyinSh;

    /**
    * ͼƬ
    */
    private String picPath;

    /**
    * ״̬
    */
    private String catState;

    /**
    * Ԥ�������
    */
    private Integer bcatId;

    /**
    * ��ע
    */
    private String catDesc;

    /**
    * ����/����
    */
    private Integer shopId;

    /**
    * ������
    */
    private Integer creator;

    /**
    * �޸���
    */
    private Integer modifier;

    /**
    * ����ʱ��
    */
    private Date createTime;

    /**
    * �޸�ʱ��
    */
    private Date modifyTime;

    /**
    * �Ƿ��ǹ����Զ��� 1:ƽ̨ 2������
    */
    private Integer isFac;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatNo() {
        return catNo;
    }

    public void setCatNo(String catNo) {
        this.catNo = catNo;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getPcatId() {
        return pcatId;
    }

    public void setPcatId(Integer pcatId) {
        this.pcatId = pcatId;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getPinyinSh() {
        return pinyinSh;
    }

    public void setPinyinSh(String pinyinSh) {
        this.pinyinSh = pinyinSh;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getCatState() {
        return catState;
    }

    public void setCatState(String catState) {
        this.catState = catState;
    }

    public Integer getBcatId() {
        return bcatId;
    }

    public void setBcatId(Integer bcatId) {
        this.bcatId = bcatId;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getIsFac() {
        return isFac;
    }

    public void setIsFac(Integer isFac) {
        this.isFac = isFac;
    }
}