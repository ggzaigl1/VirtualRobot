package com.lilosoft.virtualrobot.bean;

import com.lilosoft.virtualrobot.net.result.BaseResult;

import java.util.List;

public class InitializeBean extends BaseResult {


    /**
     * obj : {"apis":[{"code":"chatUrl","name":"知识库对话接口","url":"http://47.111.254.223:8081/"},{"code":"websocketUrl","name":"websocket连接地址","url":"wss://rapi.egovrobot.com/websocket/"},{"code":"rapiUrl","name":"机器人后台管理相关接口","url":"https://rapi.egovrobot.com/"}],"functions":[{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__cOARiYNAAALS1NNpCQ721.png","code":"customer_service","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDYOAZbwZAAAH0Arpxwo544.png","id":"76c6146e36a049d1bba87614371e98f7","introduction":"人工客服","markedWords":[{"content":"对我说：人工客服","createTime":"2020-10-09 14:05:56","functionId":"76c6146e36a049d1bba87614371e98f7","id":"2cc69097770a43c7079e06e185774c64","useFlag":"1"},{"content":"对我说：连接客服","createTime":"2020-10-09 14:05:56","functionId":"76c6146e36a049d1bba87614371e98f7","id":"dc5039e474a46eb5684b97d703c79870","useFlag":"1"}],"name":"人工客服","paramDict":[],"resume":"人工客服","showFlag":"1","sort":1,"type":"1","url":"/customerService","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__cqAVjmdAAALgRxGbOw840.png","code":"record","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDZKAUg4yAAAG_mznmVU588.png","id":"33628e7ec73d45a2b6e9942f81d77c62","introduction":"机器人档案查询","markedWords":[{"content":"对我说：查询档案","createTime":"2020-10-09 14:06:04","functionId":"33628e7ec73d45a2b6e9942f81d77c62","id":"a772b44aa61f6960f285eabe63d0d548","useFlag":"1"},{"content":"对我说：档案查询","createTime":"2020-10-09 14:06:04","functionId":"33628e7ec73d45a2b6e9942f81d77c62","id":"df6c393bbe0621778d3630ecf1556218","useFlag":"1"}],"name":"档案查询","paramDict":[],"resume":"档案查询","showFlag":"1","sort":2,"type":"1","url":"/archives","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__dKAfb8rAAAKXWGEvhc519.png","code":"job","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDaCAX72AAAAF90J3my8384.png","id":"5dfd7275224a4444886e12fa3b6e4bf8","introduction":"机器人求职招聘","markedWords":[{"content":"我可以求职招聘","createTime":"2020-10-09 14:06:11","functionId":"5dfd7275224a4444886e12fa3b6e4bf8","id":"23f5874c5aea8837092556833bf38592","useFlag":"1"},{"content":"我能求职招聘","createTime":"2020-10-09 14:06:11","functionId":"5dfd7275224a4444886e12fa3b6e4bf8","id":"4bb82df01743dc70615f45abd48639b0","useFlag":"1"}],"name":"求职招聘","paramDict":[],"resume":"对我说：求职招聘","showFlag":"1","sort":3,"type":"1","url":"/job","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__dqAKQLGAAALIiIUdlI424.png","code":"face_search","icon":"https://www.egovrobot.com/group1/M00/00/00/rAsACF78PAmAJ9T7AAAfV0IsvX4325.png","id":"aa473173c86a4d04afff4966f1b9559b","introduction":"机器人人脸识别功能","markedWords":[{"content":"人脸识别","createTime":"2020-10-09 14:06:19","functionId":"aa473173c86a4d04afff4966f1b9559b","id":"ae1124c29b74330d7087bb38ff17891e","useFlag":"1"}],"name":"人脸识别","paramDict":[],"resume":"人脸识别","showFlag":"0","sort":4,"type":"1","url":"/faceSearch","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__eGAEvqgAAALMldcy8I252.png","code":"chat","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDb2AA-WjAAAH0FVOCHo539.png","id":"e5b284e46fae4cc59279356beb0d0887","introduction":"机器人智能对话","markedWords":[{"content":"智能问答咨询","createTime":"2020-10-09 14:06:26","functionId":"e5b284e46fae4cc59279356beb0d0887","id":"10fca8beb5fe7b5b5b90017aa8c17c95","useFlag":"1"},{"content":"对我说：智能问答咨询","createTime":"2020-10-09 14:06:26","functionId":"e5b284e46fae4cc59279356beb0d0887","id":"3c842ad5e3f8a8ad03e0a8146add4c5f","useFlag":"1"}],"name":"咨询聊天","paramDict":[],"resume":"智能问答咨询","showFlag":"1","sort":5,"type":"1","url":"/chat","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__eiACwJ7AAALS1HQMgo786.png","code":"navigation","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDcyAXJwdAAAHwX-mjsA249.png","id":"9aeb52422e574f5c832f75834bc9c31f","introduction":"机器人导航","markedWords":[{"content":"我想去某某地方","createTime":"2020-10-09 14:06:33","functionId":"9aeb52422e574f5c832f75834bc9c31f","id":"77fb3120fd0b62bc10625f198051b18a","useFlag":"1"},{"content":"对我说：带我去XXX","createTime":"2020-10-09 14:06:33","functionId":"9aeb52422e574f5c832f75834bc9c31f","id":"b17f6f8436073681675d5fc7e48f1476","useFlag":"1"}],"name":"导航","paramDict":[],"resume":"对我说：带我去XXX","showFlag":"1","sort":6,"type":"1","url":"/navigation","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__e-AJ0NfAAALgTPtkEE502.png","code":"takenum","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDeKAPeNtAAAF92xqaWU892.png","id":"45446888ecfa46779917a28a025a4dc4","introduction":"机器人取号功能","markedWords":[{"content":"对我说：取号","createTime":"2020-10-09 14:06:40","functionId":"45446888ecfa46779917a28a025a4dc4","id":"7afd1edc0dcb42b37c145eb4468f305d","useFlag":"1"},{"content":"我要取号","createTime":"2020-10-09 14:06:40","functionId":"45446888ecfa46779917a28a025a4dc4","id":"d2ba22f7f7d28164bcaf899bc46eb1b5","useFlag":"1"},{"content":"我想取号","createTime":"2020-10-09 14:06:40","functionId":"45446888ecfa46779917a28a025a4dc4","id":"d6cc52942f3aaf99a667f02993508abf","useFlag":"1"}],"name":"取号","paramDict":[],"resume":"对我说：取号","showFlag":"1","sort":7,"type":"1","url":"/numbertaking","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__fWAHM7sAAAKXR3qD1M689.png","code":"evaluate","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDe-AR7c5AAAG_ne3_HI225.png","id":"6fd4192910a44b75a4ac00b4cac31923","introduction":"机器人评价功能","markedWords":[{"content":"我能评价","createTime":"2020-10-09 14:06:46","functionId":"6fd4192910a44b75a4ac00b4cac31923","id":"3586835c1ca92a43c25a8095db8ce80f","useFlag":"1"},{"content":"对我说：评价","createTime":"2020-10-09 14:06:46","functionId":"6fd4192910a44b75a4ac00b4cac31923","id":"8b3c9724968d1388b994cd88e79f69b7","useFlag":"1"},{"content":"我要评价","createTime":"2020-10-09 14:06:46","functionId":"6fd4192910a44b75a4ac00b4cac31923","id":"e2397da4c473c3834f2c0afbda48ebb9","useFlag":"1"}],"name":"评价","paramDict":[],"resume":"对我说：评价","showFlag":"1","sort":8,"type":"1","url":"/evaluate","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__fuAASivAAALIltvSVI169.png","code":"pickup","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDgCAV2DuAAAH0DqYE7o373.png","id":"732cfde4b7d548f68538316ee9ec160c","introduction":"政务柜取件","markedWords":[{"content":"我要取件","createTime":"2020-10-09 14:06:53","functionId":"732cfde4b7d548f68538316ee9ec160c","id":"2dcb06ae5df3c28ab57a97c383918b35","useFlag":"1"},{"content":"对我说：取件","createTime":"2020-10-09 14:06:53","functionId":"732cfde4b7d548f68538316ee9ec160c","id":"cbb75bc1a50376b40cf0160357937bac","useFlag":"1"}],"name":"取件","paramDict":[],"resume":"对我说：取件","showFlag":"1","sort":9,"type":"1","url":"/pickUp","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__gOAZG7vAAALMhcz80o014.png","code":"subscribe","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDgyAGHWaAAAG_nIEE24987.png","id":"f8ae067cfcbf49d284459a484d9a0b3a","introduction":"机器人预约功能","markedWords":[{"content":"对我说：预约","createTime":"2020-10-09 14:07:01","functionId":"f8ae067cfcbf49d284459a484d9a0b3a","id":"3c92cc89917b2651007b6e5d97e376e9","useFlag":"1"},{"content":"我要预约","createTime":"2020-10-09 14:07:01","functionId":"f8ae067cfcbf49d284459a484d9a0b3a","id":"979a5a3d3c028fd14eb997d1e1551f3f","useFlag":"1"}],"name":"预约","paramDict":[],"resume":"对我说：预约","showFlag":"1","sort":10,"type":"1","url":"/subscribe","version":1}],"robot":{"apkId":"7675cefb412b488884e8d7f0ebb22039","areaCode":"420103400000","backImgUrl":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__LiAZkZ7AAQZ5h6OHkQ681.png","cartographys":["https://www.egovrobot.com/group1/M00/00/06/O60S-l9__HGAaRqTAASgekcU3hc864.jpg","https://www.egovrobot.com/group1/M00/00/06/O60S-l9__GmAbAulAAVQwWo--wc791.png","https://www.egovrobot.com/group1/M00/00/06/O60S-l9__HaAStxOAAKmYV84_7w087.jpg"],"cgaAreaCode":"420103400000","createTime":"2020-10-09 14:01:49","electric":10,"enterpriseCode":"llcs","enterpriseId":"af5492d4417c44c280e480e5264b8846","enterpriseName":"力龙信息科技","greetings":[{"content":"你好，我是虚拟机器人，请问有什么可以帮到您的呢？","createTime":"2020-10-09 14:03:53","id":"306ed9b025e493be7d997004c70ca7f1","serviceId":"S100007","useFlag":"1"}],"guides":[{"content":"我要咨询","createTime":"2020-10-09 14:03:53","id":"ac48e92c637264b78876162c682c58b6","serviceId":"S100007","useFlag":"1"}],"id":"0d1de390dc154eeb88b1af53304550ce","industry":"01","language":"01","logoImgUrl":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__KCAPMKvAAAfV2IxK-Q598.png","logoName":"终端虚拟机器人","name":"终端虚拟机器人","productNo":"N.202010096718","robotType":"03","serviceId":"S100007","sound":"01","speed":"01","versionCode":"version1","versionName":"终端虚拟机器人","versionNo":1,"videoDownUrl":"","videoSource":1,"workTime":"08:30-17:30"}}
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
         * apis : [{"code":"chatUrl","name":"知识库对话接口","url":"http://47.111.254.223:8081/"},{"code":"websocketUrl","name":"websocket连接地址","url":"wss://rapi.egovrobot.com/websocket/"},{"code":"rapiUrl","name":"机器人后台管理相关接口","url":"https://rapi.egovrobot.com/"}]
         * functions : [{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__cOARiYNAAALS1NNpCQ721.png","code":"customer_service","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDYOAZbwZAAAH0Arpxwo544.png","id":"76c6146e36a049d1bba87614371e98f7","introduction":"人工客服","markedWords":[{"content":"对我说：人工客服","createTime":"2020-10-09 14:05:56","functionId":"76c6146e36a049d1bba87614371e98f7","id":"2cc69097770a43c7079e06e185774c64","useFlag":"1"},{"content":"对我说：连接客服","createTime":"2020-10-09 14:05:56","functionId":"76c6146e36a049d1bba87614371e98f7","id":"dc5039e474a46eb5684b97d703c79870","useFlag":"1"}],"name":"人工客服","paramDict":[],"resume":"人工客服","showFlag":"1","sort":1,"type":"1","url":"/customerService","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__cqAVjmdAAALgRxGbOw840.png","code":"record","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDZKAUg4yAAAG_mznmVU588.png","id":"33628e7ec73d45a2b6e9942f81d77c62","introduction":"机器人档案查询","markedWords":[{"content":"对我说：查询档案","createTime":"2020-10-09 14:06:04","functionId":"33628e7ec73d45a2b6e9942f81d77c62","id":"a772b44aa61f6960f285eabe63d0d548","useFlag":"1"},{"content":"对我说：档案查询","createTime":"2020-10-09 14:06:04","functionId":"33628e7ec73d45a2b6e9942f81d77c62","id":"df6c393bbe0621778d3630ecf1556218","useFlag":"1"}],"name":"档案查询","paramDict":[],"resume":"档案查询","showFlag":"1","sort":2,"type":"1","url":"/archives","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__dKAfb8rAAAKXWGEvhc519.png","code":"job","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDaCAX72AAAAF90J3my8384.png","id":"5dfd7275224a4444886e12fa3b6e4bf8","introduction":"机器人求职招聘","markedWords":[{"content":"我可以求职招聘","createTime":"2020-10-09 14:06:11","functionId":"5dfd7275224a4444886e12fa3b6e4bf8","id":"23f5874c5aea8837092556833bf38592","useFlag":"1"},{"content":"我能求职招聘","createTime":"2020-10-09 14:06:11","functionId":"5dfd7275224a4444886e12fa3b6e4bf8","id":"4bb82df01743dc70615f45abd48639b0","useFlag":"1"}],"name":"求职招聘","paramDict":[],"resume":"对我说：求职招聘","showFlag":"1","sort":3,"type":"1","url":"/job","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__dqAKQLGAAALIiIUdlI424.png","code":"face_search","icon":"https://www.egovrobot.com/group1/M00/00/00/rAsACF78PAmAJ9T7AAAfV0IsvX4325.png","id":"aa473173c86a4d04afff4966f1b9559b","introduction":"机器人人脸识别功能","markedWords":[{"content":"人脸识别","createTime":"2020-10-09 14:06:19","functionId":"aa473173c86a4d04afff4966f1b9559b","id":"ae1124c29b74330d7087bb38ff17891e","useFlag":"1"}],"name":"人脸识别","paramDict":[],"resume":"人脸识别","showFlag":"0","sort":4,"type":"1","url":"/faceSearch","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__eGAEvqgAAALMldcy8I252.png","code":"chat","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDb2AA-WjAAAH0FVOCHo539.png","id":"e5b284e46fae4cc59279356beb0d0887","introduction":"机器人智能对话","markedWords":[{"content":"智能问答咨询","createTime":"2020-10-09 14:06:26","functionId":"e5b284e46fae4cc59279356beb0d0887","id":"10fca8beb5fe7b5b5b90017aa8c17c95","useFlag":"1"},{"content":"对我说：智能问答咨询","createTime":"2020-10-09 14:06:26","functionId":"e5b284e46fae4cc59279356beb0d0887","id":"3c842ad5e3f8a8ad03e0a8146add4c5f","useFlag":"1"}],"name":"咨询聊天","paramDict":[],"resume":"智能问答咨询","showFlag":"1","sort":5,"type":"1","url":"/chat","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__eiACwJ7AAALS1HQMgo786.png","code":"navigation","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDcyAXJwdAAAHwX-mjsA249.png","id":"9aeb52422e574f5c832f75834bc9c31f","introduction":"机器人导航","markedWords":[{"content":"我想去某某地方","createTime":"2020-10-09 14:06:33","functionId":"9aeb52422e574f5c832f75834bc9c31f","id":"77fb3120fd0b62bc10625f198051b18a","useFlag":"1"},{"content":"对我说：带我去XXX","createTime":"2020-10-09 14:06:33","functionId":"9aeb52422e574f5c832f75834bc9c31f","id":"b17f6f8436073681675d5fc7e48f1476","useFlag":"1"}],"name":"导航","paramDict":[],"resume":"对我说：带我去XXX","showFlag":"1","sort":6,"type":"1","url":"/navigation","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__e-AJ0NfAAALgTPtkEE502.png","code":"takenum","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDeKAPeNtAAAF92xqaWU892.png","id":"45446888ecfa46779917a28a025a4dc4","introduction":"机器人取号功能","markedWords":[{"content":"对我说：取号","createTime":"2020-10-09 14:06:40","functionId":"45446888ecfa46779917a28a025a4dc4","id":"7afd1edc0dcb42b37c145eb4468f305d","useFlag":"1"},{"content":"我要取号","createTime":"2020-10-09 14:06:40","functionId":"45446888ecfa46779917a28a025a4dc4","id":"d2ba22f7f7d28164bcaf899bc46eb1b5","useFlag":"1"},{"content":"我想取号","createTime":"2020-10-09 14:06:40","functionId":"45446888ecfa46779917a28a025a4dc4","id":"d6cc52942f3aaf99a667f02993508abf","useFlag":"1"}],"name":"取号","paramDict":[],"resume":"对我说：取号","showFlag":"1","sort":7,"type":"1","url":"/numbertaking","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__fWAHM7sAAAKXR3qD1M689.png","code":"evaluate","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDe-AR7c5AAAG_ne3_HI225.png","id":"6fd4192910a44b75a4ac00b4cac31923","introduction":"机器人评价功能","markedWords":[{"content":"我能评价","createTime":"2020-10-09 14:06:46","functionId":"6fd4192910a44b75a4ac00b4cac31923","id":"3586835c1ca92a43c25a8095db8ce80f","useFlag":"1"},{"content":"对我说：评价","createTime":"2020-10-09 14:06:46","functionId":"6fd4192910a44b75a4ac00b4cac31923","id":"8b3c9724968d1388b994cd88e79f69b7","useFlag":"1"},{"content":"我要评价","createTime":"2020-10-09 14:06:46","functionId":"6fd4192910a44b75a4ac00b4cac31923","id":"e2397da4c473c3834f2c0afbda48ebb9","useFlag":"1"}],"name":"评价","paramDict":[],"resume":"对我说：评价","showFlag":"1","sort":8,"type":"1","url":"/evaluate","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__fuAASivAAALIltvSVI169.png","code":"pickup","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDgCAV2DuAAAH0DqYE7o373.png","id":"732cfde4b7d548f68538316ee9ec160c","introduction":"政务柜取件","markedWords":[{"content":"我要取件","createTime":"2020-10-09 14:06:53","functionId":"732cfde4b7d548f68538316ee9ec160c","id":"2dcb06ae5df3c28ab57a97c383918b35","useFlag":"1"},{"content":"对我说：取件","createTime":"2020-10-09 14:06:53","functionId":"732cfde4b7d548f68538316ee9ec160c","id":"cbb75bc1a50376b40cf0160357937bac","useFlag":"1"}],"name":"取件","paramDict":[],"resume":"对我说：取件","showFlag":"1","sort":9,"type":"1","url":"/pickUp","version":1},{"backIcon":"https://www.egovrobot.com/group1/M00/00/07/O60S-l9__gOAZG7vAAALMhcz80o014.png","code":"subscribe","icon":"https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDgyAGHWaAAAG_nIEE24987.png","id":"f8ae067cfcbf49d284459a484d9a0b3a","introduction":"机器人预约功能","markedWords":[{"content":"对我说：预约","createTime":"2020-10-09 14:07:01","functionId":"f8ae067cfcbf49d284459a484d9a0b3a","id":"3c92cc89917b2651007b6e5d97e376e9","useFlag":"1"},{"content":"我要预约","createTime":"2020-10-09 14:07:01","functionId":"f8ae067cfcbf49d284459a484d9a0b3a","id":"979a5a3d3c028fd14eb997d1e1551f3f","useFlag":"1"}],"name":"预约","paramDict":[],"resume":"对我说：预约","showFlag":"1","sort":10,"type":"1","url":"/subscribe","version":1}]
         * robot : {"apkId":"7675cefb412b488884e8d7f0ebb22039","areaCode":"420103400000","backImgUrl":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__LiAZkZ7AAQZ5h6OHkQ681.png","cartographys":["https://www.egovrobot.com/group1/M00/00/06/O60S-l9__HGAaRqTAASgekcU3hc864.jpg","https://www.egovrobot.com/group1/M00/00/06/O60S-l9__GmAbAulAAVQwWo--wc791.png","https://www.egovrobot.com/group1/M00/00/06/O60S-l9__HaAStxOAAKmYV84_7w087.jpg"],"cgaAreaCode":"420103400000","createTime":"2020-10-09 14:01:49","electric":10,"enterpriseCode":"llcs","enterpriseId":"af5492d4417c44c280e480e5264b8846","enterpriseName":"力龙信息科技","greetings":[{"content":"你好，我是虚拟机器人，请问有什么可以帮到您的呢？","createTime":"2020-10-09 14:03:53","id":"306ed9b025e493be7d997004c70ca7f1","serviceId":"S100007","useFlag":"1"}],"guides":[{"content":"我要咨询","createTime":"2020-10-09 14:03:53","id":"ac48e92c637264b78876162c682c58b6","serviceId":"S100007","useFlag":"1"}],"id":"0d1de390dc154eeb88b1af53304550ce","industry":"01","language":"01","logoImgUrl":"https://www.egovrobot.com/group1/M00/00/06/O60S-l9__KCAPMKvAAAfV2IxK-Q598.png","logoName":"终端虚拟机器人","name":"终端虚拟机器人","productNo":"N.202010096718","robotType":"03","serviceId":"S100007","sound":"01","speed":"01","versionCode":"version1","versionName":"终端虚拟机器人","versionNo":1,"videoDownUrl":"","videoSource":1,"workTime":"08:30-17:30"}
         */

