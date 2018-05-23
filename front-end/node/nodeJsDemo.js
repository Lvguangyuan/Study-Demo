'use strict';

var http = require('http');
var url = require('url');
var fs = require('fs');
var port = 8080;

var server = http.createServer(function(request, response){
	
	console.log(request.method + ' : ' + request.url);
	
	console.log(url.parse(request.url));
	
	fs.stat('sample.txt', function (err, stat) {
    if (err) {
        console.log(err);
    } else {
        console.log('isFile: ' + stat.isFile());
        console.log('isDirectory: ' + stat.isDirectory());
        if (stat.isFile()) {
            console.log('size: ' + stat.size);
            console.log('birth time: ' + stat.birthtime);
            console.log('modified time: ' + stat.mtime);
        }
    }
});
	
	response.writeHead(200, {'Content-type':'text/html'});
	response.end('<h1>Hello World!</h1>');
	
});

server.listen(port);

console.log('Server is running at ' + port);