// JavaScript Document
window.onload = function(){
    dian_zan_num();
}
$(function(){
	if(!placeholderSupport()){   // 判断浏览器是否支持 placeholder
		$('[placeholder]').focus(function() {
			var input = $(this);
			if (input.val() == input.attr('placeholder')) {
				input.val('');
				input.removeClass('placeholder');
				input.css('color','#333');
			}
		}).blur(function() {
			var input = $(this);
			if (input.val() == '' || input.val() == input.attr('placeholder')) {
				input.addClass('placeholder');
				input.val(input.attr('placeholder'));
				input.css('color','#999');
			}
		}).blur();
	};
	
	release();//我要发布

	tab('message');//消息
    
	jh_help(); //江湖求助
	
	all_none();
	
	date();
	
	label_box_show();
	
	addLabel();
	
	delLabel();
    
    letter_search();
    
    obj_filter('supply');
    obj_filter('news');
    obj_filter('tag');
    
    filtrate(); //过滤供需列表
    
    dian_zan(); //煤炭供需点赞
    
    change_color(); //改变颜色
    
    release_supply_demand(); //发布供货需求信息
    
    reply_list(); //回复列表
    
    floor();//楼层
    
    supply_demand_favorite(); //收藏
    
    select_area(); //选择产区
    
    img_auto();
    
    notpass_cause();
    
    person_info_dialog_show();
    
    alter_form();
    
    points();
    
    rz_info();
    
    change_rz_way();
	
	
	//修改输入框颜色
	$("input").focus(function(){
		$(this).addClass("focus");
	}).blur(function(){
		$(this).removeClass("focus");
	});
	$("textarea").focus(function(){
		$(this).addClass("focus");
	}).blur(function(){
		$(this).removeClass("focus");
	});
	$(".login_input").focus(function(){
		$(this).parent().addClass("focus");
	}).blur(function(){
		$(this).parent().removeClass("focus");
	});
	
	//search history
	$(".search_text").focus(function(){
		$(".search_history").show();
	});
	$(".search_history").hover(function(){
		$('body').unbind('mousedown');
	},function(){
		$('body').bind('mousedown', function(){
			$(".search_history").hide();
		});
	});
	
	//关注微信
	$('.wechat_qrcode').mouseenter(function(){
		$('.popup').show();
	});
	$('.wechat_qrcode').mouseleave(function(){
		$('.popup').hide();
	});
	
	//扫码下载
	$('.app_download_btn').mouseenter(function(){
		$('.download-popup').show();
	});
	$('.app_download_btn').mouseleave(function(){
		$('.download-popup').hide();
	});
	
	$('.feedback').click(function(){
		$('.mask').show();
		$('#feedback').show();
	});
	$('.close').click(function(){
		$('.mask').hide();
		$('.dialogbox').hide();
	});
	
	//用户信息
	$('.forum-user').mouseenter(function(){
		$(this).find('.userpopup').addClass('show');
	});
	$('.forum-user').mouseleave(function(){
		$(this).find('.userpopup').removeClass('show');
	});
	
	//select控件
	$(".input input").click(function(e){
		$(this).toggleClass("drop");
		//点击当前的input下面的ul隐藏或者显示
		$(this).siblings("ul").fadeToggle();
		//在有多个点击下拉的情况下，点击当前的input下面的ul隐藏或者显示，其余的div下面的ul都要隐藏
		$(this).parent().siblings(".input").find("ul").fadeOut();
		$(this).parents().siblings(".clearfix").find("ul").fadeOut();
		$(this).parent().siblings(".input").find("input").removeClass("drop");
		$(this).parents().siblings(".clearfix").find("input").removeClass("drop");
		e.stopPropagation();
	})
	$(".input ul li").click(function(){
		//点击当前的li,当前按钮的文本出现在input框里面
		$(this).parent().siblings("input").val($(this).html());
		$(this).parent().siblings("input").removeClass("drop");
		$(this).parent().fadeOut();
	})
	//下面这个点击body,html效果的意思：点击body,html的任何地方div下面的ul都要隐藏
	$("body,html").click(function(e){
		$(".input input").removeClass("drop");
		$(".input ul").fadeOut();
		e.stopPropagation();
	})
});

