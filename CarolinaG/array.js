// function diffArray(arr1, arr2) {
//   return arr1.filter((dato) => {
//     if (arr2.includes(dato)) {
//       return false;
//     } else {
//       return true;
//     }
//   });
// }


function diffArray(arr1, arr2) {
  let respuesta = [];

  for (let i = 0; i < arr1.length; i++) {
    let no_existe_en_arr2 = true;
    for (let j = 0; j < arr1.length; j++) {
      if (arr1[i] === arr2[j]) {
        no_existe_en_arr2 = false;
        break;
      }
    }

    if (no_existe_en_arr2) {
      respuesta.push(arr1[i]);
    }
  }

  return respuesta;
}

let a = [8, 7, 9, 3, 1];
let b = [1, 2, 3, 4, 5];
let c = [2, 6, 47, 8, 4];

console.log(diffArray(c, a));

