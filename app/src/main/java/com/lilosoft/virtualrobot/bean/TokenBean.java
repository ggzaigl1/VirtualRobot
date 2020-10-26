package com.lilosoft.virtualrobot.bean;

import com.lilosoft.virtualrobot.net.result.BaseResult;

public class TokenBean extends BaseResult {

    /**
     * success : true
     * status : 200
     * msg : null
     * obj : {"access_token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiYm9vdC1zZXJ2ZXIiXSwic2NvcGUiOlsic2VsZWN0Il0sImV4cCI6MTYwMDc1NzE0MSwiYXV0aG9yaXRpZXMiOlsiQ0xJRU5UIiwiQURNSU4iXSwianRpIjoiYzBjNmI0N2UtZTkzYy00OTdhLTlmYzUtNDUzYjMxOGE3NjY0IiwiY2xpZW50X2lkIjoiZWY2MGYxOTg2Y2EzNGI2Yzg0YTFlOTUyN2Y1OTFiYTYifQ.Xd_EDgIs6kV1COhIie-_WekMMkeYs5E1bSqPiDWFH20","token_type":"bearer","expires_in":80916}
     */

    private boolean success;
    private String status;
    private Object msg;
    private ObjBean obj;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public ObjBean getObj() {
        return obj;
    }

    public void setObj(ObjBean obj) {
        this.obj = obj;
    }

    public static class ObjBean {
        /**
         * access_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiYm9vdC1zZXJ2ZXIiXSwic2NvcGUiOlsic2VsZWN0Il0sImV4cCI6MTYwMDc1NzE0MSwiYXV0aG9yaXRpZXMiOlsiQ0xJRU5UIiwiQURNSU4iXSwianRpIjoiYzBjNmI0N2UtZTkzYy00OTdhLTlmYzUtNDUzYjMxOGE3NjY0IiwiY2xpZW50X2lkIjoiZWY2MGYxOTg2Y2EzNGI2Yzg0YTFlOTUyN2Y1OTFiYTYifQ.Xd_EDgIs6kV1COhIie-_WekMMkeYs5E1bSqPiDWFH20
         * token_type : bearer
         * expires_in : 80916
         */

        private String access_token;
        private String token_type;
        private int expires_in;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
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
    }
}
