package com.lilosoft.virtualrobot.bean;

import com.lilosoft.virtualrobot.net.result.BaseResult;

import java.util.List;

public class ChatBean extends BaseResult {

    /**
     * code : 200
     * data : {"answers":[],"areaCode":"area_420103400000","options":[],"query":"怎么申请低保","reply":"申请城乡低保应当以家庭为单位,由共同生活的家庭成员向户籍所在地乡镇人民政府(街道办事处)社会救助经办机构提出书面申请并提交相关材料。家庭成员行动不便可以委托村(居)民委员会提出申请的,需提供申请。","reply_voice":"","slot":{"classify":"76794fd371ad49ef812253b52600031f","file_url":"","id":6330554,"intent_name":"qa_zenmeshenqingdibao","name":"怎么申请低保？","qa_type":"qa","relation":0,"times":0,"web_url":"http://192.168.2.144:9103/HtmlDemo.html"},"type":"satisfy","userId":""}
     * errmsg : 执行成功
     * errno : 0
     * success : true
     */

    private int code;
    private DataBean data;
    private String errmsg;
    private int errno;
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * answers : []
         * areaCode : area_420103400000
         * options : []
         * query : 怎么申请低保
         * reply : 申请城乡低保应当以家庭为单位,由共同生活的家庭成员向户籍所在地乡镇人民政府(街道办事处)社会救助经办机构提出书面申请并提交相关材料。家庭成员行动不便可以委托村(居)民委员会提出申请的,需提供申请。
         * reply_voice :
         * slot : {"classify":"76794fd371ad49ef812253b52600031f","file_url":"","id":6330554,"intent_name":"qa_zenmeshenqingdibao","name":"怎么申请低保？","qa_type":"qa","relation":0,"times":0,"web_url":"http://192.168.2.144:9103/HtmlDemo.html"}
         * type : satisfy
         * userId :
         */

        private String areaCode;
        private String query;
        private String reply;
        private String reply_voice;
        private SlotBean slot;
        private String type;
        private String userId;
        private List<String> answers;
        private List<String> options;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getReply() {
            return reply;
        }

        public void setReply(String reply) {
            this.reply = reply;
        }

        public String getReply_voice() {
            return reply_voice;
        }

        public void setReply_voice(String reply_voice) {
            this.reply_voice = reply_voice;
        }

        public SlotBean getSlot() {
            return slot;
        }

        public void setSlot(SlotBean slot) {
            this.slot = slot;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public List<String> getAnswers() {
            return answers;
        }

        public void setAnswers(List<String> answers) {
            this.answers = answers;
        }

        public List<String> getOptions() {
            return options;
        }

        public void setOptions(List<String> options) {
            this.options = options;
        }

        public static class SlotBean {
            /**
             * classify : 76794fd371ad49ef812253b52600031f
             * file_url :
             * id : 6330554
             * intent_name : qa_zenmeshenqingdibao
             * name : 怎么申请低保？
             * qa_type : qa
             * relation : 0
             * times : 0
             * web_url : http://192.168.2.144:9103/HtmlDemo.html
             */

            private String classify;
            private String file_url;
            private int id;
            private String intent_name;
            private String name;
            private String qa_type;
            private int relation;
            private int times;
            private String web_url;
            private String event;

            public String getClassify() {
                return classify;
            }

            public void setClassify(String classify) {
                this.classify = classify;
            }

            public String getFile_url() {
                return file_url;
            }

            public void setFile_url(String file_url) {
                this.file_url = file_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIntent_name() {
                return intent_name;
            }

            public void setIntent_name(String intent_name) {
                this.intent_name = intent_name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getQa_type() {
                return qa_type;
            }

            public void setQa_type(String qa_type) {
                this.qa_type = qa_type;
            }

            public int getRelation() {
                return relation;
            }

            public void setRelation(int relation) {
                this.relation = relation;
            }

            public int getTimes() {
                return times;
            }

            public void setTimes(int times) {
                this.times = times;
            }

            public String getWeb_url() {
                return web_url;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public String getEvent() {
                return event;
            }

            public void setEvent(String event) {
                this.event = event;
            }
        }
    }
}
