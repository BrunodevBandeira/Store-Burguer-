<template>

  <div id="main-banner">
    <!-- Faça seu burguer -->
    <h1> {{ $t('banner.title') }} </h1> 
  </div>
  <!-- <BannerInfo /> -->

</template>

<script>
// import BannerInfo from '../components/BannerInfo'

  export default {
    name: "Banner-view",
    components: {
      // BannerInfo,
    }
  }
</script>

<style scoped>

  /* #main-banner {
    background-image: url('../../public/img/burger02.jpg');
    background-position: 0 -250px;
    background-size: cover;
    height: 500px;
    display: flex;
    align-items: center;
    justify-content: flex-start;
  }

  #main-banner h1 {
    color: #FFF;
    text-align: center;
    font-size: 60px;
    background-color: #222;
    padding: 20px 40px;
    transition: .5s;
  }

  #main-banner h1:hover {
    color:#d5c06b;
  } */

  #main-banner {
  background-image: url('../../public/img/burger02.jpg');
  background-position: 0 -250px;
  background-size: cover;
  height: 500px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  position: relative;
}

#main-banner::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;

}

#main-banner h1 {
  color: #FFF;
  text-align: center;
  font-size: 60px;
  padding: 20px 40px;
  transition: .5s;
  position: relative;
  z-index: 1; /* Certifique-se de que o conteúdo do h1 esteja acima do fundo com efeito de vidro */
  background-color: #ffa6001f;  
  backdrop-filter: blur(15px);
}

#main-banner h1:hover {
  color: #d5c06b;
}




</style>