class Aplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Cinza");
        carro1.setModelo("Duster");
        carro1.setcapacidadeTanque(60);
        
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getcapacidadeTanque());
        System.out.println(carro1.calcularAbastecimento(5.15));

        Carro carro2 = new Carro("azul", "kwid", 48);


        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getcapacidadeTanque());
        System.out.println(carro2.calcularAbastecimento(5.15));
    }
}
