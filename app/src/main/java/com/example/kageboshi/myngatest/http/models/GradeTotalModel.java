package com.example.kageboshi.myngatest.http.models;

import java.io.Serializable;
import java.util.List;

public class GradeTotalModel implements Serializable{

    /**
     * code : 0
     * msg : 操作成功
     * result : {"items":{"categories":[{"id":1,"name":"主机游戏","platform_ids":[1,2,3]},{"id":2,"name":"手机游戏","platform_ids":[5,6]},{"id":3,"name":"PC游戏","platform_ids":[4,7]}],"types":[{"value":0,"name":"全部"},{"value":1,"name":"动作"},{"value":2,"name":"角色扮演"},{"value":4,"name":"射击"},{"value":8,"name":"策略"},{"value":16,"name":"MMO"},{"value":32,"name":"合作"},{"value":64,"name":"沙盒"},{"value":128,"name":"冒险"},{"value":256,"name":"格斗"},{"value":512,"name":"塔防"},{"value":1024,"name":"音乐"},{"value":2048,"name":"即时战略"},{"value":4096,"name":"模拟"},{"value":8192,"name":"ADV"},{"value":16384,"name":"MOBA"},{"value":32768,"name":"解谜"},{"value":65536,"name":"恐怖"},{"value":262144,"name":"竞速"},{"value":524288,"name":"体育"},{"value":1048576,"name":"卡牌"},{"value":2097152,"name":"益智"},{"value":4194304,"name":"养成"},{"value":8388608,"name":"休闲"},{"value":1073741824,"name":"其他"}],"platforms":[{"value":0,"name":"全部"},{"value":1,"name":"PS4"},{"value":2,"name":"Xbox One"},{"value":3,"name":"Switch"},{"value":4,"name":"Steam"},{"value":5,"name":"iOS"},{"value":6,"name":"Android"},{"value":7,"name":"客户端游戏"}],"dates":[{"value":"onsale","name":"已发售"},{"value":"week","name":"近一周"},{"value":"month","name":"近一月"},{"value":"halfyear","name":"近半年"},{"value":"2018","name":"2018"},{"value":"2017","name":"2017"},{"value":"notyet","name":"未发售"}]},"top_games":[{"id":37,"name":"塞尔达传说：旷野之息","alias":["The Legend of Zelda: Breath of the Wild"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201706/15/-kt5xoQ928p-1gpzK1eT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2017-03-03"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:8:\"Nintendo\";s:9:\"publisher\";s:8:\"Nintendo\";s:2:\"hp\";s:24:\"http://www.nintendo.com/\";}","tid":11831787,"score":"9.8","score_count":1133,"created_at":1497519971},{"id":307,"name":"超级马里奥：奥德赛","alias":["Super Mario Odyssey"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201710/27/-6oh25Q2h-2e82ZcT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2017-10-27"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:8:\"Nintendo\";s:9:\"publisher\";s:8:\"Nintendo\";s:2:\"hp\";s:25:\"https://www.nintendo.com/\";}","tid":12714152,"score":"9.7","score_count":472,"created_at":1509071595},{"id":1,"name":"女神异闻录5","alias":["Persona5 "," P5"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201703/30/9Q2g-6esoZlT3cSxc-hi.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2016-09-15"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:5:\"Atlus\";s:9:\"publisher\";s:5:\"Atlus\";s:2:\"hp\";s:19:\"http://persona5.jp/\";}","tid":11830695,"score":"9.6","score_count":521,"created_at":1496716818},{"id":72,"name":"血源","alias":["Bloodborne"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"},{"id":65536,"name":"恐怖"}],"avatar":"http://img.ngacn.cc/attachments/mon_201707/12/-kt5xoQajk8-9ppkK1cT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2015-03-28"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:13:\"From Software\";s:9:\"publisher\";s:4:\"SCEA\";s:2:\"hp\";s:55:\"https://www.playstation.com/en-us/games/bloodborne-ps4/\";}","tid":12018909,"score":"9.6","score_count":345,"created_at":1499826413},{"id":73,"name":"《黑暗之魂3》","alias":["Dark Souls 3"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201707/12/-kt5xoQhnp-hn85K1cT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2016-03-24"},{"platform_id":2,"platform":"Xbox One","date":"2016-03-24"},{"platform_id":4,"platform":"Steam","date":"2016-04-12"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:12:\"FromSoftware\";s:9:\"publisher\";s:12:\"BANDAI NAMCO\";s:2:\"hp\";s:41:\"http://www.darksouls.jp/prologue_iii.html\";}","tid":12019194,"score":"9.6","score_count":230,"created_at":1499845818},{"id":136,"name":"喷射战士2","alias":["Splatoon 2"],"type":[{"id":4,"name":"射击"}],"avatar":"http://img.nga.cn/attachments/mon_201707/30/-kt5xoQ13r-gxgvK1sT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2017-07-21"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:8:\"Nintendo\";s:9:\"publisher\";s:8:\"Nintendo\";s:2:\"hp\";s:29:\"http://splatoon.nintendo.com/\";}","tid":12133664,"score":"9.5","score_count":201,"created_at":1501409758},{"id":190,"name":"啪嗒砰","alias":["Patapon"],"type":[{"id":1024,"name":"音乐"}],"avatar":"http://img.nga.cn/attachments/mon_201708/22/-6oh25Q13t-9h97K17T3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-08-01"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:16:\"SIE Japan Studio\";s:9:\"publisher\";s:4:\"sony\";}","tid":12286612,"score":"9.5","score_count":167,"created_at":1503392893},{"id":239,"name":"《Deemo》","alias":["古树旋律","树境琴声"],"type":[{"id":1024,"name":"音乐"}],"avatar":"http://img.ngacn.cc/attachments/mon_201709/03/-3wczfQ2h-ea0zZgT3cSxc-hi.jpg","release_info":[{"platform_id":5,"platform":"iOS","date":"2013-11-13"},{"platform_id":6,"platform":"Android","date":"2013-11-13"},{"platform_id":1,"platform":"PS4","date":"2016-06-24"},{"platform_id":3,"platform":"Switch","date":"2017-09-21"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:6:\"Rayark\";s:9:\"publisher\";s:8:\"龙渊网络\";s:2:\"hp\";s:31:\"https://www.rayark.com/g/deemo/\";}","tid":12368580,"score":"9.5","score_count":80,"created_at":1504452783},{"id":191,"name":"DJMAX致敬","alias":["DJMAX Respect"],"type":[{"id":1024,"name":"音乐"}],"avatar":"http://img.nga.cn/attachments/mon_201708/22/-6oh25Q13t-bsynK1tT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-07-28"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:12:\"Rocky Studio\";s:9:\"publisher\";s:12:\"Rocky Studio\";}","tid":12286921,"score":"9.5","score_count":45,"created_at":1503395556},{"id":426,"name":"怪物猎人：世界","alias":["MONSTER HUNTER WORLD"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201801/26/-p219Q5-q4jK1pT3cSn2-bw.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-01-26"},{"platform_id":2,"platform":"Xbox One","date":"2018-01-26"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:6:\"CAPCOM\";s:9:\"publisher\";s:6:\"CAPCOM\";s:2:\"hp\";s:37:\"http://www.monsterhunterworld.com/hk/\";}","tid":13335074,"score":"9.4","score_count":1011,"created_at":1516957913}],"games":[{"id":615,"name":"《刺客信条：奥德赛》","alias":["Assassins Creed Odyssey"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.178.com/attachments/mon_201810/06/-421abQ5-9whtZkT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-10-06"},{"platform_id":1,"platform":"PS4","date":"2018-10-05"},{"platform_id":2,"platform":"Xbox One","date":"2018-10-05"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:7:\"Ubisoft\";s:9:\"publisher\";s:7:\"Ubisoft\";s:2:\"hp\";s:50:\"https://assassinscreed.ubisoft.com/game/en-gb/home\";}","tid":15266823,"score":"9.1","score_count":218,"created_at":1538797528},{"id":613,"name":"《无双大蛇3》","alias":["Warriors Orochi 4"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201809/27/-421abQ5-15h2ZqT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-09-27"},{"platform_id":3,"platform":"Switch","date":"2018-09-27"},{"platform_id":4,"platform":"Steam","date":"2018-10-16"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:16:\"KOEI TECMO GAMES\";s:9:\"publisher\";s:16:\"KOEI TECMO GAMES\";s:2:\"hp\";s:36:\"http://www.koeitecmoamerica.com/wo4/\";}","tid":15186765,"score":"8.3","score_count":47,"created_at":1538033278},{"id":599,"name":"《古墓丽影：暗影》","alias":["Shadow of the Tomb Raider"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201809/14/-421abQ5-ilqcZmT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-09-14"},{"platform_id":1,"platform":"PS4","date":"2018-09-14"},{"platform_id":2,"platform":"Xbox One","date":"2018-09-14"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:14:\"Eidos Montreal\";s:9:\"publisher\";s:11:\"Square Enix\";s:2:\"hp\";s:26:\"https://www.tombraider.com\";}","tid":15054322,"score":"7.1","score_count":76,"created_at":1536890211},{"id":593,"name":"《漫威蜘蛛侠》","alias":["Marvel Spiderman"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201809/07/-421abQ5-djrpZoT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-09-07"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:9:\"Insomniac\";s:9:\"publisher\";s:4:\"SONY\";s:2:\"hp\";s:85:\"https://store.playstation.com/zh-hans-hk/product/HP9000-CUSA09893_00-ASIAPLACEHOLDER0\";}","tid":14985336,"score":"8.6","score_count":135,"created_at":1536283316},{"id":568,"name":"《胡闹厨房2》","alias":["Overcooked! 2"],"type":[{"id":2097152,"name":"益智"},{"id":8388608,"name":"休闲"}],"avatar":"http://img.ngacn.cc/attachments/mon_201808/07/-421abQ5-8un1ZxT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-08-08"},{"platform_id":1,"platform":"PS4","date":"2018-08-07"},{"platform_id":2,"platform":"Xbox One","date":"2018-08-07"},{"platform_id":3,"platform":"Switch","date":"2018-08-07"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:16:\"Ghost Town Games\";s:9:\"publisher\";s:14:\"Team17 Digital\";s:2:\"hp\";s:41:\"http://www.ghosttowngames.com/overcooked/\";}","tid":14686884,"score":"8.7","score_count":111,"created_at":1533608288},{"id":557,"name":"《八方旅人》","alias":["Octopath Traveler"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201807/13/-421abQ5-j1neZvT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-07-13"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:17:\"SE浅野组与Acquire\";s:9:\"publisher\";s:16:\"史克威尔艾尼克斯\";s:2:\"hp\";s:47:\"http://www.jp.square-enix.com/octopathtraveler/\";}","tid":14492004,"score":"9.0","score_count":140,"created_at":1531450727},{"id":550,"name":"《飙酷车神2》","alias":["The Crew 2"],"type":[{"id":262144,"name":"竞速"},{"id":524288,"name":"体育"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/29/-421abQ5-48e9ZxT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-06-29"},{"platform_id":1,"platform":"PS4","date":"2018-06-29"},{"platform_id":2,"platform":"Xbox One","date":"2018-06-29"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:11:\"Ivory Tower\";s:9:\"publisher\";s:7:\"Ubisoft\";s:2:\"hp\";s:23:\"http://thecrew-game.com\";}","tid":14407898,"score":"5.7","score_count":23,"created_at":1530244795},{"id":540,"name":"《马力欧网球 Ace》","alias":["Mario Tennis Aces"],"type":[{"id":32,"name":"合作"},{"id":524288,"name":"体育"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/22/-421abQ5-41h2ZsT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-06-22"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:7:\"Camelot\";s:9:\"publisher\";s:6:\"任天堂\";s:2:\"hp\";s:51:\"http://www.nintendo.com.hk/switch/mario_tennis_ace/\";}","tid":14352096,"score":"8.9","score_count":72,"created_at":1529634442},{"id":573,"name":"《空洞骑士》","alias":["Hollow Knight"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201808/10/-421abQ5-c8x3ZpT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2017-02-25"},{"platform_id":3,"platform":"Switch","date":"2018-06-13"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:11:\"Team Cherry\";s:9:\"publisher\";s:11:\"Team Cherry\";s:2:\"hp\";s:24:\"http://hollowknight.com/\";}","tid":14719569,"score":"9.4","score_count":79,"created_at":1533896400},{"id":535,"name":"《侏罗纪世界：进化》","alias":["Jurassic World Evolution"],"type":[{"id":8,"name":"策略"},{"id":4096,"name":"模拟"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/14/-421abQ5-2pfeZcT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-06-12"},{"platform_id":1,"platform":"PS4","date":"2018-06-12"},{"platform_id":2,"platform":"Xbox One","date":"2018-06-12"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:21:\"Frontier Developments\";s:9:\"publisher\";s:21:\"Frontier Developments\";s:2:\"hp\";s:39:\"https://www.jurassicworldevolution.com/\";}","tid":14296976,"score":"5.9","score_count":22,"created_at":1528971222},{"id":527,"name":"《吸血鬼》","alias":["Vampyr"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/05/-421abQ5-39gnK25T3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-06-05"},{"platform_id":1,"platform":"PS4","date":"2018-06-05"},{"platform_id":2,"platform":"Xbox One","date":"2018-06-05"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:21:\"DONTNOD Entertainment\";s:9:\"publisher\";s:22:\"Focus Home Interactive\";s:2:\"hp\";s:27:\"http://www.vampyr-game.com/\";}","tid":14228140,"score":"6.8","score_count":38,"created_at":1528170746},{"id":548,"name":"《宝可梦探险寻宝》","alias":["方可梦"],"type":[{"id":128,"name":"冒险"},{"id":8388608,"name":"休闲"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/27/-9g59Q5-3wzpZhT3cSxc-hi.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-05-30"},{"platform_id":5,"platform":"iOS","date":"2018-06-27"},{"platform_id":6,"platform":"Android","date":"2018-06-27"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:19:\"The Pokemon Company\";s:9:\"publisher\";s:19:\"The Pokemon Company\";s:2:\"hp\";s:41:\"http://www.pokemon.co.jp/ex/pokemonquest/\";}","tid":14392896,"score":"7.5","score_count":43,"created_at":1530096136},{"id":520,"name":"《底特律：成为人类》","alias":["Detroit: Become Human"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/25/-p219Q5-58zK1nT3cSyl-jh.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-05-25"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:13:\"Quantic Dream\";s:9:\"publisher\";s:3:\"SIE\";s:2:\"hp\";s:85:\"https://store.playstation.com/zh-hans-hk/product/HP9000-CUSA08392_00-ASIAPLACEHOLDER0\";}","tid":14148435,"score":"9.0","score_count":204,"created_at":1527217434},{"id":519,"name":"《黑暗之魂:重置版》","alias":["Dark Souls Remastered"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/25/-p219Q5-bq3uZhT3cS18g-m8.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-05-24"},{"platform_id":1,"platform":"PS4","date":"2018-05-24"},{"platform_id":3,"platform":"Switch","date":"2018-05-24"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:4:\"QLOC\";s:9:\"publisher\";s:45:\"FromSoftware, Inc, BANDAI NAMCO Entertainment\";s:2:\"hp\";s:50:\"https://www.bandainamcoent.com/games/ds-remastered\";}","tid":14148333,"score":"9.4","score_count":89,"created_at":1527216635},{"id":499,"name":"《战神》","alias":["God of War"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201804/20/-p219Q5-e69cK2pT3cSzk-k0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-04-20"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:19:\"Santa Monica Studio\";s:9:\"publisher\";s:4:\"SIEA\";s:2:\"hp\";s:33:\"https://godofwar.playstation.com/\";}","tid":13900202,"score":"9.4","score_count":334,"created_at":1524189686},{"id":484,"name":"《孤岛惊魂5》","alias":["Far Cry 5"],"type":[{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/27/-p219Q5-x26Z1fT3cS1hc-u0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-03-27"},{"platform_id":2,"platform":"Xbox One","date":"2018-03-27"},{"platform_id":4,"platform":"Steam","date":"2018-03-27"},{"platform_id":7,"platform":"客户端游戏","date":"2018-03-27"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:16:\"Ubisoft Montreal\";s:9:\"publisher\";s:7:\"Ubisoft\";s:2:\"hp\";s:44:\"https://far-cry.ubisoft.com/game/en-us/home/\";}","tid":13736671,"score":"7.2","score_count":133,"created_at":1522134465},{"id":479,"name":"《二之国II：王国再临》","alias":["Ni no Kuni II: Revenant Kingdom"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/26/-p219Q5-ft2wZ10T3cS1hc-u0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-03-24"},{"platform_id":4,"platform":"Steam","date":"2018-03-24"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:7:\"Level-5\";s:9:\"publisher\";s:26:\"BANDAI NAMCO Entertainment\";s:2:\"hp\";s:50:\"https://www.bandainamcoent.com/games/ni-no-kuni-ii\";}","tid":13727632,"score":"8.3","score_count":51,"created_at":1522032808},{"id":478,"name":"《逃出生天》","alias":["A WAY OUT"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/26/-p219Q5-b95rZcT3cSzk-k0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-03-23"},{"platform_id":2,"platform":"Xbox One","date":"2018-03-23"},{"platform_id":7,"platform":"客户端游戏","date":"2018-03-23"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:17:\"Hazelight Studios\";s:9:\"publisher\";s:20:\"Electronic Arts Inc.\";s:2:\"hp\";s:34:\"https://www.ea.com/games/a-way-out\";}","tid":13727553,"score":"9.2","score_count":37,"created_at":1522032117},{"id":462,"name":"《盗贼之海》","alias":["Sea of Thieves"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/20/-p219Q5-3uo6K1kT1kSdw-jo.jpg","release_info":[{"platform_id":2,"platform":"Xbox One","date":"2018-03-20"},{"platform_id":7,"platform":"客户端游戏","date":"2018-03-20"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:4:\"RARE\";s:9:\"publisher\";s:14:\"微软游戏工作室\";s:2:\"hp\";s:29:\"https://www.seaofthieves.com/\";}","tid":13686099,"score":"6.2","score_count":32,"created_at":1521514082},{"id":447,"name":"《合金装备：生存》","alias":["METAL GEAR SURVIVE"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201802/26/-p219Q5-j9piZgT3cSxc-ir.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-20"},{"platform_id":4,"platform":"Steam","date":"2018-02-20"},{"platform_id":2,"platform":"Xbox One","date":"2018-02-20"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:6:\"Konami\";s:9:\"publisher\";s:6:\"Konami\";}","tid":13537767,"score":"2.3","score_count":70,"created_at":1519628057},{"id":443,"name":"《猎天使魔女1&2》","alias":["Bayonetta"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/18/-p219Q5-rl7K1qT3cSi3-9o.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-02-16"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:14:\"Platinum Games\";s:9:\"publisher\";s:6:\"任天堂\";}","tid":13510732,"score":"9.2","score_count":71,"created_at":1519282688},{"id":444,"name":"《圣剑传说2：玛娜之谜》","alias":["Secret of Mana","聖剣伝説2 SECRET of MANA"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/18/-p219Q5-e468Z11T3cSi3-9o.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-15"},{"platform_id":4,"platform":"Steam","date":"2018-02-15"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:8:\"史克威尔\";s:9:\"publisher\";s:8:\"史克威尔\";}","tid":13510932,"score":0,"score_count":7,"created_at":1519284220},{"id":441,"name":"《刀剑神域：夺命凶弹》","alias":["Sword Art Online:Fatal Bullet"],"type":[{"id":4,"name":"射击"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/18/-p219Q5-3exeZzT3cSi3-9o.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-08"},{"platform_id":2,"platform":"Xbox One","date":"2018-02-08"},{"platform_id":4,"platform":"Steam","date":"2018-02-23"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:11:\"Dimps工作室\";s:9:\"publisher\";s:10:\"万代南梦宫\";}","tid":13430763,"score":"5.9","score_count":35,"created_at":1518169819},{"id":442,"name":"真·三国无双8","alias":["Dynasty Warriors 9"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201802/09/-p219Q5-2f84ZtT3cS1hc-u0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-08"},{"platform_id":2,"platform":"Xbox One","date":"2018-02-08"},{"platform_id":4,"platform":"Steam","date":"2018-02-13"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:14:\"KOEI(ω-Force)\";s:9:\"publisher\";s:10:\"KOEI TECMO\";}","tid":13430828,"score":"3.8","score_count":125,"created_at":1518170395},{"id":436,"name":"《旺达与巨像》重制版","alias":["Shadow of the Colossus"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.cn/attachments/mon_201805/18/-p219Q5-3mr2ZdT3cSi3-9o.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-06"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:8:\"Team ICO\";s:9:\"publisher\";s:4:\"SCEJ\";}","tid":13401236,"score":"8.3","score_count":53,"created_at":1517801798},{"id":426,"name":"怪物猎人：世界","alias":["MONSTER HUNTER WORLD"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201801/26/-p219Q5-q4jK1pT3cSn2-bw.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-01-26"},{"platform_id":2,"platform":"Xbox One","date":"2018-01-26"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:6:\"CAPCOM\";s:9:\"publisher\";s:6:\"CAPCOM\";s:2:\"hp\";s:37:\"http://www.monsterhunterworld.com/hk/\";}","tid":13335074,"score":"9.4","score_count":1011,"created_at":1516957913},{"id":416,"name":"最终幻想纷争NT","alias":["DISSIDIA FINAL FANTASY NT"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.cn/attachments/mon_201801/12/-6oh25Q5-jqjrK1iT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-01-11"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:10:\"光荣特库摩\";s:9:\"publisher\";s:28:\"史克威尔艾尼克斯，光荣特库摩\";}","tid":13237778,"score":"3.3","score_count":20,"created_at":1515725701},{"id":389,"name":"莉蒂与苏尔的工作室：不思议绘画的炼金术士","alias":["リディー＆スールのアトリエ～不思議の絵画の錬金術士～"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.cn/attachments/mon_201712/18/-6oh25Q5-akm6K2rT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-12-21"},{"platform_id":3,"platform":"Switch","date":"2017-12-21"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:4:\"Gust\";s:9:\"publisher\";s:4:\"KOEI\";}","tid":13081678,"score":"7.8","score_count":25,"created_at":1513585890},{"id":381,"name":"《Gorogoa》","alias":["画中世界"],"type":[{"id":128,"name":"冒险"},{"id":32768,"name":"解谜"},{"id":8388608,"name":"休闲"}],"avatar":"http://img.ngacn.cc/attachments/mon_201712/08/-6oh25Q5-hsu9K1yT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2017-12-15"},{"platform_id":5,"platform":"iOS","date":"2017-12-14"},{"platform_id":3,"platform":"Switch","date":"2017-12-14"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:13:\"Buried Signal\";s:9:\"publisher\";s:21:\"Annapurna Interactive\";s:2:\"hp\";s:19:\"http://gorogoa.com/\";}","tid":13013737,"score":"9.2","score_count":64,"created_at":1512724413},{"id":388,"name":"数码宝贝物语：网络侦探 骇客追忆","alias":["デジモンストーリー ハッカーズメモリー"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.cn/attachments/mon_201712/18/-6oh25Q5-c91wK2dT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-12-14"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:12:\"Bandai Namco\";s:9:\"publisher\";s:12:\"Bandai Namco\";s:2:\"hp\";s:31:\"http://digimonstory.bn-ent.net/\";}","tid":13081596,"score":"8.1","score_count":17,"created_at":1513584868}],"page":1,"pagesize":30,"total":168}
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

    public static class ResultBean implements Serializable{
        /**
         * items : {"categories":[{"id":1,"name":"主机游戏","platform_ids":[1,2,3]},{"id":2,"name":"手机游戏","platform_ids":[5,6]},{"id":3,"name":"PC游戏","platform_ids":[4,7]}],"types":[{"value":0,"name":"全部"},{"value":1,"name":"动作"},{"value":2,"name":"角色扮演"},{"value":4,"name":"射击"},{"value":8,"name":"策略"},{"value":16,"name":"MMO"},{"value":32,"name":"合作"},{"value":64,"name":"沙盒"},{"value":128,"name":"冒险"},{"value":256,"name":"格斗"},{"value":512,"name":"塔防"},{"value":1024,"name":"音乐"},{"value":2048,"name":"即时战略"},{"value":4096,"name":"模拟"},{"value":8192,"name":"ADV"},{"value":16384,"name":"MOBA"},{"value":32768,"name":"解谜"},{"value":65536,"name":"恐怖"},{"value":262144,"name":"竞速"},{"value":524288,"name":"体育"},{"value":1048576,"name":"卡牌"},{"value":2097152,"name":"益智"},{"value":4194304,"name":"养成"},{"value":8388608,"name":"休闲"},{"value":1073741824,"name":"其他"}],"platforms":[{"value":0,"name":"全部"},{"value":1,"name":"PS4"},{"value":2,"name":"Xbox One"},{"value":3,"name":"Switch"},{"value":4,"name":"Steam"},{"value":5,"name":"iOS"},{"value":6,"name":"Android"},{"value":7,"name":"客户端游戏"}],"dates":[{"value":"onsale","name":"已发售"},{"value":"week","name":"近一周"},{"value":"month","name":"近一月"},{"value":"halfyear","name":"近半年"},{"value":"2018","name":"2018"},{"value":"2017","name":"2017"},{"value":"notyet","name":"未发售"}]}
         * top_games : [{"id":37,"name":"塞尔达传说：旷野之息","alias":["The Legend of Zelda: Breath of the Wild"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201706/15/-kt5xoQ928p-1gpzK1eT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2017-03-03"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:8:\"Nintendo\";s:9:\"publisher\";s:8:\"Nintendo\";s:2:\"hp\";s:24:\"http://www.nintendo.com/\";}","tid":11831787,"score":"9.8","score_count":1133,"created_at":1497519971},{"id":307,"name":"超级马里奥：奥德赛","alias":["Super Mario Odyssey"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201710/27/-6oh25Q2h-2e82ZcT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2017-10-27"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:8:\"Nintendo\";s:9:\"publisher\";s:8:\"Nintendo\";s:2:\"hp\";s:25:\"https://www.nintendo.com/\";}","tid":12714152,"score":"9.7","score_count":472,"created_at":1509071595},{"id":1,"name":"女神异闻录5","alias":["Persona5 "," P5"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201703/30/9Q2g-6esoZlT3cSxc-hi.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2016-09-15"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:5:\"Atlus\";s:9:\"publisher\";s:5:\"Atlus\";s:2:\"hp\";s:19:\"http://persona5.jp/\";}","tid":11830695,"score":"9.6","score_count":521,"created_at":1496716818},{"id":72,"name":"血源","alias":["Bloodborne"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"},{"id":65536,"name":"恐怖"}],"avatar":"http://img.ngacn.cc/attachments/mon_201707/12/-kt5xoQajk8-9ppkK1cT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2015-03-28"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:13:\"From Software\";s:9:\"publisher\";s:4:\"SCEA\";s:2:\"hp\";s:55:\"https://www.playstation.com/en-us/games/bloodborne-ps4/\";}","tid":12018909,"score":"9.6","score_count":345,"created_at":1499826413},{"id":73,"name":"《黑暗之魂3》","alias":["Dark Souls 3"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201707/12/-kt5xoQhnp-hn85K1cT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2016-03-24"},{"platform_id":2,"platform":"Xbox One","date":"2016-03-24"},{"platform_id":4,"platform":"Steam","date":"2016-04-12"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:12:\"FromSoftware\";s:9:\"publisher\";s:12:\"BANDAI NAMCO\";s:2:\"hp\";s:41:\"http://www.darksouls.jp/prologue_iii.html\";}","tid":12019194,"score":"9.6","score_count":230,"created_at":1499845818},{"id":136,"name":"喷射战士2","alias":["Splatoon 2"],"type":[{"id":4,"name":"射击"}],"avatar":"http://img.nga.cn/attachments/mon_201707/30/-kt5xoQ13r-gxgvK1sT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2017-07-21"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:8:\"Nintendo\";s:9:\"publisher\";s:8:\"Nintendo\";s:2:\"hp\";s:29:\"http://splatoon.nintendo.com/\";}","tid":12133664,"score":"9.5","score_count":201,"created_at":1501409758},{"id":190,"name":"啪嗒砰","alias":["Patapon"],"type":[{"id":1024,"name":"音乐"}],"avatar":"http://img.nga.cn/attachments/mon_201708/22/-6oh25Q13t-9h97K17T3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-08-01"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:16:\"SIE Japan Studio\";s:9:\"publisher\";s:4:\"sony\";}","tid":12286612,"score":"9.5","score_count":167,"created_at":1503392893},{"id":239,"name":"《Deemo》","alias":["古树旋律","树境琴声"],"type":[{"id":1024,"name":"音乐"}],"avatar":"http://img.ngacn.cc/attachments/mon_201709/03/-3wczfQ2h-ea0zZgT3cSxc-hi.jpg","release_info":[{"platform_id":5,"platform":"iOS","date":"2013-11-13"},{"platform_id":6,"platform":"Android","date":"2013-11-13"},{"platform_id":1,"platform":"PS4","date":"2016-06-24"},{"platform_id":3,"platform":"Switch","date":"2017-09-21"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:6:\"Rayark\";s:9:\"publisher\";s:8:\"龙渊网络\";s:2:\"hp\";s:31:\"https://www.rayark.com/g/deemo/\";}","tid":12368580,"score":"9.5","score_count":80,"created_at":1504452783},{"id":191,"name":"DJMAX致敬","alias":["DJMAX Respect"],"type":[{"id":1024,"name":"音乐"}],"avatar":"http://img.nga.cn/attachments/mon_201708/22/-6oh25Q13t-bsynK1tT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-07-28"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:12:\"Rocky Studio\";s:9:\"publisher\";s:12:\"Rocky Studio\";}","tid":12286921,"score":"9.5","score_count":45,"created_at":1503395556},{"id":426,"name":"怪物猎人：世界","alias":["MONSTER HUNTER WORLD"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201801/26/-p219Q5-q4jK1pT3cSn2-bw.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-01-26"},{"platform_id":2,"platform":"Xbox One","date":"2018-01-26"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:6:\"CAPCOM\";s:9:\"publisher\";s:6:\"CAPCOM\";s:2:\"hp\";s:37:\"http://www.monsterhunterworld.com/hk/\";}","tid":13335074,"score":"9.4","score_count":1011,"created_at":1516957913}]
         * games : [{"id":615,"name":"《刺客信条：奥德赛》","alias":["Assassins Creed Odyssey"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.178.com/attachments/mon_201810/06/-421abQ5-9whtZkT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-10-06"},{"platform_id":1,"platform":"PS4","date":"2018-10-05"},{"platform_id":2,"platform":"Xbox One","date":"2018-10-05"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:7:\"Ubisoft\";s:9:\"publisher\";s:7:\"Ubisoft\";s:2:\"hp\";s:50:\"https://assassinscreed.ubisoft.com/game/en-gb/home\";}","tid":15266823,"score":"9.1","score_count":218,"created_at":1538797528},{"id":613,"name":"《无双大蛇3》","alias":["Warriors Orochi 4"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201809/27/-421abQ5-15h2ZqT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-09-27"},{"platform_id":3,"platform":"Switch","date":"2018-09-27"},{"platform_id":4,"platform":"Steam","date":"2018-10-16"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:16:\"KOEI TECMO GAMES\";s:9:\"publisher\";s:16:\"KOEI TECMO GAMES\";s:2:\"hp\";s:36:\"http://www.koeitecmoamerica.com/wo4/\";}","tid":15186765,"score":"8.3","score_count":47,"created_at":1538033278},{"id":599,"name":"《古墓丽影：暗影》","alias":["Shadow of the Tomb Raider"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201809/14/-421abQ5-ilqcZmT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-09-14"},{"platform_id":1,"platform":"PS4","date":"2018-09-14"},{"platform_id":2,"platform":"Xbox One","date":"2018-09-14"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:14:\"Eidos Montreal\";s:9:\"publisher\";s:11:\"Square Enix\";s:2:\"hp\";s:26:\"https://www.tombraider.com\";}","tid":15054322,"score":"7.1","score_count":76,"created_at":1536890211},{"id":593,"name":"《漫威蜘蛛侠》","alias":["Marvel Spiderman"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201809/07/-421abQ5-djrpZoT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-09-07"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:9:\"Insomniac\";s:9:\"publisher\";s:4:\"SONY\";s:2:\"hp\";s:85:\"https://store.playstation.com/zh-hans-hk/product/HP9000-CUSA09893_00-ASIAPLACEHOLDER0\";}","tid":14985336,"score":"8.6","score_count":135,"created_at":1536283316},{"id":568,"name":"《胡闹厨房2》","alias":["Overcooked! 2"],"type":[{"id":2097152,"name":"益智"},{"id":8388608,"name":"休闲"}],"avatar":"http://img.ngacn.cc/attachments/mon_201808/07/-421abQ5-8un1ZxT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-08-08"},{"platform_id":1,"platform":"PS4","date":"2018-08-07"},{"platform_id":2,"platform":"Xbox One","date":"2018-08-07"},{"platform_id":3,"platform":"Switch","date":"2018-08-07"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:16:\"Ghost Town Games\";s:9:\"publisher\";s:14:\"Team17 Digital\";s:2:\"hp\";s:41:\"http://www.ghosttowngames.com/overcooked/\";}","tid":14686884,"score":"8.7","score_count":111,"created_at":1533608288},{"id":557,"name":"《八方旅人》","alias":["Octopath Traveler"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201807/13/-421abQ5-j1neZvT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-07-13"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:17:\"SE浅野组与Acquire\";s:9:\"publisher\";s:16:\"史克威尔艾尼克斯\";s:2:\"hp\";s:47:\"http://www.jp.square-enix.com/octopathtraveler/\";}","tid":14492004,"score":"9.0","score_count":140,"created_at":1531450727},{"id":550,"name":"《飙酷车神2》","alias":["The Crew 2"],"type":[{"id":262144,"name":"竞速"},{"id":524288,"name":"体育"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/29/-421abQ5-48e9ZxT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-06-29"},{"platform_id":1,"platform":"PS4","date":"2018-06-29"},{"platform_id":2,"platform":"Xbox One","date":"2018-06-29"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:11:\"Ivory Tower\";s:9:\"publisher\";s:7:\"Ubisoft\";s:2:\"hp\";s:23:\"http://thecrew-game.com\";}","tid":14407898,"score":"5.7","score_count":23,"created_at":1530244795},{"id":540,"name":"《马力欧网球 Ace》","alias":["Mario Tennis Aces"],"type":[{"id":32,"name":"合作"},{"id":524288,"name":"体育"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/22/-421abQ5-41h2ZsT3cSi3-9i.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-06-22"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:7:\"Camelot\";s:9:\"publisher\";s:6:\"任天堂\";s:2:\"hp\";s:51:\"http://www.nintendo.com.hk/switch/mario_tennis_ace/\";}","tid":14352096,"score":"8.9","score_count":72,"created_at":1529634442},{"id":573,"name":"《空洞骑士》","alias":["Hollow Knight"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.178.com/attachments/mon_201808/10/-421abQ5-c8x3ZpT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2017-02-25"},{"platform_id":3,"platform":"Switch","date":"2018-06-13"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:11:\"Team Cherry\";s:9:\"publisher\";s:11:\"Team Cherry\";s:2:\"hp\";s:24:\"http://hollowknight.com/\";}","tid":14719569,"score":"9.4","score_count":79,"created_at":1533896400},{"id":535,"name":"《侏罗纪世界：进化》","alias":["Jurassic World Evolution"],"type":[{"id":8,"name":"策略"},{"id":4096,"name":"模拟"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/14/-421abQ5-2pfeZcT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-06-12"},{"platform_id":1,"platform":"PS4","date":"2018-06-12"},{"platform_id":2,"platform":"Xbox One","date":"2018-06-12"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:21:\"Frontier Developments\";s:9:\"publisher\";s:21:\"Frontier Developments\";s:2:\"hp\";s:39:\"https://www.jurassicworldevolution.com/\";}","tid":14296976,"score":"5.9","score_count":22,"created_at":1528971222},{"id":527,"name":"《吸血鬼》","alias":["Vampyr"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/05/-421abQ5-39gnK25T3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-06-05"},{"platform_id":1,"platform":"PS4","date":"2018-06-05"},{"platform_id":2,"platform":"Xbox One","date":"2018-06-05"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:21:\"DONTNOD Entertainment\";s:9:\"publisher\";s:22:\"Focus Home Interactive\";s:2:\"hp\";s:27:\"http://www.vampyr-game.com/\";}","tid":14228140,"score":"6.8","score_count":38,"created_at":1528170746},{"id":548,"name":"《宝可梦探险寻宝》","alias":["方可梦"],"type":[{"id":128,"name":"冒险"},{"id":8388608,"name":"休闲"}],"avatar":"http://img.ngacn.cc/attachments/mon_201806/27/-9g59Q5-3wzpZhT3cSxc-hi.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-05-30"},{"platform_id":5,"platform":"iOS","date":"2018-06-27"},{"platform_id":6,"platform":"Android","date":"2018-06-27"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:19:\"The Pokemon Company\";s:9:\"publisher\";s:19:\"The Pokemon Company\";s:2:\"hp\";s:41:\"http://www.pokemon.co.jp/ex/pokemonquest/\";}","tid":14392896,"score":"7.5","score_count":43,"created_at":1530096136},{"id":520,"name":"《底特律：成为人类》","alias":["Detroit: Become Human"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/25/-p219Q5-58zK1nT3cSyl-jh.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-05-25"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:13:\"Quantic Dream\";s:9:\"publisher\";s:3:\"SIE\";s:2:\"hp\";s:85:\"https://store.playstation.com/zh-hans-hk/product/HP9000-CUSA08392_00-ASIAPLACEHOLDER0\";}","tid":14148435,"score":"9.0","score_count":204,"created_at":1527217434},{"id":519,"name":"《黑暗之魂:重置版》","alias":["Dark Souls Remastered"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/25/-p219Q5-bq3uZhT3cS18g-m8.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2018-05-24"},{"platform_id":1,"platform":"PS4","date":"2018-05-24"},{"platform_id":3,"platform":"Switch","date":"2018-05-24"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:4:\"QLOC\";s:9:\"publisher\";s:45:\"FromSoftware, Inc, BANDAI NAMCO Entertainment\";s:2:\"hp\";s:50:\"https://www.bandainamcoent.com/games/ds-remastered\";}","tid":14148333,"score":"9.4","score_count":89,"created_at":1527216635},{"id":499,"name":"《战神》","alias":["God of War"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201804/20/-p219Q5-e69cK2pT3cSzk-k0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-04-20"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:19:\"Santa Monica Studio\";s:9:\"publisher\";s:4:\"SIEA\";s:2:\"hp\";s:33:\"https://godofwar.playstation.com/\";}","tid":13900202,"score":"9.4","score_count":334,"created_at":1524189686},{"id":484,"name":"《孤岛惊魂5》","alias":["Far Cry 5"],"type":[{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/27/-p219Q5-x26Z1fT3cS1hc-u0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-03-27"},{"platform_id":2,"platform":"Xbox One","date":"2018-03-27"},{"platform_id":4,"platform":"Steam","date":"2018-03-27"},{"platform_id":7,"platform":"客户端游戏","date":"2018-03-27"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:16:\"Ubisoft Montreal\";s:9:\"publisher\";s:7:\"Ubisoft\";s:2:\"hp\";s:44:\"https://far-cry.ubisoft.com/game/en-us/home/\";}","tid":13736671,"score":"7.2","score_count":133,"created_at":1522134465},{"id":479,"name":"《二之国II：王国再临》","alias":["Ni no Kuni II: Revenant Kingdom"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/26/-p219Q5-ft2wZ10T3cS1hc-u0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-03-24"},{"platform_id":4,"platform":"Steam","date":"2018-03-24"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:7:\"Level-5\";s:9:\"publisher\";s:26:\"BANDAI NAMCO Entertainment\";s:2:\"hp\";s:50:\"https://www.bandainamcoent.com/games/ni-no-kuni-ii\";}","tid":13727632,"score":"8.3","score_count":51,"created_at":1522032808},{"id":478,"name":"《逃出生天》","alias":["A WAY OUT"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/26/-p219Q5-b95rZcT3cSzk-k0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-03-23"},{"platform_id":2,"platform":"Xbox One","date":"2018-03-23"},{"platform_id":7,"platform":"客户端游戏","date":"2018-03-23"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:17:\"Hazelight Studios\";s:9:\"publisher\";s:20:\"Electronic Arts Inc.\";s:2:\"hp\";s:34:\"https://www.ea.com/games/a-way-out\";}","tid":13727553,"score":"9.2","score_count":37,"created_at":1522032117},{"id":462,"name":"《盗贼之海》","alias":["Sea of Thieves"],"type":[{"id":1,"name":"动作"},{"id":128,"name":"冒险"}],"avatar":"http://img.ngacn.cc/attachments/mon_201803/20/-p219Q5-3uo6K1kT1kSdw-jo.jpg","release_info":[{"platform_id":2,"platform":"Xbox One","date":"2018-03-20"},{"platform_id":7,"platform":"客户端游戏","date":"2018-03-20"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:4:\"RARE\";s:9:\"publisher\";s:14:\"微软游戏工作室\";s:2:\"hp\";s:29:\"https://www.seaofthieves.com/\";}","tid":13686099,"score":"6.2","score_count":32,"created_at":1521514082},{"id":447,"name":"《合金装备：生存》","alias":["METAL GEAR SURVIVE"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201802/26/-p219Q5-j9piZgT3cSxc-ir.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-20"},{"platform_id":4,"platform":"Steam","date":"2018-02-20"},{"platform_id":2,"platform":"Xbox One","date":"2018-02-20"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:6:\"Konami\";s:9:\"publisher\";s:6:\"Konami\";}","tid":13537767,"score":"2.3","score_count":70,"created_at":1519628057},{"id":443,"name":"《猎天使魔女1&2》","alias":["Bayonetta"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/18/-p219Q5-rl7K1qT3cSi3-9o.jpg","release_info":[{"platform_id":3,"platform":"Switch","date":"2018-02-16"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:14:\"Platinum Games\";s:9:\"publisher\";s:6:\"任天堂\";}","tid":13510732,"score":"9.2","score_count":71,"created_at":1519282688},{"id":444,"name":"《圣剑传说2：玛娜之谜》","alias":["Secret of Mana","聖剣伝説2 SECRET of MANA"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/18/-p219Q5-e468Z11T3cSi3-9o.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-15"},{"platform_id":4,"platform":"Steam","date":"2018-02-15"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:8:\"史克威尔\";s:9:\"publisher\";s:8:\"史克威尔\";}","tid":13510932,"score":0,"score_count":7,"created_at":1519284220},{"id":441,"name":"《刀剑神域：夺命凶弹》","alias":["Sword Art Online:Fatal Bullet"],"type":[{"id":4,"name":"射击"}],"avatar":"http://img.ngacn.cc/attachments/mon_201805/18/-p219Q5-3exeZzT3cSi3-9o.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-08"},{"platform_id":2,"platform":"Xbox One","date":"2018-02-08"},{"platform_id":4,"platform":"Steam","date":"2018-02-23"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:11:\"Dimps工作室\";s:9:\"publisher\";s:10:\"万代南梦宫\";}","tid":13430763,"score":"5.9","score_count":35,"created_at":1518169819},{"id":442,"name":"真·三国无双8","alias":["Dynasty Warriors 9"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201802/09/-p219Q5-2f84ZtT3cS1hc-u0.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-08"},{"platform_id":2,"platform":"Xbox One","date":"2018-02-08"},{"platform_id":4,"platform":"Steam","date":"2018-02-13"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:14:\"KOEI(ω-Force)\";s:9:\"publisher\";s:10:\"KOEI TECMO\";}","tid":13430828,"score":"3.8","score_count":125,"created_at":1518170395},{"id":436,"name":"《旺达与巨像》重制版","alias":["Shadow of the Colossus"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.nga.cn/attachments/mon_201805/18/-p219Q5-3mr2ZdT3cSi3-9o.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-02-06"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:8:\"Team ICO\";s:9:\"publisher\";s:4:\"SCEJ\";}","tid":13401236,"score":"8.3","score_count":53,"created_at":1517801798},{"id":426,"name":"怪物猎人：世界","alias":["MONSTER HUNTER WORLD"],"type":[{"id":1,"name":"动作"}],"avatar":"http://img.ngacn.cc/attachments/mon_201801/26/-p219Q5-q4jK1pT3cSn2-bw.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-01-26"},{"platform_id":2,"platform":"Xbox One","date":"2018-01-26"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:6:\"CAPCOM\";s:9:\"publisher\";s:6:\"CAPCOM\";s:2:\"hp\";s:37:\"http://www.monsterhunterworld.com/hk/\";}","tid":13335074,"score":"9.4","score_count":1011,"created_at":1516957913},{"id":416,"name":"最终幻想纷争NT","alias":["DISSIDIA FINAL FANTASY NT"],"type":[{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.cn/attachments/mon_201801/12/-6oh25Q5-jqjrK1iT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2018-01-11"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:10:\"光荣特库摩\";s:9:\"publisher\";s:28:\"史克威尔艾尼克斯，光荣特库摩\";}","tid":13237778,"score":"3.3","score_count":20,"created_at":1515725701},{"id":389,"name":"莉蒂与苏尔的工作室：不思议绘画的炼金术士","alias":["リディー＆スールのアトリエ～不思議の絵画の錬金術士～"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.cn/attachments/mon_201712/18/-6oh25Q5-akm6K2rT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-12-21"},{"platform_id":3,"platform":"Switch","date":"2017-12-21"}],"link":null,"misc":"a:2:{s:9:\"developer\";s:4:\"Gust\";s:9:\"publisher\";s:4:\"KOEI\";}","tid":13081678,"score":"7.8","score_count":25,"created_at":1513585890},{"id":381,"name":"《Gorogoa》","alias":["画中世界"],"type":[{"id":128,"name":"冒险"},{"id":32768,"name":"解谜"},{"id":8388608,"name":"休闲"}],"avatar":"http://img.ngacn.cc/attachments/mon_201712/08/-6oh25Q5-hsu9K1yT3cSi3-9i.jpg","release_info":[{"platform_id":4,"platform":"Steam","date":"2017-12-15"},{"platform_id":5,"platform":"iOS","date":"2017-12-14"},{"platform_id":3,"platform":"Switch","date":"2017-12-14"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:13:\"Buried Signal\";s:9:\"publisher\";s:21:\"Annapurna Interactive\";s:2:\"hp\";s:19:\"http://gorogoa.com/\";}","tid":13013737,"score":"9.2","score_count":64,"created_at":1512724413},{"id":388,"name":"数码宝贝物语：网络侦探 骇客追忆","alias":["デジモンストーリー ハッカーズメモリー"],"type":[{"id":2,"name":"角色扮演"}],"avatar":"http://img.nga.cn/attachments/mon_201712/18/-6oh25Q5-c91wK2dT3cSi3-9i.jpg","release_info":[{"platform_id":1,"platform":"PS4","date":"2017-12-14"}],"link":null,"misc":"a:3:{s:9:\"developer\";s:12:\"Bandai Namco\";s:9:\"publisher\";s:12:\"Bandai Namco\";s:2:\"hp\";s:31:\"http://digimonstory.bn-ent.net/\";}","tid":13081596,"score":"8.1","score_count":17,"created_at":1513584868}]
         * page : 1
         * pagesize : 30
         * total : 168
         */

