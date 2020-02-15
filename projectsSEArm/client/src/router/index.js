import Vue from 'vue'
import Router from 'vue-router';
import Home from '../components/Members';
Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            component: Home
        },
        
    ]
});