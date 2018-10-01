personalInformationDao.personalInformationDetails=SELECT \
	 A.PERSONAL_ID_NUMBR as personalIdNumber ,\
	 A.FIRSTNAME+' '+A.MIDDLENAME+' '+A.LASTNAME as firstName,\
	 A.DATEOFBIRTH as dateOfBirth,\
	 A.CELLPHONE as cellPhone,\
	 A.HOMEPHONE as homePhone,\
	 A.EMAIL as email,\
	 A.ADDRESS as address,\
	 A.CITY as city,\
	 A.POSTALCODE as postalCode,\
	 A.GENDER as gender,\
	 A.MARITALSTATUS as maritalStatus \
 FROM PERSONALINFORMATION A
