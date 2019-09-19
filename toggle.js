
$(document).ready(function(){
    $("#btn1").mousedown(function(){ 
        $("div").css("background","blue");        
    });
    $("#btn1").mouseup(function(){ 
        $("div").css("background","green");        
    });
    $("#btn2").mousedown(function(){ 
        $("div").css("border-radius","10px");        
    });
    $("#btn2").mouseup(function(){ 
        $("div").css("border-radius","6px");        
    });
    $("#btn3").click(function(){    
        $("body").append("<div></div>")
    });
});