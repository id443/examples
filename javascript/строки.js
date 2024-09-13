let lastName = "Иванов";
var firstName = "Иван";
middleName = "Иванович";
console.log(`${lastName}, ${firstName} ${middleName}`);

const string = "Restaurants in Hanalei";
const urlFriendly = "";
for (var i = 0; i < string.length; i++) {
  if (string[i] === " ") {
    urlFriendly += "-";
  } else {
    urlFriendly += string[i];
  }
}
console.log(urlFriendly);
