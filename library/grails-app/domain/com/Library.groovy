package com

class Library {

String location

String openingHours

static hasMany=[librarians:Librarian,books:Book,students:Student]

Librarian librarian

String toString(){

"$librarian, $location"
}
    static constraints = {

location()

openingHours()

    }
}
