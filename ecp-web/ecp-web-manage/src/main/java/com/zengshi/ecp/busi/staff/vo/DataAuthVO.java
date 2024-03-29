package com.zengshi.ecp.busi.staff.vo;

import java.math.BigDecimal;

import com.zengshi.ecp.base.vo.EcpBasePageReqVO;

public class DataAuthVO extends EcpBasePageReqVO {
    private Long id;

    private String name;

    private String authCode;

    private Long funcId;

    private String authType;

    private String enabled;
    
    private String sysCode;
    
    private BigDecimal authSrc;
    
    private String authDesc;
    
    private Long listAll;
    

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", authCode=").append(authCode);
        sb.append(", funcId=").append(funcId);
        sb.append(", authType=").append(authType);
        sb.append(", enabled=").append(enabled);
        sb.append("]");
        return sb.toString();
    }

    public Long getFuncId() {
        return funcId;
    }

    public void setFuncId(Long funcId) {
        this.funcId = funcId;
    }

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public Long getListAll() {
		return listAll;
	}

	public void setListAll(Long listAll) {
		this.listAll = listAll;
	}

	public BigDecimal getAuthSrc() {
		return authSrc;
	}

	public void setAuthSrc(BigDecimal authSrc) {
		this.authSrc = authSrc;
	}

	public String getAuthDesc() {
		return authDesc;
	}

	public void setAuthDesc(String authDesc) {
		this.authDesc = authDesc;
	}
}