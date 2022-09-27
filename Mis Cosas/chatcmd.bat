@echo off 
:A 
Cls 
echo MESSENGER 
set /p n=User: 
set /p m=Message: 
net helpmsg %n% %m% 
Pause 
Goto A