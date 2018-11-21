package com.example.kageboshi.myngatest.http.models;

import java.util.List;

public class GradeTitleModel {


    /**
     * code : 0
     * msg : 操作成功
     * result : {"items":{"categories":[{"id":1,"name":"主机游戏","platform_ids":[1,2,3]},{"id":2,"name":"手机游戏","platform_ids":[5,6]},{"id":3,"name":"PC游戏","platform_ids":[4,7]}],"types":[{"value":0,"name":"全部"},{"value":1,"name":"动作"},{"value":2,"name":"角色扮演"},{"value":4,"name":"射击"},{"value":8,"name":"策略"},{"value":16,"name":"MMO"},{"value":32,"name":"合作"},{"value":64,"name":"沙盒"},{"value":128,"name":"冒险"},{"value":256,"name":"格斗"},{"value":512,"name":"塔防"},{"value":1024,"name":"音乐"},{"value":2048,"name":"即时战略"},{"value":4096,"name":"模拟"},{"value":8192,"name":"ADV"},{"value":16384,"name":"MOBA"},{"value":32768,"name":"解谜"},{"value":65536,"name":"恐怖"},{"value":262144,"name":"竞速"},{"value":524288,"name":"体育"},{"value":1048576,"name":"卡牌"},{"value":2097152,"name":"益智"},{"value":4194304,"name":"养成"},{"value":8388608,"name":"休闲"},{"value":1073741824,"name":"其他"}],"platforms":[{"value":0,"name":"全部"},{"value":1,"name":"PS4"},{"value":2,"name":"Xbox One"},{"value":3,"name":"Switch"},{"value":4,"name":"Steam"},{"value":5,"name":"iOS"},{"value":6,"name":"Android"},{"value":7,"name":"客户端游戏"}],"dates":[{"value":"onsale","name":"已发售"},{"value":"week","name":"近一周"},{"value":"month","name":"近一月"},{"value":"halfyear","name":"近半年"},{"value":"2018","name":"2018"},{"value":"2017","name":"2017"},{"value":"notyet","name":"未发售"}]}}
     */

    private int code;
    private String msg;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * items : {"categories":[{"id":1,"name":"主机游戏","platform_ids":[1,2,3]},{"id":2,"name":"手机游戏","platform_ids":[5,6]},{"id":3,"name":"PC游戏","platform_ids":[4,7]}],"types":[{"value":0,"name":"全部"},{"value":1,"name":"动作"},{"value":2,"name":"角色扮演"},{"value":4,"name":"射击"},{"value":8,"name":"策略"},{"value":16,"name":"MMO"},{"value":32,"name":"合作"},{"value":64,"name":"沙盒"},{"value":128,"name":"冒险"},{"value":256,"name":"格斗"},{"value":512,"name":"塔防"},{"value":1024,"name":"音乐"},{"value":2048,"name":"即时战略"},{"value":4096,"name":"模拟"},{"value":8192,"name":"ADV"},{"value":16384,"name":"MOBA"},{"value":32768,"name":"解谜"},{"value":65536,"name":"恐怖"},{"value":262144,"name":"竞速"},{"value":524288,"name":"体育"},{"value":1048576,"name":"卡牌"},{"value":2097152,"name":"益智"},{"value":4194304,"name":"养成"},{"value":8388608,"name":"休闲"},{"value":1073741824,"name":"其他"}],"platforms":[{"value":0,"name":"全部"},{"value":1,"name":"PS4"},{"value":2,"name":"Xbox One"},{"value":3,"name":"Switch"},{"value":4,"name":"Steam"},{"value":5,"name":"iOS"},{"value":6,"name":"Android"},{"value":7,"name":"客户端游戏"}],"dates":[{"value":"onsale","name":"已发售"},{"value":"week","name":"近一周"},{"value":"month","name":"近一月"},{"value":"halfyear","name":"近半年"},{"value":"2018","name":"2018"},{"value":"2017","name":"2017"},{"value":"notyet","name":"未发售"}]}
         */

        private ItemsBean items;

        public ItemsBean getItems() {
            return items;
        }

        public void setItems(ItemsBean items) {
            this.items = items;
        }

        public static class ItemsBean {
            private List<CategoriesBean> categories;
            private List<TypesBean> types;
            private List<PlatformsBean> platforms;
            private List<DatesBean> dates;

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public List<TypesBean> getTypes() {
                return types;
            }

            public void setTypes(List<TypesBean> types) {
                this.types = types;
            }

            public List<PlatformsBean> getPlatforms() {
                return platforms;
            }

            public void setPlatforms(List<PlatformsBean> platforms) {
                this.platforms = platforms;
            }

            public List<DatesBean> getDates() {
                return dates;
            }

            public void setDates(List<DatesBean> dates) {
                this.dates = dates;
            }

            public static class CategoriesBean {
                /**
                 * id : 1
                 * name : 主机游戏
                 * platform_ids : [1,2,3]
                 */

                private int id;
                private String name;
                private List<Integer> platform_ids;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<Integer> getPlatform_ids() {
                    return platform_ids;
                }

                public void setPlatform_ids(List<Integer> platform_ids) {
                    this.platform_ids = platform_ids;
                }
            }

            public static class TypesBean {
                /**
                 * value : 0
                 * name : 全部
                 */

                private int value;
                private String name;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class PlatformsBean {
                /**
                 * value : 0
                 * name : 全部
                 */

                private int value;
                private String name;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DatesBean {
                /**
                 * value : onsale
                 * name : 已发售
                 */

                private String value;
                private String name;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
