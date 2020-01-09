import Vue from 'vue'
import Router from 'vue-router';
import Home from '../components/Home';
import Members from '../components/Members';
import Reservation from '../components/Reservation';
import Borrow from '../components/Borrow';
import Returns from '../components/Returns';
Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [{
            path: '/',
            component: Home
        
        },
        {
            path: '/Members',
            component: Members
        
        },
        {
            path: '/Reservation',
            component: Reservation
        
        },
        {
            path: '/Borrow',
            component: Borrow
        
        },
        {
            path: '/Returns',
            component: Returns
        
        },
    ]
});