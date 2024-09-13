const messages = [
  "They can be inserted into arrays",
  (message) => console.log(message),
  "like variables",
  (message) => console.log(message),
];
messages[1](messages[0]); // Они могут вставляться в массивы
messages[3](messages[2]); // как переменные

const createScream = function (logger) {
  return function (message) {
    logger(message.toUpperCase() + "!!!");
  };
};
const scream = createScream((message) => console.log(message));
scream("functions can be returned from other functions");
scream("createScream returns a function");
scream("scream invokes that returned function");
