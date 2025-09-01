# Criação dos portfólios
port_ativa = {'B3', 'Bradesco', 'BB Seguridade', 'BR Distribuidora', 'Taesa', 'СТЕЕР', 'Vale', 'Telefônica Brasil'}

port_elite = {'Bradesco', 'BB Seguridade', 'Banrisul', 'Engie', 'Itaúsa', 'Sanepar', 'Taesa', 'СТЕЕР', 'Telefônica Brasil', 'Vale'}

port_futura = {'B3', 'Cyrela', 'Gerdau', 'Vivo', 'СТЕЕР'}

port_genial = {'CPFL', 'Minerva', 'Cyrela', 'Randon', 'СТЕЕР'}

# Vendo se possui algo em comum
comum = port_ativa.intersection(port_elite, port_futura, port_genial)
print('Oque é comum entre os portfólios: ', comum)
print('\n')

# Criando variavel unindo todas
un_sem_ativa = port_elite | port_futura | port_genial
un_sem_futura = port_ativa | port_elite | port_genial
un_sem_genial = port_ativa | port_elite | port_futura
un_sem_elite = port_ativa | port_futura | port_genial

# Vendo se tem ações unicas
so_ativa = port_ativa - un_sem_ativa
so_elite = port_elite - un_sem_elite
so_futura = port_futura - un_sem_futura
so_genial = port_genial - un_sem_genial

print('Contratos apenas da Ativa: ', so_ativa)
print('Contratos apenas da Elite: ', so_elite)
print('Contratos apenas da Futura: ', so_futura)
print('Contratos apenas da Genial: ', so_genial)
print('\n')

# Relações entre os portfólios das corretoras
sub_ativa = port_ativa.issubset(un_sem_ativa)
sub_elite = port_elite.issubset(un_sem_elite)
sub_futura = port_futura.issubset(un_sem_futura)
sub_genial = port_genial.issubset(un_sem_genial)

print('Subconjunto Ativa: ', sub_ativa)
print('Subconjunto Elite: ', sub_elite)
print('Subconjunto Futura: ', sub_futura)
print('Subconjunto Genial: ', sub_genial)
print('\n')

super_ativa = port_ativa.issuperset(un_sem_ativa)
super_elite = port_elite.issuperset(un_sem_elite)
super_futura = port_futura.issuperset(un_sem_futura)
super_genial = port_genial.issuperset(un_sem_genial)

print('Superconjunto Ativa: ', super_ativa)
print('Superconjunto Elite: ', super_elite)
print('Superconjunto Futura: ', super_futura)
print('Superconjunto Genial: ', super_genial)
print('\n')

# Conjunto de ações únicos de cada corretora
so_ativa = port_ativa - un_sem_ativa
so_elite = port_elite - un_sem_elite
so_futura = port_futura - un_sem_futura
so_genial = port_genial - un_sem_genial

print('Contratos apenas da Ativa: ', so_ativa)
print('Contratos apenas da Elite: ', so_elite)
print('Contratos apenas da Futura: ', so_futura)
print('Contratos apenas da Genial: ', so_genial)