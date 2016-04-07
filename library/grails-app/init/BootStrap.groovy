import com.*

class BootStrap {

    def init = { servletContext ->

def student1=new Student(

name:'John Smith',

email:'js@email.com',

studentid:'b345278',

course:'Web Systems Design').save()


def student2=new Student(

name:'Fred Bloggs',

email:'fb@email.com',

studentid:'b647858',

course:'System security').save()


def student3=new Student(

name:'Joe Leopard',

email:'jl@email.com',

studentid:'b75869',

course:'Business management').save()


def library1=new Library(

location:'Coventry',

openingHours:'9am to 5pm',

book:'Web Design for dummies',

student:'John Smith',

librarian:'Mrs Theresa Throne').save()


def library2=new Library(

location:'Barnsley',

openingHours:'9am to 5pm',

book:'System security for dummies',

student:'Fred Bloggs',

librarian:'Mr Alex Fox').save()


def library3=new Library(

location:'Rotherham',

openingHours:'9am to 5pm',

book:'Business management for dummies',

student:'Joe Leopard',

librarian:'Miss Sarah Smith').save()


def librarian1=new Librarian(

name:'Mrs Theresa Thorne',

email:'tt@email.com',

userName:'ttrs45',

password:'secret',

telephone:'0142573892').save()



def librarian2=new Librarian(

name:'Mr Alex Fox',

email:'af@email.com',

userName:'htsg45',

password:'secret',

telephone:'01342627384').save()



def librarian3=new Librarian(

name:'Miss Sarah Smith',

email:'ss@email.com',

userName:'hgio2',

password:'secret',

telephone:'0164856902').save()


def book1=new Book(

title:'Web Design for dummies',

author:'Mr James Nill',

isbn:'ghdjyu38583j2bj',

dateBorrowed:new Date('30/04/1996'),

returnDate:new Date('04/05/1996'),

student:'John Smith').save()


def book2=new Book(

title:'System security for dummies',

author:'Mrs Claire Wills',

isbn:'dshdfvdj34542j',

dateBorrowed:new Date('07/09/2003'),

returnDate:new Date('15/09/2003'),

student:'Joe Leopard').save()


def book3=new Book(

title:'Business management for dummies',

author:'Mr Newlove Benson',

isbn:'dfjgfh4jui55',

dateBorrowed:new Date('28/02/2004'),

returnDate:new Date('05/03/2004'),

student:'Fred Bloggs').save()


def course1=new Course(

title:'Business management',

code:'IMST345M',

tutor:'Joe Jojo',

department:'Computing',

description:'''Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.''').save()


def course2=new Course(

title:'System Security',

code:'YHGR345',

tutor:'Will Smith',

department:'System security',

description:'''Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.''').save()


def course3=new Course(

title:'Web Design',

code:'GYHR3457',

tutor:'John Bloggs',

department:'Web Design',

description:'''Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.''').save()

    }
    def destroy = {
    }
}
