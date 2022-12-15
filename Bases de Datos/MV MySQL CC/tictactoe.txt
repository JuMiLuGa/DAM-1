@echo off
setLocal EnableDelayedExpansion
:newgame
cls
echo TIC-TAC-TOE
echo Written by Benjamin McLean
echo.
echo Controls:
echo|set /p="7 | 8 | 9"
echo.
echo --+---+--
echo|set /p="4 | 5 | 6"
echo.
echo --+---+--
echo|set /p="1 | 2 | 3"
echo.
echo.
set /a X=1
set /a O=2
set /a winner=0
:numberofplayers
set /P players="Number of players? (0-2) "
if %players% == 0 goto :validplayernumber
if %players% == 1 goto :validplayernumber
if %players% == 2 goto :validplayernumber
echo Invalid entry.
echo.
goto :numberofplayers
:validplayernumber

set /a human=0
if not %players% == 1 goto :humanset
set /P human="Human player gets X or O? "
if "%human%" == "X" set /a human=%X%
if "%human%" == "x" set /a human=%X%
if "%human%" == "O" set /a human=%O%
if "%human%" == "o" set /a human=%O%
if %human% == %X% goto :humanset
if %human% == %O% goto :humanset
echo Unknown entry.
echo|set /p="Choosing random human player: "
set /a human=%random% %% 2 + 1
call :drawsquare %human%
echo.
:humanset

set /P player="Who goes first? X or O? "
if "%player%" == "X" set /a player=%X%
if "%player%" == "x" set /a player=%X%
if "%player%" == "O" set /a player=%O%
if "%player%" == "o" set /a player=%O%
if %player% == %X% goto :firstset
if %player% == %O% goto :firstset
echo Unknown entry.
echo|set /p="Choosing random first player: "
set /a player=%random% %% 2 + 1
call :drawsquare %player%
echo.
:firstset

rem Clearing the board
for /l %%i in (1, 1, 9) do set /a BOARD%%i=0

:mainloop
set /a move=0
if %players% == 2 goto :callhumanmove
if %players% == 1 if %human% == %player% goto :callhumanmove
call :computermove %player%
goto :donemoving
:callhumanmove
call :humanmove %player%
:donemoving

call :checkstalemate
call :checkwinner 1
call :checkwinner 2
if not %winner% == 0 goto :youwon
if %move% == 0 (
 echo Goodbye.
 pause
 goto :eof
)
if %player% == %X% (set /a player=%O%) else set /a player=%X%
goto :mainloop

:youwon
call :drawboard
if %winner% == -1 (
echo It's a draw.
) else (
echo|set /p="Winner: "
call :drawsquare %winner%
echo.
)
pause
goto :eof



:checkwinner
 if not %BOARD1% == %1 goto :checkwinner1done
 if %BOARD2% == %1 if %BOARD3% == %1 (
  set /a winner=%1
  goto :eof
 )
 if %BOARD5% == %1 if %BOARD9% == %1 (
  set /a winner=%1
  goto :eof
 )
 if %BOARD4% == %1 if %BOARD7% == %1 (
  set /a winner=%1
  goto :eof
 )
