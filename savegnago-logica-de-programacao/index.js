class Heroi{
    constructor(name, idade, tipo){
        this.name = name,
        this.idade = idade,
        this.tipo = tipo
    }
    Atacar(ataque){
        switch (ataque){
            case 'mago': 
                ataque ='usou magia';
                break;
            case 'guerreiro':
                ataque ='usou espada';
                break;
            case 'monge':
                ataque = 'usou artes marciais';
                break;
            case 'ninja':
                ataque = 'usou shuriken';
                break;
            default:
                ataque = 'não reconhecido';
        }
        return`o ${this.tipo} atacou usando ${ataque}`;
    }
}

const heroi = new Heroi('sergio', 22, 'ninja' )
console.log(heroi.Atacar(heroi.tipo))