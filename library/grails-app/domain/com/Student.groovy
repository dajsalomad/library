package com

class Student {

String name

String email

String studentid

String course

String toString(){

"$studentid, $email"

}
    static constraints = {

name()

email()

studentid()

course()
    }
}
