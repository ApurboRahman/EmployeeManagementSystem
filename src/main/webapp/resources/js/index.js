/**
 * Created by Apurbo on 11/17/2016.
 */
function Employee() {
    var that = this;
    that.FirstName = ko.observable("");
    that.LastName = ko.observable("");
    that.FullName = ko.computed(function () {
        return that.FirstName() + " " + that.LastName();
    });
    that.DateOfBirth = ko.observable("");
    that.EducationList = ko.observableArray();
    that.Gender = ko.observable("0");
    that.DepartmentList = ko.observableArray([{ Id: '0', Name: "CSE" }, { Id: '1', Name: "MBA" }]);
    that.DepartmentId = ko.observable("1");
}