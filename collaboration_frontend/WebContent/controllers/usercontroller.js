/**
 * UserController
 */
app.controller('UserController',function($scope,UserService,$location){
	$scope.register=function(){
		UserService.register($scope.user).then(
		 function(response){
			alert('Registered successfully.. please login..')
			$location.path('/login')
		 }
		,function(response){
			$scope.error=response.data  //ErrorClazz object
		})
	}
})