//下拉菜单
function release(){
	$('.release_btn').mouseenter(function(){
		$('.release_box').addClass('current');
		$('.release_box').find('ul').addClass('show');
	});
	$('.release_box').mouseleave(function(){
		$('.release_box').removeClass('current');
		$('.release_box').find('ul').removeClass('show');
	});
	
    $('.my_page_btn').mouseenter(function(){
		$('.my_page_btn').addClass('current');
        $('.login_box') .find('ul').addClass('show');
    });
	$('.login_box').mouseleave(function(){
		$('.my_page_btn').removeClass('current');
		$('.login_box').find('ul').removeClass('show');
	});
	
	$('.top_select').mouseenter(function(){
		$('.release_select').addClass('current');
		$('.release_select').find('ul').addClass('show');
	});
	$('.release_select').mouseleave(function(){
		$('.release_select').removeClass('current');
		$('.release_select').find('ul').removeClass('show');
	});
	//账号退出
	$('.user a').mouseenter(function(){
		$('.user a').addClass('current');
        $('.user') .find('ul').addClass('show');
    });
	$('.user').mouseleave(function(){
		$('.user a').removeClass('current');
		$('.user').find('ul').removeClass('show');
	});
}

function jh_news(){
	$('.jh_news_title ul li').each(function(){
		var i = $(this).index();
		$(this).find('a').bind('click',function(){
			$(this).addClass('active').parent().siblings().find('a').removeClass('active');
			$('.jh_news_content').eq(i).show();
			$('.jh_news_content').eq(i).siblings().hide();
		});
	});
	$('.jh_news_content').eq(0).show();
}

function tab(obj){
	$('.jh_'+ obj +'_title ul li').each(function(){
		var i = $(this).index();
		$(this).find('a').bind('click',function(){
			$(this).addClass('active').parent().siblings().find('a').removeClass('active');
			$('.jh_'+ obj +'_content').eq(i).show();
			$('.jh_'+ obj +'_content').eq(i).siblings().hide();
		});
	});
	$('.jh_'+ obj +'_content').eq(0).show();
}

function jh_help(){
	$('.jh_answer span').each(function(){
		if(parseInt($(this).text()) != 0){
			$(this).parent().addClass('num1').removeClass('num0');
		}else{
			$(this).parent().addClass('num0').removeClass('num1');
		}
	});
	
	var $help = $('.jh_question_box');
	for(var i = 0; i < $help.length; i++){
		$help.eq(2*i).addClass('m_r15');
	}
}

function placeholderSupport() {
    return 'placeholder' in document.createElement('input');
}

function all_none(){
	var $obj = $('.jh_help_page_question_box,.answer_list,.similarity_question_box ul li');
	var i = $obj.length;
	$obj.eq(i-1).addClass('border_none');
}

function date(){
	var myDate = new Date();
	var mytime = myDate.toLocaleDateString();
        mytime = new Date(mytime.replace("-", "/"));
    $('.jh_supply_page_list').each(function(){
        var expiryDate = $(this).find('a p span.expiry_date i').text();
        expiryDate = new Date(expiryDate.replace("-", "/"));
        var tag = expiryDate < mytime;
        if(tag == true){
            $(this).find('a p span.overdue').css('display','block');
        }
    });
}

