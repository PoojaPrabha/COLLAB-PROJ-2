/**
 * UserService
 */
app.factory('UserService',function($http){
	var userService={}
	
	var BASE_URL = "http://localhost:8085/collaboration_middleware"
	
	userService.register=function(user){
	 return $http.post(BASE_URL + "/register",user)
	}
	
	
	return userService;
})