# SeeckzIMP

Esse Código é uma implementação básica de um controlador de API REST usando o framework Spring Boot com Java. Ele define um endpoint para a rota "/products", que responde a solicitação GET retornando uma lista de produtos.

Dentro do controller, há um método chamado "getObjects()" que é mapeado para a rota "/products" e é acionado quando uma solicitação GET é feita para essa rota. No método, alguns objetos Departamento e Produto são criados com dados de exemplo.

Os departamentos são criados com IDs e nomes específicos, representando diferentes categorias de produtos, como "Tecnologia", "Vestuário" e "Esportes". Os produtos também são produzidos com IDs, nomes, preços e departamentos associados.

Esses produtos são adicionados a uma lista e, em seguida, a lista é retornada como resposta da solicitação GET. Isso significa que, quando você fizer uma solicitação GET para "/products", a API retornará uma lista contendo esses produtos.

Essa implementação é bastante básica e serve apenas como exemplo para entender como o controlador e os endpoints podem ser definidos usando o Spring Boot.