function alter_form(){
    $('#alter_tx').click(function(){
        var src = $('.fileBoxUl li:last').find('img').attr('src');
        $('.person_data_detail table tr td img.tx_img').attr('src',src);
        closeDialog_person_tx();
    })
    $('#alter_id').click(function(){
        if($('.person_id_span').text()==""){
            var txt = $('.dialog_person_id_text').val();
            $('.person_id_span').text(txt);
        }
        closeDialog_person_id();
    });
    
    $('#alter_username').click(function(){
        var txt = $('.dialog_person_username_text').val();
        $('.person_username_span').text(txt);
        closeDialog_person_username();
    });
    
    $('#alter_intro').click(function(){
        var txt = $('.dialog_person_intro_text').val();
        $('.person_intro_p').text(txt);
        closeDialog_person_intro();
    });
    
    $('#alter_password').click(function(){
        closeDialog_person_password();
    });
    
    $('#alter_name').click(function(){
        var txt = $('.dialog_person_name_text').val();
        $('.person_name_span').text(txt);
        closeDialog_person_name();
    });
    
    $('#alter_sex').click(function(){
        var txt = $('.sex_box label input:radio:checked').val();
        $('.person_sex_span').text(txt);
        closeDialog_person_sex();
    });
    
    $('#alter_phone').click(function(){
        var txt = $('.dialog_person_phone_text').val();
        $('.person_phone_span').text(txt);
        closeDialog_person_phone();
    });
    
    $('#alter_rz_id').click(function(){
        var txt = $('.dialog_jh_rz_id_text').val();
        $('.jh_rz_id_span').text(txt);
        closeDialog_jh_rz_id();
    });
    
    $('#alter_rz_type').click(function(){
        var txt = $('.dialog_jh_rz_type_select option:checked').text();;
        $('.jh_rz_type_span').text(txt);
        closeDialog_jh_rz_type();
    });
}