:checkwinner1done
 if not %BOARD5% == %1 goto :checkwinner5done
 if %BOARD4% == %1 if %BOARD6% == %1 (
  set /a winner=%1
  goto :eof
 )
 if %BOARD2% == %1 if %BOARD8% == %1 (
  set /a winner=%1
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD7% == %1 (
  set /a winner=%1
  goto :eof
 )
:checkwinner5done
 if not %BOARD9% == %1 goto :eof
 if %BOARD7% == %1 if %BOARD8% == %1 (
  set /a winner=%1
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD6% == %1 (
  set /a winner=%1
  goto :eof
 )
 goto :eof



:checkstalemate
 for /l %%i in (0, 1, 9) do (
  if !BOARD%%i! == 0 goto :eof
 )
 set /a winner=-1
 goto :eof



:drawboard
 call :drawsquare %BOARD7%
 echo|set /p="| "
 call :drawsquare %BOARD8%
 echo|set /p="| "
 call :drawsquare %BOARD9%
 echo.
 echo --+---+--
 call :drawsquare %BOARD4%
 echo|set /p="| "
 call :drawsquare %BOARD5%
 echo|set /p="| "
 call :drawsquare %BOARD6%
 echo.
 echo --+---+--
 call :drawsquare %BOARD1%
 echo|set /p="| "
 call :drawsquare %BOARD2%
 echo|set /p="| "
 call :drawsquare %BOARD3%
 echo.
 goto :eof



:drawsquare
 if %1 == %X% (
  echo|set /p="X "
 ) else if %1 == %O% (
  echo|set /p="O "
 ) else (
  echo|set /p=". "
 )
 goto :eof



:humanmove
 call :drawboard
 echo|set /p="Human player "
 call :drawsquare %1
 set /P move="- your move? (1-9) "
 if %move% == 0 goto :eof
 for /l %%i in (0, 1, 9) do (
  if %move% == %%i if !BOARD%%i! == 0 goto :validhumanmove
 )
 echo Invalid move.
 echo.
 goto :humanmove
:validhumanmove
 set /a BOARD%move%=%1
 goto :eof



:checkalmost
 set /a almost=0 
 set /a almostwho = %1
 if not %BOARD1% == %1 goto :checkalmost1done
 if %BOARD2% == %1 if %BOARD3% == 0 (
  set /a almost=3
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD2% == 0 (
  set /a almost=2
  goto :eof
 )
 if %BOARD5% == %1 if %BOARD9% == 0 (
  set /a almost=9
  goto :eof
 )
 if %BOARD9% == %1 if %BOARD5% == 0 (
  set /a almost=5
  goto :eof
 )
 if %BOARD4% == %1 if %BOARD7% == 0 (
  set /a almost=7
  goto :eof
 )
 if %BOARD7% == %1 if %BOARD4% == 0 (
  set /a almost=4
  goto :eof
 )

:checkalmost1done
 if not %BOARD1% == 0 goto :checkalmostnot1done
 if %BOARD2% == %1 if %BOARD3% == %1 (
 set /a almost=1
 goto :eof
 )
 if %BOARD4% == %1 if %BOARD7% == %1 (
 set /a almost=1
 goto :eof
 )
 if %BOARD5% == %1 if %BOARD9% == %1 (
 set /a almost=1
 goto :eof
 )

:checkalmostnot1done
 if not %BOARD5% == %1 goto :checkalmost5done
 if %BOARD4% == %1 if %BOARD6% == 0 (
  set /a almost=6
  goto :eof
 )
 if %BOARD6% == %1 if %BOARD4% == 0 (
  set /a almost=4
  goto :eof
 )
 if %BOARD2% == %1 if %BOARD8% == 0 (
  set /a almost=8
  goto :eof
 )
 if %BOARD8% == %1 if %BOARD2% == 0 (
  set /a almost=2
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD7% == 0 (
  set /a almost=7
  goto :eof
 )
 if %BOARD7% == %1 if %BOARD3% == 0 (
  set /a almost=3
  goto :eof
 )

:checkalmost5done
 if not %BOARD5% == 0 goto :checkalmostnot5done
 if %BOARD4% == %1 if %BOARD6% == %1 (
  set /a almost=5
  goto :eof
 )
 if %BOARD2% == %1 if %BOARD8% == %1 (
  set /a almost=5
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD7% == %1 (
  set /a almost=5
  goto :eof
 )

:checkalmostnot5done
 if not %BOARD9% == %1 goto :checkalmost9done
 if %BOARD7% == %1 if %BOARD8% == 0 (
  set /a almost=8
  goto :eof
 )
 if %BOARD8% == %1 if %BOARD7% == 0 (
  set /a almost=7
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD6% == 0 (
  set /a almost=6
  goto :eof
 )
 if %BOARD6% == %1 if %BOARD3% == 0 (
  set /a almost=3
  goto :eof
 )
:checkalmost9done
 if not %BOARD9% == 0 goto :eof
 if %BOARD7% == %1 if %BOARD8% == %1 (
  set /a almost=9
  goto :eof
 )
 if %BOARD3% == %1 if %BOARD6% == %1 (
  set /a almost=9
  goto :eof
 )
 goto :eof



:computermove
 call :drawboard
 echo|set /p="Computer player "
 call :drawsquare %1
 echo|set /p="move."
 echo.
 pause
 set /a move=0
 
 if %1 == 2 goto :computercheckalmost2
 call :checkalmost 1
 call :movealmost %1
 if not %move% == 0 goto :eof
 call :checkalmost 2
 call :movealmost %1
 if not %move% == 0 goto :eof
 goto :computercheckalmost2done
:computercheckalmost2
 call :checkalmost 2
 call :movealmost %1
 if not %move% == 0 goto :eof
 call :checkalmost 1
 call :movealmost %1
 if not %move% == 0 goto :eof
:computercheckalmost2done

 if not %BOARD5% == 0 goto :computernotmoving5
 set /a move=5
 set /a BOARD%move%=%1
 goto :eof

:computernotmoving5
 set /a blanks=0
 for /l %%i in (1, 1, 9) do (
  if !BOARD%%i! == 0 set /a blanks=blanks + 1
 )
 set /a blank=%random% %% %blanks%
 set /a countup=0
:randomloop
 set /a countup=countup + 1
 if !BOARD%countup%! == 0 (
  set /a blank=blank - 1
  if %blank% == 0 (
   set /a move=%countup%
   goto :randomloopover
  )
 )
 goto :randomloop
:randomloopover
 set /a BOARD%move%=%1
 goto :eof

:movealmost
 if %almost% == 0 goto :eof
 set /a move=almost
 set /a BOARD%move%=%1
 goto :eof