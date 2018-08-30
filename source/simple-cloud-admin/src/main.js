// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import Element from 'element-ui'
import './assets/css/element-variables.scss'

Vue.config.productionTip = false
Vue.use(Element, {size: 'small'})

// 使用路由器钩子函数对路由进行权限跳转
router.beforeEach((to, from, next) => {
  next()
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
