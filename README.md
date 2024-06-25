test:

GET: localhost:8080/api/v1/webapp  //список из БД

POST: localhost:8080/api/v1/webapp/save_machine // Добавление в БД
body: {
    "name": "name",
    "weight": "weight",
    "description": "desc"
}

GET: localhost:8080/api/v1/webapp/{name}  // Поиск по /{name}


PUT: localhost:8080/api/v1/webapp/update // Изменять значение
{
    "id": 1,
    "name": "name",
    "weight": "weight",
    "description": null
}

DEL: localhost:8080/api/v1/webapp/delete_machine/{name} //удаление по {name}
