import _ from 'lodash';

function component() {
  var element = document.createElement('div');
  
  let test = "This variable is used to test how babel transfer javascript"

  // Lodash, currently included via a script, is required for this line to work.
  // Lodash, now imported by 'import'
  element.innerHTML = _.join(['A Hello,', 'webpack', '=_=', test], ' ');

  return element;
}


document.body.appendChild(component());