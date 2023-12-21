import { createApp } from 'vue'
import App from './App.vue'
import router from './router/routes'

import {createI18n} from 'vue-i18n';
import { pt_BR } from "./locales/portugues.js"
import { en } from "./locales/ingles.js"
import { es } from "./locales/espanhol.js"
import { ch } from "./locales/chines.js"

const languages = {
    pt_BR,
    en,
    es,
    ch
};

const i18n = createI18n({
    locale: "pt_BR",
    fallbackLocale: "pt_BR",
    messages: languages
})

createApp(App).use(router).use(i18n).mount('#app')