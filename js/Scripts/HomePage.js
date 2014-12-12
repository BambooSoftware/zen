$(window).load(function () {
    var InfiniteRotator =
            {
                init: function ()
                {
                    //initial fade-in time (in milliseconds)
                    var initialFadeIn = 1000;

                    //interval between items (in milliseconds)
                    var itemInterval = 5000;

                    //cross-fade time (in milliseconds)
                    var fadeTime = 2500;

                    //count number of items
                    var numberOfItems = $('.image-holder').length;

                    //set current item
                    var currentItem = 0;

                    //show first item
                    $('.image-holder').eq(currentItem).fadeIn(initialFadeIn);

                    //loop through the items
                    var infiniteLoop = setInterval(function () {
                        $('.image-holder').eq(currentItem).fadeOut(fadeTime);

                        if (currentItem === numberOfItems - 1) {
                            currentItem = 0;
                        } else {
                            currentItem++;
                        }
                        $('.image-holder').eq(currentItem).fadeIn(fadeTime);

                    }, itemInterval);
                }
            };

    InfiniteRotator.init();
});