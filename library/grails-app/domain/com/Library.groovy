package com

class Library {

String location

String openingHours

String book

String student

String librarian

String toString(){

"$librarian, $location"
}
    static constraints = {

location()

openingHours()

book()

student()

librarian()
    }
}
