package com.telecominfraproject.wlan.core.model.webtoken;

import com.telecominfraproject.wlan.core.model.json.BaseJsonModel;

/**
 * @author smacfarlane
 *
 */
public class WebTokenResult extends BaseJsonModel {
    
    private static final long serialVersionUID = 9019848455993644927L;
    
    private boolean twoFactorAuthenticationRequired;
    private boolean resetPassword;
    private String access_token;
    private String refresh_token;
    private String token_type;
    private int expires_in;
    private int idle_timeout;
    private WebTokenAclTemplate aclTemplate = new WebTokenAclTemplate();
    
	public boolean isTwoFactorAuthenticationRequired() {
		return twoFactorAuthenticationRequired;
	}
	public void setTwoFactorAuthenticationRequired(boolean twoFactorAuthenticationRequired) {
		this.twoFactorAuthenticationRequired = twoFactorAuthenticationRequired;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	public int getIdle_timeout() {
		return idle_timeout;
	}
	public void setIdle_timeout(int idle_timeout) {
		this.idle_timeout = idle_timeout;
	}
    public WebTokenAclTemplate getAclTemplate() {
        return aclTemplate;
    }
    public void setAclTemplate(WebTokenAclTemplate aclTemplate) {
        this.aclTemplate = aclTemplate;
    }
        
    public static void main(String[] args) {
        System.out.println(new WebTokenResult().toPrettyString());
    }
}