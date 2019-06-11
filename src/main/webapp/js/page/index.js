$(function () {
    $(".getUser").click(function(){
        $.ajax({
            type:'post',
            url : '../user/getUser',
            data:{
            },
            dataType:"json",
            //请求成功后的回调函数
            success:function(data) {
                alert("成功一次")
                // window.location.href="index.html?"+"data";
                // this.href=this.href+"";
                // var html = "";
                // for(var i=0;i<data.length;i++){
                //     alert("成功le");
                //     alert(data.length);
                //     var user = data.get(i).getId();
                //     alert("成功1");
                //     alert(user);
                //     html +="<span>"+user.id+"</span>";
                // }
            },
            error : function() {
                alert("错误");
            }
        });
    });
})