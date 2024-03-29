package com.zengshi.ecp.busi.shop.vo;

import java.util.List;

public class GoodSearchResultVO {



	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 7299963184185039508L;

	private String id;

	private long firstSkuId;

	private List<String> promotionType;

	private String ifLadderPrice;

	private String mainPic;

	private String imageUrl;

	private long defaultPrice;

	private long discountPrice;

	private String discount;

	// private String yunPrice;

	private String gdsName;
	
	private String gdsNameSrc;

	private String gdsSubHead;
	
	private String gdsSubHeadSrc;

	private String shopName;

	private String shopId;

	private long sales;

	private String updateTime;

	private long storage;

	private String storageDesc;
	/**
	 * add by gongxq 库存状态，用于购物车按钮的判断
	 */
	private String storageStatus;

	private String gdsDesc;

	private String gdsDescContent;

	private String gdsTypeId;

	private String uncertainfield_prop;

	private String mainCategoryCode;

	private String categoryPath;

	private String skuProps;

	private long guidePrice;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getFirstSkuId() {
		return firstSkuId;
	}

	public void setFirstSkuId(long firstSkuId) {
		this.firstSkuId = firstSkuId;
	}

	public List<String> getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(List<String> promotionType) {
		this.promotionType = promotionType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIfLadderPrice() {
		return ifLadderPrice;
	}

	public void setIfLadderPrice(String ifLadderPrice) {
		this.ifLadderPrice = ifLadderPrice;
	}

	public String getMainPic() {
		return mainPic;
	}

	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public long getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(long defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getGdsName() {
		return gdsName;
	}

	public void setGdsName(String gdsName) {
		this.gdsName = gdsName;
	}
	
	public String getGdsNameSrc() {
        return gdsNameSrc;
    }

    public void setGdsNameSrc(String gdsNameSrc) {
        this.gdsNameSrc = gdsNameSrc;
    }

    public String getGdsSubHead() {
		return gdsSubHead;
	}

	public void setGdsSubHead(String gdsSubHead) {
		this.gdsSubHead = gdsSubHead;
	}
	
	public String getGdsSubHeadSrc() {
        return gdsSubHeadSrc;
    }

    public void setGdsSubHeadSrc(String gdsSubHeadSrc) {
        this.gdsSubHeadSrc = gdsSubHeadSrc;
    }

    public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public long getSales() {
		return sales;
	}

	public void setSales(long sales) {
		this.sales = sales;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public long getStorage() {
		return storage;
	}

	public void setStorage(long storage) {
		this.storage = storage;
	}

	public String getStorageDesc() {
		return storageDesc;
	}

	public void setStorageDesc(String storageDesc) {
		this.storageDesc = storageDesc;
	}

	public String getGdsDesc() {
		return gdsDesc;
	}

	public void setGdsDesc(String gdsDesc) {
		this.gdsDesc = gdsDesc;
	}

	public String getGdsTypeId() {
		return gdsTypeId;
	}

	public void setGdsTypeId(String gdsTypeId) {
		this.gdsTypeId = gdsTypeId;
	}

	public String getGdsDescContent() {
		return gdsDescContent;
	}

	public void setGdsDescContent(String gdsDescContent) {
		this.gdsDescContent = gdsDescContent;
	}

	public String getUncertainfield_prop() {
		return uncertainfield_prop;
	}

	public void setUncertainfield_prop(String uncertainfield_prop) {
		this.uncertainfield_prop = uncertainfield_prop;
	}



	public String getMainCategoryCode() {
		return mainCategoryCode;
	}

	public void setMainCategoryCode(String mainCategoryCode) {
		this.mainCategoryCode = mainCategoryCode;
	}

	public String getSkuProps() {
		return skuProps;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	// public String getYunPrice() {
	// return yunPrice;
	// }
	//
	// public void setYunPrice(String yunPrice) {
	// this.yunPrice = yunPrice;
	// }

	public String getCategoryPath() {
		return categoryPath;
	}

	public long getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(long discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getStorageStatus() {
		return storageStatus;
	}

	public void setStorageStatus(String storageStatus) {
		this.storageStatus = storageStatus;
	}

	public long getGuidePrice() {
		return guidePrice;
	}

	public void setGuidePrice(long guidePrice) {
		this.guidePrice = guidePrice;
	}



}