        private RobotBean robot;
        private List<ApisBean> apis;
        private List<FunctionsBean> functions;

        public RobotBean getRobot() {
            return robot;
        }

        public void setRobot(RobotBean robot) {
            this.robot = robot;
        }

        public List<ApisBean> getApis() {
            return apis;
        }

        public void setApis(List<ApisBean> apis) {
            this.apis = apis;
        }

        public List<FunctionsBean> getFunctions() {
            return functions;
        }

        public void setFunctions(List<FunctionsBean> functions) {
            this.functions = functions;
        }

        public static class RobotBean {
            /**
             * apkId : 7675cefb412b488884e8d7f0ebb22039
             * areaCode : 420103400000
             * backImgUrl : https://www.egovrobot.com/group1/M00/00/06/O60S-l9__LiAZkZ7AAQZ5h6OHkQ681.png
             * cartographys : ["https://www.egovrobot.com/group1/M00/00/06/O60S-l9__HGAaRqTAASgekcU3hc864.jpg","https://www.egovrobot.com/group1/M00/00/06/O60S-l9__GmAbAulAAVQwWo--wc791.png","https://www.egovrobot.com/group1/M00/00/06/O60S-l9__HaAStxOAAKmYV84_7w087.jpg"]
             * cgaAreaCode : 420103400000
             * createTime : 2020-10-09 14:01:49
             * electric : 10
             * enterpriseCode : llcs
             * enterpriseId : af5492d4417c44c280e480e5264b8846
             * enterpriseName : 力龙信息科技
             * greetings : [{"content":"你好，我是虚拟机器人，请问有什么可以帮到您的呢？","createTime":"2020-10-09 14:03:53","id":"306ed9b025e493be7d997004c70ca7f1","serviceId":"S100007","useFlag":"1"}]
             * guides : [{"content":"我要咨询","createTime":"2020-10-09 14:03:53","id":"ac48e92c637264b78876162c682c58b6","serviceId":"S100007","useFlag":"1"}]
             * id : 0d1de390dc154eeb88b1af53304550ce
             * industry : 01
             * language : 01
             * logoImgUrl : https://www.egovrobot.com/group1/M00/00/06/O60S-l9__KCAPMKvAAAfV2IxK-Q598.png
             * logoName : 终端虚拟机器人
             * name : 终端虚拟机器人
             * productNo : N.202010096718
             * robotType : 03
             * serviceId : S100007
             * sound : 01
             * speed : 01
             * versionCode : version1
             * versionName : 终端虚拟机器人
             * versionNo : 1.0
             * videoDownUrl :
             * videoSource : 1
             * workTime : 08:30-17:30
             */

