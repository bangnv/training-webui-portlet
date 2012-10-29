function Module() {
	this.name="Nguyen Viet Bang";
}

Module.prototype.hello = function() {
	alert("Hello from Module immediate ");
}

Module= new Module();

