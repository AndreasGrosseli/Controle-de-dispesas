@echo off
cd /d "%~dp0"

javac "Controle de despesas\ControleDespesas.java"
java -cp "Controle de despesas" ControleDespesas
