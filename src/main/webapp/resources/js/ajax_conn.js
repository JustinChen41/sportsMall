function createRequest(){
	var xmlHttp = false;
	try{
		xmlHttp = new XMLHttpRequest();
	}catch (trymicrosoft){
		try{
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
		}catch(othermicrosoft) {
			try{
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			}catch(failed){
				xmlHttp = false;
			}
		}
	}
	if(!xmlHttp){
		alert("Error initializing XMLHttpRequest!");
	}
	
	
	return xmlHttp;
}	

function callServer(url,obj){
	var xmlHttp = createRequest();
	with(xmlHttp){
		open("POST",url,true);
		onreadystatechange = function (){updatePage(xmlHttp,obj);};
		setRequestHeader("If-Modified-Since","0"); 
		send(null);
	}
}
function callServer(url,obj,param){
	var xmlHttp = createRequest();
	with(xmlHttp){
		open("POST",url,true);
		onreadystatechange = function (){updatePage(xmlHttp,obj);};
		setRequestHeader("If-Modified-Since","0"); 
		send(param);
	}
}
/*function callServer(url){
	var xmlHttp = createRequest();
	with(xmlHttp){
		open("POST",url,true);
		setRequestHeader("If-Modified-Since","0"); 
		send(null);
	}
}*/
function updatePage(xmlHttp,obj){
	
	if (xmlHttp.readyState == 4){
		if (xmlHttp.status == 200){
				obj(xmlHttp);
			//xmlHttp.abort();
		}
	}
}

