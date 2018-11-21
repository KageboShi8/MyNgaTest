package com.example.kageboshi.myngatest.http.models;

import java.util.List;

public class HomeHotTopicModel {

    /**
     * code : 0
     * result : [{"tid":15493879,"fid":516,"subject":"这版本是射手的天下，平A荣耀，真的香","type":8704,"postdate":1540825003,"quote_from":0,"authorid":42658431,"recommend":"recommend"},{"tid":15495011,"fid":422,"subject":"2018 暴雪嘉年华《炉石传说》系列活动！(Blizzcon 期间登录送金群星罗列者+金奥秘图纸+砰砰计划卡包)","type":12836,"postdate":1540835943,"quote_from":0,"authorid":38260890,"recommend":"recommend"},{"tid":15495152,"fid":414,"subject":"现在的大作开发成本都上亿，如果游戏不大卖不是很容易破产？","type":512,"postdate":1540840548,"quote_from":0,"authorid":122639,"recommend":"recommend"},{"tid":15495660,"fid":516,"subject":"昨晚看呆呆评价元歌削弱","type":516,"postdate":1540859110,"quote_from":0,"authorid":42472179,"recommend":"recommend"},{"tid":15495623,"fid":485,"subject":"铁观音变佛祖了，三分24中14破记录！","type":8708,"postdate":1540858676,"quote_from":0,"authorid":15403840,"recommend":"recommend"},{"tid":15494898,"fid":540,"subject":"[精神污染C+] 不是说大英雄本是高难最简单的吗？","type":6692,"postdate":1540834175,"quote_from":0,"authorid":43070802,"recommend":"recommend"},{"tid":15495603,"fid":321,"subject":"从前820，如今566","type":8708,"postdate":1540858559,"quote_from":0,"authorid":38502705,"recommend":"recommend"},{"tid":13984380,"fid":570,"subject":"[合作广告贴]双11红包每日3次、七匹狼行李箱119、南极人假两件29、网易磁吸小夜灯39、徐福记3斤零食29、沃欧速溶咖啡100条29、孔雀保温杯69","type":4203140,"postdate":1525227045,"quote_from":0,"authorid":42868450,"recommend":"recommend"},{"tid":15496061,"fid":7,"subject":"心态已炸，去tm的个人拾取","type":548,"postdate":1540862272,"quote_from":0,"authorid":36550621,"recommend":"recommend"},{"tid":15494381,"fid":230,"subject":"[大秘境] [主宰之剑] [联盟] [公会：境界的彼方] [玩家ID：Titantree]，11层阿塔达萨无故退队黑钥匙，特来此挂人(图传在6L)","type":548,"postdate":1540828627,"quote_from":0,"authorid":14948243,"recommend":"recommend"},{"tid":15454853,"fid":-608808,"subject":"家有贤妻：魔兽生日大餐(184楼已更新食谱)","type":8740,"postdate":1540478345,"quote_from":0,"authorid":650384,"recommend":"recommend"},{"tid":15498964,"fid":-7,"subject":"坐车差一元 两名10岁女童晚上被公交车司机赶下车","type":8740,"postdate":1540880407,"quote_from":0,"authorid":42614062,"recommend":"recommend"},{"tid":15497194,"fid":556,"subject":"[新闻] 10.31传承英雄召唤活动即将开始，\u201c动人的决心 艾瑞柯\u201d开放召唤","type":8704,"postdate":1540868563,"quote_from":0,"authorid":38199182,"recommend":"recommend"},{"tid":15495086,"fid":7,"subject":"至今都弄不明白大米为什么不爱组SS","type":516,"postdate":1540837956,"quote_from":0,"authorid":23471090,"recommend":"recommend"},{"tid":15496569,"fid":-447601,"subject":"[讨论]在宿舍推gal的二三事","type":516,"postdate":1540865007,"quote_from":0,"authorid":42713563,"recommend":"recommend"},{"tid":15496005,"fid":254,"subject":"[其他] 其实希尔瓦娜斯退位的话可以让老朋友克叔上马，做洛丹伦王国永远的摄政，像米那斯提力斯的摄政一样。","type":1540,"postdate":1540861949,"quote_from":0,"authorid":42895676,"recommend":"recommend"},{"tid":15496509,"fid":7,"subject":"无头就剩最后一天了，各位收货如何？","type":516,"postdate":1540864691,"quote_from":0,"authorid":43300667,"recommend":"recommend"},{"tid":15483533,"fid":-152678,"subject":"[ROLL] IG夺冠roll一块二手1060显卡","type":78340,"postdate":1540735200,"quote_from":0,"authorid":1313573,"recommend":"recommend"},{"tid":15496645,"fid":540,"subject":"[提问求助]萌新想要飞哥那的5个心脏(内含box)","type":74244,"postdate":1540865395,"quote_from":0,"authorid":42438725,"recommend":"recommend"}]
     * error : null
     */

    private int code;
    private Object error;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * tid : 15493879
         * fid : 516
         * subject : 这版本是射手的天下，平A荣耀，真的香
         * type : 8704
         * postdate : 1540825003
         * quote_from : 0
         * authorid : 42658431
         * recommend : recommend
         */

        private int tid;
        private int fid;
        private String subject;
        private int type;
        private int postdate;
        private int quote_from;
        private int authorid;
        private String recommend;

        public int getTid() {
            return tid;
        }

        public void setTid(int tid) {
            this.tid = tid;
        }

        public int getFid() {
            return fid;
        }

        public void setFid(int fid) {
            this.fid = fid;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getPostdate() {
            return postdate;
        }

        public void setPostdate(int postdate) {
            this.postdate = postdate;
        }

        public int getQuote_from() {
            return quote_from;
        }

        public void setQuote_from(int quote_from) {
            this.quote_from = quote_from;
        }

        public int getAuthorid() {
            return authorid;
        }

        public void setAuthorid(int authorid) {
            this.authorid = authorid;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
        }
    }
}
