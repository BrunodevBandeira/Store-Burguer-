<template>
  <div id="burgerForm">
    
    <Banner />

    <span class="line"></span>

    <BannerInfo />

    <div class="main-container">
      <h1>{{ $t("home.text0001")}}</h1>
      <BurgerForm />
    </div>


  </div>
</template>

<script>
import Banner from '../components/Banner'
import BannerInfo from '../components/BannerInfo'
import BurgerForm from '../components/BurgerForm'

export default {
  name: 'Home-view',
  components: {
    Banner,
    BannerInfo,
    BurgerForm,
  }
}
</script>

<style scoped>
.line {
    content: "";
    display: block;
    height: 2px;
    background-color: #d5c06b; /* Cor da linha amarela */
  }
  
  #burgerForm {
    background: linear-gradient(to bottom, #333333,#000000);
  }

  #burgerForm div h1 {
    color: #fff;
  }
</style>