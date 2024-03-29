/*
	SuperBox v1.0.0 (modified by bootstraphunter.com)
	by Todd Motto: http://www.toddmotto.com
	Latest version: https://github.com/toddmotto/superbox
	
	Copyright 2013 Todd Motto
	Licensed under the MIT license
	http://www.opensource.org/licenses/mit-license.php

	SuperBox, the lightbox reimagined. Fully responsive HTML5 image galleries.
*/
;(function($) {
	$.fn.SuperBox = function(options) {
		
		var superbox      = $('<div class="superbox-show"></div>'),
			superboximg   = $('<img src="" class="superbox-current-img"><div id="imgInfoBox" class="superbox-imageinfo inline-block"> <h1>Image Title</h1><span><p></p><p><a href="#" class="btn btn-danger btn-sm" onclick="return confirm(\'确认删除？\')">删除图片</a></p></span> </div>'),
			superboxclose = $('<div class="superbox-close txt-color-white"><i class="fa fa-times fa-lg"></i></div>');
			superboxhiddenvalue = $('<input id="photo_id" value="" type="hidden" />');
		superbox.append(superboximg).append(superboxclose).append(superboxhiddenvalue);
		
		var imgInfoBox = $('.superbox-imageinfo');
		
		return this.each(function() {
			
			$('.superbox-list').click(function() {
				$this = $(this);
		
				var currentimg = $this.find('.superbox-img'),
					imgData = currentimg.data('img'),
					imgDescription = currentimg.attr('alt') || "无描述",
					imgLink = imgData,
					imgTitle = currentimg.attr('title') || "";
					imgId = currentimg.attr('photo_id');
					newsType = currentimg.attr('newsType');
					areaId = currentimg.attr('areaId');
					newsId = currentimg.attr('news_id');
					imgfrom = currentimg.attr('imgfrom');
					//console.log(imgData, imgDescription, imgLink, imgTitle)
					
				superboximg.attr('src', imgData);
				
				$('.superbox-list').removeClass('active');
				$this.addClass('active');
				
				//$('#imgInfoBox em').text(imgLink);
				//$('#imgInfoBox >:first-child').text(imgTitle);
				//$('#imgInfoBox .superbox-img-description').text(imgDescription);
				
				superboximg.find('>:first-child').text(imgTitle);
				superboximg.find('.superbox-img-description').text(imgDescription);
				superboximg.find('.btn-danger').attr("href" , "/Newsc/deleteNewsFile?imgId="+imgId+"&newsId="+newsId+"&newsType="+newsType+"&areaId="+areaId+"&imgfrom="+imgfrom);
				superboxhiddenvalue.attr("value" , imgId);
				//console.log("fierd")
				
				if($('.superbox-current-img').css('opacity') == 0) {
					$('.superbox-current-img').animate({opacity: 1});
				}
				
				if ($(this).next().hasClass('superbox-show')) {
					$('.superbox-list').removeClass('active');
					superbox.toggle();
				} else {
					superbox.insertAfter(this).css('display', 'block');
					$this.addClass('active');
				}
				
				$('html, body').animate({
					scrollTop:superbox.position().top - currentimg.width()
				}, 'medium');
			
			});
						
			$('.superbox').on('click', '.superbox-close', function() {
				$('.superbox-list').removeClass('active');
				$('.superbox-current-img').animate({opacity: 0}, 200, function() {
					$('.superbox-show').slideUp();
				});
			});
			
		});
	};
})(jQuery);