            private String apkId;
            private String areaCode;
            private String backImgUrl;
            private String cgaAreaCode;
            private String createTime;
            private int electric;
            private String enterpriseCode;
            private String enterpriseId;
            private String enterpriseName;
            private String id;
            private String industry;
            private String language;
            private String logoImgUrl;
            private String logoName;
            private String name;
            private String productNo;
            private String robotType;
            private String serviceId;
            private String sound;
            private String speed;
            private String versionCode;
            private String versionName;
            private double versionNo;
            private String videoDownUrl;
            private int videoSource;
            private String workTime;
            private List<String> cartographys;
            private List<GreetingsBean> greetings;
            private List<GuidesBean> guides;

            public String getApkId() {
                return apkId;
            }

            public void setApkId(String apkId) {
                this.apkId = apkId;
            }

            public String getAreaCode() {
                return areaCode;
            }

            public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
            }

            public String getBackImgUrl() {
                return backImgUrl;
            }

            public void setBackImgUrl(String backImgUrl) {
                this.backImgUrl = backImgUrl;
            }

            public String getCgaAreaCode() {
                return cgaAreaCode;
            }

            public void setCgaAreaCode(String cgaAreaCode) {
                this.cgaAreaCode = cgaAreaCode;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public int getElectric() {
                return electric;
            }

            public void setElectric(int electric) {
                this.electric = electric;
            }

            public String getEnterpriseCode() {
                return enterpriseCode;
            }

            public void setEnterpriseCode(String enterpriseCode) {
                this.enterpriseCode = enterpriseCode;
            }

            public String getEnterpriseId() {
                return enterpriseId;
            }

            public void setEnterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
            }

