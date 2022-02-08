$(document).ready(function(){
    $(".owl-carousel").owlCarousel();
});

$(".owl-carousel").owlCarousel({
    autoplay: true,
    autoplayhoverpause: true,
    autoplaytimeout: 100,
    items: 4,
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
})