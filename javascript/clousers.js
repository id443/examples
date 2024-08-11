function outer() {
    const name = "Макс";
  
    function inner() {
      console.log(`Привет, ${name}!`);
    }
  
    return inner;
  }
  
  const greeting = outer();
  greeting(); 
//---------------------------------------------------------
  let outer1 = 'Hello';

  function sayHelloDearFriend(name) {
    let inner = 'dear friend'
    console.log(`${outer1}, ${inner}, ${name}!` )
  }
  
  sayHelloDearFriend('Макс');