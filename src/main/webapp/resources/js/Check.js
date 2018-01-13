/**
 * 验证类
 *
 * @auther：lelouch
 * @create:2014.12.24
 * @update:2016-11-23
 * @version: v2.0
 * @require:jquery 1.7+
 *
 *
 */
//----------------------------------------------------------------------------------------------------------------------------------


/**
 * 时间扩展
 *  <br> demo  mysql date to long 函数 UNIX_TIMESTAMP
 *  <br> var date = new Date();
 *  <br> date.setTime("1461121631186");
 *  <br> alert(date.format("yyyy-MM-dd hh:mm:ss"));
 * @param format
 * @returns {*}
 */
Date.prototype.format = function (format) {
    var o = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S": this.getMilliseconds()
    }
    var week = {
        "0": "日",
        "1": "一",
        "2": "二",
        "3": "三",
        "4": "四",
        "5": "五",
        "6": "六"
    };
    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    if (/(E+)/.test(format)) {
        format = format.replace(RegExp.$1, ((RegExp.$1.length > 1) ? (RegExp.$1.length > 2 ? "/u661f/u671f" : "/u5468") : "") + week[this.getDay() + ""]);
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
}

/**
 * 正则表达式池 ------------------------------------------------------------------------------------------------------------------------
 */
var regular = {};
/**
 * 工具方法 ------------------------------------------------------------------------------------------------------------------------
 */
var tools =  {};


/**
 * 金额
 * @type {RegExp}
 */
regular.money = /^[+-]?\d*\.?\d{1,2}$/;
/**
 * 金额正
 * @type {RegExp}
 */
regular.pmoney = /^\d*\.?\d{1,2}$/;
/**
 * 正整数
 * @type {RegExp}
 */
regular.pInt = /^[1-9]\d*$/;
/**
 * 正整数+0
 * @type {RegExp}
 */
regular.pzInt = /^\d+$/;
/**
 * 整数
 * @type {RegExp}
 */
regular.Int = /^[0-9]*[1-9][0-9]*$/;
/**
 * 非负浮点数（正浮点数 + 0）
 * @type {RegExp}
 */
regular.pzFloat = /^\d+(\.\d+)?$/;
/**
 * 浮点数
 * @type {RegExp}
 */
regular.Float = /^(-?\d+)(\.\d+)?$/;
/**
 * 由26个英文字母组成的字符串
 * @type {RegExp}
 */
regular.Letter = /^[A-Za-z]+$"/;
/**
 * 由26个英文字母的大写组成的字符串
 * @type {RegExp}
 */
regular.cLetter = /^[A-Z]+$/;
/**
 * 由26个英文字母的小写组成的字符串
 * @type {RegExp}
 */
regular.lLetter = /^[a-z]+$/;
/**
 * 由数字和26个英文字母组成的字符串
 * @type {RegExp}
 */
regular.NumLetter = /^[A-Za-z0-9]+$/;
/**
 * 由数字、26个英文字母或者下划线组成的字符串
 * @type {RegExp}
 */
regular.Num_cLetter = /^\w+$/;
/**
 * url
 * @type {RegExp}
 */
