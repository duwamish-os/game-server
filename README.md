game-server
-----------

run app
-------

```
sbt run
```

```bash

curl localhost:9000/api/game/1 | python -m json.tool


{
    "correlationID": "1",
    "scores": [
        {
            "player": "upd",
            "score": "1000"
        },
        {
            "player": "dude",
            "score": "999"
        }
    ]
}

```