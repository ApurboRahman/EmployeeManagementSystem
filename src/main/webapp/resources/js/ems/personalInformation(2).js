/**
 * Created by md.rahman on 12/7/2016.
 */

personalInformationValidMsg = {
    userName: 'select correct user'
};

personalInformation = (function () {
    "use strict";
    var formId = "#frmPersonalInformation";

    function _baseURL() {
        var location = window.location.protocol + '//' + window.location.host + 'ems.web/'
        return "FolderLocation" + "personalInformation/"
    }

    function savePersonalInfo(){
        $('.globalForm').validate({
            submitHandler: function(form){
                var data = $(form).serialieArray();
                $.ajax({
                    url:_baseURL()+"save",
                    type: 'POST',
                    data:data,
                    cache: false,
                    success:function(res){
                        if(res.status==1){
                            console.log("Success");
                            successMsg(res.text);
                        }else {
                            errorMsg(res.text);
                        }
                    }

                });
            }
        });
    }
function getPersonalInformationInfo(){
    $('#personalId').on('blur',function(){
        var pId = $('#personalId').val().trim();

        $.ajax({
            url:_baseURL()+'getPersonalInfo',
            type:'GET',
            data:pId,
            success:function(res){
                if(res.dto){

                }
                if(res.text){
                    if(res.status==1){
                        successMsg(res.text);
                    }else {
                        errorMsg(res.text);
                    }
                }
            }
        })
    });
}
    function setPersonalID() {
        $('#persoanlId').val();
        $('#persoalId').hide();
    }


    return {
        setPersonalID: setPersonalID
    };
})();

$(document).ready(function () {
    personalInformation.setPersonalID();
});