regular.Url = /^http:\/\/[A-Za-z0-9]+\.[A-Za-z0-9]+[\/=\?%\-&_~`@[\]\':+!]*([^<>\"\"])*$/;
/**
 * email地址
 * @type {RegExp}
 */
regular.email = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
/**
 * 中文
 * @type {RegExp}
 */
regular.Chinese = /^[\u0391-\uFFE5]+$/;
/**
 * 手机号
 * @type {RegExp}
 */
regular.Mobile = /^1[3|4|5|7|8]\d{9}$/;
/**
 * 座机号
 * @type {RegExp}
 */
regular.Phone = /^0\d{2,3}-?\d{7,8}$/;
/**
 * 手机或坐机
 * @type {RegExp}
 */
regular.Telephone = /(^1[3|4|5|7|8]\d{9}$)|(^0\d{2,3}-?\d{7,8}$)/;
/**
 * 时间
 * @type {RegExp}
 */
regular.DateTime = /^((((1[6-9]|[2-9]\d)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))(\s\d{1,2}:\d{1,2}:\d{1,2})?$/;
/**
 * 图片
 * @type {RegExp}
 */
regular.pic = /.(jpg|jpeg|bmp|gif|png)$/i;
/**
 * .jpg
 * @type {RegExp}
 */
regular.jpg = /.(jpg)$/i;
/**
 * .xls
 * @type {RegExp}
 */
regular.xls = /.(xls)$/i;
/**
 * 邮编
 * @type {RegExp}
 */
regular.postcode = /^[0-9]{6}$/;
/**
 * 传真
 * @type {RegExp}
 */
regular.Fax = /^(\d{3,4}-)?\d{7,8}$/;
/**
 * 身份证
 * @type {RegExp}
 */
regular.id = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
/**
 * ip地址
 * @type {RegExp}
 */
regular.ip = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
/**
 * #FFF颜色
 * @type {RegExp}
 */
regular.color = /^#([0-9]|[a-f]|[A-F]){3,6}$/;
/**
 * #FFF颜色
 * @type {RegExp}
 */
regular.colorhex = /^#([0-9]|[a-f]|[A-F]){3,6}$/;
/**
 * 六位数字(提现密码验证)
 * @type {RegExp}
 */
regular.paypassword = /^\d{6}$/;
/**
 * 登录密码  6-18 必须包含数字和字母
 * @type {RegExp}
 */
regular.password = /^(?![0-9]+$)(?![a-zA-Z]+$)[a-zA-Z0-9]{6,18}$/;
/**
 * 中文,字母,数字,下划线
 * @type {RegExp}
 */
regular.General = /^([\u4e00-\u9fa50-9a-zA-Z_])+$/;
/**
 * 银行卡卡号 16或19位
 * @type {RegExp}
 */
regular.bankcard = /^(\d{16}|\d{19})$/;

/**
 * 图片文件
 * @type {RegExp}
 */
regular.inputImage = /^image\//;

/**
 * 视频文件
 * @type {RegExp}
 */
regular.inputVideo = /^video\//;

/**
 * 是否超过限制大小
 * <br> size 字节
 * <br> 利用对话框返回的值 （true 或者 false）
 */
tools.overlimitSize = function ($object,size) {
    if($object[0].files[0].size > size){
        return true;
    }
    else{
        return false
    }
};

/**
 * 是图片文件
 * <br>
 */
tools.isInputImage = function ($object) {
    if(regular.inputImage.test($object[0].files[0].type)){
        return true;
    }
    else{
        return false
    }
};
/**
 * 是视频文件
 * <br>
 */
tools.isInputVideo = function ($object) {
    if(regular.inputVideo.test($object[0].files[0].type)){
        return true;
    }
    else{
        return false
    }
};

/**
 * confirm
 * <br> 利用对话框返回的值 （true 或者 false）
 */
tools.firm = function () {
    if (confirm("确认执行操作？")) {
        return true;
    }
    else {
        return false;
    }
};
tools.firm = function (s) {
    if(s == undefined){
       s = "确认执行操作？";
    }
    if (confirm(s)) {
        return true;
    }
    else {
        return false;
    }
};
/**
 * 去两端空格
 */
tools.strTrim = function (s) {
    return s.replace(/(^\s*)|(\s*$)/g, "");
};
/**
 * input,textarea blur 验证
 * <br> e.g.: checkValRT("input[name='orderid']", regular_pInt, "排序必需是正整数");
 *
 * @param jquerySelectname
 *            jq选择器字段串
 * @param regularString
 *            验证字符串
 * @param alertname
 *            alert内容
 * @returns
 */

tools.checkValRT = function (jquerySelectname, regularString, alertname) {
    $(document).undelegate(jquerySelectname, "blur").delegate(jquerySelectname, "blur", function () {
        if ($(this).val() != "") {
            if (!regularString.test(tools.strTrim($(this).val()))) {
                alert(alertname);
                $(this).val("");
                $(this).focus();
            } else {
                $(this).val(tools.strTrim($(this).val()));
            }
        }
    })
};
/**
 * 获取字符串长度(中文算两个)
 */
tools.getStringLength = function (string) {
    var realLength = 0, len = string.length, charCode = -1;
    for (var i = 0; i < len; i++) {
        charCode = string.charCodeAt(i);
        if (charCode >= 0 && charCode <= 128) realLength += 1;
        else realLength += 2;
    }
    return realLength;
};

/**
 * input,textarea blur 验证
 *
 * @param jquerySelectname
 *            jq选择器字段串
 * @param regularString
 *            验证字符串
 * @param alertname
 *            alert内容
 * @param length
 *            字符长度
 * @returns
 */
tools.checkValMaxLength = function (jquerySelectname, regularString, alertname, length) {
    $(jquerySelectname).blur(function () {
        if ($(this).val() != "") {
            $(this).val(tools.strTrim($(this).val()));
            if (!regularString.test($(this).val())) {
                alert(alertname);
                $(this).val("");
                $(this).focus();
            }
            if (tools.getStringLength($(this).val()) > length) {
                alert("字符长度不能超过 " + length + " 个字符！ (中文算两个字符)");
                $(this).focus();
            }
        }
    });
}

/**
 * input,textarea blur 验证
 *
 * @param jquerySelectname
 *            jq选择器字段串
 * @param regularString
 *            验证字符串
 * @param alertname
 *            alert内容
 * @param length
 *            字符长度
 * @returns
 */
tools.checkValLength = function (jquerySelectname, regularString, alertname, minLength, maxLength) {
    $(jquerySelectname).blur(function () {
        if ($(this).val() != "") {
            $(this).val(tools.strTrim($(this).val()));
            if (!regularString.test($(this).val())) {
                alert(alertname);
                $(this).val("");
                $(this).focus();
                return;
            }
            if (tools.getStringLength($(this).val()) < minLength || tools.getStringLength($(this).val()) > maxLength) {
                alert("字符长度不能超过 " + maxLength + " 个字符！, 不能少于" + minLength + " 个字符！");
                $(this).val("");
                $(this).focus();
            }
        }
    });
}
/**
 * 确认密码判定是否一值
 *
 * @param passwordConfirmSelectname
 * @param passwordSelectname
 * @returns
 */
tools.passwordConfirm = function (passwordConfirmSelectname, passwordSelectname) {
    $(passwordConfirmSelectname).blur(function () {
        if ($(passwordConfirmSelectname).val() != $(passwordSelectname).val()) {
            $(passwordConfirmSelectname).val("");
            alert("密码不一致");
            $(passwordSelectname).focus();
        }
    });
    $(passwordSelectname).blur(function () {
        if ($(passwordConfirmSelectname).val() != "" && $(passwordConfirmSelectname).val() != $(passwordSelectname).val()) {
            $(passwordConfirmSelectname).val("");
            alert("密码不一致");
            $(passwordSelectname).focus();
        }
    });
}

/**
 * select 初始化赋值(选中状态)
 * <br>  e.g.: selectValue("preID", "${preID}");
 *
 * @param name
 *            select的名字
 * @param value
 *            值
 * @returns
 */
tools.selectValue = function (name, value) {
    $("select[name='" + name + "'] option").each(function () {
        if ($(this).val() == value) {
            $(this).attr("selected", "");
        }
    });
}
/**
 * 选择全部checkbox
 *
 * @param label
 *            jq选择器
 * @param box
 *            check容器jq选择器
 * @param fun
 *            回调函数
 * @returns
 */
tools.checkboxSelcetAll = function (label, box, fun) {
    $(label).change(function () {
        if ($(this).find("input[type='checkbox']").prop("checked") == true) {
            $(box + " input[type='checkbox']").prop("checked", true);
        } else {
            $(box + " input[type='checkbox']").prop("checked", false);
        }
        fun();
    });
}

/**
 * 输出时间差
 * @param time 时间
 * @param format 格式化字符串
 */
tools.timeDifference = function (time, format) {

    var one_seconds = 1000;
    var one_minutes = one_seconds * 60;
    var one_hours = one_minutes * 60;
    var oneday = one_hours * 24;

    var days = time / oneday;
    var hours = (time - parseInt(days) * oneday) / one_hours;
    var minutes = (time - parseInt(days) * oneday - parseInt(hours) * one_hours) / one_minutes;
    var seconds = (time - parseInt(days) * oneday - parseInt(hours) * one_hours - parseInt(minutes) * one_minutes) / one_seconds;

    format = format.replace(/dd/, parseInt(days));
    format = format.replace(/hh/, parseInt(hours));
    format = format.replace(/mm/, parseInt(minutes));
    format = format.replace(/ss/, parseInt(seconds));

    return format;
}
/**
 * long 时间格式化 (yyyy-MM-dd hh:mm:ss)
 * @param time 时间
 */
tools.longToDate = function (time) {
    var cdate = new Date();
    cdate.setTime(time);
    return cdate.format("yyyy-MM-dd hh:mm:ss");
}

// /**
//  * long 时间格式化
//  * @param time 时间
//  * @param format 格式化字符串
//  */
// tools.longToDate2 = function (time, format) {
//     var cdate = new Date();
//     cdate.setTime(time);
//     return cdate.format(format);
// }
/**
 * 时间转换 e.g.:"yyyy-MM-dd hh:mm:ss"
 * @param time 时间
 * @param formatStr 时间格式
 * @returns
 */
tools.timeChange = function (time, formatStr) {
    var now = new Date();
    now.setTime(time);
    return now.format(formatStr);
}


/**
 * 如果单数补为双位
 * @param integer
 * @returns {*}
 * @constructor
 */
tools.FZ = function (integer) {
    if (!isNaN(integer)) {
        if (parseInt(integer) < 10) {
            return "0" + integer;
        } else {
            return integer;
        }
    } else {
        return integer
    }
}
/**
 * String to Array
 * @param text
 * @returns {Array}
 * @constructor
 */
tools.StringForeach = function (text) {
    var jk = text.length;
    var mycars = new Array(jk)
    for (var index = 0; index < jk; index++) {
        mycars[index] = text.charAt(index);
    }
    return mycars;
}

/**
 * 数字处理函数，三位一逗号
 * @param s 数字
 * @param n 小数长度
 * @returns {String}
 */
tools.fmoney = function (s, n) {
    n = n >= 0 && n <= 20 ? n : 2;
    s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";
    var l = s.split(".")[0].split("").reverse(),
        r = n == 0 ? "" : s.split(".")[1];
    t = "";
    for (i = 0; i < l.length; i++) {
        t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");
    }
    var num = t.split("").reverse().join("");
    if (n > 0) {
        num += '' + "." + r;
    }
    return num;
}
/**
 * 处理键盘事件 禁止后退键（Backspace）密码或单行、多行文本框除外
 * document.onkeypress=banBackSpace;
 * document.onkeydown=banBackSpace;
 */
tools.banBackSpace = function (e) {
    var ev = e || window.event;//获取event对象
    var obj = ev.target || ev.srcElement;//获取事件源

    var t = obj.type || obj.getAttribute('type');//获取事件源类型

    //获取作为判断条件的事件类型
    var vReadOnly = obj.getAttribute('readonly');
    var vEnabled = obj.getAttribute('enabled');
    //处理null值情况
    vReadOnly = (vReadOnly == null) ? false : vReadOnly;
    vEnabled = (vEnabled == null) ? true : vEnabled;

    //当敲Backspace键时，事件源类型为密码或单行、多行文本的，
    //并且readonly属性为true或enabled属性为false的，则退格键失效
    var flag1 = (ev.keyCode == 8 && (t == "password" || t == "text" || t == "textarea")
    && (vReadOnly == true || vEnabled != true)) ? true : false;

    //当敲Backspace键时，事件源类型非密码或单行、多行文本的，则退格键失效
    var flag2 = (ev.keyCode == 8 && t != "password" && t != "text" && t != "textarea")
        ? true : false;

    //判断
    if (flag2) {
        return false;
    }
    if (flag1) {
        return false;
    }
}

/**
 * 文件大小单位自换算
 * @param {Object} size 大小B
 */
tools.getFileSize = function (size) {
    var kb = 1024;
    var mb = kb * 1024;
    var gb = mb * 1024;
    if (size >= gb) {
        return (size / gb).toFixed(2) + "GB";
    } else if (size >= mb) {
        return (size / mb).toFixed(2) + "MB";
    } else if (size >= kb) {
        return (size / kb).toFixed(2) + "KB";
    } else
        return size + "B";
}

/**
 * js获取url传递参数
 * 返回 key value 数组
 */
tools.getRequest = function (urlp) {
    var requestMap = new Array();// 定义一个数组，用来把参数封装成map集合
    if (urlp.indexOf("?") != -1) {
        var str = urlp.substr(1);
        strs = str.split("&");
//          console.log("------------------ "+strs);
        for (var i = 0; i < strs.length; i++) {
            var p = new Object;

            if (i == 0) {
                var temp = strs[i].split("=")[0];
                var strTemp = temp.split("?")[1];
                p.key = temp;
//                      console.log("p.key-1------>"+p.key);
            } else {
                p.key = strs[i].split("=")[0];
//                      console.log("p.key2-------->"+p.key);
            }
            p.value = strs[i].split("=")[1];
//                      console.log("p.value-------->"+p.value);
            requestMap.push(p);
        }
    }
    return requestMap;
}

/**
 * 去重只匹配最生一项
 * @param urlp
 * @returns 返回 key value 数组
 */
tools.urlParamsDeduplicationLast = function (urlp) {
    var requestMap = new Array();// 定义一个数组，用来把参数封装成map集合
    if (urlp.indexOf("?") != -1) {
        var str = urlp.substr(1);
        strs = str.split("&");
        var pl = new Object;
        pl.key = strs[strs.length - 1].split("=")[0];
        pl.value = strs[strs.length - 1].split("=")[1];

        for (var i = 0; i < strs.length; i++) {
            if (pl.key != strs[i].split("=")[0]) {
                var p = new Object;
                if (i == 0) {
                    var temp = strs[i].split("=")[0];
                    var strTemp = temp.split("?")[1];
                    p.key = temp;
                } else {
                    p.key = strs[i].split("=")[0];
                }
                p.value = strs[i].split("=")[1];
                requestMap.push(p);
            }
        }
        requestMap.push(pl);
    }
    return requestMap;
}

/**
 *  key value 数组 转 url 参数
 * @param paramsArray
 * @returns
 */
tools.mapToUrlp = function (paramsArray) {
    var urlp = "";
    for (var i = 0; i < paramsArray.length; i++) {
        if (i == 0) {
            urlp += "?" + paramsArray[i].key + "=" + paramsArray[i].value;
        } else {
            urlp += "&" + paramsArray[i].key + "=" + paramsArray[i].value;
        }
    }
    return urlp;
}
/**
 * RGB转Hex：
 * @param r
 * @param g
 * @param b
 * @returns {string}
 */
tools.rgbToHex = function (r, g, b) {
    return (r < 16 ? "0" + r.toString(16).toUpperCase() : r.toString(16).toUpperCase()) + (g < 16 ? "0" + g.toString(16).toUpperCase() : g.toString(16).toUpperCase()) + (b < 16 ? "0" + b.toString(16).toUpperCase() : b.toString(16).toUpperCase());
}
/**
 * Hex转RGB：
 * @param h
 * @returns {string}
 */
tools.hexToRgb = function (h) {
    var r = 0, g = 0, b = 0;
    r = parseInt(h[0], 16) * 16 + parseInt(h[1], 16);
    g = parseInt(h[2], 16) * 16 + parseInt(h[3], 16);
    b = parseInt(h[4], 16) * 16 + parseInt(h[5], 16);
    return r + "," + g + "," + b;
}
/**
 * Hex取反色：
 * @param h
 * @returns {string}
 */
tools.hexToReverse = function (h) {
    // var r = 0, g = 0, b = 0;
    // r = 255 - parseInt(h[0],16)*16 - parseInt(h[1],16);
    // g = 255 - parseInt(h[2],16)*16 - parseInt(h[3],16);
    // b = 255 - parseInt(h[4],16)*16 - parseInt(h[5],16);
    // return (r < 16 ? "0" + r.toString(16).toUpperCase() : r.toString(16).toUpperCase()) + (g < 16 ? "0" + g.toString(16).toUpperCase() : g.toString(16).toUpperCase()) + (b < 16 ? "0" + b.toString(16).toUpperCase() : b.toString(16).toUpperCase());
    var h = "0x" + h.replace(/#/g, "");
    var str = "000000" + (0xFFFFFF - h).toString(16);
    return str.substring(str.length - 6, str.length);
}
/**
 * Hex取反色：
 * @param h
 * @returns {string}
 */
tools.hexToReverses = function (h) {
    if (regular_color.test(h)) {
        var s = h.substring(1, h.length);
        if (s.length == 6) {
            return hexToReverse(h);
        } else if (s.length == 3) {
            return hexToReverse(h.substring(0) + h.substring(0) + h.substring(1) + h.substring(1) + h.substring(2) + h.substring(2));
        }
        else {
            return h;
        }

    }
}

/**
 * input [data-img] 值 要与显示的img父层元素 [data-img]值一致
 * @param file
 */
tools.previewImage = function (file) {

    function clacImgZoomParam(maxWidth, maxHeight, width, height) {
        var param = {top: 0, left: 0, width: width, height: height};
        if (width > maxWidth || height > maxHeight) {
            rateWidth = width / maxWidth;
            rateHeight = height / maxHeight;

            if (rateWidth > rateHeight) {
                param.width = maxWidth;
                param.height = Math.round(height / rateWidth);
            } else {
                param.width = Math.round(width / rateHeight);
                param.height = maxHeight;
            }
        }
        param.left = Math.round((maxWidth - param.width) / 2);
        param.top = Math.round((maxHeight - param.height) / 2);
        return param;
    }

    var MAXWIDTH = 200;
    var MAXHEIGHT = 200;
    var $div = $('[data-img="' + $(file).attr("data-img") + '"]').eq(0);
    var $img = $div.find("img").eq(0);
    if (undefined == $img.attr("data-width")) {
        MAXWIDTH = $img.width();
    } else {
        MAXWIDTH = $img.attr("data-width")
    }
    if (undefined == $img.attr("data-height")) {
        MAXHEIGHT = $img.height();
    } else {
        MAXHEIGHT = $img.attr("data-height")
    }
    if (file.files && file.files[0]) {
        $div[0].innerHTML = '<img data-width="' + MAXWIDTH + '" data-height="' + MAXHEIGHT + '" >';
        var img = $div.find("img").eq(0)[0];
        img.onload = function () {
            var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
            img.style.width = rect.width + 'px';
            img.style.height = rect.height + 'px';
            img.style.marginLeft = rect.left + 'px';
            img.style.marginTop = rect.top + 'px';
        }
        var reader = new FileReader();
        reader.onload = function (evt) {
            img.src = evt.target.result;
        }
        reader.readAsDataURL(file.files[0]);
    }
    else {
        var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
        file.select();
        file.blur();
        var src = document.selection.createRange().text;
        $div[0].innerHTML = '<img>';
        var img = $div.find("img").eq(0)[0];
        img.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale',src=\"" + src + "\")";
    }
}

tools.intToChinese = function( str ) {
    str = str+'';
    var len = str.length-1;
    var idxs = ['','十','百','千','万','十','百','千','亿','十','百','千','万','十','百','千','亿'];
    var num = ['零','壹','贰','叁','肆','伍','陆','柒','捌','玖'];
    return str.replace(/([1-9]|0+)/g,function( $, $1, idx, full) {
        var pos = 0;
        if( $1[0] != '0' ){
            pos = len-idx;
            if( idx == 0 && $1[0] == 1 && idxs[len-idx] == '十'){
                return idxs[len-idx];
            }
            return num[$1[0]] + idxs[len-idx];
        } else {
            var left = len - idx;
            var right = len - idx + $1.length;
            if( Math.floor(right/4) - Math.floor(left/4) > 0 ){
                pos = left - left%4;
            }
            if( pos ){
                return idxs[pos] + num[$1[0]];
            } else if( idx + $1.length >= len ){
                return '';
            }else {
                return num[$1[0]]
            }
        }
    });
}

tools.intToChineseX = function(money) {
    var cnNums = new Array("零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"); //汉字的数字
    var cnIntRadice = new Array("", "拾", "佰", "仟"); //基本单位
    var cnIntUnits = new Array("", "万", "亿", "兆"); //对应整数部分扩展单位
    var cnDecUnits = new Array("角", "分", "毫", "厘"); //对应小数部分单位
    var cnInteger = "整"; //整数金额时后面跟的字符
    var cnIntLast = "元"; //整型完以后的单位
    var maxNum = 999999999999999.9999; //最大处理的数字
    var IntegerNum; //金额整数部分
    var DecimalNum; //金额小数部分
    var ChineseStr = ""; //输出的中文金额字符串
    var parts; //分离金额后用的数组，预定义
    if (money == "") {
        return "";
    }
    money = parseFloat(money);
    if (money >= maxNum) {
        alert('超出最大处理数字');
        return "";
    }
    if (money == 0) {
        ChineseStr = cnNums[0] + cnIntLast + cnInteger;
        return ChineseStr;
    }
    money = money.toString(); //转换为字符串
    if (money.indexOf(".") == -1) {
        IntegerNum = money;
        DecimalNum = '';
    } else {
        parts = money.split(".");
        IntegerNum = parts[0];
        DecimalNum = parts[1].substr(0, 4);
    }
    if (parseInt(IntegerNum, 10) > 0) { //获取整型部分转换
        var zeroCount = 0;
        var IntLen = IntegerNum.length;
        for (var i = 0; i < IntLen; i++) {
            var n = IntegerNum.substr(i, 1);
            var p = IntLen - i - 1;
            var q = p / 4;
            var m = p % 4;
            if (n == "0") {
                zeroCount++;
            } else {
                if (zeroCount > 0) {
                    ChineseStr += cnNums[0];
                }
                zeroCount = 0; //归零
                ChineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
            }
            if (m == 0 && zeroCount < 4) {
                ChineseStr += cnIntUnits[q];
            }
        }
        ChineseStr += cnIntLast;
        //整型部分处理完毕
    }
    if (DecimalNum != '') { //小数部分
        var decLen = DecimalNum.length;
        for (var i = 0; i < decLen; i++) {
            var n = DecimalNum.substr(i, 1);
            if (n != '0') {
                ChineseStr += cnNums[Number(n)] + cnDecUnits[i];
            }
        }
    }
    if (ChineseStr == '') {
        ChineseStr += cnNums[0] + cnIntLast + cnInteger;
    } else if (DecimalNum == '') {
        ChineseStr += cnInteger;
    }
    return ChineseStr;

}


/**
 * Check 类 ************************************ 主入口 ---------------------------------------------------------------------------------------------
 * @type {{regular: {}}}
 */
// var Check = {
//     regular: regular,
//     'tools': tools(),
// };
Check = {};
Check.regularity = regular;
Check.tools = tools;
//Check = {};
// var Check = {
//     'regular': regular, 'tools': tools, 'aaa':'aa',
// }


//------------------------------------------------------------------------------------结束

//onkeyup="value=value.replace(/[^\d\.]/g,'')"
//onkeyup="value=value.replace(/[^0-9]/g,'')"


// e.g.: regular_pInt.test("1654");

//利用对话框返回的值 （true 或者 false）  
// function firm() {
//     if (confirm("确认执行操作？")) {
//         return true;
//     }
//     else {
//         return false;
//     }
//
// }


// e.g.: dateValidate($("input[name='setupdate']").val(),"YYYY-MM-dd","-")
// 日期验证
function dateValidate(date, dateformat, separator) {

    if (date == null || date == "") return false;

    var date_part_index = datePartIndex(dateformat, separator);
    var date_array = date.split(separator);
    var yearstr = date_array[date_part_index.y];
    var monthstr = date_array[date_part_index.m];
    var daystr = date_array[date_part_index.d];

    if (isNaN(yearstr)) return false;
    if (isNaN(monthstr)) return false;
    if (isNaN(daystr)) return false;

    var year = parseInt(yearstr);
    var month = parseInt(monthstr) - 1;
    var day = parseInt(daystr);
    var date = new Date(year, month, day);
    var y = date.getFullYear();
    var m = date.getMonth();
    var d = date.getDate();
    if (y != year || m != month || d != day) {
        return false;
    }
    return true;
}

function datePartIndex(dateformat, separator) {
    var partIndex = {};
    var part_array = dateformat.split(separator);
    for (var i = 0; i < part_array.length; i++) {
        switch (part_array[i]) {
            case "YYYY":
                partIndex.y = i;
                break;
            case "MM":
                partIndex.m = i;
                break;
            case "dd":
                partIndex.d = i;
                break;
        }
    }
    return partIndex;
}

// 常用方法
// -------------------------------------------------------------------------------------------------------------------------------------------------


/**
 * bootstrap file 上传验证
 *
 * @param jquerySelectname
 *            jq选择器字段串
 * @param size
 *            限制上传大小
 * @param regularString
 *            验证字符串
 * @returns
 */
function checkbootstrapFile(jquerySelectname, size, regularString) {
    //$(jquerySelectname).change(function(){
    $(document).delegate(jquerySelectname, 'change', function () {
        var filesize = $(jquerySelectname)[0].files[0].size;
        var tmpfilesize = Math.round(filesize / 1024 / 1024 * 100) / 100;
        // 文件大小
        if (tmpfilesize > size) {
            alert("文件过大，请上传小于" + size + "兆文件");
            $(jquerySelectname).val("");
            return false;
        }
        // 左侧图片
        if (!regularString.test($(jquerySelectname).val())) {
            alert("文件格式不正确！");
            $(jquerySelectname).val("");
        }

        $(jquerySelectname).parent().next().val($(jquerySelectname)[0].value.replace(/^(\w)?:\\(\w)*\\/, ""));
    })
}


$(function () {

    // datepicker 汉化(Jquery UI)
    if (jQuery.isFunction(jQuery.fn.datepicker)) {
        $(".datepicker_chinese").datepicker({
            changeYear: true,
            yearRange: "1790:2200",
            changeMonth: true,
            // showButtonPanel:true,//是否显示按钮面板
            dateFormat: 'yy-mm-dd',  // 日期格式，自己设置
            monthNames: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
            monthNamesShort: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
            dayNames: ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'],
            dayNamesShort: ['周日', '周一', '周二', '周三', '周四', '周五', '周六'],
            dayNamesMin: ['日', '一', '二', '三', '四', '五', '六'],
            prevText: "前一个月", // Display text for previous month link
            nextText: "后一全月",
            beforeShow: function () {
                setTimeout(
                    function () {
                        $('#ui-datepicker-div').css("z-index", 20);
                    }, 100
                );
            },
            onClose: function (dateText, inst) {
                //当日期面板关闭后触发此事件（无论是否有选择日期），参数为选择的日期和当前日期插件的实例。
            },
            onSelect: function (dateText, inst) {
                //当在日期面板选中一个日期后触发此事件，参数为选择的日期和当前日期插件的实例。
            }

        });
    }


    // ul-li 式下拉
    // $("div.widget-toolbar")
})


//// select
////
//	<div class="widget-toolbar" role="menu"> //
//	<div class="btn-group"> //
//			<button class="btn dropdown-toggle btn-xs btn-success"
//// data-toggle="dropdown"> 选择班级 <i class="fa fa-caret-down"></i> </button>
//			//
//			<ul class="dropdown-menu pull-right js-status-update">
//			//
//			<li> <a href="" sid ="">name </a> </li>
//			//
//		</ul>
//			// </div>
//	// </div>
/**
 * BootStrapSelect 赋值
 *
 * @param
    <div
 *            class="widget-toolbar">
 的jq字符串
 * @param sid
 *            值
 * @returns
 */
function BootStrapSelect(toolbar, sid) {
    $(toolbar + " ul > li > a").each(function () {

        if ((sid != null && sid != "") && sid == $(this).attr("sid")) {
            $(this).parents(".widget-toolbar[role='menu']").eq(0).find("button.dropdown-toggle").html('&nbsp;' + $(this).text() + '&nbsp;<i class="fa fa-caret-down"></i>&nbsp;');
        }
    });
}

$(function () {
    $(document).delegate(".widget-toolbar[role='menu'] ul.dropdown-menu > li > a", "click", function () {
        $(this).parents(".widget-toolbar[role='menu']").eq(0).find("button.dropdown-toggle").html('&nbsp;' + $(this).text() + '&nbsp;<i class="fa fa-caret-down"></i>&nbsp;');
    });
})


/**
 *
 * @param inputName
 * @returns
 */
function checkboxCheckedSize(inputName) {
    return $("input[name='" + inputName + "']:checked").size();
}

/**
 * 对象内容为i++
 *
 * @param queryStr
 * @returns
 */
function identityFun(queryStr) {
    $(queryStr).each(function (i) {
        $(this).text(i + 1);
    });
}

/**
 * 动态生成html标签
 *
 * @param box
 *            外框窗口 jqueryStr
 * @param paneClass
 *            循环体 class
 * @param add
 *            添加 jqueryStr
 * @param del
 *            删除 jqueryStr
 * @param identity
 *            自增 jqueryStr
 * @param maxSize
 *            最大数量（为0不限制）
 * @returns
 */
function dynamicHTML(box, paneClass, add, del, identity, maxSize) {
    // var box = "#bookPanelBox";
    // var paneClass="bookPanel";
    // var add = ".b_Add";
    // var del = ".b_Del";
    // var identity = "c.identity";

    $("." + paneClass + "Demo").hide();

    $(document).undelegate(add, "click").delegate(add, "click", function () {
        if (maxSize < 1) {
            $(box).append($("." + paneClass + "Demo").clone().removeClass(paneClass + "Demo").addClass(paneClass).show());
            identityFun(identity);
        } else {
            if ($("." + paneClass).size() < maxSize) {
                $(box).append($("." + paneClass + "Demo").clone().removeClass(paneClass + "Demo").addClass(paneClass).show());
                identityFun(identity);
            }
            else {
                alert("不能再添加了!只能添加 " + maxSize + " 个");
            }
        }
    });
    if ($("." + paneClass).size() < 1) {
        $(add).click();
    }

    $(document).undelegate(".b_Del", "click").delegate(".b_Del", "click", function () {
        $(this).parents("." + paneClass).eq(0).remove();
        identityFun(identity);
        if ($("." + paneClass).size() < 1) {
            $(add).click();
        }
    });
}


/**
 * 时间转换
 * @param eleClass
 * @param formatStr
 * @returns
 */
function eleTimeChangeText(eleClass, formatStr) {
    $(eleClass).text(timeChange($(eleClass).text(), formatStr));

}

//是否存在指定函数 
function isExitsFunction(funcName) {
    try {
        if (typeof(eval(funcName)) == "function") {
            return true;
        }
    } catch (e) {
    }
    return false;
}
//是否存在指定变量 
function isExitsVariable(variableName) {
    try {
        if (typeof(variableName) == "undefined") {
            //alert("value is undefined"); 
            return false;
        } else {
            //alert("value is true"); 
            return true;
        }
    } catch (e) {
    }
    return false;
}
/**
 * 返回空值长度
 * @param jquerySelect
 * @returns
 */
function nullSize(jquerySelect) {
    var i = 0;
    $(jquerySelect).each(function (j) {
        if ($(this).val().trim() == "") {
            i++;
        }
    });
    return i;
}




	
  
