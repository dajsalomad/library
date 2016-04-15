package com

class Student {

String name

String email

String studentid

Course course

static hasMany=[books:Book]

Librarian librarian

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
