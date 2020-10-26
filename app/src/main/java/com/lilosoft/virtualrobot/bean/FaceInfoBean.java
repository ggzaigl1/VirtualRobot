package com.lilosoft.virtualrobot.bean;

import com.lilosoft.virtualrobot.net.result.BaseResult;

public class FaceInfoBean extends BaseResult {

    /**
     * obj : {"createTime":"2020-09-25 10:15:32","enterpriseCode":"jxqjd","enterprise_code":"jxqjd","id":"e6874aab0d05460abe750ce357d05fef","service_id":"S100002","useFlag":1}
     * status : 200
     * success : true
     */

    private ObjBean obj;
    private String status;
    private boolean success;

    public ObjBean getObj() {
        return obj;
    }

    public void setObj(ObjBean obj) {
        this.obj = obj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class ObjBean {
        /**
         * createTime : 2020-09-25 10:15:32
         * enterpriseCode : jxqjd
         * enterprise_code : jxqjd
         * id : e6874aab0d05460abe750ce357d05fef
         * service_id : S100002
         * useFlag : 1
         * * birthday : 1991-08-12
         * * enterpriseCode : llcs
         * * faceToken : de18f109a5a29aea4f9fd2a9bef4ef85
         * * greetings : 龚先生，你好！
         * * groupId : 420000000000_01_113948912
         * * id : 0f87ce40d62843c094476bc6b54cf535
         * * idcard : 420503199108125215
         * * identityCode : 02
         * * identityName : 大厅员工
         * * mobile : 18771972664
         * * name : 龚冠璋
         * * sex : 01
         * * useFlag : 1
         */

        private String createTime;
        private String enterpriseCode;
        private String enterprise_code;
        private String id;
        private String service_id;
        private int useFlag;
        private String birthday;
        private String faceToken;
        private String greetings;
        private String groupId;
        private String idcard;
        private String identityCode;
        private String identityName;
        private String mobile;
        private String name;
        private String sex;

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getEnterpriseCode() {
            return enterpriseCode;
        }

        public void setEnterpriseCode(String enterpriseCode) {
            this.enterpriseCode = enterpriseCode;
        }

        public String getEnterprise_code() {
            return enterprise_code;
        }

        public void setEnterprise_code(String enterprise_code) {
            this.enterprise_code = enterprise_code;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getService_id() {
            return service_id;
        }

        public void setService_id(String service_id) {
            this.service_id = service_id;
        }

        public int getUseFlag() {
            return useFlag;
        }

        public void setUseFlag(int useFlag) {
            this.useFlag = useFlag;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getFaceToken() {
            return faceToken;
        }

        public void setFaceToken(String faceToken) {
            this.faceToken = faceToken;
        }

        public String getGreetings() {
            return greetings;
        }

        public void setGreetings(String greetings) {
            this.greetings = greetings;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public String getIdentityCode() {
            return identityCode;
        }

        public void setIdentityCode(String identityCode) {
            this.identityCode = identityCode;
        }

        public String getIdentityName() {
            return identityName;
        }

        public void setIdentityName(String identityName) {
            this.identityName = identityName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            if (sex.equals("01")) {
                return "先生";
            } else if (sex.equals("02")) {
                return "女士";
            }
            return "未知";
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }
}