function person_info_dialog_show(){
    //个人头像
    $('.person_tx').click(function(){
        dialog_person_tx_show();
    });
    //账号
    $('.person_id').bind('click',function(){
        dialog_person_id_show();
        if($('.person_id_span').text()==""){
            $('.dialog_person_id_text').show().after('<p>账号设置后将不能修改，请谨慎操作！</p>');
        }else{
            $('.dialog_person_id_text').hide().next('p').text("您已经设置过账户，不能修改！");
        }
    });
    //用户名
    $('.person_username').click(function(){
        dialog_person_username_show();
        var txt = $('.person_username_span').text();
        $('.dialog_person_username_text').val(txt);
    });
    //简介
    $('.person_intro').click(function(){
        dialog_person_intro_show();
        var txt = $('.person_intro_p').text();
        $('.dialog_person_intro_text').val(txt);
    });
    //密码
    $('.person_password').click(function(){
        dialog_person_password_show();
    });
    //江湖认证
    $('.person_rz').click(function(){
        dialog_person_rz_show();
    });
    //姓名
    $('.person_name').click(function(){
        dialog_person_name_show();
        var txt = $('.person_name_span').text();
        $('.dialog_person_name_text').val(txt);
    });
    //性别
    $('.person_sex').click(function(){
        var txt = $('.person_sex_span').text();
        if(txt == '男'){
            $('.sex_box label:eq(0) input').attr("checked","checked");
        }else{
            $('.sex_box label:eq(1) input').attr("checked","checked");
        }
        dialog_person_sex_show();
    });
    //电话
    $('.person_phone').click(function(){
        dialog_person_phone_show();
        var txt = $('.person_phone_span').text();
        $('.dialog_person_phone_text').val(txt);
    });
    //职业
    $('.add_occup').click(function(){
        $('#add_occup_btn').show();
        $('#save_occup_btn').hide();
        $('#del_occup_btn').hide();
        $('.person_occup_text').val('');
        $('.person_company_text').val('');
        $('#person_entry_time').val('');
        $('#person_leave_time').val('');
        dialog_person_occup_info_show();
    });
    
    //江湖认证身份证号
    $('.rz_id').click(function(){
        dialog_jh_rz_id_show();
        var txt = $('.jh_rz_id_span').text();
        $('.dialog_jh_rz_id_text').val(txt);
    });
    
    //江湖认证行业类型
    $('.rz_type').click(function(){
        dialog_jh_rz_type_show();
        var txt = $('.jh_rz_type_span').text();
        
        $('.dialog_jh_rz_type_select option').each(function(){
           if($(this).text()==txt) {
               $(this).attr('selected','true');
           }
        });
    });
    
    //添加职业信息
    $('#add_occup_btn').click(function(){
        var str = "";
        var oc = $('.person_occup_text').val();
        var company = $('.person_company_text').val();
        var first_time = $('#person_entry_time').val();
        var last_time = $('#person_leave_time').val();

        str += '<div class="person_occup_info_block clearfix"><a href="javascript:;" class="person_occup_info">'
        str +=    '<img src="images/jh_occup_info_ico.jpg" />'
        str +=    '<span class="post_info">'+ oc +'</span><br/>'
        str +=    '<span class="company_info">'+ company +'</span><br/>'
        str +=    '<span class="company_date" id="first_time">'+ first_time +'</span>至<span class="company_date" id="last_time">'+ last_time +'</span>'
        str += '</a></div>';

        if($('.occup_info > p').text()=='您还未完善职业信息！'){
            $('.occup_info').empty().append(str);
            closeDialog_person_occup_info();
        }else{
            $(str).insertBefore('.person_occup_info_block:first');
            closeDialog_person_occup_info();
        }
    });
    
    //修改职业信息
    $('.occup_info').on('click','.person_occup_info',function(){
        $('#add_occup_btn').hide();
        $('#save_occup_btn').show();
        $('#del_occup_btn').show();
        var index = $(this).parent().index();
        $('.ele_index').val(index);
        var oc = $(this).find('.post_info').text();
        $('.person_occup_text').val(oc);
        var company = $(this).find('.company_info').text();
        $('.person_company_text').val(company);
        var first_time = $(this).find('#first_time').text();
        $('#person_entry_time').val(first_time);
        var last_time = $(this).find('#last_time').text();
        $('#person_leave_time').val(last_time);
        dialog_person_occup_info_show();
    });
    
    //保存修改
    $(document).on('click','#save_occup_btn',function(){
        var person_occup_text = $(this).parent().find('.person_occup_text').val();
        var person_company_text = $(this).parent().find('.person_company_text').val();
        var first_time = $('#person_entry_time').val();
        var last_time = $('#person_leave_time').val();
        var index = $('.ele_index').val();
        $('.person_occup_info_block').eq(index).find('.post_info').text(person_occup_text);
        $('.person_occup_info_block').eq(index).find('.company_info').text(person_company_text);
        $('.person_occup_info_block').eq(index).find('#first_time').text(first_time);
        $('.person_occup_info_block').eq(index).find('#last_time').text(last_time);
    });
    
    //删除职业
    $(document).on('click','#del_occup_btn',function(){
        var index = $('.ele_index').val();
        $('.person_occup_info_block').eq(index).remove();
        closeDialog_person_occup_info();
        if($('.person_occup_info_block').length == 0)
        $('.occup_info').append('<p>您还未完善职业信息！</p>');
    });
}

function label_box_show(){
	$('.label_text').click(function(){
		dialog1_show();
	});
}

function filtrate(){
    $('.supply_filtrate_box').click(function(){
        dialog2_show();
    });
    $('.demand_filtrate_box').click(function(){
        dialog3_show();
    })
    $('#area_select').click(function(){
        dialog4_show();
    })
}

//显示弹出层
function showBg() { 
	var bh = $("body").height(); 
	var bw = $("body").width(); 
	$("#fullbg").css({ 
		height:bh, 
		width:bw, 
		display:"block" 
	}); 
} 

function dialog1_show(){
    showBg();
    $("#dialog").show();
}

function dialog2_show(){
    showBg();
    $("#dialog2").show(); 
}

function dialog3_show(){
    showBg();
    $("#dialog3").show();
}

function dialog4_show(){
    showBg();
    $("#dialog4").show(); 
}

function dialog_person_tx_show(){
    showBg();
    $("#dialog_person_tx").show();
}

