document.getElementById('submit').onclick = function(){
    console.log("abc")
}

var totalPrice = 0;

function replaceCharInString(items){
    items.replaceAll('.','').replaceAll('đ','');
}


document.getElementById('qty-input').onchange = function(){
    let amount = document.getElementById('qty-input').value;
    let itemPrice_raw_1 = document.getElementById('item-price').innerHTML;
    let itemPrice_raw = itemPrice_raw_1.replaceAll('.','');
    let itemPrice = itemPrice_raw.replaceAll('đ','');

    let parsePrice = parseInt(itemPrice, 10);
    let parseAmount = parseInt(amount, 10);

    let totalItemPrice_raw = parsePrice * parseAmount;
    let totalItemPrice = totalItemPrice_raw.toLocaleString('vn-VN');
    let totalItemPrice_final = totalItemPrice.replaceAll(',','.').concat('đ');

    document.getElementById('total-item-price').innerHTML = totalItemPrice_final;
}

const collection = document.getElementsByClassName('qty-in'); 

function check () {  
        console.log(collection.length);
        // console.log(collection[0].value)
    
    
}