            public String getEnterpriseName() {
                return enterpriseName;
            }

            public void setEnterpriseName(String enterpriseName) {
                this.enterpriseName = enterpriseName;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIndustry() {
                return industry;
            }

            public void setIndustry(String industry) {
                this.industry = industry;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public String getLogoImgUrl() {
                return logoImgUrl;
            }

            public void setLogoImgUrl(String logoImgUrl) {
                this.logoImgUrl = logoImgUrl;
            }

            public String getLogoName() {
                return logoName;
            }

            public void setLogoName(String logoName) {
                this.logoName = logoName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getProductNo() {
                return productNo;
            }

            public void setProductNo(String productNo) {
                this.productNo = productNo;
            }

            public String getRobotType() {
                return robotType;
            }

            public void setRobotType(String robotType) {
                this.robotType = robotType;
            }

            public String getServiceId() {
                return serviceId;
            }

            public void setServiceId(String serviceId) {
                this.serviceId = serviceId;
            }

            public String getSound() {
                return sound;
            }

            public void setSound(String sound) {
                this.sound = sound;
            }

            public String getSpeed() {
                return speed;
            }

            public void setSpeed(String speed) {
                this.speed = speed;
            }

            public String getVersionCode() {
                return versionCode;
            }

            public void setVersionCode(String versionCode) {
                this.versionCode = versionCode;
            }

            public String getVersionName() {
                return versionName;
            }

            public void setVersionName(String versionName) {
                this.versionName = versionName;
            }

            public double getVersionNo() {
                return versionNo;
            }

            public void setVersionNo(double versionNo) {
                this.versionNo = versionNo;
            }

            public String getVideoDownUrl() {
                return videoDownUrl;
            }

            public void setVideoDownUrl(String videoDownUrl) {
                this.videoDownUrl = videoDownUrl;
            }

            public int getVideoSource() {
                return videoSource;
            }

            public void setVideoSource(int videoSource) {
                this.videoSource = videoSource;
            }

            public String getWorkTime() {
                return workTime;
            }

            public void setWorkTime(String workTime) {
                this.workTime = workTime;
            }

            public List<String> getCartographys() {
                return cartographys;
            }

            public void setCartographys(List<String> cartographys) {
                this.cartographys = cartographys;
            }

            public List<GreetingsBean> getGreetings() {
                return greetings;
            }

            public void setGreetings(List<GreetingsBean> greetings) {
                this.greetings = greetings;
            }

            public List<GuidesBean> getGuides() {
                return guides;
            }

            public void setGuides(List<GuidesBean> guides) {
                this.guides = guides;
            }

            public static class GreetingsBean {
                /**
                 * content : 你好，我是虚拟机器人，请问有什么可以帮到您的呢？
                 * createTime : 2020-10-09 14:03:53
                 * id : 306ed9b025e493be7d997004c70ca7f1
                 * serviceId : S100007
                 * useFlag : 1
                 */

                private String content;
                private String createTime;
                private String id;
                private String serviceId;
                private String useFlag;

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getServiceId() {
                    return serviceId;
                }

                public void setServiceId(String serviceId) {
                    this.serviceId = serviceId;
                }

                public String getUseFlag() {
                    return useFlag;
                }

                public void setUseFlag(String useFlag) {
                    this.useFlag = useFlag;
                }
            }

            public static class GuidesBean {
                /**
                 * content : 我要咨询
                 * createTime : 2020-10-09 14:03:53
                 * id : ac48e92c637264b78876162c682c58b6
                 * serviceId : S100007
                 * useFlag : 1
                 */

                private String content;
                private String createTime;
                private String id;
                private String serviceId;
                private String useFlag;

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getServiceId() {
                    return serviceId;
                }

                public void setServiceId(String serviceId) {
                    this.serviceId = serviceId;
                }

                public String getUseFlag() {
                    return useFlag;
                }

                public void setUseFlag(String useFlag) {
                    this.useFlag = useFlag;
                }
            }
        }

        public static class ApisBean {
            /**
             * code : chatUrl
             * name : 知识库对话接口
             * url : http://47.111.254.223:8081/
             */

            private String code;
            private String name;
            private String url;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class FunctionsBean {
            /**
             * backIcon : https://www.egovrobot.com/group1/M00/00/06/O60S-l9__cOARiYNAAALS1NNpCQ721.png
             * code : customer_service
             * icon : https://www.egovrobot.com/group1/M00/00/04/O60S-l9DDYOAZbwZAAAH0Arpxwo544.png
             * id : 76c6146e36a049d1bba87614371e98f7
             * introduction : 人工客服
             * markedWords : [{"content":"对我说：人工客服","createTime":"2020-10-09 14:05:56","functionId":"76c6146e36a049d1bba87614371e98f7","id":"2cc69097770a43c7079e06e185774c64","useFlag":"1"},{"content":"对我说：连接客服","createTime":"2020-10-09 14:05:56","functionId":"76c6146e36a049d1bba87614371e98f7","id":"dc5039e474a46eb5684b97d703c79870","useFlag":"1"}]
             * name : 人工客服
             * paramDict : []
             * resume : 人工客服
             * showFlag : 1
             * sort : 1
             * type : 1
             * url : /customerService
             * version : 1.0
             */

            private String backIcon;
            private String code;
            private String icon;
            private String id;
            private String introduction;
            private String name;
            private String resume;
            private String showFlag;
            private int sort;
            private String type;
            private String url;
            private double version;
            private List<MarkedWordsBean> markedWords;
            private List<?> paramDict;

            public String getBackIcon() {
                return backIcon;
            }

            public void setBackIcon(String backIcon) {
                this.backIcon = backIcon;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getResume() {
                return resume;
            }

            public void setResume(String resume) {
                this.resume = resume;
            }

            public String getShowFlag() {
                return showFlag;
            }

            public void setShowFlag(String showFlag) {
                this.showFlag = showFlag;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public double getVersion() {
                return version;
            }

            public void setVersion(double version) {
                this.version = version;
            }

            public List<MarkedWordsBean> getMarkedWords() {
                return markedWords;
            }

            public void setMarkedWords(List<MarkedWordsBean> markedWords) {
                this.markedWords = markedWords;
            }

            public List<?> getParamDict() {
                return paramDict;
            }

            public void setParamDict(List<?> paramDict) {
                this.paramDict = paramDict;
            }

            public static class MarkedWordsBean {
                /**
                 * content : 对我说：人工客服
                 * createTime : 2020-10-09 14:05:56
                 * functionId : 76c6146e36a049d1bba87614371e98f7
                 * id : 2cc69097770a43c7079e06e185774c64
                 * useFlag : 1
                 */

                private String content;
                private String createTime;
                private String functionId;
                private String id;
                private String useFlag;

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getFunctionId() {
                    return functionId;
                }

                public void setFunctionId(String functionId) {
                    this.functionId = functionId;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUseFlag() {
                    return useFlag;
                }

                public void setUseFlag(String useFlag) {
                    this.useFlag = useFlag;
                }
            }
        }
    }
}