function dialog_person_id_show(){
    showBg();
    $("#dialog_person_id").show();
}

function dialog_person_username_show(){
    showBg();
    $("#dialog_person_username").show();
}

function dialog_person_intro_show(){
    showBg();
    $("#dialog_person_intro").show();
}

function dialog_person_password_show(){
    showBg();
    $("#dialog_person_password").show();
}

function dialog_person_rz_show(){
    showBg();
    $("#dialog_person_rz").show();
}

function dialog_person_name_show(){
    showBg();
    $("#dialog_person_name").show();
}

function dialog_person_sex_show(){
    showBg();
    $("#dialog_person_sex").show();
}

function dialog_person_phone_show(){
    showBg();
    $("#dialog_person_phone").show();
}

function dialog_person_occup_info_show(){
    showBg();
    $("#dialog_person_occup_info").show();
}

function dialog_jh_rz_id_show(){
    showBg();
    $("#dialog_jh_rz_id").show();
}

function dialog_jh_rz_type_show(){
    showBg();
    $("#dialog_jh_rz_type").show();
}

//关闭弹出层
function closeBg() { 
	$("#fullbg,#dialog").hide();
	if($('.label_text').text()=='') {
		$('.label_text').text("标签，点击添加");
	}
}

function closeDialog2(){
    $("#fullbg,#dialog2").hide();
}

function closeDialog3(){
    $("#fullbg,#dialog3").hide();
}

function closeDialog4(){
    $("#fullbg,#dialog4").hide();
}

function closeDialog_person_tx(){
    $("#fullbg,#dialog_person_tx").hide();
}

function closeDialog_person_id(){
    $("#fullbg,#dialog_person_id").hide();
}

function closeDialog_person_username(){
    $("#fullbg,#dialog_person_username").hide();
}

function closeDialog_person_intro(){
    $("#fullbg,#dialog_person_intro").hide();
}

function closeDialog_person_password(){
    $("#fullbg,#dialog_person_password").hide();
}

function closeDialog_person_rz(){
    $("#fullbg,#dialog_person_rz").hide();
    $('.my_rz_info_list').hide();
    $('#my_rz_btn').show();
}

function closeDialog_person_name(){
    $("#fullbg,#dialog_person_name").hide();
}

function closeDialog_person_sex(){
    $("#fullbg,#dialog_person_sex").hide();
}

function closeDialog_person_phone(){
    $("#fullbg,#dialog_person_phone").hide();
}

function closeDialog_person_occup_info(){
    $("#fullbg,#dialog_person_occup_info").hide();
}

function closeDialog_jh_rz_id(){
    $("#fullbg,#dialog_jh_rz_id").hide();
}

function closeDialog_jh_rz_type(){
    $("#fullbg,#dialog_jh_rz_type").hide();
}

function addLabel(){
	$('.add_label_btn').click(function(){
		var str="";
		$('.wx_label span').each(function(){
			if($(this).find("input").is(':checked')){
				str = '<span>'+$(this).text()+'</span>';
				$('.yx_label').append('<span>' + $(this).html()+'</span>');
				if($('.label_text').text()=='标签，点击添加'){
					$('.label_text').text('').append(str);
					$(this).remove();
				}else{
					$('.label_text').append(str);
					$(this).remove();
				}
			}
		});
	});
}

function delLabel(){
	$('.remove_label_btn').click(function(){
		var str = "";
		$('.yx_label span').each(function(){
			if($(this).find("input").is(':checked')){
				$('.wx_label').append('<span>' + $(this).html()+'</span>');
				$(this).remove();
				str = $(this).text();
				$('.label_text span').each(function(){
					if(str == $(this).text()){
						$(this).remove();
					}
				});
			}
		});
	});
}

function letter_search(){
    $('.letter_search ul li').each(function(){
        $(this).find('a').bind('click',function(){
            $(this).addClass('active').parent().siblings().find('a').removeClass('active');
        });
    });
}

