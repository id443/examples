let color_lawn = {
  title: "lawn",
  color: "#00FF00",
  rating: 0,
};
function rateColor(color, rating) {
  color.rating = rating;
  return color;
}
console.log(rateColor(color_lawn, 5).rating); // 5
console.log(color_lawn.rating); // 5
const rateColor1 = function (color, rating) {
  return Object.assign({}, color, { rating: rating });
};
console.log(rateColor1(color_lawn, 5).rating); // 5
console.log(color_lawn.rating); // 0
const rateColor3 = (color, rating) => ({
  ...color,
  rating,
});

let list = [{ title: "Rad Red" }, { title: "Lawn" }, { title: "Party Pink" }];
const addColor = function (title, colors) {
  colors.push({ title: title });
  return colors;
};
console.log(addColor("Glam Green", list).length); // 4
console.log(list.length); // 4
const addColor2 = (title, array) => array.concat({ title });
console.log(addColor2("Glam Green", list).length); // 4
console.log(list.length); // 3
const addColor3 = (title, list) => [...list, { title }];
console.log(addColor3("Glam Green", list).length); // 4
console.log(list.length); // 3

const frederick = {
  name: "Frederick Douglass",
  canRead: false,
  canWrite: false,
};
const selfEducate = (person) => ({
  ...person,
  canRead: true,
  canWrite: true,
});
console.log(selfEducate(frederick));
console.log(frederick);

const schools = ["Yorktown", "Washington & Liberty", "Wakefield"];
console.log(schools.join(", "));
const wSchools = schools.filter((school) => school[0] === "W");
console.log(wSchools);
const cutSchool = (cut, list) => list.filter((school) => school !== cut);
console.log(cutSchool("Washington & Liberty", schools).join(", "));
console.log(schools.join("\n"));
const highSchools = schools.map((school) => `${school} High School`);
console.log(highSchools.join("\n"));
const highSchools1 = schools.map((school) => ({ name: school }));
console.log(highSchools1);

const ages = [21, 18, 42, 40, 64, 63, 34];
const maxAge = ages.reduce((max, age) => {
  console.log(`${age} > ${max} = ${age > max}`);
  if (age > max) {
    return age;
  } else {
    return max;
  }
}, 66);
console.log("maxAge", maxAge);
const max = ages.reduce((max, value) => (value > max ? value : max), 0);

const colors = ["red", "red", "green", "blue", "green"];
const uniqueColors = colors.reduce(
  (unique, color) =>
    unique.indexOf(color) !== -1 ? unique : [...unique, color],
  []
);
console.log(uniqueColors);

const invokeIf = (condition, fnTrue, fnFalse) =>
  condition ? fnTrue() : fnFalse();
const showWelcome = () => console.log("Welcome!!!");
const showUnauthorized = () => console.log("Unauthorized!!!");
invokeIf(true, showWelcome, showUnauthorized); // "Welcome!!!"
invokeIf(false, showWelcome, showUnauthorized); // "Unauthorized!!!"

const userLogs = (userName) => (message) =>
  console.log(`${userName} -> ${message}`);
const log = userLogs("grandpa23");
log("attempted to load 20 fake members");
getFakeMembers(20).then(
  (members) => log(`successfully loaded ${members.length} members`),
  (error) => log("encountered an error loading members")
);

const countdown = (value, fn) => {
  fn(value);
  return value > 0 ? countdown(value - 1, fn) : value;
};
countdown(10, (value) => console.log(value));
const countdown1 = (value, fn, delay = 1000) => {
  fn(value);
  return value > 0
    ? setTimeout(() => countdown(value - 1, fn, delay), delay)
    : value;
};
const log1 = (value) => console.log(value);
countdown1(10, log1);
const dan = {
  type: "person",
  data: {
    gender: "male",
info: {
id: 22,
fullname: {
first: "Dan",
last: "Deacon"
}
}
}
};
deepPick("type", dan); // "person"
deepPick("data.info.fullname.first", dan); // "Dan"
const deepPick = (fields, object = {}) => {
  const [first, ...remaining] = fields.split(".");
  return remaining.length
  ? deepPick(remaining.join("."), object[first])
  : object[first];
  };

  const template = "hh:mm:ss tt";
const clockTime = template
.replace("hh", "03")
.replace("mm", "33")
.replace("ss", "33")
.replace("tt", "PM");
console.log(clockTime);