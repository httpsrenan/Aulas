import psutil

for i in range (1, 2):
    cpu = psutil.cpu_percent(interval= 2 ,percpu=False)

    print(cpu)

ram = psutil.virtual_memory().percent

print(ram)

disco = psutil.disk_usage('C:\\').percent

print(disco)