function obj_filter(obj){
    
    $('.' + obj + '_filter > a').click(function(event){
        event.stopPropagation();
        $('.' + obj + '_filter ul').fadeIn();
    });
    $(document).click(function(){
		$('.' + obj + '_filter ul').hide();
	});
    $('.' + obj + '_filter ul li').each(function(){
        $(this).find('a').click(function(){
            $(this).addClass('active').parent().siblings().find('a').removeClass('active');
            $('.' + obj + '_filter > a').text($(this).text());
        });
    });
}

function dian_zan(){
    var i = 0;
    $('.jh_supply_page_list,.jh_area_page_list').each(function(){
        $(this).find('h3 span.zan_num a').click(function(){
            if(parseInt($(this).find('i').text())==0){
                i++;
                $(this).find('i').text(i).addClass('active').end().find('img').attr('src','images/zan2_ico.png');
            }else{
                var num = parseInt($(this).find('i').text());
                num++;
                $(this).find('i').text(num).addClass('active').end().find('img').attr('src','images/zan2_ico.png');
            }
        });
        var $obj = $(this).find('h3 span.zan_num a');

        if(parseInt($obj.find('i').text()) != 0){
            $obj.find('img').attr('src','images/zan2_ico.png');
            $obj.find('i').addClass('active');
        }else{
            $obj.find('img').attr('src','images/zan_ico.png');
            $obj.find('i').removeClass('active');
        }
    });
}

function change_color(){
    $('.jh_supply_page_list').each(function(){
        $(this).find('a.change_color').click(function(){
            $(this).find('input.tag').val('yes').end().find('span').css('color','#666').end().find('span.overdue').css('color','#fff');
        });
        if($('.tag').val()=='yes') $('a.change_color').find('span').css('color','#666').end().find('span.overdue').css('color','#fff');
    });
}

function release_supply_demand(){
    $('.release_supply_box').show();
    $('.jh_supply_demand_title ul li a:eq(0)').click(function(){
        $('.release_supply_box').show();
        $('.release_demand_box').hide();
    });
    $('.jh_supply_demand_title ul li a:eq(1)').click(function(){
        $('.release_supply_box').hide();
        $('.release_demand_box').show();
    });
}

function dian_zan_num(){
    if($('.zan_num_hidden').val() == 'yes'){
        $('.dian_zan_btn').css('background','url("images/dian_zan_orange_btn.png")');
        var zan_num = parseInt($('.dian_zan_tab_btn').find('span').text());
        $('.dian_zan_tab_btn').find('span').text(zan_num).end().addClass('zan');
    }else{
        $('.dian_zan_btn').css('background','url("images/dian_zan_btn.png")');
        var zan_num = parseInt($('.dian_zan_tab_btn').find('span').text());
        $('.dian_zan_tab_btn').find('span').text(zan_num);
    }
    
    $('.dian_zan_btn').click(function(){
        if($('.zan_num_hidden').val() == 'no'){
            $('.zan_num_hidden').val('yes');
            $('.dian_zan_btn').css('background','url("images/dian_zan_orange_btn.png")');
            var zan_num = parseInt($('.dian_zan_tab_btn').find('span').text());
            $('.dian_zan_tab_btn').find('span').text(zan_num + 1).end().addClass('zan');
        }
    });
}

function reply_list(){
    var $obj = $('div.jh_supply_detail_reply_content_list');
    if($obj.html() == ""){
        $('.reply_tab_btn span').text(0);
        $obj.html('<p>快来发表你的评论吧</p>');
    }
}

function floor(){
    var $obj = $('.jh_supply_detail_reply_content_list_box');
    var len = $obj.length;
    $obj.each(function(i){
        $obj.eq(i).find('.floor i').text(i+1);
        i++;
    });
    $('.reply_tab_btn span').text(len);
}

