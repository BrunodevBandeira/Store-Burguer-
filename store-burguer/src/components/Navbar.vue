<template>
  <div>
    <div id="nav">

      <router-link id="logo-url" to="/">
        <img id="logo" :src="logo" :alt="alt">
      </router-link>

      <div >
        <img class="flags" v-if="selectedLanguage === 'pt_BR'" :src="brasil" :alt="alt" />
        <img class="flags" v-else-if="selectedLanguage === 'en'" :src="reinoUnido" :alt="alt" />
        <img class="flags" v-else-if="selectedLanguage === 'es'" :src="espanha" :alt="alt" />
        <img class="flags" v-else-if="selectedLanguage === 'ch'" :src="china" :alt="alt" />
      </div>  
       
      <div>
        <select class="custom-select" v-model="selectedLanguage" @change="setLocale(selectedLanguage)">
          <option v-for="(lang, index) in supportedLanguages" :key="index" :value="lang.code">
            {{ lang.name }}
          </option>
        </select>
      </div>


      
      
       <!-- Fazer Pedido  -->
      <router-link to="/">  {{ $t('navbar.text0001') }} </router-link>

      <!--  Pedidos  -->
      <router-link to="/pedidos">{{ $t('navbar.text0002') }}</router-link>

      <!-- Cardapio  -->
      <router-link to="/menu">  {{ $t('navbar.text0003') }} </router-link>

      <!-- Quem somos  -->
      <router-link to="/who">{{ $t('navbar.text0004') }}</router-link>

      <!-- Cupons  -->
      <router-link to="/cupons">  {{ $t('navbar.text0005') }} </router-link>

      <!-- Delivery  -->
      <router-link to="/delivery">{{ $t('navbar.text0006') }}</router-link>
    </div>
    <span class="line"></span>
     
  </div>
</template>

<script>
import brasil from "../../public/flags/brasil.png"
import reinoUnido from "../../public/flags/reino-unido.png"
import espanha from "../../public/flags/espanha.png"
import china from "../../public/flags/china.png"

export default {
  name: "Navbar-view",
  props: ["logo", "alt"],

  components: {
    // brasil,
    // reinoUnido,
    // espanha,
    // china
  },

  data() {
    return {
      selectedLanguage: 'pt_BR', // Defina 'pt_BR' como a opção padrão
      supportedLanguages: [
        { code: 'pt_BR', name: 'PT' },
        { code: 'en', name: 'EN' },
        { code: 'es', name: 'ES' },
        { code: 'ch', name: 'CH' },
        // Adicione mais idiomas conforme necessário
      ],
      brasil,
      reinoUnido,
      espanha,
      china
    };
  },

  methods: {
    setLocale(locale) {
        this.$i18n.locale = locale;
    },

  }
}
</script>

<style scoped>

/* 
  background: linear-gradient(to right, #111 30%, transparent 70%);
  background: linear-gradient(to top, #111 10%, transparent 90%);  */

  #nav {
    background: linear-gradient(to top, #33333310 ,#000 45%);
    position: fixed;
    top: 0;
    left: 0;
    z-index: 50;
    padding: 15px 50px;
    display: flex;
    justify-content: flex-end;
    align-items: center;
    width: 100%;
    
    /* background-color: #222; */
    /* background-color: #333333; */
    /* border-bottom: 4px solid #111; */
  }

  .flags {
    width: 2rem;
    padding-top: .1rem;
    margin-right: .1rem;
  }
  
  .line {
    content: "";
    display: block;
    height: 2px;
    background-color: #d5c06b; /* Cor da linha amarela */
  }

  #nav #logo-url {
    margin: auto;
    margin-left: 0;
  }



  #logo {
    width: 40px;
    height: 40px;
  }

  #nav a {
    color: #d5c06b;
    text-decoration: none;
    margin: 12px;
    transition: .5s;
  }

  #nav a:hover {
    color: #FFF;
  }

  .custom-select {
    background-color: #d5c06b
; /* Cor de fundo amarela */
    color: black; /* Cor do texto preto */
    padding: 5px; /* Espaçamento interno para melhor aparência */
    border: 1px solid #ccc; /* Borda para melhorar a aparência */
    border-radius: 4px; /* Borda arredondada */
    font-size: 14px; /* Tamanho da fonte */
    cursor: pointer; /* Ícone de cursor de apontador ao pairar */
    transition: .5s;
  }

  /* Altere o estilo da opção selecionada no hover */
  .custom-select:hover {
    background-color: lightyellow; /* Cor de fundo mais clara ao pairar */
  }

  /* Estilo para opção selecionada */
  .custom-select option:checked {
    background-color: yellow; /* Cor de fundo amarela para opção selecionada */
    color: black; /* Cor do texto preto para opção selecionada */
  }
</style>