function CalculadoradePartidasRankeadas(vitorias, derrotas) {
    let saldo = vitorias - derrotas;
    let nivel;

    if (saldo < 10) {
        nivel = "Ferro";
    } else if (saldo >= 10 && saldo < 20) {
        nivel = "Bronze";
    } else if (saldo >= 20 && saldo < 50) {
        nivel = "Prata";
    } else if (saldo >= 50 && saldo < 80) {
        nivel = "Ouro";
    } else if (saldo >= 80 && saldo < 90) {
        nivel = "Diamante";
    } else if (saldo >= 90 && saldo < 100) {
        nivel = "Lendário";
    } else {
        nivel = "Imortal";
    }

    return `O Herói tem de saldo de ${saldo} está no nível de ${nivel}`;
}

console.log(CalculadoradePartidasRankeadas(29, 69));
