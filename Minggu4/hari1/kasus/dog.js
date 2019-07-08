class Dog{
	constructor() {
    this.breed = null
    this.size = null
    this.age = null
    this.color = null
  }

  get Info () {
    return `Breed is: ${this.breed} size is: ${this.size} Age is: ${this.age} color is: ${this.color} `
  }

}

const dog = new Dog()
		    dog.breed="Maltese";
        dog.size="Small";
        dog.age=2;
        dog.color="white";

console.log(dog.Info)