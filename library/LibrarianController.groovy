def login() {

if (params.cName)

return [cName:params.cName, aName:params.aName]
}

def validate(){

def user = Leader.findByUserName(params.username)

if (user && user.password == params.password){

session.user = user

if (params.cName)

redirect controller:params.cName, action:params.aName

else

redirect controller;'library', action:'index'

}else{

flash.message = "invalid username and password."

render view:'login'

}

}

def logout = {

session.user = null
redirect(url:'/')

}
