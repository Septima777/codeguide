#Codeguide 
##By Noppawan Kulchol (5910545728)
##Useful references:
Code Complete, 2E by Steve McConnell.
CLICK  <a href="http://testa.roberta.free.fr/My%20Books/Computer%20programming/Java/Code%20Complete%20%20Second%20Edition%20By%20Steve%20Mcconnell%20(Microsoft%20Press%202004).pdf">HERE</a>

##Guidance for writing good code:
##1.Don’t expose member data in public
Exposing member data is a violation of encapsulation and limits your control over the abstraction.As Arthur Riel points out, a Point class that exposes 
float x;
float y;
float z;
is violating encapsulation because client code is free to monkey around with Point’s data, and Point won’t necessarily even know when its values have been changed (Riel 1996). However, a Point class that exposes
float X();
float Y();
float Z();
void SetX( float x );
void SetY( float y );
void SetZ( float z ); 
is maintaining perfect encapsulation. You have no idea whether the underlying 
implementation is in terms of floats x, y, and z, whether Point is storing those items as doubles and converting them to floats, or whether Point is storing them on the moon and retrieving them from a satellite in outer space.

##2.Initialize all member data in all constructors, if possible 
Initializing all data members in all constructors is an inexpensive defensive programming practice.

private String name;
private String address;
private String tel;

public Hospital(String name, String address){
     this.name = name;
     this.address = address;
     this.tel = tel; // tel is not appear in param but we also initailize it.
}

public Hospital(String name, String address, String tel){
     this.name = name;
     this.address = address;
     this.tel = tel;
}


