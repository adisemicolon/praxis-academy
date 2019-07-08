/*var fs = require("fs");
var data = fs.readFileSync('anu.txt');

console.log(data.toString());
console.log("Program Ended");*/

var fs = require("fs");

fs.readFile('anu.txt', function (err, data) {
   if (err) return console.error(err);
   console.log(data.toString());
});

console.log("Program Ended");