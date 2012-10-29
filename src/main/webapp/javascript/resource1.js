function Person() {
	this.name="Nguyen Viet Bang";
}

Person.prototype.hello = function() {
	alert("Hello from person");
}

_module= new Person();