/**
 * Created by Apurbo on 11/18/2016.
 */


personalInformationValidMsg = {
    userName: 'select correct user'
};

personalInformation = (function () {

    "use strict";
    var formId = "#frmPersonalInformation";

    function _baseURL() {
        var location = window.location.protocol + '//' + window.location.host
        return location+"/personalInformation"
    }




    $( function() {
        $( "#datepicker" ).datepicker({
            changeMonth: true,
            changeYear: true
        });
    } );


    function savePersonalInfo() {
        $('.form-group').validate({
            submitHandler: function (form) {
                var data = $(form).serializeArray();
                $.ajax({
                    url: "/savePersonalInfo",
                    type: 'POST',
                    data: data,
                    cache: false,
                    success: function (res) {
                        if (res.status == 1) {
                            console.log("Success");
                            successMsg(res.text);
                        } else {
                            errorMsg(res.text);
                        }
                    }

                });
            }
        });
    }



    return {
        savePersonalInfo:savePersonalInfo

    };
})();
$(document).ready( function () {
    personalInformation.savePersonalInfo();
    console.log("OK");

    $("#personalIdNumber").on('blur',function () {
        console.log("work");
    });
    console.log($('#personalIdNumber').val());
});