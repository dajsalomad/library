package com

class Book {

String title

String author 

String isbn

Date dateBorrowed

Date returnDate

String student

static hasMany=[students:Student]

static belongsTo=Student

String toString(){

"$title, $isbn, $author"
}

    static constraints = {

title()

author()

isbn()

dateBorrowed()

returnDate()

student()

    }
}
