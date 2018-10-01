/**
 * Created by Apurbo on 12/8/2016.
 */

var loadScript= function () {
    if(document.URL.search(personalInformation)>1){
        scriptLoader("/personalInformation");
    }
};

var scriptLoader = function (url) {
    url = '/resources/js/ems'+url+'.js';
 $.ajax({
     url:url,
     type:'POST',
     dataType:"script",
     cache:false
 });
};