function supply_demand_favorite(){
    var $obj = $('#favorite_btn,#area_favorite_btn,#entry_favorite_btn').find('i');
    if(parseInt($obj.text())==1){
        $('#favorite_btn').addClass('supply_demand_favorite_orange_btn').removeClass('supply_demand_favorite_btn');
        $('#area_favorite_btn').addClass('area_favorite_orange_btn').removeClass('area_favorite_btn');
        $('#entry_favorite_btn').addClass('entry_favorite_orange_btn').removeClass('entry_favorite_btn');
    }
    
    $('#favorite_btn').click(function(){
        if(parseInt($obj.text()) == 0){
            $(this).addClass('supply_demand_favorite_orange_btn').removeClass('supply_demand_favorite_btn');
            $(this).find('i').text(1);
        }else{
            $(this).addClass('supply_demand_favorite_btn').removeClass('supply_demand_favorite_orange_btn');
            $(this).find('i').text(0);
        }
    });
    
    $('#area_favorite_btn').click(function(){
        if(parseInt($obj.text()) == 0){
            $(this).addClass('area_favorite_orange_btn').removeClass('area_favorite_btn');
            $(this).find('i').text(1);
        }else{
            $(this).addClass('area_favorite_btn').removeClass('area_favorite_orange_btn');
            $(this).find('i').text(0);
        }
    });
    
    $('#entry_favorite_btn').click(function(){
        if(parseInt($obj.text()) == 0){
            $(this).addClass('entry_favorite_orange_btn').removeClass('entry_favorite_btn');
            $(this).find('i').text(1);
        }else{
            $(this).addClass('entry_favorite_btn').removeClass('entry_favorite_orange_btn');
            $(this).find('i').text(0);
        }
    });
}

function select_area(){
    $('#dialog4 .arealist .bbssection').each(function(){
        $(this).find('a').click(function(){
            var text = $(this).find('h3 span').text();
            $('#area_select').val(text);
            $(this).find('img').before('<i></i>').end().parent().siblings().find('i').remove();
        });
    });
}

function img_auto(){
    var $obj = $('.area_detail_content').find('img');
    var $w = $obj.width();
    if($w < 845){
        $obj.before('<br/>').css('width','auto');
    }else{
        $obj.css('width','100%');
    }
}

function notpass_cause(){
    $('.my_news_list').each(function(){
        $(this).find('a.notpass_cause').click(function(){
           $(this).parent('p').after('<p>【建议】</p>')
        });
    });
}

