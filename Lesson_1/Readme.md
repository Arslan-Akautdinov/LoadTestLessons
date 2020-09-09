# Урок 1-2

## План занятия

- ToolPanel.
- CVS.
- Controllers.
    - if
    - foreach | while
    - loop
- Finding, JsonPath.
- Plugin manager.
- SSHFMon.
- NON-GUI.
- Web reports.

<br>

## Исходники

**Lesson.jmx** - Файл тестового сценария. <br>
**env_1.cvs** - Файл конфигураций для запуска с авторизацией <br>
**env_2.cvs** - Файл конфигурации для запкска без авторизации <br>

<br>

## Ссылки

Сервис для тестирования: </br>
https://github.com/Arslan-Akautdinov/template_flask_api_service

Plugin manager: </br>
https://jmeter-plugins.org/install/Install/

Jmetr: </br>
https://jmeter.apache.org/download_jmeter.cgi

SSHFMon:

<br>

## Комнды

Запуск тестов в non-gui и выгрузка отчета: <br>
> jmeter -n -t [jmx file] -l [results file] -e -o [Path to web report folder]

if controller пример проверки на groovy: <br>
> ${__groovy("${var}"=="false")}

<br>

## SSHMon

CPU:<br>
> sar -u 1 1 | awk '/^Average:/{print 100-$8}'

file size
> wc -c /app/data/articles.json  | awk '{print $1}'

MEM in use
> free | grep Mem | awk '{print $3/$2 * 100.0}'

Disk space u