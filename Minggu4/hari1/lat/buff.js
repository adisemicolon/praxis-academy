// buf = new Buffer(26);
// for (var i = 0 ; i < 26 ; i++) {
//   buf[i] = i + 97;
// }

// console.log( buf.toString('ascii'));       // outputs: abcdefghijklmnopqrstuvwxyz
// console.log( buf.toString('ascii',0,5));   // outputs: abcde
// console.log( buf.toString('utf8',0,5));    // outputs: abcde
// console.log( buf.toString(undefined,0,5)); // encoding defaults to 'utf8', outputs abcde

// var json = buf.toJSON(buf);

//console.log(json);

// var buffer2 = new Buffer('ABC');
// var buffer1 = new Buffer('ABCD');
// var result = buffer1.compare(buffer2);

// if(result < 0) {
//    console.log(buffer1 +" comes before " + buffer2);
// } else if(result === 0) {
//    console.log(buffer1 +" is same as " + buffer2);
// } else {
//    console.log(buffer1 +" comes after " + buffer2);
// }

// var fs = require("fs");
// var data = '';

// // Create a readable stream
// var readerStream = fs.createReadStream('anu.txt');

// // Set the encoding to be utf8. 
// readerStream.setEncoding('UTF8');

// // Handle stream events --> data, end, and error
// readerStream.on('data', function(chunk) {
//    data += chunk;
// });

// readerStream.on('end',function() {
//    console.log(data);
// });

// readerStream.on('error', function(err) {
//    console.log(err.stack);
// });

// console.log("Program Ended");


// var fs = require("fs");
// var data = 'Simply Easy Learning';

// // Create a writable stream
// var writerStream = fs.createWriteStream('output.txt');

// // Write the data to stream with encoding to be utf8
// writerStream.write(data,'UTF8');

// // Mark the end of file
// writerStream.end();

// // Handle stream events --> finish, and error
// writerStream.on('finish', function() {
//    console.log("Write completed.");
// });

// writerStream.on('error', function(err) {
//    console.log(err.stack);
// });

// console.log("Program Ended

var fs = require("fs");

// Create a readable stream
var readerStream = fs.createReadStream('anu.txt');

// Create a writable stream
var writerStream = fs.createWriteStream('output.txt');

// Pipe the read and write operations
// read input.txt and write data to output.txt
readerStream.pipe(writerStream);

console.log("Program Ended");