
$(function(){

    /**
     * Created by zqr on 2015/8/19.
     */
    var U = window.U || (window.U = {});

    U.qtip = function(obj,opt){
        var _opt= $.extend({
            style: {
                classes: 'qtip-bootstrap'
            },
            position:{
                my: 'right center',
                at: 'left center'
            }
        },opt);
        var _p={}
        switch(_opt.position)
        {
            case 'top':
                _p={
                    my: 'bottom center',
                    at: 'top center'
                }
                break;
            case 'right':
                _p={
                    my: 'left center',
                    at: 'right center'
                }
                break;
            case 'bottom':
                _p={
                    my: 'top center',
                    at: 'bottom center'
                }
                break;
            default:
                _p={
                    my: 'right center',
                    at: 'left center'
                }
                break;
        }

        _opt.position=_p;
        $(obj).qtip(_opt);

    }
    U.tab = function(head,body,opt){
        var _opt= $.extend({
            event:'click',
            filterD:null,
            callback:null,
            defItem:0
        },opt);

        var _hc=$(head).children();
        var _bc=$(body).children();
        var _actIndex=null;

        _hc=_opt.filterD?_hc.not(_opt.filterD):_hc;
        show(_opt.defItem);

        _hc.on(_opt.event,function(e){
            var _id=$(this).index();

            if((!_actIndex&&_actIndex!=0)||_actIndex!=_id){
                show($(this).index());
                _opt.callback&&_opt.callback($(this));
            }
            _actIndex=_id;
            e.preventDefault();

        });
        function show(index){
            _hc.eq(index)
                .addClass('active')
                .siblings().removeClass('active');
            _bc.eq(index).show().siblings().hide();
        }

    };
    /* 多图轮播 */
    U.jcarousel=function(obj,opt){
        $(obj).each(function(){
            var _this=$(this);
            var _opt=$.extend({},opt);
            var slide=$('.slide',_this);
            $(this).slides({
                preload: true,
                generateNextPrev:true,
                animationComplete:function(item){
                    if(slide.size()>1){
                        if(item<=1){
                            _this.find('.prev').hide();
                            _this.find('.next').show();
                        }
                        if(item>=(slide.size())){
                            _this.find('.next').hide();
                            _this.find('.prev').show();
                        }
                    }
                },
                slidesLoaded:function(){
                    if(slide.size()>1){
                        _this.find('.next').show();
                    }
                }
            },_opt);
        });

    }

    U.alertInfo=function(content,p,_callback){
        var _p= $.extend({
            title : '提示',
            buttons : [{
                caption : '取消',
                callback : function(){
                    bDialog.closeCurrent();
                }
            },
            {
                caption : '确定',
                callback : function(){
                    _callback&&_callback();
                }
            }]
        },p);
        eDialog.info(content,_p);
    }

})


/* 初始化js */
$(function(){
    /* 网站顶部内容收缩 */
  /*  $('.dorpdown,.downc').on('mouseover', function () {
        $(this).addClass('active');
    }).on('mouseout', function () {
        $(this).removeClass('active');
    });*/


    $('.order-switch a').click(function () {
        $(this).siblings().removeClass('checked')
            .find('input[type="radio"]').prop('checked', false);
        $(this).addClass('checked')
            .find('input[type="radio"]').prop('checked', true);
    });

   $('.check-switch label').click(function(){
       $(this).addClass('selected').siblings().removeClass('selected');
   });

    if($('.icheck').size()>0){
        //$('.icheck').iCheck();
    }

});