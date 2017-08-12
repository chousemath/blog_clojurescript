// Compiled by ClojureScript 1.7.228 {}
goog.provide('modern_cljs.core');
goog.require('cljs.core');
modern_cljs.core.add = (function modern_cljs$core$add(x,y){
return (x + y);
});
modern_cljs.core.minus = (function modern_cljs$core$minus(x,y){
return (x - y);
});
modern_cljs.core.multiply = (function modern_cljs$core$multiply(x,y){
return (x * y);
});
modern_cljs.core.division = (function modern_cljs$core$division(x,y){
return (x / y);
});
add = modern_cljs.core.add;
minus = modern_cljs.core.minus;
multiply = modern_cljs.core.multiply;
division = modern_cljs.core.division;
cljs.core.enable_console_print_BANG_.call(null);
cljs.core.println.call(null,"Hello world!");
cljs.core.println.call(null,[cljs.core.str("Hello again "),cljs.core.str("world!!!")].join(''));

//# sourceMappingURL=core.js.map