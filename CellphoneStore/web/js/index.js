$(document).ready(function(){
    $(".owl-carousel").owlCarousel();
});

$(".owl-carousel").owlCarousel({
    autoplay: true,
    autoplayhoverpause: true,
    autoplaytimeout: 100,
    nav: true,
    loop: true,
    margin: 5,
    responsive:{
        0 : {
            items: 1,
            dots: false
        },
        600 :{
            items: 2,
            dots: false
        },
        1000 :{
            items: 4,
            dots: false
        }
    }
});

var $maxWidthElement = $('.navbar'),
  maxWidth = $maxWidthElement.width();

function positionDropdowns() {
  $('.dropdown-menu').each(function () {
    $(this).removeClass('dropdown-menu-right');
    var $navItem = $(this).closest('.dropdown'),
      dropdownWidth = $(this).outerWidth(),
      dropdownOffsetLeft = $navItem.offset().left,
      dropdownOffsetRight = maxWidth - (dropdownOffsetLeft + dropdownWidth),
      linkCenterOffsetLeft = dropdownOffsetLeft + $navItem.outerWidth() / 2,
      outputCss = {
        left: 0,
        right: '',
        width: ''
      };

    if ((linkCenterOffsetLeft - dropdownWidth / 2 > 0) & (linkCenterOffsetLeft + dropdownWidth / 2 < maxWidth)) {
      // center the dropdown menu if possible
      outputCss.left = -(dropdownWidth / 2 - $navItem.outerWidth() / 2);
    } else if ((dropdownOffsetRight < 0) & (dropdownWidth < dropdownOffsetLeft + $navItem.outerWidth())) {
      // set the dropdown menu to left if it exceeds the viewport on the right
      $(this).addClass('dropdown-menu-right');
      outputCss.left = '';
    } else if (dropdownOffsetLeft + dropdownWidth > maxWidth) {
      // full width if the dropdown is too large to fit on the right
      outputCss.left = 0;
      outputCss.right = 0;
      outputCss.width = maxWidth + 'px';
    }
    $(this).css({
      left: outputCss.left,
      right: outputCss.right,
      width: outputCss.width
    });
  });
}

$("#trigger-btn").on("click", function () {
  positionDropdowns();
  $(this)
    .text("Done!")
    .addClass("btn-success")
    .removeClass("btn-danger");
});

var resizeTimer;

$(window).on("resize", function (e) {
  clearTimeout(resizeTimer);
  resizeTimer = setTimeout(function () {
    maxWidth = $maxWidthElement.width();
    positionDropdowns();
  }, 250);
});

function loadTop4() {
  var amount = document.getElementsByClassName("product").length;
  $.ajax({
      type: "post",
      url: "/cellphone/loadtop4products",
      data: {
      exist: amount
      },
      success: function (response) {
      var row = document.getElementById("newlist");
      row.innerHTML += response;
      }
  });
}

$(document).ready(function(){
  $.ajax({
    type: "post",
    url: "/cellphone/loadtop4product",
    success: function (response) {
    var row = document.getElementById("newlist");
    row.innerHTML += response;
    }
});
});