const lordify = (firstName, land) => `${firstName} of ${land}`;
console.log(lordify("Don", "Piscataway")); // Don of Piscataway
console.log(lordify("Todd", "Schenectady"));

const lordify2 = (firstName, land) => {
  if (!firstName) {
    throw new Error("A firstName is required to lordify");
  }
  if (!land) {
    throw new Error("A lord must have a land");
  }
  return `${firstName} of ${land}`;
};
console.log(lordify2("Kelly", "Sonoma")); // Kelly of Sonoma
//console.log(lordify2("Dave")); // ! ОШИБКА JAVASCRIPT

const person = (firstName, lastName) => ({
  first: firstName,
  last: lastName,
});
console.log(person("Flad", "Hanson"));

console.log(this);

const tahoe = {
  mountains: ["Freel", "Rose", "Tallac", "Rubicon", "Silver"],
  print: function (delay = 1000) {
    setTimeout(() => {
      console.log(this.mountains.join(", "));
    }, delay);
  },
};
tahoe.print(); // Freel, Rose, Tallac, Rubicon, Silver

const sandwich = {
  bread: "dutch crunch",
  meat: "tuna",
  cheese: "swiss",
  toppings: ["lettuce", "tomato", "mustard"],
};
const { bread, meat } = sandwich;
console.log(bread, meat); // dutch crunch tuna

const [firstAnimal] = ["Horse", "Mouse", "Cat"];
console.log(firstAnimal); // Horse
//console.log(thirdAnimal); // Cat

const name = "Tallac";
const elevation = 9738;
const print = function () {
  console.log(`Mt. ${this.name} is ${this.elevation} feet tall`);
};
const funHike = { name, elevation, print };
funHike.print(); // Mt. Tallac is 9738 feet tall

const peaks = ["Tallac", "Ralston", "Rose"];
const canyons = ["Ward", "Blackwood"];
const tahoe3 = [...peaks, ...canyons];
//console.log(tahoe.join(", ")); // Tallac, Ralston, Rose, Ward, Blackwood

const peaks2 = ["Tallac", "Ralston", "Rose"];
const [last] = peaks2.reverse();
console.log(last); // Rose
console.log(peaks.join(", ")); // Rose, Ralston, Tallac

function directions(...args) {
  let [start, ...remaining] = args;
  let [finish, ...stops] = remaining.reverse();
  console.log(`drive through ${args.length} towns`);
  console.log(`start in ${start}`);
  console.log(`the destination is ${finish}`);
  console.log(`stopping ${stops.length} times in between`);
}
directions("Truckee", "Tahoe City", "Sunnyside", "Homewood", "Tahoma");

const morning = {
  breakfast: "oatmeal",
  lunch: "peanut butter and jelly",
};
const dinner = "mac and cheese";
const backpackingMeals = {
  ...morning,
  dinner,
};
console.log(backpackingMeals);

fetch("https://api.randomuser.me/?nat=US&results=1")
.then(res => res.json())
.then(json => json.results)
.then(console.log)
.catch(console.error);

const getFakePerson = async () => {
try {
let res = await fetch("https://api.randomuser.me/?nat=US&results=1");
let { results } = res.json();
console.log(results);
} catch (error) {
console.error(error);
}
};
getFakePerson();

const getPeople = count =>
new Promise((resolves, rejects) => {
const api = `https://api.randomuser.me/?nat=US&results=${count}`;
const request = new XMLHttpRequest();
request.open("GET", api);
request.onload = () =>
request.status === 200
? resolves(JSON.parse(request.response).results)
: reject(Error(request.statusText));
request.onerror = err => rejects(err);
request.send();
});
getPeople(5)
.then(members => console.log(members))
.catch(error => console.error(`getPeople failed: ${error.message}`));

function Vacation(destination, length) {
this.destination = destination;
this.length = length;
}
Vacation.prototype.print = function() {
console.log(this.destination + " | " + this.length + " days");
};
const maui = new Vacation("Maui", 7);
maui.print(); // Maui | 7 days

class Vacation1 {
constructor(destination, length) {
this.destination = destination;
this.length = length;
}
print() {
console.log(`${this.destination} will take ${this.length} days.`);
}
}
const trip = new Vacation1("Santiago, Chile", 7);
trip.print(); // Chile will take 7 days.

class Expedition extends Vacation {
constructor(destination, length, gear) {
super(destination, length);
this.gear = gear;
}
print() {
super.print();
console.log(`Bring your ${this.gear.join(" and your ")}`);
}
}
const trip2 = new Expedition("Mt. Whitney", 3, [
"sunglasses",
"prayer flags",
"camera"
]);
trip2.print();