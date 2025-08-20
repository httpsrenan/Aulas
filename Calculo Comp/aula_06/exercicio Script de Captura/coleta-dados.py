import pandas as pd
import time
import psutil
import datetime

while True:
    dados = {
    "timesnap" : [datetime.datetime.now().strftime("%d-%m-%Y %H:%M:%S")],
    "cpu" : [psutil.cpu_percent(percpu=False)],
    "ram" : [psutil.virtual_memory().percent],
    "disco" : [psutil.disk_usage('C:\\').percent]
    }

    df = pd.DataFrame(dados)
    
    df.to_csv("coletas-dados.csv", encoding="utf=-8",mode="a")

    time.sleep(10)

    print(dados)