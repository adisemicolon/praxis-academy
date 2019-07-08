class Account{
	constructor(){
		this.a = 0
		this.b = 0
	}
	setData(c,d){
		 this.a = c
		 this.b = d
	}

	info(){
		console.log(`Value of a = ${this.a}`)
   		console.log(`Value of b = ${this.b}`)
	}
}
 	let obj = new Array() 
    obj[0] = new Account()
     obj[1] = new Account()
    obj[0].setData(1,2)
    obj[1].setData(3,4)
    console.log('For Array Element 0')
    obj[0].info()
    console.log('For Array Element 1')
     obj[1].info()
