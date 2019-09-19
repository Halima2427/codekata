$(document).ready(function(){
    var canvas = document.getElementById("myCanvas");
    var gc = canvas.getContext('2d');

    $("#draw").click(function(){ 
                
                gc.fillStyle   = '#b99';
                gc.strokeStyle = '#000';
                gc.lineWidth   = 3;
                gc.beginPath();
                gc.moveTo(60, 240);
                gc.lineTo(240, 240);
                gc.lineTo(150, 60);
                gc.closePath();
                gc.fill();
                gc.stroke();
                gc.save();
    });

    $("#rotate").click(function(){ 
                gc.clearRect(0, 0, canvas.width, canvas.height);
                gc.fillStyle   = '#b66';
                gc.strokeStyle = '#000';
                gc.lineWidth   = 3;
                gc.translate(canvas.width / 2, canvas.height / 2);
                gc.rotate(Math.PI / 4);
                gc.beginPath();
                gc.moveTo(-90, 90);
                gc.lineTo(90, 90);
                gc.lineTo(0, -90);
                gc.closePath();
                gc.fill();
                gc.stroke();
    });

    $("#clear").click(function(){ 
                gc.setTransform(1,0,0,1,0,0);
                gc.clearRect(0, 0, canvas.width, canvas.height);
                gc.restore();
    });
});



