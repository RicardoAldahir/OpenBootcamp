var array = [10, 5, 8, 2, 4, 1, 3, 9, 6];
var target = 3;
var n = 0;

var sumaDeDosNumeros = function (array, target) {
    let resultado = [];
    let numeroposicion = [];
    let suma = 0;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length; j++) {
        suma = array[i] + array[j];
            if (suma === target) {
                resultado.push(array[i], array[j]);
                numeroposicion.push(i, j);
                return resultado+" ---- "+numeroposicion;
            }
        }
    }
}

var objetivo = function (array, target) {
    let resultado = [];
    for (let i = 0; i < array.length; i++) {
        let suma = target - array[i];
        let index = array.indexOf(suma);
        if (index !== -1) {
            resultado.push(array[i], suma);
            return resultado;
        }
    }
}

var buscarnum = (array, target)=>{
    if (target == array[n]) {
        return array[n];
    } else {
        return buscarnum(array[n+1], target);
    }
}


console.log(buscarnum(array, target, n));
//console.log(sumaDeDosNumeros(array, target));
//console.log(objetivo(array, target));
