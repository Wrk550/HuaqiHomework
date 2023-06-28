const array = [1, 8, 2, 0];
array.sort((a, b) => {
  return b - a;
});
console.log(array);

function handleClick(event) {
  var targetElement = event.target;
  console.log(targetElement);
}

export function addItem() {
  var input = document.getElementById('inputText');
  var value = input.value.trim();

  if (value !== '') {
    var item = document.createElement('div');
    item.className = 'item';
    item.innerHTML = value + ' <button onclick="removeItem(this)">删除</button>';

    var stringList = document.getElementById('stringList');
    stringList.appendChild(item);

    input.value = '';
  }
}

export function removeItem(button) {
  var item = button.parentNode;
  item.parentNode.removeChild(item);
}





