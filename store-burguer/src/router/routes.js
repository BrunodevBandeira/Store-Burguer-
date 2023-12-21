import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
// import Pedidos from '../views/Pedidos.vue'
import Menu from '../views/Menu.vue'
import Who from '../views/Who.vue'
import Cupons from '../views/Cupons.vue'
import Delivery from '../views/Delivery.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/pedidos',
    name: 'Pedidos',
    component: () => import('../views/Pedidos.vue')
  }
  ,
  {
    path: '/menu',
    name: 'Menu',
    component: Menu
  }
  ,
  {
    path: '/who',
    name: 'Who',
    component: Who
  }
  ,
  {
    path: '/cupons',
    name: 'Cupons',
    component: Cupons
  }
  ,
  {
    path: '/delivery',
    name: 'Delivery',
    component: Delivery
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
