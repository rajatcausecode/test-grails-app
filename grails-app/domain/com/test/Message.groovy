package com.test

class Message {

	String name
	String email
	String address
	String message

    static constraints = {
    	name blank: false
    	email blank: false
    	address blank: false
    	message blank: false
    }
}
