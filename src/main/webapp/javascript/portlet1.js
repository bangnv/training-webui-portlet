function Portlet1() {
	this.name="Nguyen Viet Bang";
}

Portlet1.prototype.hello = function() {
	alert("Hello from Portlet");
}

_module= new Portlet1();
