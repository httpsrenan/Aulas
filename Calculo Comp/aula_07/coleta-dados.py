import pandas as pd
import time
import psutil
import datetime
import csv

arquivo_csv = "coletas-dados.csv"

fieldnames = ["user", "timestamp", "cpu", "ram", "disco"]

with open(arquivo_csv, "w", newline="") as file:
    writer = csv.DictWriter(file, fieldnames=fieldnames)
    writer.writeheader()

while True:
    user = "renan"
    timestamp = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    cpu = psutil.cpu_percent(percpu=False)
    ram = psutil.virtual_memory().percent
    disco = psutil.disk_usage('C:\\').percent

    registro = {
        "user" : user,
        "timestamp": timestamp,
        "cpu": cpu,
        "ram": ram,
        "disco": disco
}

    with open(arquivo_csv, "a", newline="") as file:
        writer = csv.DictWriter(file, fieldnames=fieldnames)
        writer.writerow(registro)

    print(f"Capturado: {registro}")
    time.sleep(10)
