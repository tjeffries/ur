#!/sru/bin/env python

#cgitb pushes python errors to webpage for debugging
import cgi
import cgitb
import datetime

cgitb.enable()

print 'Content-Type: text.html'
print

print '''<html>
	<head>
		<title>Python Page</title>
	</head>
	<body>
		This is a webpage!
	</body>
<html>
'''

#<form method="post" action="/cgi-bin/lecture03-demo.py">


