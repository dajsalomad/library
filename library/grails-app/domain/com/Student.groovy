package com

class Student {

String name

String email

String studentid

Course course

static hasMany=[books:Book]

static belongsTo=Book

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
