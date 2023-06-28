// import { submit } from "./submit.js";

// let result = submit();

// console.log(result);


function insertData(item) {
  // 获取 tbody 标签
  var tbody = document.querySelector('tbody')
  // 循环遍历 dataForm 数据
  let flag = true
  let tr = document.createElement('tr')
  for (let key in item) {
    let td = document.createElement('td')
    if (key == 'clientSide' || key == 'size') {
      if (item[key] == 'Sell') flag = false // 染成红色
      td.style.color = flag ? '#00b755' : '#ff7a75'
    }
    if (key == 'size' || key == 'price' || key == 'notionalUsd') td.style.textAlign = 'right'
    td.innerHTML = item[key]
    tr.appendChild(td)
  }
  tbody.appendChild(tr)
}


function getInput() {
  let dataForm = {
    date: getTime(),
    clientName: document.querySelector('#clientName').value,
    clientSide: '',
    ticker: document.querySelector('#ticker').value,
    ric: document.querySelector('#ric').value,
    size: document.querySelector('#size').value,
    price: document.querySelector('#price').value,
    notionalUsd: 1300.78,
    currency: document.querySelector('#currency').value,
    issueSector: document.querySelector('#issueSector').value,
    salesperson: document.querySelector('#salesperson').value,
    htpt: document.querySelector('#htpt').value
  }
  return dataForm;
}

function buyHandler() {
  let dataForm = getInput();
  dataForm.clientSide = 'Buy'
  insertData(dataForm)
}

function sellHandler() {
  let dataForm = getInput();
  dataForm.clientSide = 'Sell'
  insertData(dataForm)
}


// 时间格式化方法
function getTime() {
  let timer = new Date() // 转为日期对象
  let year = timer.getFullYear()
  let month = timer.getMonth() + 1
  let day = timer.getDate()
  let hour = timer.getHours()
  let minutes = timer.getMinutes()
  let seconds = timer.getSeconds()
  return `${month}/${day} ${hour}:${minutes}:${seconds}`
}

