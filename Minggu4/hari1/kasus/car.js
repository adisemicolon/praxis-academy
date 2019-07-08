class Car {
  constructor() {
    this._color = null
  
  }

  get color () {
    return `Warna Mobilnya adalah ${this._color}`
  }

  set color (color) {
    this._color = `${color} keren`
  }

}

const car = new Car()

car.color = 'merah'

console.log(car.color)