function points(){
    var str = '.baixing,.chuchumaolu,.niudaoxiaoshi,.yizhanchengming,.jianghuhaoxia,.jueshigaoshou,.tianxiawushuang,.shiwaigaoren,.yidaizongshi,.wulinmengzhu';
    for(var s = 0; s < 10; s++){
        $(str).append('<span></span>');
    }
    
    var dq_points = parseInt($('.dq_points i').text());
    var $sj_points = $('.sj_points i');
    if(dq_points >= 0 && dq_points <= 500){
        $sj_points.text(500)
    }else if(dq_points > 500 && dq_points <= 1000){
        $sj_points.text(1000);
    }else if(dq_points > 1000 && dq_points <= 2000){
        $sj_points.text(2000);
    }else if(dq_points > 2000 && dq_points <= 3500){
        $sj_points.text(3500);
    }else if(dq_points > 3500 && dq_points <= 5000){
        $sj_points.text(5000);
    }else if(dq_points > 5000 && dq_points <= 8000){
        $sj_points.text(8000);
    }else if(dq_points > 8000 && dq_points <= 15000){
        $sj_points.text(15000);
    }else if(dq_points > 15000 && dq_points <= 30000){
        $sj_points.text(30000);
    }else if(dq_points > 30000 && dq_points <= 50000){
        $sj_points.text(50000);
    }else if(dq_points > 50000 && dq_points <= 75000){
        $sj_points.text(75000);
    }
    
    var sj_points = parseInt($sj_points.text());
    var sy_points = sj_points - dq_points;
    $('.sy_points p span').text(sy_points);
    
    if(dq_points <= 500){
        $('.dq_chenghao i').text('百姓');
        var percent = Math.round(dq_points/500*10);
        for(var i = 0; i < percent; i++){
            $('.baixing span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 500 && dq_points <= 1000){
        $('.dq_chenghao i').text('初出茅庐');
        if(dq_points == 1000){
            $('.dq_chenghao i').text('牛刀小试');
        }
        $('.baixing span').css('background','#f60');
        var percent = Math.round((dq_points-500)/500*10);
        for(var i = 0; i < percent; i++){
            $('.chuchumaolu span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 1000 && dq_points <= 2000){
        $('.dq_chenghao i').text('牛刀小试');
        if(dq_points == 2000){
            $('.dq_chenghao i').text('一战成名');
        }
        for(var b = 0; b < 2; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-1000)/1000*10);
        for(var i = 0; i < percent; i++){
            $('.niudaoxiaoshi span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 2000 && dq_points <= 3500){
        $('.dq_chenghao i').text('一战成名');
        if(dq_points == 3500){
            $('.dq_chenghao i').text('江湖豪侠');
        }
        for(var b = 0; b < 3; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-2000)/1500*10);
        for(var i = 0; i < percent; i++){
            $('.yizhanchengming span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 3500 && dq_points <= 5000){
        $('.dq_chenghao i').text('江湖豪侠');
        if(dq_points == 5000){
            $('.dq_chenghao i').text('绝世高手');
        }
        for(var b = 0; b < 4; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-3500)/1500*10);
        for(var i = 0; i < percent; i++){
            $('.jianghuhaoxia span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 5000 && dq_points <= 8000){
        $('.dq_chenghao i').text('绝世高手');
        if(dq_points == 8000){
            $('.dq_chenghao i').text('天下无双');
        }
        for(var b = 0; b < 5; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-5000)/3000*10);
        for(var i = 0; i < percent; i++){
            $('.jueshigaoshou span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 8000 && dq_points <= 15000){
        $('.dq_chenghao i').text('天下无双');
        if(dq_points == 15000){
            $('.dq_chenghao i').text('世外高人');
        }
        for(var b = 0; b < 6; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-8000)/7000*10);
        for(var i = 0; i < percent; i++){
            $('.tianxiawushuang span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 15000 && dq_points <= 30000){
        $('.dq_chenghao i').text('世外高人');
        if(dq_points == 30000){
            $('.dq_chenghao i').text('一代宗师');
        }
        for(var b = 0; b < 7; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-15000)/15000*10);
        for(var i = 0; i < percent; i++){
            $('.shiwaigaoren span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 30000 && dq_points <= 50000){
        $('.dq_chenghao i').text('一代宗师');
        if(dq_points == 50000){
            $('.dq_chenghao i').text('武林盟主');
        }
        for(var b = 0; b < 8; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-30000)/20000*10);
        for(var i = 0; i < percent; i++){
            $('.yidaizongshi span').eq(i).css('background','#f60');
        }
    }else if(dq_points > 50000 && dq_points <= 75000){
        $('.dq_chenghao i').text('武林盟主');
        if(dq_points == 75000){
            $('.dq_chenghao i').text('扫地高僧');
        }
        for(var b = 0; b < 9; b++){
            $('.jdt div').eq(b).find('span').css('background','#f60');
        }
        var percent = Math.round((dq_points-50000)/25000*10);
        for(var i = 0; i < percent; i++){
            $('.wulinmengzhu span').eq(i).css('background','#f60');
        }
    }
}

function rz_info(){
    $('#my_rz_btn').click(function(){
        $('.my_rz_info_list').slideDown();
        $(this).hide();
    });
}

function change_rz_way(){
    $('.change_rz_way input').change(function(){
        if($(this).attr('id')=='way1'){
            $('.info_rz_box').show();
            $('.friend_rz_box').hide();
        }else{
            $('.info_rz_box').hide();
            $('.friend_rz_box').show();
        }
    });
}