        private ItemsBean items;
        private int page;
        private int pagesize;
        private int total;
        private List<TopGamesBean> top_games;
        private List<GamesBean> games;

        public ItemsBean getItems() {
            return items;
        }

        public void setItems(ItemsBean items) {
            this.items = items;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<TopGamesBean> getTop_games() {
            return top_games;
        }

        public void setTop_games(List<TopGamesBean> top_games) {
            this.top_games = top_games;
        }

        public List<GamesBean> getGames() {
            return games;
        }

        public void setGames(List<GamesBean> games) {
            this.games = games;
        }

        public static class ItemsBean implements Serializable{
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

            public static class CategoriesBean implements Serializable{
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

            public static class TypesBean implements Serializable{
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

            public static class PlatformsBean implements Serializable {
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

            public static class DatesBean implements Serializable{
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

        public static class TopGamesBean implements Serializable{
            /**
             * id : 37
             * name : 塞尔达传说：旷野之息
             * alias : ["The Legend of Zelda: Breath of the Wild"]
             * type : [{"id":2,"name":"角色扮演"}]
             * avatar : http://img.ngacn.cc/attachments/mon_201706/15/-kt5xoQ928p-1gpzK1eT3cSi3-9i.jpg
             * release_info : [{"platform_id":3,"platform":"Switch","date":"2017-03-03"}]
             * link : null
             * misc : a:3:{s:9:"developer";s:8:"Nintendo";s:9:"publisher";s:8:"Nintendo";s:2:"hp";s:24:"http://www.nintendo.com/";}
             * tid : 11831787
             * score : 9.8
             * score_count : 1133
             * created_at : 1497519971
             */

            private int id;
            private String name;
            private String avatar;
            private Object link;
            private String misc;
            private int tid;
            private String score;
            private int score_count;
            private int created_at;
            private List<String> alias;
            private List<TypeBean> type;
            private List<ReleaseInfoBean> release_info;

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

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public Object getLink() {
                return link;
            }

            public void setLink(Object link) {
                this.link = link;
            }

            public String getMisc() {
                return misc;
            }

            public void setMisc(String misc) {
                this.misc = misc;
            }

            public int getTid() {
                return tid;
            }

            public void setTid(int tid) {
                this.tid = tid;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public int getScore_count() {
                return score_count;
            }

            public void setScore_count(int score_count) {
                this.score_count = score_count;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public List<String> getAlias() {
                return alias;
            }

            public void setAlias(List<String> alias) {
                this.alias = alias;
            }

            public List<TypeBean> getType() {
                return type;
            }

            public void setType(List<TypeBean> type) {
                this.type = type;
            }

            public List<ReleaseInfoBean> getRelease_info() {
                return release_info;
            }

            public void setRelease_info(List<ReleaseInfoBean> release_info) {
                this.release_info = release_info;
            }

            public static class TypeBean implements Serializable{
                /**
                 * id : 2
                 * name : 角色扮演
                 */

                private int id;
                private String name;

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
            }

            public static class ReleaseInfoBean implements Serializable{
                /**
                 * platform_id : 3
                 * platform : Switch
                 * date : 2017-03-03
                 */

                private int platform_id;
                private String platform;
                private String date;

                public int getPlatform_id() {
                    return platform_id;
                }

                public void setPlatform_id(int platform_id) {
                    this.platform_id = platform_id;
                }

                public String getPlatform() {
                    return platform;
                }

                public void setPlatform(String platform) {
                    this.platform = platform;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }
        }

        public static class GamesBean implements Serializable{
            /**
             * id : 615
             * name : 《刺客信条：奥德赛》
             * alias : ["Assassins Creed Odyssey"]
             * type : [{"id":1,"name":"动作"},{"id":2,"name":"角色扮演"}]
             * avatar : http://img.nga.178.com/attachments/mon_201810/06/-421abQ5-9whtZkT3cSi3-9i.jpg
             * release_info : [{"platform_id":4,"platform":"Steam","date":"2018-10-06"},{"platform_id":1,"platform":"PS4","date":"2018-10-05"},{"platform_id":2,"platform":"Xbox One","date":"2018-10-05"}]
             * link : null
             * misc : a:3:{s:9:"developer";s:7:"Ubisoft";s:9:"publisher";s:7:"Ubisoft";s:2:"hp";s:50:"https://assassinscreed.ubisoft.com/game/en-gb/home";}
             * tid : 15266823
             * score : 9.1
             * score_count : 218
             * created_at : 1538797528
             */

            private int id;
            private String name;
            private String avatar;
            private Object link;
            private String misc;
            private int tid;
            private String score;
            private int score_count;
            private int created_at;
            private List<String> alias;
            private List<TypeBeanX> type;
            private List<ReleaseInfoBeanX> release_info;

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

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public Object getLink() {
                return link;
            }

            public void setLink(Object link) {
                this.link = link;
            }

            public String getMisc() {
                return misc;
            }

            public void setMisc(String misc) {
                this.misc = misc;
            }

            public int getTid() {
                return tid;
            }

            public void setTid(int tid) {
                this.tid = tid;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public int getScore_count() {
                return score_count;
            }

            public void setScore_count(int score_count) {
                this.score_count = score_count;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public List<String> getAlias() {
                return alias;
            }

            public void setAlias(List<String> alias) {
                this.alias = alias;
            }

            public List<TypeBeanX> getType() {
                return type;
            }

            public void setType(List<TypeBeanX> type) {
                this.type = type;
            }

            public List<ReleaseInfoBeanX> getRelease_info() {
                return release_info;
            }

            public void setRelease_info(List<ReleaseInfoBeanX> release_info) {
                this.release_info = release_info;
            }

            public static class TypeBeanX implements Serializable{
                /**
                 * id : 1
                 * name : 动作
                 */

                private int id;
                private String name;

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
            }

            public static class ReleaseInfoBeanX implements Serializable{
                /**
                 * platform_id : 4
                 * platform : Steam
                 * date : 2018-10-06
                 */

                private int platform_id;
                private String platform;
                private String date;

                public int getPlatform_id() {
                    return platform_id;
                }

                public void setPlatform_id(int platform_id) {
                    this.platform_id = platform_id;
                }

                public String getPlatform() {
                    return platform;
                }

                public void setPlatform(String platform) {
                    this.platform = platform;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }
            }
        }
    }
}
