Требования к системе "Чятик".

# Метафора
Быстрый и лаконичный консольный чат для поклонников CLI.


# Функциональные требования

## Посылка сообщения
### User Story
Я, как пользователь, хочу послать сообщение, чтобы его увидели другие пользователи чата.
### Acceptance Test
#### Given
- Запущены клиентское и серверное приложения.
#### When
- Я печатаю и отсылаю сообщение в чат с помощью команды "/snd <сообщение>"
#### Then
- Я вижу свое сообщение с датой и временем.
- Другие пользователи видят мое сообщение с датой и временем.

## Просмотр полной истории
### User Story
Я, как пользователь, хочу видеть все сообщения за все время существования чата, чтобы найти нужное мне сообщение.
### Acceptance Test
#### Given
- Запущены клиентское и серверное приложения.
#### When
- Я ввожу команду "/hist".
#### Then
- Я вижу полный список всех сообщений чата с датой и временем.


# Нефункциональные требования

## Usability
- Процесс ввода сообщения не должен прерываться приходящими сообщениями.
- Запуск клиента одним скриптом.
- Запуск сервера одним скриптом.
- Лаконичный простой консольный интерфейс.
- Для лаконичности размер сообщения ограничен 150 символов.

## Performance
- Система должна гарантировать throughput 0,1k сообщений в секунду (без учета сетевой latency).
- Система должна гарантировать response time не более 0.2 сек
- Система должна гарантировать емкость до 1k работающих одновременно пользователей.