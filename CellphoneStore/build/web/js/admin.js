function openNav() {
  var width = document.getElementById('sidenav').clientWidth;
  if (width === 0) {
    document.getElementById("sidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
  } else {
    document.getElementById("sidenav").style.width = "0px";
    document.getElementById("main").style.marginLeft = "0";
  }
}

/* Set the width of the side navigation to 0 and the left margin of the page content to 0 */

var keys = { 37: 1, 38: 1, 39: 1, 40: 1 };

function preventDefault(e) {
  e.preventDefault();
}

function preventDefaultForScrollKeys(e) {
  if (keys[e.keyCode]) {
    preventDefault(e);
    return false;
  }
}

// modern Chrome requires { passive: false } when adding event
var supportsPassive = false;
try {
  window.addEventListener("test", null, Object.defineProperty({}, 'passive', {
    get: function () { supportsPassive = true; }
  }));
} catch (e) { }

var wheelOpt = supportsPassive ? { passive: false } : false;
var wheelEvent = 'onwheel' in document.createElement('div') ? 'wheel' : 'mousewheel';

// call this to Disable
function disableScroll() {
  window.addEventListener('DOMMouseScroll', preventDefault, false); // older FF
  window.addEventListener(wheelEvent, preventDefault, wheelOpt); // modern desktop
  window.addEventListener('touchmove', preventDefault, wheelOpt); // mobile
  window.addEventListener('keydown', preventDefaultForScrollKeys, false);
}

// call this to Enable
function enableScroll() {
  window.removeEventListener('DOMMouseScroll', preventDefault, false);
  window.removeEventListener(wheelEvent, preventDefault, wheelOpt);
  window.removeEventListener('touchmove', preventDefault, wheelOpt);
  window.removeEventListener('keydown', preventDefaultForScrollKeys, false);
}


function openModal(pid) {
  var check = document.getElementById('check-delete-modal');
  check.style.display = "block";
  if (pid !== undefined && pid !== null) {
    document.getElementById('modal-title').innerHTML = "Bạn có muốn xóa " + pid;
  }

  document.getElementsByTagName('body')[0].style.overflow = "hidden";
  disableScroll();
  document.getElementById('modal-delete-btn-1').onclick = function () {
    window.location = "admin-delete?pid=" + pid;
  };
}

function openModal2(pid) {
  var check = document.getElementById('check-delete-modal');
  check.style.display = "block";
  if (pid !== undefined && pid !== null) {
    document.getElementById('modal-title').innerHTML = "Bạn có muốn hủy đơn hàng " + pid;
  }

  document.getElementsByTagName('body')[0].style.overflow = "hidden";
  disableScroll();
  document.getElementById('modal-delete-btn-1').onclick = function () {
    window.location = "admin-delete?pid=" + pid;
  };
}

function closeModal() {
  var check = document.getElementById('check-delete-modal');
  check.style.display = "none";
  document.getElementsByTagName('body')[0].style.overflow = "auto";
  enableScroll();
}

function addColor(pid){
  let color = document.getElementById('new-color').value+',';
  // console.log(color);

  if (color !== undefined && color !== null) {
    window.location = "admin-updateproduct?action=add&type=color&value="+color+"&pid="+pid;
  }
}

function changeColor(cid,pid) {
  let id = 'cl'+cid;
  let color = document.getElementById("'"+id+"'").value;
  if (color !== undefined && color !== null) {
    window.location = "admin-updateproduct?action=update&type=color&value="+color+"&cid="+cid+"&pid="+pid;
  }
}

function addStorage(pid){
  let storage = document.getElementById('new-storage').value;
  if (storage !== undefined && storage !== null) {
    window.location = "admin-updateproduct?action=add&type=storage&value="+storage+"&pid="+pid;
  }
}

function changeStorage(sid,pid){
  let id = 'st'+sid;
  let storage = document.getElementById("'"+id+"'").value;
  // console.log(storage+' '+sid);
  if (storage !== undefined && storage !== null) {
    window.location = "admin-updateproduct?action=update&type=storage&value="+storage+"&sid="+sid+"&pid="+pid;
  }
}